target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-mingw32"
declare i32 @printf(i8 *, ...) nounwind
declare i8* @gets(i8*)
declare i32 @atoi(i8*) nounwind readonly
declare i8* @strcat(i8*, i8*) nounwind
declare i8* @strcpy(i8*, i8*) nounwind
declare i64 @strlen(i8*) nounwind readonly
declare i32 @strcmp(i8*, i8*) nounwind readonly

@.str1 = private constant [19 x i8] c"Input your name: \0A\00", align 1
@.str5 = private constant [13 x i8] c"Hello, %s! \0A\00", align 1
define i32 @main() {
	%r2 = getelementptr [19 x i8]* @.str1, i64 0, i64 0
	call i32 (i8*, ...)* @printf(i8* %r2);
	%name = alloca i8*
	%r4 = alloca [256 x i8]
	%read4 = bitcast [256 x i8]* %r4 to i8*
	%r3 = call i8* @gets(i8* %read4) nounwind
	store i8* %r3, i8** %name
	%r6 = getelementptr [13 x i8]* @.str5, i64 0, i64 0
	%r7 = load i8** %name
	call i32 (i8*, ...)* @printf(i8* %r6, i8* %r7);
	%r8 = add i32 1, 0
	ret i32 %r8
}