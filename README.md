# UC9 - Email Sample Validation

## Description

This branch implements **Use Case 9 (UC9)** of the User Registration System.

The objective is to validate multiple **valid and invalid email samples** using Java Regular Expressions (Regex) to ensure the email validation logic works correctly.

---

## Requirement

Validate different email formats and verify whether they are accepted or rejected based on the defined email validation regex.

---

## Regex Used

```regex
^[a-zA-Z0-9]+(\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\.[a-zA-Z]{2,}(\.[a-zA-Z]{2,})?$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of the string |
| `[a-zA-Z0-9]+` | Username |
| `(\.[a-zA-Z0-9]+)?` | Optional dot followed by characters |
| `@` | Mandatory separator |
| `[a-zA-Z0-9]+` | Domain name |
| `\.[a-zA-Z]{2,}` | Domain extension |
| `(\.[a-zA-Z]{2,})?` | Optional country extension |
| `$` | End of the string |

---

## Test Cases

### Valid Emails

```text
Aryan@gmail.com
aryan.pujari@gmail.com
aryan123@yahoo.co.in
```

### Invalid Emails

```text
aryan@gmail
aryan@@gmail.com
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
feature/uc9-email-sample-validation
```

---

## Learning Outcome

After completing UC9, you will understand:

- Email validation using Regular Expressions
- Testing multiple valid and invalid email samples
- Verifying regex behavior against different input formats
- Manual validation using Java

---

## Status

✅ UC9 Completed