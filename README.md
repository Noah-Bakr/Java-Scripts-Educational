[![header][header-url]][header-link]

# Java Scripts (Educational)
[![Project Version][version-image]][version-url]
[![Java][Java-image]][Java-url]
[![Eclipse][Eclipse-image]][Eclipse-url]
[![VSCode][VSCode-image]][VSCode-url]

> A collection of scripts created throughout my years of study, displayed to show my learning and heavily commented to help others learn.

This repository is a curated collection of Java projects that I’ve developed throughout my academic journey. Each script highlights various aspects of Java programming, from core concepts to advanced features, demonstrating my growth as a developer.

> [!NOTE]  
> This repository is a collection of scripts, coded in Java. Projects can be found on my Github profile or, view my most recent [project][PS1-url].

---
## Author

**Noah Bakr** 
* *Initial work* - Script Development
* *My professional profile on* [LinkedIn][linkedin-url]

## Showcase

This repository was designed to demonstrate:

* **Object-Oriented Programming**
  * Inheritance
  * Polymorphism
  * Encapsulation
* **Data Structures and Algorithms**
  * Problem-Solving
  * Efficiency
  * Search &amp; Sort Algorithms
* **Database Integration**
  * JDBC Integration
    * Further depth is shown in [this][PS1-url] project

---

## File Directory
Folders:
```bash
├── Beginner                  - Collection of scripts, given the 'beginner' difficulty rating
├── Intermediate              - Collection of scripts, given the 'intermediate' difficulty rating
├── Advanced                  - Collection of scripts, given the 'advanced' difficulty rating
│      └── ProjectName        - Group of files that are connected, through file reference and inheritance
```

Other Files:
```bash
├── JSE-Header.png            - Header image
└── README.md                 - This file
```
<br>

| File | Description | Difficulty |
| :--- | :--- | :---: |
| [``CoinFlip.java``][CoinFlip-url] | A script that utilises the 'Random' class to choose an output (heads or tails). | Beginner |
| [``Fibonacci.java``][Fibonacci-url] | A script that utilises the Fibonacci Sequence formula (Fn = Fn-1 + Fn-2, where n > 1), to locate a sequence position. | Beginner |
| [``LargestNumber.java``][LargestNumber-url] | A script to find the largest number in each array. | Beginner |
| [``RemoveEvenNumbers.java``][RemoveEvenNumbers-url] | A script that reads an array and filters out 'even numbers' through 'if' statement operations, then returns only the odd numbers, in an array. | Beginner |
||||
| [``GuessTheWord.java``][GuessTheWord-url] | A script that utilises The 'String Tokeniser' class to break a string into tokens, i.e. an array of individual characters. | Intermediate |
| [``InsertionSort.java``][InsertionSort-url] | A script that utilises "Insertion Sort" to order an array. Steps are shown in the output for educational purposes. | Intermediate |
| [``SmallestNumbers.java``][SmallestNumbers-url] | A script that utilises "Selection Sort" to order an array and, returns the two smallest numbers. | Intermediate |

---

## Libraries
**Current Libraries:**
* [org.xerial.sqlite-jdbc][xerial-sqlite-jdbc-url] (SQLite JDBC library)

**Libraries required as dependencies:**
* By Xerial/JDBC
   * sqlite-jdbc

---

## Building & Running the code
There are two types of script builds
1. Single ``.java`` script files
2. Secondary folders with **two or more** ``.java`` script files (with the addition of other files if necessary)

### Running a ``.java`` Script File
1. Open the repository within VSCode or, download the single ``.java`` file
2. Allow VSCode to trust the authors
3. To Build & Run, click the 'Run Java' play button in the top right
4. The script will then open in the terminal window, input as directed

### Running Multiple ``.java`` Script Files from a Folder
1. Open the repository within VSCode or, download the whole folder
2. Allow VSCode to trust the authors
3. Navigate to the ``Main.java`` script file
3. To Build & Run, click the 'Run Java' play button in the top right
4. The script will then open in the terminal window, input as directed

---

## Built With

* [Eclipse](https://eclipseide.org/) - IDE
* [VSCode](https://code.visualstudio.com/) - IDE

## Release History

* 0.1.0
    * Portfolio Presentation (New ``README.md``)
* 0.0.1
    * Initial work

---

&copy; Noah Bakr 2024

<!-- Markdown link & img dfn's -->

[header-url]: JSE-Header.png
[header-link]: https://github.com/Noah-Bakr

[Webpage-Showcase-image]: README-Images/Webpage-Showcase.png

[xerial-sqlite-jdbc-url]: https://github.com/xerial/sqlite-jdbc

[linkedin-url]: https://www.linkedin.com/in/Noah-Bakr
[PS1-url]: https://github.com/Noah-Bakr/Programming-Studio-1-Project

[version-image]: https://img.shields.io/badge/Version-1.0.0-brightgreen?style=for-the-badge&logo=appveyor
[version-url]: https://img.shields.io/badge/version-1.0.0-green

[Java-image]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white

[Eclipse-image]: https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white
[Eclipse-url]: https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white

[VSCode-image]: https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white
[VSCode-url]: https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white

<!-- Links to Code Files -->
[CoinFlip-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/Beginner/CoinFlip.java
[Fibonacci-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/Beginner/Fibonacci.java
[RemoveEvenNumbers-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/Beginner/RemoveEvenNumbers.java
[LargestNumber-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/Beginner/LargestNumber.java

[GuessTheWord-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/intermediate/GuessTheWord.java
[InsertionSort-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/intermediate/InsertionSort.java
[SmallestNumbers-url]: https://github.com/Noah-Bakr/Java-Scripts-Educational/blob/main/intermediate/SmallestNumbers.java
