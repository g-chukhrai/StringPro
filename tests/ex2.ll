target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-mingw32"
declare i32 @printf(i8 *, ...) nounwind
declare i8* @gets(i8*)
declare i32 @atoi(i8*) nounwind readonly
declare i8* @strcat(i8*, i8*) nounwind
declare i8* @strcpy(i8*, i8*) nounwind
declare i64 @strlen(i8*) nounwind readonly
declare i32 @strcmp(i8*, i8*) nounwind readonly

@.str1 = private constant [20 x i8] c"Input any string: \0A\00", align 1
@.str5 = private constant [16 x i8] c"String is %s! \0A\00", align 1
@.str15 = private constant [30 x i8] c"Char[%d] in string %s is %c \0A\00", align 1
define i32 @main() {
	%r2 = getelementptr [20 x i8]* @.str1, i64 0, i64 0
	call i32 (i8*, ...)* @printf(i8* %r2);
	%s = alloca i8*
	%r4 = alloca [256 x i8]
	%read4 = bitcast [256 x i8]* %r4 to i8*
	%r3 = call i8* @gets(i8* %read4) nounwind
	store i8* %r3, i8** %s
	%r6 = getelementptr [16 x i8]* @.str5, i64 0, i64 0
	%r7 = load i8** %s
	call i32 (i8*, ...)* @printf(i8* %r6, i8* %r7);
	%len = alloca i32
	%r8 = load i8** %s
	%r10 = call i64 @strlen(i8* %r8) nounwind readonly
	%r9 = trunc i64 %r10 to i32
	store i32 %r9, i32* %len
	%i = alloca i32
	%zero = add i32 0, 0
	store i32 %zero, i32* %i
	%comp11 = alloca i32
	%r11 = load i32* %len
	store i32 %r11, i32* %comp11
	br label %loop20
	loop20:
		%a111 = load i32* %i, align 4  
		%a211 = load i32* %comp11, align 4
		%bool11 = icmp slt i32 %a111, %a211
		br i1 %bool11, label %start20, label %end20
	start20:
		%ch = alloca i8
		%r12 = load i8** %s
		%r13 = load i32* %i
		%rget14 = getelementptr inbounds i8* %r12, i32 %r13
		%r14 = load i8* %rget14, align 1
		store i8 %r14, i8* %ch
		%r16 = getelementptr [30 x i8]* @.str15, i64 0, i64 0
		%r17 = load i32* %i
		%r18 = load i8** %s
		%r19 = load i8* %ch
		call i32 (i8*, ...)* @printf(i8* %r16, i32 %r17, i8* %r18, i8 %r19);
		%aa11 = load i32* %i, align 4  
		%bb11 = add nsw i32 %aa11, 1      
		store i32 %bb11, i32* %i, align 4
		br label %loop20
	end20:
	%r22 = add i32 1, 0
	ret i32 %r22
}