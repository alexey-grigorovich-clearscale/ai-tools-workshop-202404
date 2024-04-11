---
# try also 'default' to start simple
theme: seriph
# random image from a curated Unsplash collection by Anthony
# like them? see https://unsplash.com/collections/94734566/slidev
# some information about your slides, markdown enabled
title: Clearscale Summit 2024 AI in Software Development Workshop
info: |
  ## Clearscale Summit 2024 AI in Software Development Workshop
  Presentation slides and accompanying resources for the AI in Software Development workshop at the Clearscale Summit 2024.

# apply any unocss classes to the current slide
class: text-center
# https://sli.dev/custom/highlighters.html
highlighter: shiki
# https://sli.dev/guide/drawing
drawings:
  persist: false
# slide transition: https://sli.dev/guide/animations#slide-transitions
transition: slide-left
# enable MDC Syntax: https://sli.dev/guide/syntax#mdc-syntax
mdc: true
---

# AI in Software Development Workshop

## Or, How I Outsourced My Job to AI and Still Got Paid

---

## Agenda

- Introduction
- Understanding of AI tools and technologies
- Practical demonstrations
- Addressing Challenges and Mitigating Risks
- The Future of AI in Software Development
- Q&amp;A Session
- Closing Remarks and Resources

<!--
- Welcome, my name is Alexey Grigorovich and I will be your host today for the AI in Software Development workshop.
- The goal of this talk is to provide you with an understanding of AI tools and technologies, practical demonstrations, addressing challenges and mitigating risks, the future of AI in software development, and a Q&amp;A session.
-->

---

## Introduction to Modern AI in Software Development

A brief timeline of AI advancements:

<v-clicks>

- Transformers paper by Vaswani et al. in 2017, kicking off the transformer revolution
- GPT-2 published by OpenAI in 2019
- GitHub Copilot beta released by GitHub in 2021
- GPT-3.5 published by OpenAI in 2022, marking first practical use of AI in software development
- ChatGPT published by OpenAI in 2023, enabling conversational AI for the people
- ChatGPT 4.0 released by OpenAI in 2023, increasing the capabilities of conversational AI
- Google Gemini released by Google in late 2023

</v-clicks>

---

## Introduction to Modern AI in Software Development

Evolution in AI tools in software development

<v-clicks>

- code completion and generation (e.g. GitHub Copilot, AWS CodeWhisperer aka Q Developer)
- code suggestions and refactoring (e.g. GitHub Copilot Chat)
- code review (AWS CodeGuru)
- code search and completions (SourceGraph Cody)

</v-clicks>

---

# Practical Demonstrations

---

## Prerequisites

For the workshop, we recommend having the following tools and accounts ready:

- Google Gemini account
- Optionally, OpenAI ChatGPT account
- Code editor and language runtimes, or
- an online playground (such as repl.it)

We'll be using examples in Python, Javascript and some other languages throughout the workshop; feel free to follow along or just watch.

---

## Task 1: Basic code generation

Let's start with something simple. We'll ask the AI to generate a simple "Hello, World!" program in Python:

<v-click>

<div class="entry user">

```md
Write a Python program that prints 'Hello, World!' to the console.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

````md
Here's a Python program that prints "Hello, World!" to the console:

~~~python
print("Hello, World!")
~~~

This program uses the `print` function, which is a built-in function in Python
that outputs the given message to the console. The message you want to print is
enclosed in quotation marks.
````
</div>

</v-click>

<v-click>

This is not terribly sophisticated, is it? Why don't we try something more exotic, shall we?

</v-click>

<!--

Prompt: Ask the AI to generate a simple "Hello, World!" program in Python.

Objective: Familiarize with basic command prompts for code generation.

Expected Output from AI: A simple Python script.

Evaluation Criteria: Correct syntax, successful execution printing "Hello, World!".

Note: see how modern models have been trained to follow instructions and generate code snippets based on the input prompt.

-->

---

## Task 1: Basic code generation

Let's check if the AI can generate a "Hello, World" in an esoteric language like Brainfuck:

<v-click>

<div class="entry user">

```md
Write a Brainfuck program that prints 'Hello, World!' to the console.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'400px'}
Brainfuck is an esoteric programming language designed to challenge and amuse
programmers, and not for practical use. Its simplicity in the design,
consisting of only eight commands, belies the complexity of the programs it
can execute. Writing "Hello, World!" in Brainfuck involves manipulating the
memory tape to store the ASCII values of the characters in "Hello, World!" and
then printing them. Here's a Brainfuck program that does just that:

