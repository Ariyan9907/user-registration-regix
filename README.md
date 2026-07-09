# UC2 - Last Name Validation

## Description

This branch implements **Use Case 2 (UC2)** of the User Registration System.

The objective is to validate the user's **last name** using **Java Regular Expressions (Regex)**.

---

## Requirement

The last name should satisfy the following conditions:

- The first letter must be an uppercase alphabet (`A-Z`).
- The remaining characters must be lowercase alphabets (`a-z`).
- The last name must contain at least **3 characters**.

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
Pujari
Sharma
Patil
Rao
```

---

## Invalid Examples

```text
pujari      // Starts with lowercase
PUJARI      // Contains uppercase letters after the first character
Pu          // Less than 3 characters
123Patil    // Starts with digits
Patil1      // Contains numbers
```

---

## Project Structure

```
src
├── main
│   └── java
│       └── UserRegistration.java
│
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
feature/uc2-last-name-validation
```

---

## Learning Outcome

After completing this use case, you will understand:

- Character classes (`[A-Z]`, `[a-z]`)
- Quantifiers (`{2,}`)
- Anchors (`^` and `$`)
- Input validation using `Pattern.matches()`

---

## Status

✅ UC2 Completed