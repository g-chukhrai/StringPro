#include <stdio.h>

extern int fact(int n);
int main(int argc, char *argv[]) {
	printf("%d\n", fact(10));
	return 0;
}
