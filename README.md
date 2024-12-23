# Automation Web Testing Project

This project demonstrates web automation testing using Java, Selenium, TestNG, Cucumber, and Extent Report. Follow the instructions below to set up and run your tests.

## Prerequisites

Ensure that you have the following installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 17
- [Apache Maven](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) 

## Project Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/koswara-dev/selenium-automation-testing.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd selenium-automation-testing
   ```

3. **Open the project in IntelliJ IDEA:**
   - Open IntelliJ IDEA.
   - Go to `File -> Open`.
   - Browse to the directory where the project is cloned and click `OK`.

4. **Build the project using Maven:**
   - Open the Terminal window in IntelliJ IDEA.
   - Run the following command:
     ```bash
     mvn clean install
     ```

## Running Tests

You can run the tests in various ways:

### Using Maven

To execute all tests, run:
```bash
mvn test
```

### Using TestNG XML file

Run tests specified in the `testng.xml` file:
1. Locate the `testng.xml` file in the Project pane.
2. Right-click on the `testng.xml` file.
3. Select `Run 'testng.xml'`.

### Using Cucumber Feature files

Each feature file contains scenarios written in Gherkin language. To run a specific feature file:
1. Locate the feature file in the Project pane.
2. Right-click on the feature file.
3. Select `Run 'Feature: <feature-file-name>'`.

## Generating Reports

The project uses ExtentReports for generating detailed reports.

1. After running the tests, the report will be generated in the `/test-output` directory.
2. Open the `ExtentReport.html` file in a browser to view the test execution report.

## Project Structure

- **src/main/java**: Contains application code (if any).
- **src/test/java**: Contains test classes and step definitions.
- **src/test/resources**: Contains feature files and configuration files.
- **test-output**: Contains the test results and reports.

## Customizing the Project

- **Updating Dependencies**: Modify the `pom.xml` to add or update dependencies as needed.
- **Configuring TestNG**: Edit the `testng.xml` file to include/exclude test classes or methods.
- **Modifying Cucumber Options**: Update `CucumberRunner` class with desired tags and features.

## Troubleshooting

If you encounter issues:

- Ensure all dependencies are correctly added in the `pom.xml`.
- Verify the correct Java version is being used.
- Check if WebDriver binaries (e.g., ChromeDriver) are properly configured in system PATH.

## Contribution

Feel free to contribute to the project by forking the repository and creating pull requests. For any queries, contact [koswara.dev92@gmail.com].

Happy Testing!

## Buy me a coffe

If you like this project and want to support its further development, buy me a coffee!

[![Buy Me a Coffee](https://www.buymeacoffee.com/assets/img/guidelines/download-assets-sm-1.svg)](https://www.buymeacoffee.com/kudajengke404)
