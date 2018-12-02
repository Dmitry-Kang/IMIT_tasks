package ru.omsu.imit.kang.other_tasks.functions;

public class LinearFunction implements IFunction {
    private double a, b, min, max;

    public LinearFunction(double a, double b, double min, double max) {
        if (min > max){
            throw new IllegalArgumentException("max should be >= min");
        }
        this.a = a;
        this.b = b;
        this.min = min;
        this.max = max;
    }

    public double value(double x) throws FunctionException{
        if (x < min || x > max){
            throw new FunctionException("Argument out of bounds");
        }
        return a*x + b;
    }

    public double minBound() {
        return min;
    }

    public double maxBound() {
        return max;
    }
}
