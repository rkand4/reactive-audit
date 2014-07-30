rem @echo off
setlocal
set VERSION=0.0.2-SNAPSHOT
if "%HOME%"=="" set "HOME=%~dp0"

REM Reset
if exist %HOME%\home\etc (
  rmdir %HOME%\home\etc
  rmdir /S /Q %HOME%\home
)

mkdir %HOME%\home\bin
mkdir %HOME%\home\lib

pushd %HOME%\home\bin
mklink debug-audit-reactive.bat ..\..\src\test\bin\debug-audit-reactive.bat
mklink debug-audit-reactive ..\..\src\test\bin\debug-audit-reactive
mklink init-audit-reactive.bat ..\..\src\main\dist\bin\init-audit-reactive.bat
mklink init-audit-reactive ..\..\src\main\dist\bin\init-audit-reactive
popd

pushd %HOME%\home
mklink /D etc ..\src\main\dist\etc
popd

pushd %HOME%\home\lib
mklink aspectjweaver.jar %ASPECTJ_HOME%\lib\aspectjweaver.jar
mklink audit-reactive-lib.jar ..\..\audit-reactive-lib\build\libs\audit-reactive-lib-%VERSION%.jar
mklink audit-reactive.jar ..\..\build\libs\audit-reactive-%VERSION%.jar
popd

