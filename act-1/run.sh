#!/bin/bash
echo "Compiling Main.java..."
javac Main.java

if [ $? -eq 0 ]; then
    echo "Running Main.java..."
    java Main
else
    echo "Compilation failed."
fi
