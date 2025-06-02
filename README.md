# Palindrome Checker

[![version](https://img.shields.io/badge/version-1.0.1-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/palindrome-checker/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/palindrome-checker/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/palindrome-checker/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/palindrome-checker)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.21-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-8.14.1-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

A simple Kotlin utility to check whether a given string is a **palindrome** — ignoring case, spaces, punctuation, and special characters.

## 🔍 What is a palindrome?

A palindrome is a word, phrase, number, or sequence of characters that reads the same backward as forward — for example:

- `madam`
- `A man, a plan, a canal: Panama!`
- `12321`

## ✅ Features

- Ignores non-letter/digit characters
- Case-insensitive comparison
- Unicode-aware
- Includes a comprehensive set of parameterized tests

## 📦 Installation

Clone the repository:

```bash
git clone https://github.com/your-username/palindrome-checker.git
cd palindrome-checker
````

Build the project:

```bash
./gradlew build
```

## 🧪 Running Tests

```bash
./gradlew test
```

You can find test cases in `PalindromeTest.kt`. They cover:

* Valid palindromes
* Non-palindromes
* Edge cases (e.g., empty string, single characters, digits)

## 🧠 How it works

The core logic is defined in a Kotlin extension function:

```kotlin
fun String.isPalindrome(): Boolean {
    val sanitized = lowercase().filter { it.isLetterOrDigit() }
    return sanitized == sanitized.reversed()
}
```

This function:

1. Converts the string to lowercase.
2. Removes all characters except letters and digits.
3. Compares the sanitized string with its reversed version.

## 🧾 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
