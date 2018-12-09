package ru.omsu.imit.kang.other_tasks.functions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;


public class RationalFunctionTest {
    @DataProvider
    public static Object[][] definedData() {
        return new Object[][] {
                // TODO: this tests
                { 0.0, 0.0, 1.0, 1.0, -1.0, 1.0, 0.0, 0.0 },
                { 0.0, 0.0, 1.0, 1.0, -1.0, 1.0, 0.0, 0.0 }
        };
    }

    @Test(dataProvider = "definedData")
    public void testValue(
            double a, double b, double c, double d,
            double min, double max,
            double x, double expectedValue
    ) throws FunctionException {
        IFunction f = new RationalFunction(a, b, c, d, min, max);

        assertEquals(expectedValue, f.value(x));
    }

    @Test(expectedExceptions = { FunctionException.class })
    public void testValueDivideByZero() throws FunctionException {
        IFunction f = new RationalFunction(2, -3, 2, 6, -1.0, 5.0);
        f.value(-3);
    }

    @Test(expectedExceptions = { FunctionException.class })
    public void testValueOutOfBounds() throws FunctionException {
        IFunction f = new RationalFunction(2, -3, -1.22, 21, -1.0, 5.0);
        f.value(10.0);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void constructMinGreaterThanMax() {
        IFunction f = new RationalFunction(-0.5, 3, 3300, -0.1, 1e-6, 0);
    }
}