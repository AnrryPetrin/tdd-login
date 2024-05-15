package com.qa;

import java.util.HashMap;
import java.util.Map;

/*
 * This class is a simple login screen that allows users to login and add new users.    
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /*
     * Constructor that initializes the userDatabase with two default users.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("admin", "admin");
        userDatabase.put("user", "user");
    }

    /*
     * Method that checks if the username and password are correct.
     * 
     * @param username The username of the user.
     * 
     * @param password The password of the user.
     * 
     * @return True if the username and password are correct, false otherwise.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            } else {
                return false;

            }
        }
        return false;
    }

    /*
     * Method that adds a new user to the userDatabase.
     * 
     * @param username The username of the new user.
     * 
     * @param password The password of the new user.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }

}