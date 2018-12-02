package ru.omsu.imit.kang.other_tasks.functionals;

public class FunctionalException extends Exception{
    public FunctionalException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionalException(Throwable cause) {
        super(cause);
    }

    public FunctionalException(String message) {
        super(message);
    }
}
