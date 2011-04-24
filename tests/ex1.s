	.def	 _main;	.scl	2;	.type	32;	.endef
	.text
	.globl	_main
	.align	16, 0x90
_main:                                  # @main
# BB#0:
	pushl	%ebp
Llabel1:
	movl	%esp, %ebp
Llabel2:
	subl	$272, %esp              # imm = 0x110
Llabel3:
	call	___main
	movl	$L_.str1, (%esp)
	call	_printf
	leal	-260(%ebp), %eax
	movl	%eax, (%esp)
	call	_gets
	movl	%eax, -4(%ebp)
	movl	%eax, 4(%esp)
	movl	$L_.str5, (%esp)
	call	_printf
	movl	$1, %eax
	addl	$272, %esp              # imm = 0x110
	popl	%ebp
	ret

	.data
L_.str1:                                # @.str1
	.asciz	 "Input your name: \n"

L_.str5:                                # @.str5
	.asciz	 "Hello, %s! \n"


