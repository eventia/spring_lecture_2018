@echo off
echo ù��° �μ� : %1

if [%1] EQU []  ( 
echo NoParameter
color 0A
echo 11111 
color 07
) else ( 
color 0A
echo %1
echo 22222
color 07
)
