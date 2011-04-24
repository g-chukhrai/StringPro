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
	pushl	%esi
	subl	$276, %esp              # imm = 0x114
Llabel3:
	call	___main
	subl	$8, %esp
	movl	$L_.str1, (%esp)
	call	_printf
	addl	$8, %esp
	subl	$8, %esp
	leal	-264(%ebp), %eax
	movl	%eax, (%esp)
	call	_gets
	addl	$8, %esp
	movl	%eax, -8(%ebp)
	subl	$8, %esp
	movl	%eax, 4(%esp)
	movl	$L_.str5, (%esp)
	call	_printf
	addl	$8, %esp
	movl	-8(%ebp), %eax
	subl	$8, %esp
	movl	%eax, (%esp)
	call	_strlen
	addl	$8, %esp
	movl	%eax, -268(%ebp)
	movl	$0, -272(%ebp)
	movl	-268(%ebp), %eax
	movl	%eax, -276(%ebp)
	movl	$8, %esi
	jmp	LBB1_1
	.align	16, 0x90
LBB1_2:                                 # %start20
                                        #   in Loop: Header=BB1_1 Depth=1
	movl	%esi, %eax
	call	__alloca
	movl	-272(%ebp), %ecx
	movl	-8(%ebp), %edx
	movb	(%edx,%ecx), %cl
	movb	%cl, (%esp)
	movzbl	(%esp), %eax
	movl	-272(%ebp), %ecx
	movl	-8(%ebp), %edx
	subl	$16, %esp
	movl	%eax, 12(%esp)
	movl	%edx, 8(%esp)
	movl	%ecx, 4(%esp)
	movl	$L_.str15, (%esp)
	call	_printf
	addl	$16, %esp
	incl	-272(%ebp)
LBB1_1:                                 # %loop20
                                        # =>This Inner Loop Header: Depth=1
	movl	-276(%ebp), %eax
	cmpl	%eax, -272(%ebp)
	jl	LBB1_2
# BB#3:                                 # %end20
	movl	$1, %eax
	leal	-4(%ebp), %esp
	popl	%esi
	popl	%ebp
	ret

	.data
L_.str1:                                # @.str1
	.asciz	 "Input any string: \n"

L_.str5:                                # @.str5
	.asciz	 "String is %s! \n"

L_.str15:                               # @.str15
	.asciz	 "Char[%d] in string %s is %c \n"


