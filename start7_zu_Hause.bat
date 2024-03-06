@echo off

rem ***********************************************************
rem * Dies ist eine Batch-Datei mit Betriebssystemkommandos.  *
rem * Sie startet die Konsole ("Eingabeaufforderung").        *
rem ***********************************************************

rem -----------------------------------------------------------
rem Den Pfad auf den Ordner mit dem java-Compiler setzen:
rem -----------------------------------------------------------

rem set PATH=%PATH%;"C:\Program Files\Java\jdk1.7.0_01\bin"
    set PATH=%PATH%;"C:\Program Files\Java\jdk1.7.0_05\bin"
rem set PATH=%PATH%;"C:\Programme\Java\jdk1.6.0_21\bin"

rem -----------------------------------------------------------
rem Die Anzeige des aktuellen Pfades als "Bereitschaftszeichen"
rem ("prompt") in der Konsole ausblenden:
rem -----------------------------------------------------------

prompt $g

rem -----------------------------------------------------------
rem den Konsolen-Bildschirm loeschen:
rem -----------------------------------------------------------

cls

rem -----------------------------------------------------------
rem Den Kommandointerpreter ("Eingabeaufforderung") starten:
rem -----------------------------------------------------------

cmd
