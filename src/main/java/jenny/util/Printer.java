package jenny.util;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Prints to the provided {@link PrintStream}.
 * CS2103 Week 2
 * AY21/22 Semester 1
 *
 * @author Deon
 */
public final class Printer {
    private final PrintStream out;

    /**
     * Creates a new instance of a printer using the provided {@link PrintStream}.
     *
     * @param out a {@link PrintStream}.
     */
    public Printer(PrintStream out) {
        this.out = out;
    }

    /**
     * Sends a series of messages to the output stream.
     *
     * @param messages the messages to be printed.
     */
    public void print(String[] messages) {
        for (String message : messages) {
            out.println("\t" + message);
        }
    }

    /**
     * Sends a series of messages to the output stream.
     *
     * @param messages the messages to be printed.
     */
    public void print(ArrayList<String> messages) {
        for (String message : messages) {
            out.println("\t" + message);
        }
    }
}
