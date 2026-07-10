# UC11 - JUnit Parameterized Testing for Email Validation

## Description

This branch implements **Use Case 11 (UC11)** of the User Registration System.

The objective is to validate **multiple email addresses** using **JUnit 5 Parameterized Tests**.

Instead of writing multiple individual test methods, a single parameterized test method is executed multiple times using different email inputs supplied by `@ValueSource`.

---

## Requirement

Write **JUnit Parameterized Tests** to validate multiple email addresses.

The implementation includes:

- Valid Email Test Cases
- Invalid Email Test Cases
- Reusable test methods
- Reduced duplicate code

---

## Test Classes

### UserRegistrationTest.java

Contains JUnit test cases for:

- First Name Validation
- Last Name Validation
- Email Validation
- Mobile Number Validation
- Password Validation

using Happy and Sad test cases.

---

### UserRegistrationTestParam.java

Contains Parameterized Tests for Email Validation using:

- `@ParameterizedTest`
- `@ValueSource`

---

## Parameterized Test Example

```java
@ParameterizedTest
@ValueSource(strings = {
    "aryan@gmail.com",
    "aryan.ar@gmail.in"
})
public void givenValidEmails_WhenValidated_ShouldReturnTrue(String email) {
    assertTrue(userRegistration.validateEmail(email));
}
```

---

## Benefits of Parameterized Tests

- Less duplicate code
- Better readability
- Easy to add new test cases
- Improved maintainability

---

## Project Structure

```
src
└── com
    └── userregix
        └── userregistration
            ├── UserRegistration.java
            ├── UserRegistrationTest.java
            └── UserRegistrationTestParam.java
```

---

## Technologies Used

- Java
- Java Regular Expressions (Regex)
- JUnit 5
- Parameterized Tests

---

## Branch

```text
feature/uc11-parameterized-email-validation
```

---

## Learning Outcome

After completing UC11, you will understand:

- JUnit 5 Parameterized Testing
- `@ParameterizedTest`
- `@ValueSource`
- Testing multiple inputs using a single test method
- Writing reusable and maintainable unit tests

---

## Status

✅ UC11 Completed