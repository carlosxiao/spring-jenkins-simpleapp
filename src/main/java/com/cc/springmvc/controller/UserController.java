package com.cc.springmvc.controller;

import com.cc.springmvc.domain.User;
import com.cc.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list")
    public String findAll(Model model) {
        List<User> all = userService.findAll();
        model.addAttribute("userList", all);
        return "user/list";
    }

    @PostMapping("add")
    public String saveUser(User user) {
        user.setType("1");
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("add")
    public String toAddUser(User user) {
        return "user/add";
    }
}
