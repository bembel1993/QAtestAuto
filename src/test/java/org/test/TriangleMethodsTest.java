package org.test;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleMethodsTest extends TestCase {

    private TriangleMethods triangleMethods = new TriangleMethods();

    @DataProvider
    public Object[][] isTriangleEquilateral() {
        return new Object[][]{
                {triangleMethods.sedSide(8, 10, 4).equalateralOrIsosceles(), false},
                {triangleMethods.sedSide(8, 10, 7).equalateralOrIsosceles(), false},
                {triangleMethods.sedSide(10, 10, 10).equalateralOrIsosceles(), true},
                {triangleMethods.sedSide(8, 7, 1).equalateralOrIsosceles(), false},
        };
    }

    @DataProvider
    public Object[][] isTriangleVersatile() {
        return new Object[][]{
                {triangleMethods.sedSide(8, 10, 4).versatile(), false},
                {triangleMethods.sedSide(10, 10, 10).versatile(), true},
                {triangleMethods.sedSide(8, 8, 5).versatile(), true},
        };
    }

    @DataProvider
    public Object[][] isTriangleNotExists() {
        return new Object[][]{
                {triangleMethods.sedSide(8, 10, 4).notExist(), true},
                {triangleMethods.sedSide(10, 10, 10).notExist(), true},
                {triangleMethods.sedSide(5, 5, 5).notExist(), true},
        };
    }

    
    @Test(dataProvider = "isTriangleEquilateral")
    public void testTriangleEquilateral(boolean actualResult, boolean expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "isTriangleVersatile")
    public void testTriangleVersatile(boolean actualResult, boolean expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "isTriangleNotExists")
    public void testTriangleNotExists(boolean actualResult, boolean expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }
}