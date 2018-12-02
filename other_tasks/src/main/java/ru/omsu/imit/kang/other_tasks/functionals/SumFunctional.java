package ru.omsu.imit.kang.other_tasks.functionals;

import ru.omsu.imit.kang.other_tasks.functions.FunctionException;
import ru.omsu.imit.kang.other_tasks.functions.IFunction;

public class SumFunctional implements IFunctional<IFunction> {

    public double value(IFunction f) throws FunctionalException {
        double center = (f.maxBound() + f.minBound()) / 2.0;
        try {
            return f.value(f.minBound()) + f.value(f.maxBound()) + f.value(center);
        } catch (FunctionException e) {
            throw new FunctionalException(e);
        }
    }
}
