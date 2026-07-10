# User Registration System Using Java Regex

## Description

The **User Registration System** is a Java-based application that validates user registration details using **Regular Expressions (Regex)**. The project was developed incrementally through **12 use cases (UC1–UC12)**, introducing concepts from basic regex validation to JUnit testing, parameterized testing, and custom exception handling.

Each use case was implemented on a separate feature branch and merged into the `dev` branch using Git workflow best practices.

---

# Features

The application validates the following user details:

- First Name
- Last Name
- Email Address
- Mobile Number
- Password

The project also includes:

- JUnit 5 Testing
- Parameterized Testing
- Custom Exception Handling

---

# Use Cases Implemented

| Use Case | Description | Status |
|----------|-------------|--------|
| UC1 | First Name Validation | ✅ |
| UC2 | Last Name Validation | ✅ |
| UC3 | Email Validation | ✅ |
| UC4 | Mobile Number Validation | ✅ |
| UC5 | Password Validation - Rule 1 (Minimum 8 Characters) | ✅ |
| UC6 | Password Validation - Rule 2 (At Least One Uppercase Letter) | ✅ |
| UC7 | Password Validation - Rule 3 (At Least One Numeric Digit) | ✅ |
| UC8 | Password Validation - Rule 4 (Exactly One Special Character) | ✅ |
| UC9 | Validate Multiple Email Samples | ✅ |
| UC10 | JUnit Happy & Sad Test Cases | ✅ |
| UC11 | JUnit Parameterized Testing | ✅ |
| UC12 | Custom Exception Handling | ✅ |

---

# Validation Rules

## First Name

- Starts with one uppercase letter.
- Minimum 3 characters.

Example:

```
Aryan
John
```

---

## Last Name

- Starts with one uppercase letter.
- Minimum 3 characters.

Example:

```
Pujari
Sharma
```

---

## Email

Supports email formats such as:

```
abc@gmail.com
abc.xyz@gmail.com
abc@yahoo.co.in
```

---

## Mobile Number

Format:

```
91 9876543210
```

Rules:

- Two-digit country code
- One whitespace
- Ten-digit mobile number

---

## Password

### Rule 1

- Minimum 8 characters

### Rule 2

- At least one uppercase letter

### Rule 3

- At least one numeric digit

### Rule 4

- Exactly one special character

Example:

```
Password1@
```

---

# Regex Concepts Covered

- Character Classes

```
[A-Z]
[a-z]
[0-9]
```

- Quantifiers

```
*
+
?
{2}
{2,}
{2,5}
```

- Anchors

```
^
$
```

- Groups

```
(...)
```

- Optional Groups

```
?
```

- Positive Lookahead

```
(?=.*[A-Z])

(?=.*\d)

(?=.*[@#$%^&+=!])
```

---

# Testing

## UC10

JUnit Test Cases were written for:

- First Name
- Last Name
- Email
- Mobile Number
- Password

Both

- Happy Test Cases
- Sad Test Cases

were implemented.

---

## UC11

Parameterized Tests were implemented using

```
@ParameterizedTest

@ValueSource
```

to validate multiple email addresses without duplicate test methods.

---

## UC12

The validation logic was refactored to throw **Custom Exceptions** instead of returning `false`.

Example:

```java
throw new UserRegistrationException("Invalid Email");
```

JUnit tests were updated using

```java
assertThrows()
```

to verify exception handling.

---

# Project Structure

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

# Technologies Used

- Java
- Java Regex (Regular Expressions)
- JUnit 5
- Parameterized Tests
- Exception Handling
- Git
- GitHub

---

# Git Workflow

Each use case followed the same workflow:

```bash
git checkout dev
git pull origin dev
git checkout -b feature/<use-case>

git add .

git commit -m "[Aryan Pujari] Implement UCX: <Feature Name>"

git push origin feature/<use-case>

git checkout dev

git merge feature/<use-case>

git push origin dev
```

---

# Learning Outcomes

By completing this project, I learned:

- Java Regular Expressions
- Character Classes
- Quantifiers
- Anchors
- Groups
- Lookaheads
- Email Validation
- Password Validation
- Mobile Number Validation
- JUnit 5
- Parameterized Testing
- Custom Exception Handling
- Java Exception Hierarchy
- Unit Testing
- Git Branching Strategy
- GitHub Workflow
- Clean Project Organization

---

# Author

**Aryan Pujari**

---

# Project Status

✅ Completed

**Total Use Cases Implemented:** 12

**Testing:** Completed

**Documentation:** Completed

**Git Workflow:** Completed