package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.FigureValidator;

public class FigureValidatorImpl implements FigureValidator {
    @Override
    public boolean validateTriangle(double a, double b, double c) {
        return zeroNegativeCheck(a, b, c) && triangleInequalityCheck(a, b, c);
    }

    private boolean triangleInequalityCheck(double a, double b, double c) {
        if((a + b <= c) || (a + c <= b) || (b + c <= a)){
            throw new IllegalArgumentException("The triangle inequality is violated");
        }
        return true;
    }

    private boolean zeroNegativeCheck(double a, double b, double c) {
        if(a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("Side can't be zero or negative number");
        }
        return true;
    }

    @Override
    public boolean validateRectangle(double a, double b) {
        if(a <= 0 || b <= 0){
            throw new IllegalArgumentException("Sides of rectangular couldn't be zero or negative");
        }
        return true;
    }
}
