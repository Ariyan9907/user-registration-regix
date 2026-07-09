package com.userregix.userregistration;

public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Aryan"));
        System.out.println(userRegistration.validateLastName("Pujari"));
        System.out.println(userRegistration.validateEmail("Aryan@gmail.com"));
        System.out.println(userRegistration.validateNumber("91 9482928131"));
        System.out.println(userRegistration.validatePassword("aryanA@9rt"));
    }

}
