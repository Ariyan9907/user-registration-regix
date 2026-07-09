# UC4 - Mobile Number Validation

## Description

This branch implements **Use Case 4 (UC4)** of the User Registration System.

The objective is to validate a user's **mobile number** using **Java Regular Expressions (Regex)**.

---

## Requirement

The mobile number should satisfy the following conditions:

- Country code must contain exactly **2 digits**.
- Country code must be followed by **one space**.
- Mobile number must contain exactly **10 digits**.

Example:

```text
91 9482928131
```

---

## Regex Used

```regex
^\d{2}\s\d{10}$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `\d{2}` | Exactly 2 digits (Country Code) |
| `\s` | Exactly one whitespace |
| `\d{10}` | Exactly 10 digits (Mobile Number) |
| `$` | End of the string |

---

## Valid Examples

```text
91 9482928131
12 1234567890
99 9999999999
```

---

## Invalid Examples

```text
919482928131
91-9482928131
91 948292813
91 94829281311
9 9482928131
9194 82928131
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
feature/uc4-mobile-number-validation
```

---

## Learning Outcome

After completing UC4, you will understand:

- Digit matching using `\d`
- Whitespace matching using `\s`
- Quantifiers (`{2}`, `{10}`)
- Anchors (`^` and `$`)
- Mobile number validation using Regular Expressions

---

## Status

✅ UC4 Completed