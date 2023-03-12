package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Batman", "Petrovich", (byte) 45);
        userService.saveUser("Aquaman", "Igorevich", (byte) 40);
        userService.saveUser("Superman", "Victorovich", (byte) 38);
        userService.saveUser("Flash", "Antonovich", (byte) 27);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
