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

---

## Task 3: Refactoring code

The goal here is to improve code readability and performance based on AI suggestions.

The following code snippet has a couple of issues with readability and maintainability, let's see if AI can fix those:

```java
public class DataProcessor {
    public static void processData() {
        // Simulated data fetch
        String rawData = "name:John Doe,age:29;name:Jane Smith,age:34";
         
        // Processing data
        String[] entries = rawData.split(";");
        for (String entry : entries) {
            String[] details = entry.split(",");
            String name = details[0].split(":")[1];
            String age = details[1].split(":")[1];
             
            // Output generation
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
 
    public static void main(String[] args) {
        processData();
    }
}
```

--- 

## Task 3: Refactoring code


<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Refactor this Java method for better readability and modularity:

~~~java
public class DataProcessor {
    public static void processData() {
        // Simulated data fetch
        String rawData = "name:John Doe,age:29;name:Jane Smith,age:34";
         
        // Processing data
        String[] entries = rawData.split(";");
        for (String entry : entries) {
            String[] details = entry.split(",");
            String name = details[0].split(":")[1];
            String age = details[1].split(":")[1];
             
            // Output generation
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
 
    public static void main(String[] args) {
        processData();
    }
}
~~~java
```

</div>

</v-click>


<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
Here's the refactored Java method for better readability and modularity:

~~~java
public class DataProcessor {

  public static void main(String[] args) {
    String rawData = "name:John Doe,age:29;name:Jane Smith,age:34";
    List<Map<String, String>> data = extractData(rawData);
    processData(data);
  }

  private static List<Map<String, String>> extractData(String rawData) {
    List<Map<String, String>> data = new ArrayList<>();
    for (String entry : rawData.split(";")) {
      Map<String, String> details = parseEntry(entry);
      data.add(details);
    }
    return data;
  }

  private static Map<String, String> parseEntry(String entry) {
    Map<String, String> details = new HashMap<>();
    for (String nameValue : entry.split(",")) {
      String[] parts = nameValue.split(":");
      details.put(parts[0].trim(), parts[1].trim());
    }
    return details;
  }

  private static void processData(List<Map<String, String>> data) {
    for (Map<String, String> entry : data) {
      String name = entry.get("name");
      String age = entry.get("age");
      System.out.println("Name: " + name + ", Age: " + age);
    }
  }
}
~~~

**Explanation of the Refactoring:**

1. **Extracting Data Processing:** The original `processData` method performed data extraction and processing in a single step. We've separated these concerns into two methods:
    - `extractData(String rawData)`: This method takes the raw data string and splits it into individual entries. Then, for each entry, it parses the data into a key-value map format using `parseEntry(String entry)`. Finally, it returns a list of these maps. 
    - `processData(List<Map<String, String>> data)`: This method takes the list of key-value maps generated by `extractData` and iterates through each map to retrieve names and ages. It then formats and prints this information.

2. **Using Descriptive Names:** Method names like `processData` are vague. We've renamed them to `extractData` and `processData` to better reflect their purpose.

3. **Using a List and Map:** The data is now stored in a `List<Map<String, String>>`. This is a more flexible and reusable structure compared to using separate string arrays.

4. **Improved Readability:** By separating functionalities and using descriptive names, the code becomes easier to understand and maintain.
```

</div>

</v-click>

---

## Task 4: Writing Unit Tests

Objective: generate unit tests for exixting functions

Assume that we have the following React component:

```js
import React, { useState } from 'react';
 
function ClickCounter() {
  const [count, setCount] = useState(0);
 
  const incrementCount = () => {
    setCount(count + 1);
  };
 
  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={incrementCount}>Click me</button>
    </div>
  );
}
 
export default ClickCounter;
```

Let's generate some tests for this component using AI.

---

## Task 4: Writing Unit Tests


<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Generate unit tests for the add function in JavaScript.
~~~js

import React, { useState } from 'react';
 
function ClickCounter() {
  const [count, setCount] = useState(0);
 
  const incrementCount = () => {
    setCount(count + 1);
  };
 
  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={incrementCount}>Click me</button>
    </div>
  );
}
 
export default ClickCounter;
~~~
```

</div>

</v-click>


<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
To generate unit tests for a component like `ClickCounter` in React, you'd
typically want to focus on testing its functionality, ensuring that the
component behaves as expected under different conditions. Since the primary
functionality of `ClickCounter` is to increment a count and display it, your
tests should cover:

1. Verifying that the count is initially set to `0`.
2. Ensuring that clicking the button increments the count appropriately.
3. (Optionally) Checking that the component renders correctly (snapshot testing).

Here's how you can write tests for `ClickCounter` using `React Testing Library`
and `Jest`. This assumes you're familiar with these tools and have them set up
in your project. If not, you might need to add them to your project first.

~~~javascript
import React from 'react';
import { render, fireEvent, screen } from '@testing-library/react';
import '@testing-library/jest-dom';
import ClickCounter from './ClickCounter'; // Adjust the import path as needed

describe('ClickCounter', () => {
  test('initially displays 0 clicks', () => {
    render(<ClickCounter />);
    expect(screen.getByText(/you clicked 0 times/i)).toBeInTheDocument();
  });

  test('increments count on button click', () => {
    render(<ClickCounter />);
    const button = screen.getByRole('button', { name: /click me/i });
    fireEvent.click(button);
    expect(screen.getByText(/you clicked 1 times/i)).toBeInTheDocument();
  });

  // Optional: Snapshot testing
  test('matches snapshot', () => {
    const { asFragment } = render(<ClickCounter />);
    expect(asFragment()).toMatchSnapshot();
  });
});
~~~

### Explanation:

- **Test 1 ("initially displays 0 clicks")**: This test checks if the component
  correctly displays that 0 clicks have occurred when it's first rendered.
- **Test 2 ("increments count on button click")**: This tests the functionality
  of the button within the component. It simulates a button click and then
checks if the text displaying the number of clicks is updated correctly.
- **Test 3 ("matches snapshot")**: Snapshot testing can be helpful to ensure
  your UI does not change unexpectedly. This test takes a "snapshot" of the
`ClickCounter` component and compares it against a reference snapshot file. If
the snapshot differs from the reference, the test will fail. This is optional
and can be useful for components with more complex rendering.

Remember, for snapshot testing to work, you'll need to have Jest configured to
handle snapshots, and you'll need to accept the initial snapshot the first time
you run the tests.
```

</div>

</v-click>

<!-- 

Note: Gemini has to be prompted multiple times to arrive at a solution
-->

---

# Task 5: interaction with an unfamiliar API

### Objective

Write a Python script to scan a DynamoDB users table and delete records where the email address matches a given regular expression pattern.

### Provided Information

- DynamoDB Table Name: users
- Each record in the table has the following attributes:
    - userId (String): The unique identifier for the user.
    - email (String): The user's email address.
- Regular Expression Pattern: ".*@example\.com$"

---

# Task 5: interaction with an unfamiliar API

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Write a Python script to scan a DynamoDB users table. The script should delete
all records where the email address matches the regular expression pattern
indicating the email domain is example.com.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
To accomplish this task, you will need a Python script that interacts with the
AWS DynamoDB service. The script will scan the users table for records where
the email address domain is `example.com` and then delete those records. To
perform operations on DynamoDB, you will need to use the `boto3` library, which
is the AWS SDK for Python.

Before you start, make sure you have:
- AWS CLI configured with the necessary access rights to read from and write to
  the DynamoDB table.
- `boto3` installed in your environment. You can install it using `pip install
  boto3` if you haven't already.

Here's a basic script to perform the task described:

~~~python
import boto3
import re

# Initialize a boto3 DynamoDB client
dynamodb = boto3.resource('dynamodb')
table = dynamodb.Table('users')  # Replace 'users' with your table name

# Compile the regular expression for matching 'example.com' domain in email addresses
email_pattern = re.compile(r'^[^@]+@example\.com$')

def delete_records_with_example_domain():
    # Scan the table (Note: Consider using pagination for large datasets)
    response = table.scan(
        ProjectionExpression="id, email"  # Adjust attributes as per your table's design
    )
    items = response.get('Items', [])

