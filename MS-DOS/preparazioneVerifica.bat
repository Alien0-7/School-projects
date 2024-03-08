@ECHO OFF

SET PATHESERCIZI="D:\Esercizio-dos"

cd %PATHESERCIZI%

cd A2000
mkdir ESER
cd ESER
type nul>esercizio.txt

cd ..\..\A1999
rmdir INV
mkdir FIL
cd FIL
XCOPY ..\..\A1998\AUT .\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\.\
DEL /q ..\..\A1998\AUT

ECHO FINITO!