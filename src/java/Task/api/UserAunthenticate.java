/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task.api;

import dao.GeneralDao;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Users;

/**
 *
 * @author Seka
 */
@Path("auth")
public class UserAunthenticate {
     GeneralDao dao = new GeneralDao(Users.class);
    
    @POST
    public Users aunthenticate(Users user){
        String email = user.getEmail();
        System.out.println(email);
        String password = user.getPassword();
        Users users = (Users) dao.findByMail(email);
        if(users == null){
            return null;
        }
        System.out.println(users.getPassword());
        if(users.getPassword().equals(password)){
//            return Response.status(Response.Status.ACCEPTED).build();
            return users;
        }
//        return Response.status(Response.Status.NOT_FOUND).build();
        return null;
    }
}
