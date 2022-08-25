package jenny.exceptions;

import jenny.util.Printer;

/**
 * Represents runtime exceptions thrown in the JennyBot application
 * CS2103 Week 3
 * AY21/22 Semester 1
 *
 * @author Deon
 */
public class JennyException extends RuntimeException {
    /**
     * Creates an instance of the exception.
     *
     * @param errorMessage error message of the exception.
     */
    public JennyException(String scope, String errorMessage) {
        super(errorMessage);
        Printer.echo(scope, errorMessage);
    }
}
