# Simple Capture the Flag (CTF) Challenge

## Description

We're given a java class file that checks the username and password that we
input and prints the flag if the credentials are correct. The goal of the
challenge is to find the correct username and password that will print the
flag.

## Prerequsites

* Java Development Kit (JDK), any version
* Access to Google Gemini or ChatGPT 4 (preferred)
* Optionally, python

## Instructions

1. Locate the `SimpleCTFChallenge.class` file.
2. Run the following command to execute the class file:

```bash
java -cp . SimpleCTFChallenge
```

The program will prompt you for username and password. If the credentials are
valid, it'll output a `flag` value, otherwise will print "Invalid credentials".

3. Using Google Gemini or ChatGPT AI assistants, investigate the class file
structure and locate the correct username and password that will print the
flag.

# Development

## Build

To rebuild the class file, run

```
javac -d . src/SimpleCTFChallenge.java
```

