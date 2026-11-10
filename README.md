# Java Projects

Small Java programs for practicing beginner programming concepts. These are copies of existing class exercises; the originals remain in the original workspace.

## Projects

| Project | What it practices |
| --- | --- |
| [HelloWorld](projects/HelloWorld/HelloWorld.java) | Console output and a minimal Java program |
| [MadLibs](projects/MadLibs/MadLibs.java) | Console input, strings, and building a story |
| [MultiplicationTables](projects/MultiplicationTables/TableFor.java) | Nested `for` loops and a `while` loop |
| [RecursionDemo](projects/RecursionDemo/RecursionDemo.java) | Recursion and input validation |
| [SearchDemo](projects/SearchDemo/SearchDemo.java) | Linear search and return values |

## Requirements

- A Java Development Kit (JDK) with `javac` and `java` on `PATH`.
- No third-party libraries are required.

## Compile and run

Run commands from this repository's root in PowerShell. Compiled output goes into `out`, which Git ignores.

```powershell
New-Item -ItemType Directory -Force out
javac -d out projects\HelloWorld\HelloWorld.java
java -cp out HelloWorld
```

For another exercise, replace the source path and main class. For example:

```powershell
javac -d out projects\MultiplicationTables\TableFor.java projects\MultiplicationTables\TableWhile.java
java -cp out TableFor
java -cp out TableWhile
```

`MadLibs` and `RecursionDemo` read from the console, so enter the requested values after starting them.

## Verification

The six source files compile together with the installed OpenJDK 25. Smoke tests confirmed the expected Hello World, multiplication table, linear-search, recursion, and Mad Libs output.
