#!/bin/sh

PROGRAM_NAME=BankApp.java

javac -d ./ ./src/**/*.java
javac -d ./ ./src/*.java

if [ $? -eq 0 ]
then
    echo "Successful Compilation!"
    java BankApp
fi