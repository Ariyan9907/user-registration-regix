package com.userregix.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //validating firstname
    public boolean validateFirstName(String firstName){
        String regex="^[A-Z][a-z]{2,}$";
        return Pattern.matches(regex,firstName);
    }

    //validating lastname
    public boolean validateLastName(String lastName){
        String regix="^[A-Z][a-z]{2,}$";
        return Pattern.matches(regix,lastName);
    }

    //validate email
    public boolean validateEmail(String email){
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex,email);
    }
}
