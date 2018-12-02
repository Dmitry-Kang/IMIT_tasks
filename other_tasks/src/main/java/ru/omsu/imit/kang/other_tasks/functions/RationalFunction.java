package ru.omsu.imit.kang.other_tasks.functions;

public class RationalFunction implements IFunction {
    private double a, b, c, d, min, max;

    public RationalFunction(double a, double b, double c, double d, double min, double max) {
        if (min > max){
            throw new IllegalArgumentException("max should be >= min");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.min = min;
        this.max = max;
    }

    public double value(double x) throws FunctionException{
        if (x < min || x > max){
            throw new FunctionException("Argument out of bounds");
        }
        if (c*x + d == 0){
            throw new FunctionException("Denumerator is 0");
        }
        return (a*x + b)/(c*x + d);
    }

    public double minBound() {
        return min;
    }

    public double maxBound() {
        return max;
    }
}
