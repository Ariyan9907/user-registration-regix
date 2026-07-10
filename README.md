# UC10 - JUnit Testing for User Registration Validation

## Description

This branch implements **Use Case 10 (UC10)** of the User Registration System.

The objective is to write **JUnit Test Cases** to validate all user registration fields using **Happy Test Cases** and **Sad Test Cases**.

The following validations are covered:

- First Name
- Last Name
- Email Address
- Mobile Number
- Password

Each validation contains positive (valid input) and negative (invalid input) test cases to verify the correctness of the Regular Expressions. :contentReference[oaicite:0]{index=0}

---

## Requirement

Write JUnit test cases for:

- First Name Validation
- Last Name Validation
- Email Validation
- Mobile Number Validation
- Password Validation

Test both:

- Happy Test Cases (Valid Input)
- Sad Test Cases (Invalid Input)

---

## Test Coverage

### First Name

- Valid First Name
- Invalid First Name

### Last Name

- Valid Last Name
- Invalid Last Name

### Email

- Valid Email
- Invalid Email

### Mobile Number

- Valid Mobile Number
- Invalid Mobile Number

### Password

- Valid Password
- Invalid Password

---

## Project Structure

```
src
└── com
    └── userregix
        └── userregistration
            ├── UserRegistration.java
            └── UserRegistrationTest.java
```

---

## Technologies Used

- Java
- Regular Expressions (Regex)
- JUnit 5

---

## Branch

```text
feature/uc10-junit-user-validation
```

---

## Learning Outcome

After completing UC10, you will understand:

- Writing JUnit 5 Test Cases
- Happy Test Cases
- Sad Test Cases
- Assertions (`assertTrue()`, `assertFalse()`)
- Unit Testing for Regex Validation

---

## Status

✅ UC10 Completed