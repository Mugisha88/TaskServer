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
import model.Users;

/**
 *
 * @author Seka
 */
@Path("assignee")
public class AssigneeResource {
    GeneralDao dao = new GeneralDao(Assignee.class);
    @GET
    public List<Assignee> getResult() {
        List<Assignee> assignee = dao.listAll();
        return assignee;
    }

}
