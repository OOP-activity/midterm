#!/bin/bash
echo "Compiling src/Main.java into out/..."
javac -d out src/Main.java

if [ $? -eq 0 ]; then
    echo "Running com.example.Main from out/..."
    java -cp out src.Main
else
    echo "Compilation failed."
fi
