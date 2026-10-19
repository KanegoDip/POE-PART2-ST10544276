/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
 public class login {

    public boolean checkUserName(String username) {

        if (username.length() <= 5 && username.contains("_")) {
            return true;
        }

        return false;
    }

    public boolean checkPasswordComplexity(String password) {

        boolean capital = password.matches(".*[A-Z].*");
        boolean small = password.matches(".*[a-z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@#$%^&*].*");

        if (password.length() >= 8
                && capital
                && small
                && number
                && special) {

            return true;
        }

        return false;
    }

    public boolean checkCellPhoneNumber(String phone) {

        if (phone.startsWith("+27") && phone.length() == 12) {
            return true;
        }

        return false;
    }

    public String registerUser(String username,
      String password,
      String phone) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password does not meet the requirements.";
        }

        if (!checkCellPhoneNumber(phone)) {
            return "Cellphone number is not correctly formatted.";
        }

        return "User is successfully registered.";
    }

    public boolean loginUser(String username,
      String password,
      String savedUsername,
      String savedPassword) {

        if (username.equals(savedUsername)
                && password.equals(savedPassword)) {

            return true;
        }

        return false;
    }

    public String returnLoginStatus(boolean loginStatus,
      String firstName,
      String lastName) {

        if (loginStatus) {
        return "Welcome " + firstName + " " + lastName
                    + ", Great to see you again.";
        }

     return "Username or password incorrect, please try again.";
    }
}
    

