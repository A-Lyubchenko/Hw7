package org.goit;


import org.goit.Shapes.*;

public class Main {
    public static void main(String[] args) {
        PrintShapes consolePrint = new Printer();
        consolePrint.print(new Circle());
        consolePrint.print(new Rectangle());
        consolePrint.print(new Square());
        consolePrint.print(new SuperPuper());
        consolePrint.print(new Triangle());

    }
}
