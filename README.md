# UC5 - Password Validation (Rule 1)

## Description

This branch implements **Use Case 5 (UC5)** of the User Registration System.

The objective is to validate a user's **password** based on **Rule 1** using **Java Regular Expressions (Regex)**.

---

## Requirement

The password should satisfy the following condition:

- Must contain **at least 8 characters**.

> **Note:** This is only **Rule 1**. Additional password rules will be implemented in the upcoming use cases (UC6, UC7, and UC8).

---

## Regex Used

```regex
^.{8,}$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `.` | Matches any character |
| `{8,}` | Minimum 8 characters |
| `$` | End of the string |

---

## Valid Examples

```text
Password
Password123
Aryan123
abcdefgh
12345678
```

---

## Invalid Examples

```text
Pass123
Hello
1234567
abc123
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
feature/uc5-password-rule1
```

---

## Learning Outcome

After completing UC5, you will understand:

- The `.` wildcard character
- Quantifiers (`{8,}`)
- Password length validation
- Regex anchors (`^` and `$`)

---

## Status

✅ UC5 Completed