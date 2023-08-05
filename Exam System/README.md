Sure! Here's a sample README file for the Java program:

# Java Quiz Application task given on CodeAcademy Oman

This is a simple Java quiz application that presents the user with a set of multiple-choice questions and calculates their total score based on the correct answers provided.

## Prerequisites

To run this Java quiz application, you need to have the following installed on your system:

- Java Development Kit (JDK) - version 8 or higher
- Any integrated development environment (IDE) or a Java compiler to run the program.

## Getting Started

1. Clone the repository to your local machane  you can download the ZIP file of the repository and extract it.

2. Open the cloned or extracted folder in your preferred IDE or compiler.

3. Compile and run the `Main.java` file, which contains the main method, to start the quiz application.

## Usage

The quiz application will prompt the user with five multiple-choice questions, one after another. Each question will be followed by four answer choices, labeled as A, B, C, and D. To answer a question, enter the letter corresponding to your choice (e.g., "A" for the first option).

Once you have completed all the questions, the application will display your exam mark, which is the total score based on the correct answers you provided.

## Adding or Modifying Questions

To add or modify questions for the quiz, open the `Main.java` file in your IDE or text editor. Inside the `main` method, you will find an array called `questions`, which stores instances of `ExamQuestion` objects.

To add a new question, create a new instance of the `ExamQuestion` class and add it to the `questions` array. Each `ExamQuestion` instance takes four parameters: the question, an array of answer choices, the correct answer (as a single letter), and the mark for that question.

For example, to add a new question, you can do the following:

```java
ExamQuestion newQuestion = new ExamQuestion("6. What is the capital of France?",
    new String[]{"A. Paris", "B. Berlin", "C. London", "D. Rome"}, "A", 2);
questions[5] = newQuestion; // Assuming you have already added five questions before this.
```



## Author

This quiz application was created by Ammar Al hasani

