package net.nhatien.todolist.exception;

/**
 * 
 * 
 * @author shimazu
 */
public class TaskNotFountException extends Exception {
    /**  */
    private static final long serialVersionUID = 2483754874434663458L;

    /**
     * @param message
     */
    public TaskNotFountException(String message) {
        super(message);
    }
}
