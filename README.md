# UC1 - First Name Validation

## Description

This branch implements **Use Case 1 (UC1)** of the User Registration System.

The objective is to validate the user's **first name** using **Java Regular Expressions (Regex)**.

---

## Requirement

The first name should satisfy the following conditions:

- The first letter must be an uppercase alphabet (`A-Z`).
- The remaining characters must be lowercase alphabets (`a-z`).
- The first name must contain at least **3 characters**.

---

## Regex Used

```regex
^[A-Z][a-z]{2,}$
```

### Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `[A-Z]` | First character must be an uppercase letter |
| `[a-z]{2,}` | Minimum two lowercase letters |
| `$` | End of the string |

---

## Valid Examples

```text
Aryan
John
Ravi
Kiran
```

---

## Invalid Examples

```text
aryan      // Starts with lowercase
ARyan      // Contains uppercase after first letter
Ar         // Less than 3 characters
123Aryan   // Starts with digits
Aryan1     // Contains number
```

---

## Project Structure

```
src
└── main
    └── java
        └── UserRegistration.java

src
└── test
    └── java
        └── UserRegistrationTest.java
```

---

## Technologies Used

- Java
- Regular Expressions (Regex)
- JUnit 5

---

## Branch

```
feature/uc1-first-name-validation
```

---

## Status

✅ UC1 Completed
