package ru.omsu.imit.kang.other_tasks.functionals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.omsu.imit.kang.other_tasks.functions.IFunction;
import ru.omsu.imit.kang.other_tasks.functions.LinearFunction;
import ru.omsu.imit.kang.other_tasks.functions.RationalFunction;

import static org.testng.Assert.assertEquals;

public class DefiniteIntegralTest {
    @DataProvider
    public static Object[][] definedData() {
        return new Object[][] {
                // TODO: this tests
                { new LinearFunction(0, 0, -1, 2), 0.0, 25 },
                { new LinearFunction(0, 0, -1, 2), 0.0, 25 }
        };
    }

    @Test(dataProvider = "definedData")
    public void testValue(IFunction f, double expectedValue, int divisions) throws FunctionalException {
        IFunctional<IFunction> fl = new DefiniteIntegral(divisions);

        assertEquals(expectedValue, fl.value(f));
    }

    @Test(expectedExceptions = { FunctionalException.class })
    public void testValueThrows() throws FunctionalException {
        IFunctional<IFunction> fl = new DefiniteIntegral(10);
        IFunction f = new RationalFunction(1, 1, 0, 0, -1, 1);
        fl.value(f);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void constructWithZeroDivisions() throws IllegalArgumentException {
        new DefiniteIntegral(0);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void constructWithNegativeDivisions() throws IllegalArgumentException {
        new DefiniteIntegral(-10);
    }
}
