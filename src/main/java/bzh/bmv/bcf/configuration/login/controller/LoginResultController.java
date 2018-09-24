package bzh.bmv.bcf.configuration.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bzh.bmv.bcf.repository.UserCrudRepository;

@Controller
public class LoginResultController {

    @Autowired
    UserCrudRepository repo;

    @RequestMapping(path = "/loginResult", method = RequestMethod.GET)
    public ResponseEntity<bzh.bmv.bcf.model.User> loginPost() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User userDetails = (User) auth.getPrincipal();
        return ResponseEntity.ok(repo.findByLogin(userDetails.getUsername()));
    }
}
