package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.TriangleVerifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleVerifierTest {

    private TriangleVerifier underTest;

    @Before
    public void setUp() {
        underTest = new TriangleVerifierImpl();
    }

    @Test
    public void verifyTriangleSanityTest(){
        assertTrue("False case wasn't implemented",
                underTest.verifyTriangle(3,4,5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyTriangleWithZeroParameterTest(){
        underTest.verifyTriangle(0,1,2);

        fail("Zero side length is forbidden");
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyTriangleWithNegativeParameterTest(){
        underTest.verifyTriangle(1,-1,2);

        fail("Negative side length is forbidden");
    }
    @Test(expected = IllegalArgumentException.class)
    public void verifyTriangleWithUnacceptableParameterTest(){
        underTest.verifyTriangle(1,1,8);

        fail("Sides of triangle should be good enough");
    }

}