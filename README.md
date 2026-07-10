# UC12 - Custom Exception Handling for User Registration

## Description

This branch implements **Use Case 12 (UC12)** of the User Registration System.

The objective is to refactor the validation logic to throw **Custom Exceptions** whenever invalid user details are entered instead of simply returning `false`.

All existing JUnit and Parameterized Test Cases are updated to validate exceptions using `assertThrows()`.

---

## Requirement

Refactor the code to:

- Throw Custom Exceptions for invalid user details.
- Rewrite all JUnit Test Cases to handle Custom Exceptions.
- Validate all user inputs using exception handling.

---

## Validations Covered

- First Name Validation
- Last Name Validation
- Email Validation
- Mobile Number Validation
- Password Validation

Each validation throws a `UserRegistrationException` when the input is invalid.

---

## Custom Exception

A custom exception class is created:

```java
public class UserRegistrationException extends Exception {

    public UserRegistrationException(String message) {
        super(message);
    }
}
```

---

## JUnit Testing

### Valid Inputs

- Uses `assertTrue()`
- Test methods declare `throws UserRegistrationException`

Example:

```java
assertTrue(userRegistration.validateEmail("aryan@gmail.com"));
```

---

### Invalid Inputs

Uses `assertThrows()` to verify that a `UserRegistrationException` is thrown.

Example:

```java
assertThrows(
    UserRegistrationException.class,
    () -> userRegistration.validateEmail("abc")
);
```

---

## Project Structure

```
src
└── com
    └── userregix
        └── userregistration
            ├── UserRegistration.java
            ├── UserRegistrationException.java
            ├── UserRegistrationTest.java
            └── UserRegistrationTestParam.java
```

---

## Technologies Used

- Java
- Java Regular Expressions (Regex)
- JUnit 5
- Parameterized Tests
- Custom Exception Handling

---

## Branch

```text
feature/uc12-custom-exception-handling
```

---

## Learning Outcome

After completing UC12, you will understand:

- Creating Custom Exceptions
- Exception Handling in Java
- Throwing Checked Exceptions
- Using `throws` in JUnit Tests
- Using `assertThrows()` for Exception Testing
- Refactoring Validation Logic
- Writing Robust Unit Tests

---

## Status

✅ UC12 Completed