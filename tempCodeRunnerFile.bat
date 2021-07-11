if exist %cd%\ExecutableJAR\*.zip 
(
    del /Q %cd%\ExecutableJAR\*.jar 
    del /Q %cd%\ExecutableJAR\*.zip
)