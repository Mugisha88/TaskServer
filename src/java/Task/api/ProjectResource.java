/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task.api;

import dao.GeneralDao;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.Assignee;
import model.Project;

/**
 *
 * @author Seka
 */
@Path("project")
public class ProjectResource {
    GeneralDao dao = new GeneralDao(Project.class);
    @GET
    public List<Project> getResult() {
        List<Project> projects = dao.listAll();
        return projects;
    }
}
