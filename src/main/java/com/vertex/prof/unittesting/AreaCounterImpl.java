package com.vertex.prof.unittesting;

import com.vertex.prof.unittesting.interfaces.AreaCounter;
import com.vertex.prof.unittesting.interfaces.TriangleVerifier;

public class AreaCounterImpl implements AreaCounter {

    private TriangleVerifier triangleVerifier;

    public AreaCounterImpl(TriangleVerifier triangleVerifier) {
        this.triangleVerifier = triangleVerifier;
    }

    @Override
    public double triangleArea(double a, double b, double c) {
        triangleVerifier.verifyTriangle(a, b, c);

        double p = halfPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double halfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }


}
