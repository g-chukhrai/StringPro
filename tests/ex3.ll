target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-mingw32"
declare i32 @printf(i8 *, ...) nounwind
declare i8* @gets(i8*)
declare i32 @atoi(i8*) nounwind readonly
declare i8* @strcat(i8*, i8*) nounwind
declare i8* @strcpy(i8*, i8*) nounwind
declare i64 @strlen(i8*) nounwind readonly
declare i32 @strcmp(i8*, i8*) nounwind readonly

@smthGlobal = private constant [30 x i8] c"You can call me everywhere! \0A\00", align 1
@.str22 = private constant [15 x i8] c"new[%d] = %c \0A\00", align 1
@.str38 = private constant [5 x i8] c"less\00", align 1
@.str44 = private constant [7 x i8] c"equals\00", align 1
@.str50 = private constant [5 x i8] c"more\00", align 1
@.str55 = private constant [7 x i8] c"%d. %s\00", align 1
@.str61 = private constant [20 x i8] c"Input some string: \00", align 1
@.str65 = private constant [10 x i8] c"read %s \0A\00", align 1
@.str70 = private constant [38 x i8] c"String reversed: old: %s -> new: %s \0A\00", align 1
@.str77 = private constant [25 x i8] c"String %s %s string %s \0A\00", align 1

