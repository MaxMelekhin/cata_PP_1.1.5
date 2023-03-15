package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Batman", "Petrovich", (byte) 45);
        userService.saveUser("Aquaman", "Igorevich", (byte) 40);
        userService.saveUser("Superman", "Victorovich", (byte) 38);
        userService.saveUser("Flash", "Antonovich", (byte) 27);
//        List<User> listUser = userService.getAllUsers();
//        for (User u : listUser) {
//            System.out.println(u);
//        }
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}