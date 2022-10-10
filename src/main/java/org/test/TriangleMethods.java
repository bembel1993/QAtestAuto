package org.test;

public class TriangleMethods {
    private int a;
    private int b;
    private int c;

    public TriangleMethods(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleMethods() {
    }

    public TriangleMethods sedSide(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        return this;
    }

    @Override
    public String toString() {
        return "TriangleMethods{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public boolean equalateralOrIsosceles() {
        return (a == b && a == c && b == c);
    }


    public boolean versatile() {
        if (a == b || a == c || b == c) {
            System.out.println("Methode versatile not use");
        } else {
            System.out.println("Triangle versatile (разносторонний)");
        }
        return (a == b || a == c || b == c);
    }

    public boolean notExist() {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Methode notExist not use");
        } else {
            System.out.println("Triangle does not exist");
        }
        return (a + b > c && a + c > b && b + c > a);
    }

    public void verification(int a, int b, int c) {

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b || a == c || b == c) {
                if (a == b && a == c && b == c) {
                    System.out.println("Triangle is equilateral (равносоторнний)");
                } else {
                    System.out.println("Triangle isosceles (равнобедренный)");
                }
            } else {
                System.out.println("Triangle versatile (разносторонний)");
            }
        } else {
            System.out.println("Triangle does not exist (не существует)");
        }
    }
}
