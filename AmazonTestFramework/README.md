#  Amazon Automated Web Testing Framework

This is a Java-based Selenium automation framework for testing key functionalities of the Amazon India website using **TestNG** and **Maven**.

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

# How to Run Tests
we can run entire test suite using "mvn test"

OR
run individual tests in eclipse using below option
Right-click test class → Run As → TestNG Test

