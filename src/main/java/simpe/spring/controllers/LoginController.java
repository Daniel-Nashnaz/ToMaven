
package simpe.spring.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simpe.spring.models.Login;
import simpe.spring.services.LoginService;

 @RestController
public class LoginController {
   
    @Autowired
    private LoginService userService;

    @GetMapping("/userssr")
    public List<Login> getAllUsers() {
        return this.userService.getAll();
    }
}
