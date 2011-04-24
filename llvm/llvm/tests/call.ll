; (FILE (FUNCDEF g int (ARGS (ARG x int) (ARG y int)) (BLOCK (return (EXPR (+ x y))))) (FUNCDEF f void (BLOCK (CALL printf (ELIST %d\n (CALL g (ELIST 1 2)))))))
declare i32 @printf(i8 *, ...)
@s1 = internal constant [4 x i8] c"%d\0A\00"
define i32 @g(i32 %x_arg, i32 %y_arg) {
; init arg(s): x, y
    %x = alloca i32
    store i32 %x_arg, i32* %x
    %y = alloca i32
    store i32 %y_arg, i32* %y
    ; return x+y;
    %r1 = load i32* %x
    %r2 = load i32* %y
    %r3 = add i32 %r1, %r2
    ret i32 %r3
    ret i32 0
}
define void @f() {
; init arg(s): 
    ; printf(%d\n, g(1,2));
    %r4 = getelementptr [4 x i8]* @s1, i32 0, i32 0
    ; g(1,2)
    %r5 = add i32 1, 0
    %r6 = add i32 2, 0
    %r7 = call i32(i32,i32)* @g(i32 %r5, i32 %r6)
    call i32 (i8*, ...)* @printf(i8* %r4, i32 %r7)
    ret void
}
