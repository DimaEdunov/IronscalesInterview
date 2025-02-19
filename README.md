# IronscalesInterview

This project demonstrates a testing framework that integrates UI and API tests using Selenium, TestNG, REST Assured, and WebDriverManager.

## Project Structure

The repository is organized as follows:
IronscalesInterview/ ├── skeleton/ │ ├── src/ │ │ ├── main/ │ │ │ └── java/ │ │ │ └── com/ │ │ │ └── example/ │ │ │ └── ui/ │ │ │ └── TestBase.java │ │ └── test/ │ │ └── java/ │ │ └── com/ │ │ └── example/ │ │ ├── ui/ │ │ │ └── UITest.java │ │ └── api/ │ │ └── APITest.java │ ├── pom.xml │ └── testng.xml


- `src/main/java/com/example/ui/TestBase.java`: Contains the base setup and teardown methods for UI tests.
- `src/test/java/com/example/ui/UITest.java`: Houses the UI test cases.
- `src/test/java/com/example/api/APITest.java`: Contains the API test cases.
- `pom.xml`: Maven configuration file managing project dependencies and build configuration.
- `testng.xml`: TestNG configuration file defining test suites and execution settings.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6.0 or higher
- Google Chrome browser installed (for UI tests)

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/DimaEdunov/IronscalesInterview.git
   cd IronscalesInterview/skeleton


**The pom.xml file includes the following essential dependencies:**

Selenium Java (version 4.8.1): For browser automation in UI tests.
TestNG (version 7.8.0): Testing framework for organizing and running tests.
WebDriverManager (version 5.3.2): Automates the management of browser drivers.
REST Assured (version 5.3.0): Simplifies testing of REST APIs.
These dependencies are managed via Maven and are specified in the pom.xml file.



**Running Tests**
UI Tests: Ensure that the Google Chrome browser is installed. The UI tests will automatically download the appropriate ChromeDriver using WebDriverManager.

API Tests: These tests run independently and do not require a browser.
