# Assignment 1
Counting how many java classes are in a specified folder, and how many issues they solve.

# Application Process
1. Determine current working directory.
2. Obtain all files' name from the directory.
3. To get total number of java files: 
   - Check if files have .java extention.
   - Increment classCount if file ends with .java

4. To get total number of issues solved:
   - Read content of each java file using BufferedReader, ignoring files with other extention.
   - Compare each line obtained through BufferedReader with a subString
     - subString1 = "public static void main(String[] args)"
     - subString2 = "public static void main(String args[])"
   - Increment issueCount if a line contains subString.

#### Sample Output Using Test Files Provided:
![Output](https://i.imgur.com/BYHfiYI.jpg)

# JUnit Testing
To run JUnit test, execute A1_JunitTestSuite.java located in Test Packages, com.realtime.a1

![JUnit Test Result](https://i.imgur.com/HSSasOF.jpg)

# Limitation
This application is only suitable for counting issues which each issue only have **ONE** entry point because this application assumes one main method is euqal to solving one issue and doesn't take multiple entry points (main methods) into consideration.

# Reference
1. Get all file names in a folder: https://stackoverflow.com/a/1846349
2. Get current working directory: https://stackoverflow.com/a/1846349
3. Manipulating characters in string: https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html
4. Read file using BufferedReader: https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example
5. SubString Matching: https://stackoverflow.com/a/2275035
6. Pass parameters to java thread: https://stackoverflow.com/a/877113
7. Returning value from thread: https://stackoverflow.com/a/9148954
8. JUnit tutorial: https://www.youtube.com/watch?v=o5k9NOR9lrI
9. ArrayList equality JUnit testing: https://stackoverflow.com/a/15457020
