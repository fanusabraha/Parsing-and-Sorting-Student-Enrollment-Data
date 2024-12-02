# Parsing-and-Sorting-Student-Enrollment-Data

 # README: Parsing and Sorting Student Enrollment Data

## Overview
This project is designed to provide junior developers with an opportunity to enhance their skills in parsing CSV files, organizing data, and performing file-based operations using Java. By completing this exercise, you will learn how to manipulate and structure raw data into meaningful outputs tailored to specific requirements.

## What You Will Learn
### 1. **Working with CSV Files**
   - Learn how to read data from a CSV file.
   - Understand how to split large datasets into smaller, meaningful subsets based on specific criteria.

### 2. **Data Structuring and Filtering**
   - Parse and filter data based on column values (e.g., separating students by course).
   - Dynamically handle input data for various courses and student attributes.

### 3. **Sorting Data**
   - Implement sorting algorithms or use built-in Java utilities to sort datasets by grade in descending order.
   - Handle potential issues like null values when sorting data.

### 4. **File Operations**
   - Learn how to write structured data back to separate CSV files.
   - Understand how to dynamically generate file names based on specific criteria.

### 5. **Error Handling**
   - Learn to handle edge cases such as missing or invalid data entries (e.g., null values in the dataset).
   - Prevent application crashes caused by improperly formatted input.

## Exercise Details
### Input
A "Master List" CSV file containing the following columns:
- `Student ID`
- `Student Name`
- `Course`
- `Grade`

### Output
Three separate CSV files (`course1.csv`, `course2.csv`, `course3.csv`) containing:
- Data filtered by course
- Students sorted by grade (in descending order)

### Key Features
- Each output file corresponds to a specific course.
- Each file is sorted by grades from highest to lowest.
- Dynamically structured data ensures reusability for other datasets.

## Skills Gained
- Reading and writing files in Java.
- Parsing strings and converting data types (e.g., parsing a grade from `String` to `Integer`).
- Using `Collections.sort` or other utilities to organize data.
- Practicing clean code principles by structuring data parsing and file writing into reusable methods.

## How to Use This Code
1. Place the master CSV file in the same directory as the Java program.
2. Run the program to generate `course1.csv`, `course2.csv`, and `course3.csv` in the same directory.
3. Review the outputs to ensure that students are grouped by course and sorted by grade.

## Extensions and Challenges
For those looking to further develop their skills:
- Add functionality to dynamically detect and handle more than three courses.
- Enhance the program to validate input files and handle corrupted or missing data gracefully.
- Optimize the sorting mechanism for larger datasets.
- Implement unit tests for each method to ensure code reliability and maintainability.

By working through this exercise, you will gain hands-on experience in handling real-world data processing tasks that are essential for backend development and data-related applications.
