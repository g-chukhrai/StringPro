target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-mingw32"
declare i32 @printf(i8 *, ...) nounwind
declare i8* @gets(i8*)
declare i32 @atoi(i8*) nounwind readonly
declare i8* @strcat(i8*, i8*) nounwind
declare i8* @strcpy(i8*, i8*) nounwind
declare i64 @strlen(i8*) nounwind readonly
declare i32 @strcmp(i8*, i8*) nounwind readonly

@.str1 = private constant [6 x i8] c"Hello\00", align 1
@.str15 = private constant [10 x i8] c"s1 = %s \0A\00", align 1
@.str17 = private constant [10 x i8] c"s2 = %s \0A\00", align 1
define i32 @main() {
	%s1 = alloca i8*
	%r1 = getelementptr [6 x i8]* @.str1, i64 0, i64 0
	store i8* %r1, i8** %s1
	%s2 = alloca i8*
	%st12 = alloca [256 x i8] 
	%st22 = bitcast [256 x i8]* %st12 to i8*
	store i8* %st22, i8** %s2, align 4
	%i = alloca i32
	%r3 = add i32 0, 0
	store i32 %r3, i32* %i
	%i4 = alloca i32
	store i32 0, i32* %i4
	%ii4 = alloca i32
	store i32 5, i32* %ii4
	br label %loop14
	loop14:
	    %b1 = load i32* %i4, align 4  
	    %b2 = load i32* %ii4, align 4  
	    %r5 = icmp slt i32 %b1, %b2
	    br i1 %r5, label %start14, label %end14
	start14:
	        %r7 = load i8** %s1
	        %r8 = load i32* %i
	        %rget9 = getelementptr inbounds i8* %r7, i32 %r8
	        %r9 = load i8* %rget9, align 1
	        %r6 = load i32* %i
	        %ra110 = load i8** %s2, align 8                  
	        %ra210 = getelementptr inbounds i8* %ra110, i32 %r6
	        store i8 %r9, i8* %ra210, align 1;
	        %r11 = load i32* %i
	        %r12 = add i32 1, 0
	        %r13 = add i32 %r11, %r12
	        store i32 %r13, i32* %i;
		  %aa4 = load i32* %i4, align 4  
		  %bb4 = add nsw i32 %aa4, 1      
		  store i32 %bb4, i32* %i4, align 4
	    br label %loop14
	end14:
	%r15 = getelementptr [10 x i8]* @.str15, i64 0, i64 0
	%r16 = load i8** %s1
	call i32 (i8*, ...)* @printf(i8* %r15, i8* %r16);
	%r17 = getelementptr [10 x i8]* @.str17, i64 0, i64 0
	%r18 = load i8** %s2
	call i32 (i8*, ...)* @printf(i8* %r17, i8* %r18);
	%r19 = add i32 1, 0
	ret i32 %r19
}
