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

## Task 2: Understanding Code and fixing bugs

OK, that was easy. What about performance issues?

```java
import java.util.Map;

public class ContentUtils {
    private static final String TEMPLATE_DELIMITERS = "%%";

    /**
      * Instantiates the given template, replacing placeholders with the corresponding values.
      */
    public static String instantiateTemplate(String template, Map<String, String> values) {
        String result = template;
        if (result != null && values != null) {
            for (var item : values.entrySet()) {
                String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
                result = result.replace(attribute, item.getValue());
            }
        }
        return result;
    }
}
```

Quick poll: can you spot any issues with the following code?

---

## Task 2: Understanding Code and fixing bugs

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Provide code review comments and code suggestions for the following code:

~~~java
import java.util.Map;

public class ContentUtils {
  private static final String TEMPLATE_DELIMITERS = "%%";

  /**
   * Instantiates the given template, replacing placeholders with the corresponding values
   */
  public static String instantiateTemplate(String template, Map<String, String> values) {
    String result = template;
    if (result != null && values != null) {
      for (var item : values.entrySet()) {
        String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
        result = result.replace(attribute, item.getValue());
      }
    }
    return result;
  }
}
~~~

```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
Sure, here are some code review comments and suggestions for the provided Java code:

**Comments:**

* **Clarity:** The code is well-formatted and easy to read. The variable names
  are descriptive, and the comments clearly explain the purpose of the
  function.
* **Efficiency:** The code could be slightly more efficient by using a
  StringBuilder instead of repeated string concatenation within the loop.

**Suggestions:**

* **StringBuilder:** Consider using a `StringBuilder` to improve the efficiency
  of the `replace` operation within the loop. Here's how the code can be
  modified:

~~~java
public static String instantiateTemplate(String template, Map<String, String> values) {
  if (template == null || values == null) {
    return template; // Handle null cases gracefully
  }
  StringBuilder result = new StringBuilder(template);
  for (var item : values.entrySet()) {
    String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
    int index = result.indexOf(attribute);
    while (index != -1) {
      result.replace(index, index + attribute.length(), item.getValue());
      index = result.indexOf(attribute, index + item.getValue().length());
    }
  }
  return result.toString();
}
~~~

* **Null Handling:** The current code doesn't handle null cases for `template`
  and `values`. It would be better to handle these cases explicitly and
  potentially return an empty string or throw an exception depending on the
  desired behavior.
* **Error Handling:** The code assumes that the placeholders (`attribute`) will
  always exist in the template. Consider adding checks to handle cases where a
  placeholder might be missing in the template string.

**Additional Notes:**

* The code uses `var` for iterating through the map entries. This requires Java
  10 or above. If compatibility with older versions is needed, you can use the
  traditional `Map.Entry<String, String>` type.

I hope these comments and suggestions are helpful!
```

</div>

</v-click>

---

## Task 2: Understanding Code and fixing bugs

When prompted to focus on performance of processing larger templates with lots of parameters, ChatGPT arrived at a single-pass version:

<div class="entry user">

```md
Can you suggest performance improvements assuming large templates and large
number of placeholders?
```

</div>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
[... skipped ...]

** Performance-Optimized Code Example **

Here’s how you might implement a more performance-optimized version using
StringBuilder and a single-pass token parsing strategy:

~~~java
import java.util.Map;

public class ContentUtils {
  private static final String TEMPLATE_DELIMITER_START = "%%";
  private static final String TEMPLATE_DELIMITER_END = "%%";

  /**
   * Instantiates the given template, replacing placeholders enclosed by %% with the corresponding values.
   * This method is optimized for large templates and a large number of placeholders.
   *
   * @param template The template string with placeholders.
   * @param values A map containing placeholder values.
   * @return A string with placeholders replaced by corresponding map values.
   * @throws IllegalArgumentException if template or values is null.
   */
  public static String instantiateTemplate(String template, Map<String, String> values) {
    if (template == null || values == null) {
      throw new IllegalArgumentException("Template and values must not be null");
    }

    StringBuilder result = new StringBuilder();
    int lastIndex = 0;
    int startIndex = template.indexOf(TEMPLATE_DELIMITER_START);

    while (startIndex != -1) {
      // Copy everything up to the start of the placeholder
      result.append(template, lastIndex, startIndex);

      int endIndex = template.indexOf(TEMPLATE_DELIMITER_END, startIndex + TEMPLATE_DELIMITER_START.length());
      if (endIndex != -1) {
        String key = template.substring(startIndex + TEMPLATE_DELIMITER_START.length(), endIndex);
        // Replace the placeholder with its value from the map, defaulting to the placeholder itself if not found
        result.append(values.getOrDefault(key, TEMPLATE_DELIMITER_START + key + TEMPLATE_DELIMITER_END));

        lastIndex = endIndex + TEMPLATE_DELIMITER_END.length();
      } else {
        // No closing delimiter found, append the rest of the template
        result.append(template.substring(startIndex));
        break;
      }

      startIndex = template.indexOf(TEMPLATE_DELIMITER_START, lastIndex);
    }

    // Append any remaining part of the template
    if (lastIndex < template.length()) {
      result.append(template.substring(lastIndex));
    }

    return result.toString();
  }
}
~~~
```

</div>

</v-click>

---

## Task 2: Understanding Code and fixing bugs

Performance Results:

```
Original version:               4.321083333
Bard initial version:           48.510457833
ChatGPT initial version:        4.232012875
ChatGPT4 optimized version:     6.74222875
```

Notes:
- Amuzingly, the original version turned out to be more performant than the "optimized" one on the tests that I've ran
    - I'm assuming that the `String.replace` built-in is optimized extremely well compared to other variants;
- GPT4 was able to restructure the loop to arrive at a single-pass variant,
  although it still under-performed the naive implementation;
- Bard's optimized variant (not listed here) failed to compile, but your mileage may vary.

---

## Task 2: Understanding Code and fixing bugs

### Lessons

- Both GPT4 and Bard were able to spot the potential inefficiencies and suggest funcitonally equivalent improvements
- You should always validate the changes to see if they are actually improvements
- Thankfully, AI could help with testing as well!


