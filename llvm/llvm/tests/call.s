

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
	addl	4(%esp), %eax
	addl	$8, %esp
	ret
Leh_func_end1:


	.align	4,0x90
	.globl	_f
_f:
Leh_func_begin2:
Llabel2:
	subl	$12, %esp
	movl	$2, 4(%esp)
	movl	$1, (%esp)
	call	_g
	movl	%eax, 4(%esp)
	movl	$_s1, (%esp)
	call	_printf
	addl	$12, %esp
	ret
Leh_func_end2:
	.cstring
_s1:				## s1
	.asciz	"%d\n"

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

	.globl	_f.eh
_f.eh:
	.set	Lset2eh,Leh_frame_end2-Leh_frame_begin2
	.long	Lset2eh
Leh_frame_begin2:
	.long	Leh_frame_begin2-EH_frame0
	.long	Leh_func_begin2-.
	.set	Lset3eh,Leh_func_end2-Leh_func_begin2
	.long	Lset3eh
	.byte	0x0
	.byte	0xE
	.byte	0x10
	.byte	0x4
	.set	Lset4eh,Llabel2-Leh_func_begin2
	.long	Lset4eh
	.byte	0xD
	.byte	0x5
	.align	2
Leh_frame_end2:
	.subsections_via_symbols

