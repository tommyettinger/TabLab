@ECHO OFF
:Loop
IF "%1" == "" GOTO Done
java -jar tablab.jar %*
SHIFT
GOTO Loop
:Done
