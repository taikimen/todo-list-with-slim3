package net.nhatien.todolist.controller;

import javax.servlet.http.HttpServletRequest;

import net.nhatien.todolist.model.Task;
import net.nhatien.todolist.service.TaskService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

/**
 * 
 * 
 * @author shimazu
 */
public class WriteController extends Controller {

    /**  */
    private TaskService taskService = new TaskService();

    @Override
    public Navigation run() throws Exception {

        UserService service = UserServiceFactory.getUserService();
        HttpServletRequest request = RequestLocator.get();
        String thisURL = request.getRequestURI();

        if (request.getUserPrincipal() == null) {
            requestScope("loginUrl", service.createLoginURL(thisURL));
            return forward("login.jsp");
        }
        User user = service.getCurrentUser();

        Task task = new Task();
        task.setContent(asString("content"));
        task.setDueDate(asDate("dueDate", "yyyy/mm/dd"));
        task.setEmail(user.getEmail());

        taskService.addTask(task);
        return redirect(basePath);
    }
}
