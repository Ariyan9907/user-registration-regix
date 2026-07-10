package com.userregix.userregistration;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTestParam {
    @ParameterizedTest
    @ValueSource(strings = {"abc", "@gmail.com", "abc@gmail", "abc@@gmail.com", "abc@gmail."})
    public void givenInvalidEmails_WhenValidated_ShouldReturnFalse(String email) {
        UserRegistration userRegistration = new UserRegistration();
        assertThrows(UserRegistrationException.class,()->userRegistration.validateEmail(email));

    }

    @ParameterizedTest
    @ValueSource(strings={"aryan@gmai.com","aryan.ar@gamil.in"})
    public void givenValidEmial_WhenValidated_ShouldReturnTrue(String email) throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.validateEmail(email));
    }
}
