package hz.springblank.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hz.springblank.web.model.User;
import hz.springblank.web.service.UserService;

@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/select")
    public String select() {
        User user = userService.selectUserById(1);
        return user.toString();
    }
}
