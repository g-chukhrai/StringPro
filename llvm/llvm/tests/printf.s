

	.text
	.align	4,0x90
	.globl	_f
_f:
Leh_func_begin1:
Llabel1:
	subl	$12, %esp
	movl	$_s1, (%esp)
	call	_printf
	movl	$99, 4(%esp)
	movl	$_s2, (%esp)
	call	_printf
	addl	$12, %esp
	ret
Leh_func_end1:
	.cstring
_s1:				## s1
	.asciz	"hello, world\n"
_s2:				## s2
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

	.globl	_f.eh
_f.eh:
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
	.byte	0x4
	.set	Lset4eh,Llabel1-Leh_func_begin1
	.long	Lset4eh
	.byte	0xD
	.byte	0x5
	.align	2
Leh_frame_end1:
	.subsections_via_symbols

