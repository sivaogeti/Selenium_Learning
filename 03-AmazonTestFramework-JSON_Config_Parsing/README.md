# Automated Web Testing Framework for Amazon Using Selenium, TestNG & JSON Configuration

A robust, scalable Selenium automation framework for testing key functionalities of the Amazon India website.
Built with Java, TestNG, Maven, and supports cross-browser testing, modular POM design, and JSON-based configuration management.

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
