

	.text
	.align	4,0x90
	.globl	_g
_g:
Leh_func_begin1:
Llabel1:
	subl	$8, %esp
	movl	12(%esp), %eax
	movl	%eax, 4(%esp)
	movl	16(%esp), %eax
	movl	%eax, (%esp)
	cmpl	%eax, 4(%esp)
	jne	LBB1_2	## false6
LBB1_1:	## true6
	movl	4(%esp), %eax
	addl	$8, %esp
	ret
LBB1_2:	## false6
	movl	(%esp), %eax
	addl	$8, %esp
	ret
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

	.globl	_g.eh
_g.eh = 0
	.no_dead_strip	_g.eh

	.subsections_via_symbols

