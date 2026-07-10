package com.userregix.userregistration;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    @Test
    public void TestAcceptValidFirstname(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateFirstName("Aryan");
        assertTrue(actual);

    }

    @Test
    public void TesAcceptValidUserNameLength(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateFirstName("Ar");
        assertFalse(actual);
    }

    @Test
    public void TesAcceptValidUserNameUpper(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateFirstName("aryan");
        assertFalse(actual);
    }

    @Test
    public void TestValidEmail(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateEmail("aryan@gmail.com");
        assertTrue(actual);
    }

    @Test
    public void TestInValidEmail(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateEmail("aryan@@gmail.com");
        assertFalse(actual);
    }

    @Test
    public void TestvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateLastName("Pujari");
        assertTrue(actual);
    }

    @Test
    public void TestInvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateLastName("ma");
        assertFalse(actual);
    }

    @Test
    public void TestValidMobileNumber(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateNumber("91 9864852582");
        assertTrue(actual);
    }

    @Test
    public void TestInValidMobileNumber(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateNumber("91@9864852582");
        assertFalse(actual);
    }

    @Test
    public void TestValidPassword(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validatePassword("Password1@");
        assertTrue(actual);
    }

    @Test
    public void TestInValidPassword(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validatePassword("password@");
        assertFalse(actual);
    }




}
