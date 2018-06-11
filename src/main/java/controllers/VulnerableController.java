package controllers;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import services.VulnerableRepository;

@Controller
@RequestMapping(path="/vulnerable")
public class VulnerableController {

    @Autowired
    VulnerableRepository vulnerableRepository;

    @GetMapping(path="/user")
    public @ResponseBody
    User getUser() {
        // This returns a JSON or XML with the users
        return vulnerableRepository.findUser();
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return vulnerableRepository.findAll();
    }

}
