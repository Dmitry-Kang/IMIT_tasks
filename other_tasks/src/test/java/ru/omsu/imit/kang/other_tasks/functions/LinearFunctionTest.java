package ru.omsu.imit.kang.other_tasks.functions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LinearFunctionTest {
    @DataProvider
    public static Object[][] definedData() {
        return new Object[][] {
                // TODO: this tests
                { 0.0, 0.0, -1.0, 1.0, 0.0, 0.0 },
                { 0.0, 0.0, -1.0, 1.0, 0.0, 0.0 }
        };
    }

    @Test(dataProvider = "definedData")
    public void testValue(
            double a, double b,
            double min, double max,
            double x, double expectedValue
    ) throws FunctionException {
        IFunction f = new LinearFunction(a, b, min, max);

        assertEquals(expectedValue, f.value(x));
    }

    @Test(expectedExceptions = { FunctionException.class })
    public void testValueOutOfBounds() throws FunctionException {
        IFunction f = new LinearFunction(2, -3, -1.0, 5.0);
        f.value(10.0);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void constructMinGreaterThanMax() {
        IFunction f = new LinearFunction(-0.5, 3, 0.00001, 0);
    }
}