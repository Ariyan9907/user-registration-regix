# UC8 - Password Validation (Rule 4)

## Description

This branch implements **Use Case 8 (UC8)** of the User Registration System.

The objective is to validate a user's **password** based on **Rule 4** using **Java Regular Expressions (Regex)**.

---

## Requirement

The password should satisfy the following conditions:

- Must contain **at least 8 characters**.
- Must contain **at least one uppercase letter**.
- Must contain **at least one numeric digit**.
- Must contain **exactly one special character**.

> **Note:** Rule 4 builds upon Rule 1, Rule 2, and Rule 3.

---

## Regex Used

```regex
^(?=.*[A-Z])(?=.*\d)(?=[^@#$%^&+=!]*[@#$%^&+=!][^@#$%^&+=!]*$).{8,}$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `(?=.*[A-Z])` | Ensures at least one uppercase letter exists |
| `(?=.*\d)` | Ensures at least one numeric digit exists |
| `(?=[^@#$%^&+=!]*[@#$%^&+=!][^@#$%^&+=!]*$)` | Ensures exactly one special character exists |
| `.{8,}` | Minimum 8 characters |
| `$` | End of the string |

---

## Valid Examples

```text
Password1@
Aryan123#
Hello123$
Java2026!
```

---

## Invalid Examples

```text
Password1
Password1@@
password1@
Password@
Hello123##
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
feature/uc8-password-rule4
```

---

## Learning Outcome

After completing UC8, you will understand:

- Positive Lookahead `(?=...)`
- Combining multiple validation rules
- Validating uppercase letters, digits, and special characters
- Restricting a password to exactly one special character
- Password validation using Regular Expressions

---

## Status

✅ UC8 Completed