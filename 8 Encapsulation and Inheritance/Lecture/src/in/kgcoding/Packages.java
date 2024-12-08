package in.kgcoding;

import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        in.knowledgegate.Packages packages = new in.knowledgegate.Packages();
    }
}


/*
<----------------------------------------------------{"Using Packages in Deep"}--------------------------------------------------------------->

1.Package Definition:-----> A package in Java is a namespace that organizes classes and interfaces, preventing naming conflicts.
2.Package Declaration:----> Packages are declared at the beginning of a Java source file using the package keyword followed by the package name.
                            1.Built-in-packages: We already have various pre-defined packages and these packages contain
                                                 large numbers of classes and interfaces.
                            2.User-defined-packages: As the name suggests user-defined packages are a package that is defined by the user.
3.Import Statement:-------> An import statement in java is used to bring in classes or interfaces from other packages into
                            the current file, making them accessible without using a fully  qualified name.
4.Types of Import:--------> 1.Single-Type-Import: Imports a single class or interface from a package(e.g., import java.util.List;).
                            2.On-Demand-Import: Import all classes and interfaces from a package(e.g., import java.util.*;).
5.Avoiding Collisions:----> Packages help in avoiding name collisions by categorizing similar classes together.
6.Built-in-Packages:------> Java comes with built-in-packages like java.lang(automatically imported), java.util, java.io, etc.



 */


