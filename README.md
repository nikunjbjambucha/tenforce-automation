# Tenforce Automation Assignment

## Overview

This project automates the following scenario on https://www.tenforce.com using Selenium WebDriver with Java and TestNG following the Page Object Model (POM) design pattern.

### Test Scenario

1. Open https://www.tenforce.com/
2. Navigate to the Careers page.
3. Scroll to the **Life at Tenforce** section.
4. Open the **"Life of two interns"** article.
5. Scroll through the article.
6. Navigate back to **Job openings**.
7. Verify that the text **"Feel free to send your CV to..."** is displayed.

---

## Framework Choice Justification

The framework is built using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**.

* **Selenium WebDriver** is a widely adopted open-source tool for browser automation and supports multiple browsers.
* **Java** provides strong object-oriented capabilities and extensive ecosystem support for automation frameworks.
* **TestNG** offers flexible test execution, annotations, assertions, and reporting features.
* **Maven** simplifies dependency management and enables tests to be executed easily from the command line.

This combination is industry standard, scalable, and suitable for building maintainable UI automation frameworks.

---

## Architecture

The project follows the **Page Object Model (POM)** design pattern, where each page of the application is represented by a separate class containing its locators and actions. This improves maintainability by separating test logic from UI interaction details.

Common functionalities such as driver initialization, waits, scrolling, and setup/teardown are centralized in utility and base classes. Test classes contain only the business flow and assertions, making the framework easy to extend and maintain.

---

## Project Structure

```text
src

├── main
│   └── java
│       └── com.tenforce
│            ├── pages
│            │     ├── BasePage.java
│            │     ├── HomePage.java
│            │     ├── CareerPage.java
│            │     └── ArticlePage.java
│            │
│            ├── utils
│            │     └── DriverFactory.java
│            │
│            └── constants
│                  └── FrameworkConstants.java
│
└── test
    └── java
        └── com.tenforce
             ├── base
             │      └── BaseTest.java
             │
             └── tests
                    └── TenforceTest.java

pom.xml
testng.xml
README.md
```

---

## Prerequisites

* Java 17+
* Maven 3.9+
* Chrome Browser
* Eclipse IDE (optional)

---

## How to Run the Tests

### Clone the repository

```bash
git clone <repository-url>

cd tenforce-automation
```

### Install dependencies

```bash
mvn clean install
```

### Execute tests

```bash
mvn test
```

### Execute specific TestNG suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## Assertions Used

* Verify that the **Life of two interns** article is opened successfully.
* Verify that the **Job openings** section is accessible.
* Verify that the text **"Feel free to send your CV to..."** is visible on the page.

---

## Author

Nikunj Jambucha
