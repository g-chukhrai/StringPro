; (FILE (VARDEF a (ARRAY int (EXPR 10))) (FUNCDEF f void (BLOCK (VARDEF x int) (= x (EXPR 2)) (= (INDEX a x) (EXPR 99)) (= x (EXPR (INDEX a 2))) (CALL printf (ELIST %d\n x)))))
declare i32 @printf(i8 *, ...)
@s1 = internal constant [4 x i8] c"%d\0A\00"
; int a[10];
@a = global [10 x i32] zeroinitializer
define void @f() {
; init arg(s): 
    ; int x;
    %x = alloca i32
    ; x=2;
    %r2 = add i32 2, 0
    store i32 %r2, i32* %x
    ; a[x] = 99;
    %r4 = add i32 99, 0
    %r3 = load i32* %x
    ; array_ptr.reg=5
    %r5 = bitcast [10 x i32]* @a to i32*
    %r6 = getelementptr i32* %r5, i32 %r3
    store i32 %r4, i32* %r6
    ; x = a[2];
    %r7 = add i32 2, 0
    ; array_ptr.reg=9
    %r9 = bitcast [10 x i32]* @a to i32*
    %r10 = getelementptr i32* %r9, i32 %r7
    %r8 = load i32* %r10
    store i32 %r8, i32* %x
    ; printf(%d\n, x);
    %r11 = getelementptr [4 x i8]* @s1, i32 0, i32 0
    %r12 = load i32* %x
    call i32 (i8*, ...)* @printf(i8* %r11, i32 %r12)
    ret void
}
