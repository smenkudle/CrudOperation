package org.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.crud.domain.User;
import org.crud.repository.UserCrudRepository;

@Service
public class UserService {

    @Autowired
    UserCrudRepository crudRepository;

    public List<User> getUsers() {

        List<User> users = new ArrayList<User>();

        File file = new File("userdetails.txt");
        String[] line;


        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                line = sc.next().split(",");
                users.add(new User(line[0]));
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        return users;
    }

    public String saveUsers() {
        File file = new File("userdetails.txt");
        String[] line;


        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                line = sc.next().split(",");
                crudRepository.save(new User(line[0]));
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }

    public List<User> getUsersFromDb() {
        List<User> users = new ArrayList<User>();
        for(User user: crudRepository.findAll()){
            users.add(user);
        }
        
        return users;
    }
}
