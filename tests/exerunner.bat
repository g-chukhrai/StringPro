@ECHO OFF
goto start
:notExist
echo file %INPUT%.exe not exist
:start
set /P INPUT=Input example filename: %=%
if not exist %INPUT%.txt goto notExist
echo run %INPUT%.exe file
%INPUT%
pause