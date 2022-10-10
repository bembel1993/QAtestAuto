package org.test;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Проинициализированные стороны треугольника
        int a = 8;
        int b = 10;
        int c = 4;

        TriangleMethods triangle = new TriangleMethods(a, b, c);

        Scanner sc1 = new Scanner(System.in);
        int sA = 0;
        int sB = 0;
        int sC = 0;

        //Ввод 1 стороны треугольника
        System.out.println("Input 1 side: ");//0-10
        try {
            sA = sc1.nextInt();
        } catch (Exception exception) {
            System.out.println("Char not pass !");
        }

        //Ввод 2 стороны треугольника
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Inpu 2 side: ");//0-10
        try {
            sB = sc2.nextInt();
        } catch (Exception exception) {
            System.out.println("Char not pass !");
        }

        //Ввод 3 стороны треугольника
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Input 3 side: ");//0-10
        try {
            sC = sc3.nextInt();
        } catch (Exception exception) {
            //exception.printStackTrace();
            System.out.println("Char not pass !");
        }

        //Вывод сторон треугольника в таблицу
        System.out.println("");
        System.out.format("%27s%10s%10s%10s", "ONE SIDE|", "TWO SIDE|", "THREE SIDE|", "");
        System.out.println("");
        //Проинициализированные стороны
        System.out.format("%5s%10s%10s%10s", "ACTUAL SIDE      ", a + " |", b + " |", c + " |");
        System.out.println("");
        //Стороны введенные пользователем
        System.out.format("%10s%10s%10s%10s", "INPUT SIDES USER ", sA + " |", sB + " |", sC + " |");
        System.out.println(" ");
        System.out.println("Conclusion: ");

        if (sA == a && sB == b && sC == c) {
            //Вызов методов проверки
            if (triangle.notExist(a, b, c)) {
                if (triangle.versatile(a, b, c)) {
                    if (triangle.equalateralOrIsosceles()) {
                    }
                }
            }
            ///////////////////////////////////////////////////////////////////////////
            System.out.println(" ");
            System.out.println("Verification");

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
        } else {
            System.out.println("Not input side !");
        }
    }
}
