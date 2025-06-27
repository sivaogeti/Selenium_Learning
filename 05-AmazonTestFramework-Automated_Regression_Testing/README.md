# 🧪 Automated Regression Testing Framework - Selenium + TestNG

This is a Java-based automated regression testing framework for web applications using **Selenium WebDriver**, **TestNG**, **Maven**, and **Allure Reporting**.

It is designed to test core user journeys of the Amazon India website (or any similar e-commerce platform), including login, search, cart, and checkout functionalities.

---

## 📂 Project Structure

---

## Features
🔧 Page Object Model (POM) for clean code and reusability

🧪 TestNG for test management, grouping, parallel execution

⚙️ Maven for dependency management and easy build/run

🧩 JSON-based Config Management via custom JsonConfigReader

🌐 Cross-Browser Support (Chrome, Firefox, Edge)

📄 Data-driven Testing support using JSON

📊 Easily extendable for CI/CD and reporting integration

##  Technologies Used

| Technology                  | Description                                                                   |
| --------------------------- | ----------------------------------------------------------------------------- |
| **Java**                    | Programming language for automation logic and test structure                  |
| **Selenium WebDriver**      | Web automation framework for interacting with browsers                        |
| **TestNG**                  | Test framework for structuring, grouping, and executing tests                 |
| **Maven**                   | Build automation and dependency management tool                               |
| **Allure Reports**          | Advanced reporting tool for generating rich, interactive test reports         |
| **Page Object Model (POM)** | Design pattern to maintain clean separation of test logic and UI interactions |
| **Config Properties**       | Externalized configuration management for flexibility                         |
| **Git**                     | Version control system for tracking code changes                              |
| **ChromeDriver**            | WebDriver implementation for running tests on Google Chrome                   |



## 🚀 How to Run the Tests

### 1. 📦 Install Dependencies
Make sure you have:
- Java 8+
- Maven
- Chrome browser
- [Allure CLI](https://docs.qameta.io/allure/#_installing_a_commandline)

Install Allure CLI using Chocolatey (Windows):
choco install allure

### 2. Run Tests
mvn clean test

### 3. View Allure Report
allure serve target/allure-results

### Configuration
browser=chrome
baseUrl=https://www.amazon.in
username=yourEmail
password=yourPassword

### Key Components
| Component       | Description                                |
| --------------- | ------------------------------------------ |
| `BasePage`      | Common Selenium actions                    |
| `DriverFactory` | WebDriver initialization & teardown        |
| `ConfigReader`  | Loads values from `config.properties`      |
| `LoginPage`     | Page Object for login elements             |
| `LoginTests`    | Test class to validate login functionality |
| `testng.xml`    | Defines test classes and Allure listener   |


### Clean & Build Project
mvn clean install

### Sample Scripts
To run and generate reports in one step:

run_allure_report.bat (Windows)

mvn clean test
allure serve target/allure-results


# Setup Instructions
git clone https://github.com/your-username/selenium-regression-framework.git
cd selenium-regression-framework

##🧪 Test Coverage
Test Suite							Class						Description
Login Tests							AmazonLoginPageTest			Validates login functionality
Search Tests						AmazonSearchTest			Validates search input & results
Checkout Tests						AmazonCartTest			1	Validates checkout workflow
