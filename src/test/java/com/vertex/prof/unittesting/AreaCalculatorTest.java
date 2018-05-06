package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.AreaCalculator;
import com.vertex.prof.unittesting.interfaces.FigureValidator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class AreaCalculatorTest {

//    @Rule
//    public Timeout timeout = Timeout.millis(1);

    private static final double DELTA = 0.001;
    private AreaCalculator underTest;

    @Mock
    private FigureValidator figureValidator;

    @BeforeClass
    public static void init() {
        System.out.println("It has to be executed before the whole test class");
    }

    @Before
    public void setUp() {
        System.out.println("It has to be executed before every test method");
//        MockitoAnnotations.initMocks(this);
        underTest = new AreaCalculatorImpl(figureValidator);
    }

    @Test
    public void triangleAreaCallsVerifierTest() {
        underTest.triangleArea(6, 8, 10);
        verify(figureValidator).validateTriangle(6, 8, 10);
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

    @Test(expected = IllegalArgumentException.class)
    public void triangleAreaWhenValidationIsNotPassedTest(){
        when(figureValidator.validateTriangle(1,1,1))
                .thenThrow(new IllegalArgumentException());

        underTest.triangleArea(1,1,1);
        fail("Exception should be passed");
    }


    @Test
    public void rectangleAreaNeedValidationTest() {
        underTest.rectangleArea(1, 2);
        verify(figureValidator).validateRectangle(1, 2);
    }

    @Test
    public void rectangleAreaSanityTest() {
        double actual = underTest.rectangleArea(5, 2);
        double expected = 5 * 2;
        assertEquals("Actual result was not in delta close to expected",
                expected, actual, DELTA);
    }

    @Test
    public void rectangleAreaSanityTestWithParametersInDifOrder() {
        double actual = underTest.rectangleArea(6, 2);
        double expected = underTest.rectangleArea(2, 6);
        assertEquals("Actual result was not in delta close to expected",
                expected, actual, DELTA);
    }

    @After
    public void tearDown() {
        System.out.println("It has to be executed after every test method");
    }

    @AfterClass
    public static void farewell() {
        System.out.println("It has to be executed after the whole test class");
    }
}