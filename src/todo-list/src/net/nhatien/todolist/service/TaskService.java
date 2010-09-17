package net.nhatien.todolist.service;

import java.util.Date;
import java.util.List;

import net.nhatien.todolist.exception.TaskNotFountException;
import net.nhatien.todolist.meta.TaskMeta;
import net.nhatien.todolist.model.Task;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;

/**
 * 
 * 
 * @author shimazu
 */
public class TaskService {

    /**  */
    private TaskMeta t = new TaskMeta();

    /**
     * @param task
     */
    public void addTask(Task task) {
        task.setClosed(new Boolean(false));
        task.setCreated(new Date());
        Datastore.put(task);
    }

    /**
     * @param user
     * @param closed
     * @return tasklist
     */
    public List<Task> getTaskList(User user, Boolean closed) {

        if (closed.booleanValue()) {
            return Datastore
                .query(t)
                .filter(t.email.equal(user.getEmail()), t.closed.equal(closed))
                .sort(t.dueDate.desc)
                .asList();
        } else {
            return Datastore
                .query(t)
                .filter(t.email.equal(user.getEmail()), t.closed.equal(closed))
                .sort(t.dueDate.asc)
                .asList();
        }
    }

    /**
     * @param key
     */
    public void finishTask(Key key) {
        Task task = Datastore.get(Task.class, key);
        if (task == null) {
            try {
                throw new TaskNotFountException("task key mismatch");
            } catch (TaskNotFountException e) {
                throw new RuntimeException(e);
            }
        } else {
            task.setClosed(new Boolean(true));
            Datastore.put(task);
        }
    }
}
