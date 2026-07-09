# User Registration System Using Java Regex

## Description

This project demonstrates the implementation of a **User Registration System** using **Java Regular Expressions (Regex)**.

The project validates user details such as **First Name, Last Name, Email Address, Mobile Number, and Password** by implementing each requirement as an individual use case.

Each use case was developed on a separate feature branch and later merged into the `dev` branch following Git best practices.

---

## Features

- First Name Validation
- Last Name Validation
- Email Validation
- Mobile Number Validation
- Password Validation
    - Rule 1 – Minimum 8 Characters
    - Rule 2 – At Least One Uppercase Letter
    - Rule 3 – At Least One Numeric Digit
    - Rule 4 – Exactly One Special Character
- Email Sample Validation

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
- Java Regular Expressions (Regex)
- Git
- GitHub

---

## Use Cases Implemented

| Use Case | Description | Status |
|----------|-------------|--------|
| UC1 | First Name Validation | ✅ |
| UC2 | Last Name Validation | ✅ |
| UC3 | Email Validation | ✅ |
| UC4 | Mobile Number Validation | ✅ |
| UC5 | Password Validation – Rule 1 | ✅ |
| UC6 | Password Validation – Rule 2 | ✅ |
| UC7 | Password Validation – Rule 3 | ✅ |
| UC8 | Password Validation – Rule 4 | ✅ |
| UC9 | Email Sample Validation | ✅ |

---

## Validation Rules

### First Name

- Starts with an uppercase letter.
- Minimum 3 characters.

### Last Name

- Starts with an uppercase letter.
- Minimum 3 characters.

### Email

- Valid username.
- Valid domain.
- Valid domain extension.

### Mobile Number

- Two-digit country code.
- One whitespace.
- Ten-digit mobile number.

### Password

- Minimum 8 characters.
- At least one uppercase letter.
- At least one numeric digit.
- Exactly one special character.

---

## Learning Outcomes

By completing this project, I learned:

- Java Regular Expressions (Regex)
- Character Classes
- Quantifiers
- Anchors (`^` and `$`)
- Lookaheads (`(?=...)`)
- Input Validation
- Manual Testing
- Git Branching Strategy
- GitHub Workflow

---

## Git Workflow

Each use case was developed using the following workflow:

1. Create a feature branch from `dev`.
2. Implement one use case.
3. Commit changes with a meaningful commit message.
4. Push the feature branch to GitHub.
5. Merge the feature branch into `dev`.

---

## Author

**Aryan Pujari**

---

## Status

✅ Project Completed Successfully