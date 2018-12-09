package ru.omsu.imit.kang.other_tasks.functionals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.omsu.imit.kang.other_tasks.functions.IFunction;
import ru.omsu.imit.kang.other_tasks.functions.LinearFunction;
import ru.omsu.imit.kang.other_tasks.functions.RationalFunction;

import static org.testng.Assert.assertEquals;

public class SumFunctionalTest {
    @DataProvider
    public static Object[][] definedData() {
        return new Object[][] {
                // TODO: this tests
                { new LinearFunction(0, 0, -1, 2), 0.0 },
                { new LinearFunction(0, 0, -1, 2), 0.0 }
        };
    }

    @Test(dataProvider = "definedData")
    public void testValue(IFunction f, double expectedValue) throws FunctionalException {
        IFunctional<IFunction> fl = new SumFunctional();

        assertEquals(expectedValue, fl.value(f));
    }

    @Test(expectedExceptions = { FunctionalException.class })
    public void testValueThrows() throws FunctionalException {
        IFunctional<IFunction> fl = new SumFunctional();
        IFunction f = new RationalFunction(1, 1, 0, 0, -1, 1);
        fl.value(f);
    }
}
