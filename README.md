# Java-Selenium-Framework
Java-Selenium-Framework

This is a sample Test Framework which is designed to test the Web-based (SaaS) application using below technology stack.
- I've designed Selenium WebDriver Data-Driven framework using TestNG library, Maven Build tool and for reporting purpose we're using both TestNG reports and Extent reports.

- Selenium WebDriver: It's used for automating the web based application.
- Maven Build tool: It's used for downloading and managing the third party dependencies which are required by your project (Ex: Selenium, TestNG, Log4j2,Extent report).
- TestNG: Since Selenium webdriver allows only in automation of the application under test, It does not generate any report and does not have the capability to categorise the tests. so for that we are using TestNG library. It allows us to write test in efficient manner.
- POM: We are using POM pattern(Page object model) for writing the re-usable code for efficiency.
- Extent Report: Selenium does not support Test report, so for reporting purpose we can either use TestNG report or extent report. Extent report is widely as compared to TestNG report as it provides options to attach various log levels and screenshot information etc. 
