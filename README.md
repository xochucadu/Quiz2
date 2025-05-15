# Quiz #2 - Task 1

## Overview

This Java program is developed as part of Quiz #2 for the package `oop.q2`.

The program performs the following tasks:

- Initializes two predefined lists:
  - `list1`: A list of integers representing indices.
  - `list2`: A list of strings containing various elements.

- Processes `list1` and `list2` to create a third list, `list3`.  
  For each element `x` in `list1`, it calculates the index `(2 * x - 1)` to retrieve an element from `list2`.  
  These retrieved elements are collected in `list3`.

- Prints the contents of `list3`.

## Package Structure

- Package name: `oop.q2`
- Main class: `Task1`

---

## 📘 Classes Overview

### 1. `Student.java`

Fields:
- `String name`
- `String surname`
- `String country`
- `String info`

Includes constructor, `toString()`, `equals()`, and `hashCode()`.

### 2. `University.java`

Methods:
- `addStudent(Student s)`
- `removeStudent(Student s)`
- `printStudents()`
- `getStudentInfoStrange(Student s)`

Special logic in `getStudentInfoStrange()` based on whether the student is the author or someone else.

### 3. `Main.java`

Demonstrates how to:
- Add students
- Remove students
- Print all students
- Test `getStudentInfoStrange()` method in all required cases

---

## 🧪 Example Output

```plaintext
Current Students:
Nikita Bezhanovi (Georgia) - Hardworking CS student
John Doe (USA) - Basketball fan

Info if I’m in university:
OOP, Databases, Web Development

Info if I’m NOT in university:
69384751

Friend's info:
Basketball fan

Unknown student:
null

