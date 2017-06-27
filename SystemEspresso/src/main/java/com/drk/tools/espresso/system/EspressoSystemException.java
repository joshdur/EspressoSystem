package com.drk.tools.espresso.system;

public class EspressoSystemException extends RuntimeException {

    public EspressoSystemException(String message, Object... objects) {
        super(String.format(message,objects));
    }

    public EspressoSystemException(Throwable cause, String message, Object... objects) {
        super(String.format(message, objects), cause);
    }
}
