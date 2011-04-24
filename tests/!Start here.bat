::java -jar antlr.jar strgram.g
::java -jar stringpro.jar 
::echo %INPUT%.c to %INPUT%.ll
::llvm-gcc -O3 -emit-llvm %INPUT%.c -S -o %INPUT%.ll
::llvm-gcc hello.c -o hello
::llvm-gcc -O3 -emit-llvm hello.c -S -o hello.ll
::llvm-as -f hello.ll
::llc -f hello.bc
::llvm-gcc hello.s -o hello 
@ECHO OFF
goto start
:notExist
echo file %INPUT%.txt not exist
:start
set /P INPUT=Input example filename: %=%
if not exist %INPUT%.txt goto notExist
echo start creating %INPUT%.ll LLVM IR-code
java -jar stringpro.jar %INPUT%
echo %INPUT%.ll to %INPUT%.bc
llvm-as -f %INPUT%.ll
echo %INPUT%.bc to %INPUT%.s
llc -f %INPUT%.bc
echo %INPUT%.s to %INPUT%.exe
llvm-gcc -o %INPUT% %INPUT%.s

echo ....................................................................
echo run %INPUT%.exe file
%INPUT%
pause
goto end
:end