package ru.omsu.imit.kang.other_tasks.functionals;

import ru.omsu.imit.kang.other_tasks.functions.IFunction;

public interface IFunctional <T extends IFunction> {
    double value(T x) throws FunctionalException;
}
