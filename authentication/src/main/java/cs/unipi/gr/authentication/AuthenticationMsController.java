package cs.unipi.gr.authentication;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Panagiotis Papadopoulos P10095
 * @University University of Pireus Cs Department
 */
@RestController
public class AuthenticationMsController {

    @LoadBalanced
    @RequestMapping(value = "/repository/v1_0_release/apis/1.0/authentication/users",method = RequestMethod.GET)
    public User getUsers()  {

        User usr= new User();
        usr.setEmail("panos");
        usr.setPassword("ioooooo");
        return usr;
    }
}
