package com.userregix.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //validating firstname
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        String regex="^[A-Z][a-z]{2,}$";

        if((Pattern.matches(regex,firstName))){
            return true;
        }
        throw new UserRegistrationException("Invalid FirstName");

    }

    //validating lastname
    public boolean validateLastName(String lastName) throws UserRegistrationException {
        String regex="^[A-Z][a-z]{2,}$";

        if((Pattern.matches(regex,lastName))){
            return true;
        }
        throw new UserRegistrationException("Invalid LastName");
    }

    //validate email
    public boolean validateEmail(String email) throws UserRegistrationException {
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        if((Pattern.matches(regex,email))){
            return true;
        }

        throw new UserRegistrationException("Invalid Email");
    }

    //validate number
    public boolean validateNumber(String number) throws UserRegistrationException {
        String regex="^[0-9]{2}\\s[0-9]{10}$";
        if((Pattern.matches(regex,number))){
            return true;
        }
        throw new UserRegistrationException("Invalid FirstName");
    }

    //validate password
    public boolean validatePassword(String password) throws UserRegistrationException {
        String regex="^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=!]*[@#$%^&+=!][^@#$%^&+=!]*$).{8,}$";
        if((Pattern.matches(regex,password))){
            return true;
        }
        throw new UserRegistrationException("Invalid FirstName");
    }
}
