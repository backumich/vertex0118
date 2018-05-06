package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.AreaCalculator;
import com.vertex.prof.unittesting.interfaces.FigureValidator;

public class AreaCalculatorImpl implements AreaCalculator {

    private FigureValidator figureValidator;

    public AreaCalculatorImpl(FigureValidator figureValidator) {
        this.figureValidator = figureValidator;
    }

    @Override
    public double triangleArea(double a, double b, double c) {
        figureValidator.validateTriangle(a, b, c);

        double p = halfPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double halfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    @Override
    public double rectangleArea(double a, double b) {
        figureValidator.validateRectangle(a, b);
        return a * b;
    }

}