~~~text
>+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]
<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.
~~~

Each command in Brainfuck does the following:

- `>` increment the data pointer (to point to the next cell to the right).
- `<` decrement the data pointer (to point to the next cell to the left).
- `+` increment (increase by one) the byte at the data pointer.
- `-` decrement (decrease by one) the byte at the data pointer.
- `.` output the byte at the data pointer.
- `,` accept one byte of input, storing its value in the byte at the data pointer.
- `[` if the byte at the data pointer is zero, then instead of moving the
  instruction pointer forward to the next command, jump it forward to the
command after the matching `]` command.
- `]` if the byte at the data pointer is nonzero, then instead of moving the 
  instruction pointer forward to the next command, jump it back to the command
  after the matching `[` command.

This program initializes cells with the ASCII values corresponding to the
letters in "Hello, World!", and then prints them one by one.
```

</div>

</v-click>

---

## Task 1: Basic code generation

I happen to have a Brainfuck compiler on my machine, which I'm going to use to test that code. You could also use an online interpreter such as (https://me.pocke.me/brainfuck-playground/):

```bash
$ cat >hello.bf <<EOF
>+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]
<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.
EOF
$ bfc hello.bf
$ ./hello
Hello World!
```

---

## Task 1: Basic code generation

Another example: z80 assembly language

<v-click>

<div class="entry user">

```md
Write a program in z80 assembly language that prints "Hello, World" to the
standard output, assuming MSX-2 machine architecture
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```asm {all}{maxHeight:'200px'}
        org     100h            ; Origin address, standard for MSX DOS .COM programs

start:
        ld      hl, msg         ; Load address of the message into HL
nextchar:
        ld      a, (hl)         ; Load the character pointed by HL into A
        or      a               ; Logical OR A with itself to check if it's the null terminator (0)
        jp      z, finished     ; If zero, we've hit the end of the string, jump to finished
        call    0A2h            ; Call CHPUT routine of MSX BIOS to print > aracter in A
        inc     hl              ; Move to the next character in the string
        jp      nextchar        ; Jump back to print the next character

finished:
        ret                     ; Return to MSX-DOS

msg:    db      'Hello, World!', 0 ; Null-terminated string

        end     start           ; End of the program, with start as entry int
```

</div>

</v-click>

---

## Task 2: Understanding Code and fixing bugs

The goal is use AI to idenitfy and fix bugs in a given code snippet.

Code snippet:

````md magic-move
```python
def calculate_area(radius):
    pi = 3.14
    area = pi * radius ^ 2
    return area
```

```python
def calculate_area(radius):
    pi = 3.14
    area = pi * radius ^ 2  # Error: Incorrect exponentiation operator
    return area
```
````

<v-click>

This snippet has subtle bug in the calculation of the area: the code uses the `^` operator, which is the bitwise XOR operator, instead of the `**` operator, which is the exponentiation operator. Let's see if AI can spot this!

</v-click>

---

<style>


</style>

## Task 2: Understanding Code and fixing bugs

<v-click>

<div class="entry user">

```md
Identify and correct the error in this Python function.

~~~python
def calculate_area(radius):
  pi = 3.14
  area = pi * radius ^ 2
  return area
~~~
```

</div>

</v-click>

<v-click> 

<div class="entry ai">

```md {all}{maxHeight:'300px'}
The error in the function is the way the exponent is calculated. In Python, the
caret (`^`) symbol is used for the bitwise XOR operator, not exponentiation.
 
Here's the corrected code:
 
~~~python
def calculate_area(radius):
  pi = 3.14
  area = pi * radius ** 2  # Use ** for exponentiation
  return area
~~~
 
Use code with caution.  This code uses the correct operator `**` for
exponentiation. It calculates the area of the circle by multiplying `pi` by the
`radius` squared.
```

</div>

</v-click>

---