    # Filter items with email domain matching 'example.com'
    items_to_delete = [item for item in items if email_pattern.match(item.get('email', ''))]
    
    # Delete the filtered items
    for item in items_to_delete:
        delete_response = table.delete_item(
            Key={
                'id': item['id']  # Adjust the Key schema as per your table's design
            }
        )
        print(f"Deleted item with id {item['id']} and email {item['email']}")

if __name__ == "__main__":
    delete_records_with_example_domain()
~~~

Please adjust the `ProjectionExpression` and the `Key` in the `delete_item`
call to match your table's schema. The given script does not implement
pagination, which is necessary for scanning large tables. You may need to
handle the pagination by checking if `LastEvaluatedKey` exists in the response
and then making subsequent `scan` calls using that key as the
`ExclusiveStartKey` until all items have been scanned.

This script assumes that your DynamoDB table's primary key is `id` and that
each record has an `email` attribute. You should adjust these fields based on
your actual table schema. Additionally, for tables with a large number of
records, consider using a more efficient query mechanism or filtering directly
through DynamoDB if possible, as scanning can be expensive and time-consuming
for large datasets.
```

</div>

</v-click>

---

# Task 5: Interaction with an unfamiliar API

Notes:
- As noted by the assistant, handling large tables needs pagination. Tweak the script so that it uses pagination.
- Batching updates to DynamoDB is usually more performant on larger data sets. Consider tweaking the prompt to make the assistant use batch updates
