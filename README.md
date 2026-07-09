# UC6 - Password Validation (Rule 2)

## Description

This branch implements **Use Case 6 (UC6)** of the User Registration System.

The objective is to validate a user's **password** based on **Rule 2** using **Java Regular Expressions (Regex)**.

---

## Requirement

The password should satisfy the following conditions:

- Must contain **at least 8 characters**.
- Must contain **at least one uppercase letter**.

> **Note:** Rule 2 builds upon Rule 1. The remaining password rules will be implemented in UC7 and UC8.

---

## Regex Used

```regex
^(?=.*[A-Z]).{8,}$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `(?=.*[A-Z])` | Ensures at least one uppercase letter exists |
| `.` | Matches any character |
| `{8,}` | Minimum 8 characters |
| `$` | End of the string |

---

## Valid Examples

```text
Password
Hello123
Aryan123
JAVAabcd
```

---

## Invalid Examples

```text
password
aryan123
abcdefgh
12345678
Pass12
```

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

---

## Branch

```text
feature/uc6-password-rule2
```

---

## Learning Outcome

After completing UC6, you will understand:

- Positive Lookahead `(?=...)`
- Uppercase letter validation
- Combining multiple validation rules
- Password validation using Regular Expressions

---

## Status

✅ UC6 Completed