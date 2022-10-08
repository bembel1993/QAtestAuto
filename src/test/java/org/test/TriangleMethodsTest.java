package org.test;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TriangleMethodsTest extends TestCase {
    int a = 8;
    int b = 10;
    int c = 4;

    @Test
    public void testEqualateralOrIsosceles() {
        if (a == b && a == c && b == c) {
            System.out.println("Triangle is equilateral (равносторонний)");
            assertTrue(true);
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangle isosceles (равнобедренный)");
            assertTrue(true);
        } else {
            System.out.println("Method no pass");
            assertFalse(false);
        }
    }
    @Test
    public void testVersatile() {
        if (a == b || a == c || b == c) {
            System.out.println("Methode versatile not use");
            assertFalse(false);
        } else {
            System.out.println("Triangle versatile (разносторонний)");
            assertTrue(true);
        }
    }
    @Test
    public void testNotExist() {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Methode notExist not use");
        } else {
            System.out.println("Triangle does not exist");
        }
        assertTrue(true);
    }
    @Test
    public void testVerification(){

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
        assertTrue(true);
    }

}