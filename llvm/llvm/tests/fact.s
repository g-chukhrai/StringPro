

	.text
	.align	4,0x90
	.globl	_fact
_fact:
Leh_func_begin1:
Llabel1:
	pushl	%esi
	subl	$8, %esp
	movl	16(%esp), %eax
	movl	%eax, 4(%esp)
	cmpl	$1, %eax
	jg	LBB1_3	## false5
LBB1_1:	## true5
	movl	$1, %eax
LBB1_2:	## true5
	addl	$8, %esp
	popl	%esi
	ret
LBB1_3:	## false5
	movl	4(%esp), %esi
	leal	-1(%esi), %eax
	movl	%eax, (%esp)
	call	_fact
	imull	%esi, %eax
	jmp	LBB1_2	## true5
Leh_func_end1:

.section __TEXT,__eh_frame,coalesced,no_toc+strip_static_syms+live_support
EH_frame0:
Lsection_eh_frame:
Leh_frame_common:
	.set	Lset1eh,Leh_frame_common_end-Leh_frame_common_begin
	.long	Lset1eh
Leh_frame_common_begin:
	.long	0x0
	.byte	0x1
	.asciz	"zR"
	.byte	0x1
	.byte	0x7C
	.byte	0x8
	.byte	0x1
	.byte	0x1B
	.byte	0xC
	.byte	0x5
	.byte	0x4
	.byte	0x88
	.byte	0x1
	.align	2
Leh_frame_common_end:

	.globl	_fact.eh
_fact.eh:
	.set	Lset2eh,Leh_frame_end1-Leh_frame_begin1
	.long	Lset2eh
Leh_frame_begin1:
	.long	Leh_frame_begin1-EH_frame0
	.long	Leh_func_begin1-.
	.set	Lset3eh,Leh_func_end1-Leh_func_begin1
	.long	Lset3eh
	.byte	0x0
	.byte	0xE
	.byte	0x10
	.byte	0x86
	.byte	0x2
	.byte	0x4
	.set	Lset4eh,Llabel1-Leh_func_begin1
	.long	Lset4eh
	.byte	0xD
	.byte	0x5
	.align	2
Leh_frame_end1:
	.subsections_via_symbols

