package org.crud.rest.impl;

import java.util.List;

import org.crud.domain.User;
import org.crud.rest.IUserManagement;
import org.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagement implements IUserManagement{
    @Autowired
    private UserService service;


    @RequestMapping("/")
    @ResponseBody
	public String healthCheck() {
		return "OK";
	}
	
    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getUsers();
    }
    
    
    @PostMapping("/save")    
    public String saveUsers(){
        return service.saveUsers();
    }
    
    
    @GetMapping("/getusers")
    public List<User> getUsersFromDb(){
        return service.getUsersFromDb();
    }
    
}
