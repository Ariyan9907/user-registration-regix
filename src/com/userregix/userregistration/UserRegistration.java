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
}
