package com.demo.mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.mvc.model.Users;
import com.demo.mvc.service.UsersService;

@Controller
public class UserController {
	
    @Autowired
    UsersService service;
     
    @Autowired
    MessageSource messageSource;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listEmployees(Model model) {
 
        List<Users> listUsers = service.getListUsers();
        model.addAttribute("listUsers", listUsers);
        return "views";
    }
    
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String addUser(Model model) {
    	Users user = new Users();
        model.addAttribute("user", user);
        model.addAttribute("edit", false);
        return "insert";
    }
    
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveUser(@Valid Users user, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "insert";
        }
        service.addUser(user);
 
        return "redirect:/list";
    }

}
