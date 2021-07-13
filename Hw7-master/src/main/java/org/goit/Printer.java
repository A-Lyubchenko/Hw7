package org.goit;

public class Printer implements PrintShapes {
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getFigureName());
    }
}
