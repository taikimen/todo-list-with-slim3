package net.nhatien.todolist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.nhatien.todolist.model.Task;
import net.nhatien.todolist.service.TaskService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        HttpServletRequest request = RequestLocator.get();

        UserService service = UserServiceFactory.getUserService();
        String thisURL = request.getRequestURI();

        if (request.getUserPrincipal() == null) {
            requestScope("loginUrl", service.createLoginURL(thisURL));
            return forward("login.jsp");
        }
        User user = service.getCurrentUser();

        requestScope("userName", user.getNickname());
        requestScope("logoutUrl", service.createLogoutURL(thisURL));

        TaskService taskService = new TaskService();
        List<Task> closeTask = taskService.getTaskList(user, new Boolean(true));
        List<Task> openTask = taskService.getTaskList(user, new Boolean(false));
        requestScope("closeTask", closeTask);
        requestScope("openTask", openTask);
        return forward("index.jsp");
    }
}
