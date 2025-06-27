# 🧪 Automated Regression Testing Framework - Selenium + TestNG

This is a Java-based Selenium automation framework for performing **regression testing** on web applications. 
It follows the **Page Object Model (POM)** design pattern and supports integration with **TestNG** for test execution and **Maven** for dependency management.

---

## 📁 Project Structure



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

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Page Object Model (POM)**
- **ChromeDriver**


## Project Structure

Please refer "Project_Structure.doc" file 

# Setup Instructions
git clone https://github.com/your-username/selenium-regression-framework.git
cd selenium-regression-framework

## Install Dependencies
Make sure you have Maven installed, then run:

mvn clean install

## How to Run Tests
Using Maven
	mvn test

Using TestNG XML
	mvn clean test -DsuiteXmlFile=testng.xml

##🧪 Test Coverage
Test Suite							Class						Description
Login Tests							AmazonLoginPageTest			Validates login functionality
Search Tests						AmazonSearchTest			Validates search input & results
Checkout Tests						AmazonCartTest			1	Validates checkout workflow

