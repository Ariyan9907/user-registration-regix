package com.userregix.userregistration;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    @Test
    public void TestAcceptValidFirstname() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateFirstName("Aryan");
        assertTrue(actual);

    }

    @Test
    public void TesAcceptValidUserNameLength(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validateFirstName("Ar"));
    }

    @Test
    public void TesAcceptInValidUserNameUpper(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validateFirstName("aryan"));

    }

    @Test
    public void TestValidEmail() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateEmail("aryan@gmail.com");
        assertTrue(actual);
    }

    @Test
    public void TestInValidEmail(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()-> userRegistration.validateEmail("ar@@"));
    }

    @Test
    public void TestvalidLastName() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateLastName("Pujari");
        assertTrue(actual);
    }

    @Test
    public void TestInvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validateLastName("ma"));
    }

    @Test
    public void TestValidMobileNumber() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validateNumber("91 9864852582");
        assertTrue(actual);
    }

    @Test
    public void TestInValidMobileNumber(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validateNumber("91@9864852582"));
    }

    @Test
    public void TestValidPassword() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual=userRegistration.validatePassword("Password1@");
        assertTrue(actual);
    }

    @Test
    public void TestInValidPassword(){
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validatePassword("password@"));
    }




}
