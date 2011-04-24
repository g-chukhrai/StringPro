; (FILE (FUNCDEF fact int (ARGS (ARG n int)) (BLOCK (if (EXPR (<= n 1)) (return (EXPR 1))) (return (EXPR (* n (CALL fact (ELIST (- n 1)))))))))
declare i32 @printf(i8 *, ...)
define i32 @fact(i32 %n_arg) {
; init arg(s): n
    %n = alloca i32
    store i32 %n_arg, i32* %n
    ; if ( n<=1) return 1;
    %r1 = load i32* %n
    %r2 = add i32 1, 0
    %r3 = icmp sle i32 %r1, %r2
    br i1 %r3, label %true5, label %false5
    true5:
    ; return 1;
    %r4 = add i32 1, 0
    ret i32 %r4
    false5:
    ; return n*fact(n-1);
    %r6 = load i32* %n
    ; fact(n-1)
    %r7 = load i32* %n
    %r8 = add i32 1, 0
    %r9 = sub i32 %r7, %r8
    %r10 = call i32(i32)* @fact(i32 %r9)
    %r11 = mul i32 %r6, %r10
    ret i32 %r11
    ret i32 0
}
