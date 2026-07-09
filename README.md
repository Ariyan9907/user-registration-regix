# UC7 - Password Validation (Rule 3)

## Description

This branch implements **Use Case 7 (UC7)** of the User Registration System.

The objective is to validate a user's **password** based on **Rule 3** using **Java Regular Expressions (Regex)**.

---

## Requirement

The password should satisfy the following conditions:

- Must contain **at least 8 characters**.
- Must contain **at least one uppercase letter**.
- Must contain **at least one numeric digit**.

> **Note:** Rule 3 builds upon Rule 1 and Rule 2.

---

## Regex Used

```regex
^(?=.*[A-Z])(?=.*\d).{8,}$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `(?=.*[A-Z])` | Ensures at least one uppercase letter exists |
| `(?=.*\d)` | Ensures at least one numeric digit exists |
| `.` | Matches any character |
| `{8,}` | Minimum 8 characters |
| `$` | End of the string |

---

## Valid Examples

```text
Password1
Hello123
Aryan2026
JAVA1234
```

---

## Invalid Examples

```text
Password
password1
ABCDEFGH
Pass12
12345678
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
feature/uc7-password-rule3
```

---

## Learning Outcome

After completing UC7, you will understand:

- Positive Lookahead `(?=...)`
- Numeric digit validation using `\d`
- Combining multiple lookaheads
- Password validation using Regular Expressions

---

## Status

✅ UC7 Completed