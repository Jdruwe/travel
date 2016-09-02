package be.jeroendruwe.authserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by jdruwe on 15/06/16.
 */

@RestController
@RequestMapping("/")
public class AuthRestController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
