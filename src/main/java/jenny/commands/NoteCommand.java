package jenny.commands;

import jenny.exceptions.JennyException;
import jenny.storage.Storage;
import jenny.tasks.NoteTask;
import jenny.tasks.Task;
import jenny.tasks.TaskList;
import jenny.util.Ui;

import java.util.ArrayList;


/**
 * Add a new task to the instance of {@link TaskList}.
 * CS2103 Week 3
 * AY21/22 Semester 1
 *
 * @author Deon
 */
public class NoteCommand extends Command {
    public static final String COMMAND = "note";
    private static final String MESSAGE_SCOPE = NoteCommand.class.getSimpleName();
    private static final String ADD_NOTE_SUCCESS = "Got it. I've added this note:";

    /**
     * Constructor for an instance of a new command.
     * Will initialise a new command with the provided {@code arguments}.
     * Arguments must follow the format of {@code "description"},
     *
     * @param arguments valid command arguments defined.
     */
    public NoteCommand(String arguments) {
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
        try {
            NoteTask task = new NoteTask(arguments);
            tasks.add(task);
            tasks.save(storage);
            ui.print(new String[]{
                    ADD_NOTE_SUCCESS,
                    "  " + task,
                    "Now you have " + tasks.size() + " tasks in the list."
            });
        } catch (JennyException e) {
            throw new JennyException(MESSAGE_SCOPE, e.getMessage());
        }
    }
}
