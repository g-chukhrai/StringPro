target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-mingw32"
	
    declare i32 @printf(i8 *, ...)
    define i32 @factorial(i32 %X_arg) {
        %X = alloca i32
        store i32 %X_arg, i32* %X
        %r1 = load i32* %X
        %r2 = add i32 0, 0
        %r3 = icmp eq i32 %r1, %r2
        br i1 %r3, label %true5, label %false5
        true5:
            %r4 = add i32 1, 0
            ret i32 %r4
        false5:
        %r6 = load i32* %X
        %r7 = load i32* %X
        %r8 = add i32 1, 0
        %r9 = sub i32 %r7, %r8
        %r10 = call i32(i32)* @factorial(i32 %r9)
        %r11 = mul i32 %r6, %r10
        ret i32 %r11
    }
    define i32 @main() {
        %r12 = getelementptr ["ALOE" x i8]* @s1, i32 0, i32 0 
        call i32 (i8*, ...)* @printf(i8* %r, i32 %r);
    }