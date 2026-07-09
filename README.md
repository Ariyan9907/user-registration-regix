# UC3 - Email Validation

## Description

This branch implements **Use Case 3 (UC3)** of the User Registration System.

The objective is to validate a user's **email address** using **Java Regular Expressions (Regex)**.

---

## Requirement

The email should satisfy the following conditions:

- Contains a valid username.
- May contain an optional '.' followed by additional characters.
- Must contain exactly one '@' symbol.
- Must contain a valid domain name.
- Must contain a valid domain extension.
- May contain an optional country extension.

Example:

```text
abc.xyz@bl.co.in
```

Where:

- `abc` → Mandatory username
- `.xyz` → Optional
- `@` → Mandatory
- `bl` → Mandatory domain
- `.co` → Mandatory extension
- `.in` → Optional country extension

---

## Regex Used

```regex
^[a-zA-Z0-9]+(\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\.[a-zA-Z]{2,}(\.[a-zA-Z]{2,})?$
```

---

## Regex Explanation

| Regex | Meaning |
|--------|---------|
| `^` | Start of string |
| `[a-zA-Z0-9]+` | Username (one or more letters/digits) |
| `(\.[a-zA-Z0-9]+)?` | Optional `.xyz` part |
| `@` | Mandatory separator |
| `[a-zA-Z0-9]+` | Domain name |
| `\.` | Dot before extension |
| `[a-zA-Z]{2,}` | Domain extension (co, com, org, etc.) |
| `(\.[a-zA-Z]{2,})?` | Optional country extension (in, uk, us, etc.) |
| `$` | End of string |

---

## Valid Examples

```text
abc@bl.co
abc.xyz@bl.co
abc@bl.co.in
abc.xyz@bl.co.in
john@gmail.com
john123@gmail.co.in
```

---

## Invalid Examples

```text
abcgmail.com
@gmail.com
abc@
abc@.com
abc@gmail
abc@gmail.
abc..xyz@gmail.com
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
- Java Regex (`Pattern.matches()`)
- JUnit 5

---

## Branch

```
feature/uc3-email-validation
```

---

## Learning Outcome

After completing UC3, you will understand:

- Character classes
- Groups `()`
- Optional groups `?`
- Escaping special characters (`\\.`)
- Email validation using Regular Expressions

---

## Status

✅ UC3 Completed