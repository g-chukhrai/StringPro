int a[10]; // must be a constant size
void f() { int x; x=2; a[x] = 99; x = a[2]; printf("%d\n", x); }
