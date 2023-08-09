/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task.api;

import dao.GeneralDao;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Task;

/**
 *
 * @author Seka
 */
@Path("task")
public class TaskResource {
    GeneralDao dao = new GeneralDao(Task.class);
    @POST
    public void create(Task task) {
        dao.create(task);
    }
    @GET
    public List<Task> getResult() {
        List<Task> task = dao.listAll();
        return task;
    }
}
