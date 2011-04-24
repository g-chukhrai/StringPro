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
	subl	$288, %esp              # imm = 0x120
Llabel3:
	call	___main
	movl	$L_.str1, -4(%ebp)
	leal	-264(%ebp), %eax
	movl	%eax, -8(%ebp)
	movl	$0, -268(%ebp)
	movl	$0, -272(%ebp)
	movl	$5, -276(%ebp)
	jmp	LBB1_1
	.align	16, 0x90
LBB1_2:                                 # %start14
                                        #   in Loop: Header=BB1_1 Depth=1
	movl	-268(%ebp), %eax
	movl	-4(%ebp), %ecx
	movb	(%ecx,%eax), %cl
	movl	-8(%ebp), %edx
	movb	%cl, (%edx,%eax)
	incl	-268(%ebp)
	incl	-272(%ebp)
LBB1_1:                                 # %loop14
                                        # =>This Inner Loop Header: Depth=1
	movl	-276(%ebp), %eax
	cmpl	%eax, -272(%ebp)
	jl	LBB1_2
# BB#3:                                 # %end14
	movl	-4(%ebp), %eax
	movl	%eax, 4(%esp)
	movl	$L_.str15, (%esp)
	call	_printf
	movl	-8(%ebp), %eax
	movl	%eax, 4(%esp)
	movl	$L_.str17, (%esp)
	call	_printf
	movl	$1, %eax
	addl	$288, %esp              # imm = 0x120
	popl	%ebp
	ret

	.data
L_.str1:                                # @.str1
	.asciz	 "Hello"

L_.str15:                               # @.str15
	.asciz	 "s1 = %s \n"

L_.str17:                               # @.str17
	.asciz	 "s2 = %s \n"


