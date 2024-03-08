@ECHO OFF

SET Esercizi_dosPATH=
SET /P Esercizi_dosPATH= Scrivi la PATH della cartella Esercizi-dos salvata nel computer: 
 
:while1
if not exist %Esercizi_dosPATH%\Esercizi-dos\ (
   ECHO La cartella non esiste!
   SET /P Esercizi_dosPATH=Riscrivi la PATH della cartella Esercizi-dos salvata nel computer: 
   goto :while1
)

ECHO INSERISCI LA CHIAVETTA
PAUSE

SET ChiavettaPATH=
SET /P ChiavettaPATH= Scrivi la PATH della Chiavetta: 


:while2
if not exist %ChiavettaPATH% (
   ECHO La cartella non esiste!
   SET /P ChiavettaPATH=Riscrivi la PATH della Chiavetta: 
   goto :while2
)

ECHO;
ECHO Per interrompere l'esecuzione digitare CTRL+C
ECHO Copiero' i file dalla cartella %Esercizi_dosPATH% alla cartella %ChiavettaPATH%
MKDIR %ChiavettaPATH%\Esercizi-dos
PAUSE

XCOPY %Esercizi_dosPATH%\Esercizi-dos\ %ChiavettaPATH%\Esercizi-dos\ /y /e

ECHO;
ECHO FINITO!!
