package jenny.commands;

import jenny.exceptions.JennyException;
import jenny.storage.Storage;
import jenny.tasks.Task;
import jenny.tasks.TaskList;
import jenny.util.Ui;

import java.util.ArrayList;

public class FindCommand extends Command {
    public static final String COMMAND = "find";

    /**
     * Constructor for an instance of command.
     * Will initialise a new command with the provided {@code arguments}.
     *
     * @param arguments valid command arguments defined.
     */
    public FindCommand(String arguments) {
        super(arguments);
    }

    /**
     * {@inheritDoc}
     *
     * @param tasks   the instance of {@link TaskList} to run the command with.
     * @param ui      the instance of {@link Ui} to run the command with.
     * @param storage the instance of {@link Storage} to run the command with.
     * @throws JennyException when runtime exceptions are thrown in the JennyBot application.
     */
    @Override
    public void run(TaskList tasks, Ui ui, Storage<ArrayList<Task>> storage) throws JennyException {
        ArrayList<Task> filtered = tasks.filter(description -> description.contains(arguments));
        ui.print(filtered.toString());
    }
}
