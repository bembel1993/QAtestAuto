package org.test;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class TriangleMethodsTest extends TestCase {

    private int a;
    private int b;
    private int c;
    private IncrementTriangleMethodsTest itpt;

    @Parameterized.Parameters
    public static Collection set_of_parameters() {
        return Arrays.asList(new Object[][]{
                {3, 10, 10},
                {8, 3, 5},
                {8, 3, 5}});
    }

    public TriangleMethodsTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Before
    public void setUp() {
        itpt = new IncrementTriangleMethodsTest();
    }

    @Test
    public void TriangleMethodsTest() {
        assertEquals(a,itpt.equals(a));
        assertEquals(b,itpt.equals(b));
        assertEquals(c,itpt.equals(c));
    }

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
    public void testVerification() {

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

    private class IncrementTriangleMethodsTest {
    }
}