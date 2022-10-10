package org.test;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleMethodsTest extends TestCase {

    private TriangleMethods triangleMethods = new TriangleMethods();

    @DataProvider
    public Object[][] isTriangleEquilateralTestData() {
        return new Object[][]{
                {triangleMethods.sedSide(8, 10, 4).equalateralOrIsosceles(), false},
                {triangleMethods.sedSide(8, 10, 7).equalateralOrIsosceles(), false},
                {triangleMethods.sedSide(10, 10, 10).equalateralOrIsosceles(), true},
                {triangleMethods.sedSide(8, 7, 1).equalateralOrIsosceles(), false},
        };
    }



    
    @Test(dataProvider = "isTriangleEquilateralTestData")
    public void testTriangleIsosceles(boolean actualResult, boolean expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

}