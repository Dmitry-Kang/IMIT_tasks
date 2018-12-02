package ru.omsu.imit.kang.other_tasks.functions;

public interface IFunction {
    double value(double x) throws FunctionException;
    double minBound();
    double maxBound();

}
