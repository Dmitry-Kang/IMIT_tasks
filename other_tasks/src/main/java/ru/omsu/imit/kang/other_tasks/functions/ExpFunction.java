package ru.omsu.imit.kang.other_tasks.functions;

public class ExpFunction implements IFunction {
    private double a, b, min, max;

    public ExpFunction(double a, double b, double min, double max) {
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
        return a*Math.exp(x) + b;
    }

    public double minBound() {
        return min;
    }

    public double maxBound() {
        return max;
    }

}
