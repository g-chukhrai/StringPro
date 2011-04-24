; (FILE (FUNCDEF f void (BLOCK (CALL printf (ELIST hello, world\n)) (CALL printf (ELIST %d\n 99)))))
declare i32 @printf(i8 *, ...)
@s1 = internal constant [14 x i8] c"hello, world\0A\00"
@s2 = internal constant [4 x i8] c"%d\0A\00"
define void @f() {
; init arg(s): 
    ; printf(hello, world\n);
    %r1 = getelementptr [14 x i8]* @s1, i32 0, i32 0
    call i32 (i8*, ...)* @printf(i8* %r1)
    ; printf(%d\n, 99);
    %r2 = getelementptr [4 x i8]* @s2, i32 0, i32 0
    %r3 = add i32 99, 0
    call i32 (i8*, ...)* @printf(i8* %r2, i32 %r3)
    ret void
}
