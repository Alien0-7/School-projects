@ECHO OFF

SET MODIFICA=false
SET /P TAVOLO="Inserisci il numero del tavolo: "

ECHO Benvenuto nel menu' del ristorante via console!

:ANTIPASTO
CHOICE /C 123C /N /M "ANTIPASTO: Premi 1 per Fiori di zucca con baccala', 2 per Cestini di pastasfoglia ripieni, 3 per Tagliere di affettati o C per niente."
IF ERRORLEVEL 1 SET ANTIPASTO=Fiori di zucca con baccala'
IF ERRORLEVEL 2 SET ANTIPASTO=Cestini di pastasfoglia ripieni
IF ERRORLEVEL 3 SET ANTIPASTO=Tagliere di affettati
IF ERRORLEVEL 4 SET ANTIPASTO=Niente
IF "%MODIFICA%"=="true" GOTO :MODIFICA

:PRIMO
CHOICE /C 123C /N /M "PRIMO: Premi 1 per Pasta al ragu', 2 per Spaghetti alla Carbonara, 3 per Spaghetti all'Amatriciana o C per niente."
IF ERRORLEVEL 1 SET PRIMO=Pasta al ragu'
IF ERRORLEVEL 2 SET PRIMO=Spaghetti alla Carbonara
IF ERRORLEVEL 3 SET PRIMO=Spaghetti all'Amatriciana
IF ERRORLEVEL 4 SET PRIMO=Niente
IF "%MODIFICA%"=="true" GOTO :MODIFICA

:SECONDO
CHOICE /C 123C /N /M "SECONDO: Premi 1 per Tagliata di manzo, 2 per Filetti di merluzzo, 3 per Frittura mista o C per niente."
IF ERRORLEVEL 1 SET SECONDO=Tagliata di manzo
IF ERRORLEVEL 2 SET SECONDO=Filetti di merluzzo
IF ERRORLEVEL 3 SET SECONDO=Frittura mista
IF ERRORLEVEL 4 SET SECONDO=Niente
IF "%MODIFICA%"=="true" GOTO :MODIFICA

:CONTORNO
CHOICE /C 123C /N /M "CONTORNO: Premi 1 per Erbe cotte, 2 per Patate al forno, 3 per Insalata mista o C per niente."
IF ERRORLEVEL 1 SET CONTORNO=Erbe cotte
IF ERRORLEVEL 2 SET CONTORNO=Patate al forno
IF ERRORLEVEL 3 SET CONTORNO=Insalata mista
IF ERRORLEVEL 4 SET CONTORNO=Niente
IF "%MODIFICA%"=="true" GOTO :MODIFICA

:DESSERT
CHOICE /C 123C /N /M "DESSERT: Premi 1 per Panna cotta, 2 per Tiramisu', 3 per Torta ai lamponi o C per niente."
IF ERRORLEVEL 1 SET DESSERT=Panna cotta
IF ERRORLEVEL 2 SET DESSERT=Tiramisu'
IF ERRORLEVEL 3 SET DESSERT=Torta ai lamponi
IF ERRORLEVEL 4 SET DESSERT=Niente
IF "%MODIFICA%"=="true" GOTO :MODIFICA

:MODIFICA
SET MODIFICA=true
CHOICE /C 12345C /N /M "Premi 1 per modificare l'antipasto, 2 per modificare il primo, 3 per modificare il secondo, 4 per modificare il contorno, 5 per modificare il dessert o C per Continuare."
IF ERRORLEVEL 6 (
  SET MODIFICA=false
  GOTO :RIEPILOGO
)
IF ERRORLEVEL 5 GOTO :DESSERT
IF ERRORLEVEL 4 GOTO :CONTORNO
IF ERRORLEVEL 3 GOTO :SECONDO
IF ERRORLEVEL 2 GOTO :PRIMO
IF ERRORLEVEL 1 GOTO :ANTIPASTO


:RIEPILOGO
ECHO Il tuo tavolo e' il numero %TAVOLO%, hai ordinato:

IF ANTIPASTO == "Niente" (
  ECHO   - Nessun antipasto selezionato

) ELSE (
  ECHO   - Antipasto: %ANTIPASTO%
)

IF PRIMO == "Niente" (
  ECHO   - Nessun primo selezionato

) ELSE (
  ECHO   - Primo: %PRIMO%
)

IF SECONDO == "Niente" (
  ECHO   - Nessun secondo selezionato

) ELSE (
  ECHO   - Secondo: %SECONDO%
)

IF CONTORNO == "Niente" (
  ECHO   - Nessun contorno selezionato

) ELSE (
  ECHO   - Contorno: %CONTORNO%
)

IF DESSERT == "Niente" (
  ECHO   - Nessun dessert selezionato

) ELSE (
  ECHO   - Dessert: %DESSERT%
)

ECHO Grazie per aver scelto dal nostro ristorante!