@globalVar = global i32 3
define i8* @reverseString(i8* %old_arg) {
	%old = alloca i8*
	store i8* %old_arg, i8** %old
	%new = alloca i8*
	%st13 = alloca [256 x i8] 
	%st23 = bitcast [256 x i8]* %st13 to i8*
	store i8* %st23, i8** %new, align 4
	%r4 = load i8** %new
	%r5 = load i8** %old
	%r6 = call i8* @strcpy(i8* %r4, i8* %r5) nounwind;
	%ch = alloca i8
	%char7 = add i32 33, 0
	%r7 = trunc i32 %char7 to i8  
	store i8 %r7, i8* %ch
	%i = alloca i32
	%zero = add i32 0, 0
	store i32 %zero, i32* %i
	%comp9 = alloca i32
	%r8 = load i8** %new
	%r10 = call i64 @strlen(i8* %r8) nounwind readonly
	%r9 = trunc i64 %r10 to i32
	store i32 %r9, i32* %comp9
	br label %loop28
	loop28:
		%a19 = load i32* %i, align 4  
		%a29 = load i32* %comp9, align 4
		%bool9 = icmp slt i32 %a19, %a29
		br i1 %bool9, label %start28, label %end28
	start28:
		%r12 = load i8** %old
		%r13 = load i8** %new
		%r15 = call i64 @strlen(i8* %r13) nounwind readonly
		%r14 = trunc i64 %r15 to i32
		%r16 = load i32* %i
		%r17 = add i32 1, 0
		%r18 = add i32 %r16, %r17
		%r19 = sub i32 %r14, %r18
		%rget20 = getelementptr inbounds i8* %r12, i32 %r19
		%r20 = load i8* %rget20, align 1
		%r11 = load i32* %i
		%ra121 = load i8** %new, align 8                  
		%ra221 = getelementptr inbounds i8* %ra121, i32 %r11
		store i8 %r20, i8* %ra221, align 1;
		%r23 = getelementptr [15 x i8]* @.str22, i64 0, i64 0
		%r24 = load i32* %i
		%r25 = load i8** %new
		%r26 = load i32* %i
		%rget27 = getelementptr inbounds i8* %r25, i32 %r26
		%r27 = load i8* %rget27, align 1
		call i32 (i8*, ...)* @printf(i8* %r23, i32 %r24, i8 %r27);
		%aa9 = load i32* %i, align 4  
		%bb9 = add nsw i32 %aa9, 1      
		store i32 %bb9, i32* %i, align 4
		br label %loop28
	end28:
	%r30 = load i8** %new
	ret i8* %r30
}
define i8* @compareStrings(i8* %s1_arg, i8* %s2_arg) {
	%s1 = alloca i8*
	%s2 = alloca i8*
	store i8* %s1_arg, i8** %s1
	store i8* %s2_arg, i8** %s2
	%result = alloca i32
	%r31 = load i8** %s1
	%r32 = load i8** %s2
	%r33 = call i32 @strcmp(i8* %r31, i8* %r32) nounwind readonly
	store i32 %r33, i32* %result
	%resultString = alloca i8*
	%st134 = alloca [256 x i8] 
	%st234 = bitcast [256 x i8]* %st134 to i8*
	store i8* %st234, i8** %resultString, align 4
	%r35 = load i32* %result
	%r36 = add i32 0, 0
	%r37 = icmp slt i32 %r35, %r36
	br i1 %r37, label %true40, label %false40
	true40:
	  %r39 = getelementptr [5 x i8]* @.str38, i64 0, i64 0
	  store i8* %r39, i8** %resultString;
		br label %false40
	false40:
	%r41 = load i32* %result
	%r42 = add i32 0, 0
	%r43 = icmp eq i32 %r41, %r42
	br i1 %r43, label %true46, label %false46
	true46:
	  %r45 = getelementptr [7 x i8]* @.str44, i64 0, i64 0
	  store i8* %r45, i8** %resultString;
		br label %false46
	false46:
	%r47 = load i32* %result
	%r48 = add i32 0, 0
	%r49 = icmp sgt i32 %r47, %r48
	br i1 %r49, label %true52, label %false52
	true52:
	  %r51 = getelementptr [5 x i8]* @.str50, i64 0, i64 0
	  store i8* %r51, i8** %resultString;
		br label %false52
	false52:
	%r53 = load i8** %resultString
	ret i8* %r53
}
define i32 @main() {
	%i = alloca i32
	%zero = add i32 0, 0
	store i32 %zero, i32* %i
	%comp54 = alloca i32
	%r54 = load i32* @globalVar
	store i32 %r54, i32* %comp54
	br label %loop59
	loop59:
		%a154 = load i32* %i, align 4  
		%a254 = load i32* %comp54, align 4
		%bool54 = icmp slt i32 %a154, %a254
		br i1 %bool54, label %start59, label %end59
	start59:
		%r56 = getelementptr [7 x i8]* @.str55, i64 0, i64 0
		%r57 = load i32* %i
		%r58 = getelementptr [30 x i8]* @smthGlobal, i64 0, i64 0
		call i32 (i8*, ...)* @printf(i8* %r56, i32 %r57, i8* %r58);
		%aa54 = load i32* %i, align 4  
		%bb54 = add nsw i32 %aa54, 1      
		store i32 %bb54, i32* %i, align 4
		br label %loop59
	end59:
	%r62 = getelementptr [20 x i8]* @.str61, i64 0, i64 0
	call i32 (i8*, ...)* @printf(i8* %r62);
	%in = alloca i8*
	%r64 = alloca [256 x i8]
	%read64 = bitcast [256 x i8]* %r64 to i8*
	%r63 = call i8* @gets(i8* %read64) nounwind
	store i8* %r63, i8** %in
	%r66 = getelementptr [10 x i8]* @.str65, i64 0, i64 0
	%r67 = load i8** %in
	call i32 (i8*, ...)* @printf(i8* %r66, i8* %r67);
	%reversed = alloca i8*
	%r68 = load i8** %in
	%r69 = call i8*(i8*)* @reverseString(i8* %r68)
	store i8* %r69, i8** %reversed
	%r71 = getelementptr [38 x i8]* @.str70, i64 0, i64 0
	%r72 = load i8** %in
	%r73 = load i8** %reversed
	call i32 (i8*, ...)* @printf(i8* %r71, i8* %r72, i8* %r73);
	%compared = alloca i8*
	%r74 = load i8** %in
	%r75 = load i8** %reversed
	%r76 = call i8*(i8*,i8*)* @compareStrings(i8* %r74, i8* %r75)
	store i8* %r76, i8** %compared
	%r78 = getelementptr [25 x i8]* @.str77, i64 0, i64 0
	%r79 = load i8** %in
	%r80 = load i8** %compared
	%r81 = load i8** %reversed
	call i32 (i8*, ...)* @printf(i8* %r78, i8* %r79, i8* %r80, i8* %r81);
	%r82 = add i32 1, 0
	ret i32 %r82
}