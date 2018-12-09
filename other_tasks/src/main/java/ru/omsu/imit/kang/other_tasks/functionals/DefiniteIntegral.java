package ru.omsu.imit.kang.other_tasks.functionals;

import ru.omsu.imit.kang.other_tasks.functions.FunctionException;
import ru.omsu.imit.kang.other_tasks.functions.IFunction;

public class DefiniteIntegral implements IFunctional<IFunction> {
    private int parts;
    public DefiniteIntegral(int parts) {
        if (parts <= 0) {
            throw new IllegalArgumentException("Count of parts must be greater than 0");
        }
        this.parts = parts;
    }

    public double value(IFunction f) throws FunctionalException {
        double a = f.minBound(), b = f.maxBound();
        double h = (b - a) / parts;
        double s;

        try {
            s = (f.value(a) + f.value(b)) / 2;
            for (int i = 1; i < parts; i++) {
                s += f.value(a + i*h);
            }
        } catch (FunctionException e) {
            throw new FunctionalException(e);
        }

        return h * s;
    }
}
