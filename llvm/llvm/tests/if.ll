; (FILE (FUNCDEF g int (ARGS (ARG x int) (ARG y int)) (BLOCK (if (EXPR (== x y)) (return (EXPR x)) (return (EXPR y))))))
declare i32 @printf(i8 *, ...)
define i32 @g(i32 %x_arg, i32 %y_arg) {
; init arg(s): x, y
    %x = alloca i32
    store i32 %x_arg, i32* %x
    %y = alloca i32
    store i32 %y_arg, i32* %y
    ; if ( x==y ) return x; 	else return y;
    %r1 = load i32* %x
    %r2 = load i32* %y
    %r3 = icmp eq i32 %r1, %r2
    br i1 %r3, label %true6, label %false6
    true6:
    ; return x;
    %r4 = load i32* %x
    ret i32 %r4
    br label %end6
    false6:
    ; return y;
    %r5 = load i32* %y
    ret i32 %r5
    end6:
    ret i32 0
}
