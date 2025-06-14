#  Amazon Automated Web Testing Framework

This is a Java-based Selenium automation framework designed to test key functionalities of the Amazon India website. 
It leverages TestNG for test management and Maven for project build and dependency management.
The framework includes automation of core Amazon workflows and supports cross-browser testing to ensure compatibility across different web browsers.

---

##  Technologies Used

- Java 11+
- Selenium WebDriver
- TestNG****
- Maven
- WebDriverManager
- Page Object Model (POM) Design Pattern


## Project Structure

Please refer "Project_Structure.doc" file 

# Setup Instructions
git clone https://github.com/sivaogeti/Selenium_Learning/tree/main/AmazonTestFramework
cd AmazonTestFramework

# Prerequisites
Java JDK 11 or higher
Maven

# Update Config
Edit src/test/resources/config.properties:

username=your_emailid
password=your_password

# Functionalities\Modules Automated
Logging
Searching products
Adding product to Cart

# Cross-Browser support
chrome
Firefox
Microsoft Edge

# How to Run Tests
we can run entire test suite using "mvn test"

OR
run individual tests in eclipse using below option
Right-click test class → Run As → TestNG Test
