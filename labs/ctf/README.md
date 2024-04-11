# Simple Capture the Flag (CTF) Challenge

# Challenge

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

1. Download the [SimpleCTFChallenge.class](https://github.com/alexey-grigorovich-clearscale/ai-tools-workshop-202404/raw/master/labs/ctf/SimpleCTFChallenge.class) class file
2. Run the following command to execute the class file:
    
    ```bash
    java -cp . SimpleCTFChallenge
    ```

    The program will prompt you for username and password. If the credentials are
    valid, it'll output a `flag` value, otherwise will print "Invalid credentials".

3. Using Google Gemini or ChatGPT AI assistants, investigate the class file
structure and locate the correct username and password that will print the
flag.

# Hints

Some starter prompts to get you started:

```md
You are reverse engineering java code for a toy CTF challenge. You are given a
java class file that asks for username and password, validates it and outputs a
flag if the username/password are correct. Solve the CTF challenge step by
step. When tools are needed, provide recommendations for the tools to the user.
Prefer tools included in the JDK or python standard library.

Attaching the class file:

<class file>
```

# Development

## Build

To rebuild the class file, run

```
javac -d . src/SimpleCTFChallenge.java
```

