package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {
    private UserService UserService;

    public UserController(vn.hoidanit.laptopshop.service.UserService userService) {
        UserService = userService;
    }

    @RequestMapping("/")

    public String getHomePage() {
        return "hello";
    }
}
// @RestController
// public class UserController {
// private UserService UserService;

// public UserController(vn.hoidanit.laptopshop.service.UserService userService)
// {
// UserService = userService;
// }

// @GetMapping("/")

// public String getHomePage() {
// return this.UserService.handleHello();
// }
// }
