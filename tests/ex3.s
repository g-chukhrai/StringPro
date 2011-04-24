	.def	 _reverseString;	.scl	2;	.type	32;	.endef
	.text
	.globl	_reverseString
	.align	16, 0x90
_reverseString:                         # @reverseString
# BB#0:
	pushl	%esi
Llabel1:
	subl	$288, %esp              # imm = 0x120
Llabel2:
	movl	296(%esp), %eax
	movl	%eax, 284(%esp)
	leal	24(%esp), %eax
	movl	%eax, 280(%esp)
	movl	284(%esp), %ecx
	movl	%ecx, 4(%esp)
	movl	%eax, (%esp)
	call	_strcpy
	movb	$33, 23(%esp)
	movl	$0, 16(%esp)
	movl	280(%esp), %eax
	movl	%eax, (%esp)
	call	_strlen
	movl	%eax, 12(%esp)
	jmp	LBB1_1
	.align	16, 0x90
LBB1_2:                                 # %start28
                                        #   in Loop: Header=BB1_1 Depth=1
	movl	284(%esp), %esi
	movl	280(%esp), %eax
	movl	%eax, (%esp)
	call	_strlen
	movl	16(%esp), %ecx
	leal	1(%ecx), %edx
	subl	%edx, %eax
	movb	(%esi,%eax), %al
	movl	280(%esp), %edx
	movb	%al, (%edx,%ecx)
	movl	16(%esp), %eax
	movl	280(%esp), %ecx
	movzbl	(%ecx,%eax), %ecx
	movl	%ecx, 8(%esp)
	movl	%eax, 4(%esp)
	movl	$L_.str22, (%esp)
	call	_printf
	incl	16(%esp)
LBB1_1:                                 # %loop28
                                        # =>This Inner Loop Header: Depth=1
	movl	12(%esp), %eax
	cmpl	%eax, 16(%esp)
	jl	LBB1_2
# BB#3:                                 # %end28
	movl	280(%esp), %eax
	addl	$288, %esp              # imm = 0x120
	popl	%esi
	ret

	.def	 _compareStrings;	.scl	2;	.type	32;	.endef
	.globl	_compareStrings
	.align	16, 0x90
_compareStrings:                        # @compareStrings
# BB#0:
	subl	$284, %esp              # imm = 0x11C
Llabel3:
	movl	288(%esp), %eax
	movl	%eax, 280(%esp)
	movl	292(%esp), %eax
	movl	%eax, 276(%esp)
	movl	280(%esp), %ecx
	movl	%eax, 4(%esp)
	movl	%ecx, (%esp)
	call	_strcmp
	movl	%eax, 272(%esp)
	leal	12(%esp), %eax
	movl	%eax, 268(%esp)
	cmpl	$0, 272(%esp)
	jns	LBB2_2
# BB#1:                                 # %true40
	movl	$L_.str38, 268(%esp)
LBB2_2:                                 # %false40
	cmpl	$0, 272(%esp)
	jne	LBB2_4
# BB#3:                                 # %true46
	movl	$L_.str44, 268(%esp)
LBB2_4:                                 # %false46
	cmpl	$0, 272(%esp)
	jle	LBB2_6
# BB#5:                                 # %true52
	movl	$L_.str50, 268(%esp)
LBB2_6:                                 # %false52
	movl	268(%esp), %eax
	addl	$284, %esp              # imm = 0x11C
	ret

	.def	 _main;	.scl	2;	.type	32;	.endef
	.globl	_main
	.align	16, 0x90
_main:                                  # @main
# BB#0:
	pushl	%ebp
Llabel4:
	movl	%esp, %ebp
Llabel5:
	pushl	%ebx
	pushl	%edi
	pushl	%esi
	subl	$12, %esp
Llabel6:
	call	___main
	movl	$0, -16(%ebp)
	movl	_globalVar, %eax
	movl	%eax, -20(%ebp)
	jmp	LBB3_1
	.align	16, 0x90
LBB3_2:                                 # %start59
                                        #   in Loop: Header=BB3_1 Depth=1
	movl	-16(%ebp), %eax
	subl	$16, %esp
	movl	%eax, 4(%esp)
	movl	$L_smthGlobal, 8(%esp)
	movl	$L_.str55, (%esp)
	call	_printf
	addl	$16, %esp
	incl	-16(%ebp)
LBB3_1:                                 # %loop59
                                        # =>This Inner Loop Header: Depth=1
	movl	-20(%ebp), %eax
	cmpl	%eax, -16(%ebp)
	jl	LBB3_2
# BB#3:                                 # %end59
	subl	$8, %esp
	movl	$L_.str61, (%esp)
	call	_printf
	addl	$8, %esp
	movl	$8, %esi
	movl	$8, %eax
	call	__alloca
	movl	%esp, %edi
	movl	$256, %eax              # imm = 0x100
	call	__alloca
	movl	%esp, %eax
	subl	$8, %esp
	movl	%eax, (%esp)
	call	_gets
	addl	$8, %esp
	movl	%eax, (%edi)
	subl	$8, %esp
	movl	%eax, 4(%esp)
	movl	$L_.str65, (%esp)
	call	_printf
	addl	$8, %esp
	movl	%esi, %eax
	call	__alloca
	movl	%esp, %ebx
	movl	(%edi), %eax
	subl	$8, %esp
	movl	%eax, (%esp)
	call	_reverseString
	addl	$8, %esp
	movl	%eax, (%ebx)
	movl	(%edi), %ecx
	subl	$16, %esp
	movl	%eax, 8(%esp)
	movl	%ecx, 4(%esp)
	movl	$L_.str70, (%esp)
	call	_printf
	addl	$16, %esp
	movl	%esi, %eax
	call	__alloca
	movl	%esp, %esi
	movl	(%edi), %eax
	movl	(%ebx), %ecx
	subl	$8, %esp
	movl	%ecx, 4(%esp)
	movl	%eax, (%esp)
	call	_compareStrings
	addl	$8, %esp
	movl	%eax, (%esi)
	movl	(%edi), %ecx
	movl	(%ebx), %edx
	subl	$16, %esp
	movl	%edx, 12(%esp)
	movl	%eax, 8(%esp)
	movl	%ecx, 4(%esp)
	movl	$L_.str77, (%esp)
	call	_printf
	addl	$16, %esp
	movl	$1, %eax
	leal	-12(%ebp), %esp
	popl	%esi
	popl	%edi
	popl	%ebx
	popl	%ebp
	ret

	.data
L_smthGlobal:                           # @smthGlobal
	.asciz	 "You can call me everywhere! \n"

L_.str22:                               # @.str22
	.asciz	 "new[%d] = %c \n"

L_.str38:                               # @.str38
	.asciz	 "less"

L_.str44:                               # @.str44
	.asciz	 "equals"

L_.str50:                               # @.str50
	.asciz	 "more"

L_.str55:                               # @.str55
	.asciz	 "%d. %s"

L_.str61:                               # @.str61
	.asciz	 "Input some string: "

L_.str65:                               # @.str65
	.asciz	 "read %s \n"

L_.str70:                               # @.str70
	.asciz	 "String reversed: old: %s -> new: %s \n"

L_.str77:                               # @.str77
	.asciz	 "String %s %s string %s \n"

	.globl	_globalVar
	.align	4
_globalVar:                             # @globalVar
	.long	3                       # 0x3


