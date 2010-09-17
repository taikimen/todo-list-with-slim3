package net.nhatien.todolist.controller;

import net.nhatien.todolist.meta.TaskMeta;
import net.nhatien.todolist.service.TaskService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class FinishController extends Controller {

    /**  */
    private TaskService taskService = new TaskService();

    @Override
    public Navigation run() throws Exception {

        TaskMeta u = new TaskMeta();
        Key key = KeyFactory.createKey(u.getKind(), asLong("key").longValue());

        taskService.finishTask(key);
        return redirect(basePath);
    }
}
