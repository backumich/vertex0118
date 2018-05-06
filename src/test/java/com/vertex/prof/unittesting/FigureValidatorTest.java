package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.FigureValidator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureValidatorTest {

    private FigureValidator underTest;

    @Before
    public void setUp() {
        underTest = new FigureValidatorImpl();
    }

    @Test
    public void validateTriangleSanityTest(){
        assertTrue("False case wasn't implemented",
                underTest.validateTriangle(3,4,5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTriangleWithZeroParameterTest(){
        underTest.validateTriangle(0,1,2);

        fail("Zero side length is forbidden");
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTriangleWithNegativeParameterTest(){
        underTest.validateTriangle(1,-1,2);

        fail("Negative side length is forbidden");
    }
    @Test(expected = IllegalArgumentException.class)
    public void validateTriangleWithUnacceptableParameterTest(){
        underTest.validateTriangle(1,1,8);

        fail("Sides of triangle should be good enough");
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateRectangleWithZeroParameterTest(){
        underTest.validateRectangle(0,1);

        fail("Sides of rectangle should not be zero");
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateRectangleWithNegativeParameterTest(){
        underTest.validateRectangle(-1,1);

        fail("Sides of rectangle should be positive");
    }
}