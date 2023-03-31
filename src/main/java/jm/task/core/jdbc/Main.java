package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Kirill", "Antonov", (byte) 23);
        userService.saveUser("Viktor", "Romanov", (byte) 35);
        userService.saveUser("Nick", "Rame", (byte) 65);
        userService.saveUser("John", "Black", (byte) 18);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
