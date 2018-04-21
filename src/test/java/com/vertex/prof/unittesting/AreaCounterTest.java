package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.AreaCounter;
import com.vertex.prof.unittesting.interfaces.TriangleVerifier;
import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;


public class AreaCounterTest {

//    @Rule
//    public Timeout timeout = Timeout.millis(1);

    private static final double DELTA = 0.001;
    private AreaCounter underTest;
    private TriangleVerifier triangleVerifier;

    @BeforeClass
    public static void init(){
        System.out.println("In before class");
    }

    @Before
    public void setUp() {
        System.out.println("In before");
        triangleVerifier = new TriangleVerifierImpl();
        underTest = new AreaCounterImpl(triangleVerifier);
    }

    @Test(timeout = 100)
    public void triangleAreaSanityTest() {
        double actual = underTest.triangleArea(3, 4, 5);
        double expected = 6;
        assertEquals("Actual result was not in delta close to expected",
                expected, actual, DELTA);
    }

    @Test
    public void triangleAreaSanityTestWithDoubledArgs() {
        double actual = underTest.triangleArea(6, 8, 10);
        double expected = 24;
        assertThat("Actual result was not in delta close to expected",
                expected, closeTo(actual, DELTA));
    }

    @Test(timeout = 100)
    public void triangleAreaWithMixedArgs() {
        double actualFirst = underTest.triangleArea(4, 5, 6);
        double actualSecond = underTest.triangleArea(4, 6, 5);
        assertThat("Actual result was not in delta close to expected",
                actualSecond, closeTo(actualFirst, DELTA));
    }

    @After
    public void tearDown() {
        System.out.println("in after method");
    }
}