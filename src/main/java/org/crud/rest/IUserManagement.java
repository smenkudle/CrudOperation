package org.crud.rest;

import java.util.List;

import org.crud.domain.User;

public interface IUserManagement {
    
    List<User> getUsers();    
    String saveUsers();
    List<User> getUsersFromDb();
    
}
