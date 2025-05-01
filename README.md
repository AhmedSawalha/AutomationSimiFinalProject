"# AutomationSimiFinalProject" 
 # Selenium TestNG Automation Project

This project contains a suite of automated test cases for practicing automation techniques using Selenium WebDriver and TestNG. The test cases interact with elements on the [CodenBox Automation Lab Practice Page](https://codenboxautomationlab.com/practice/).

## 🛠 Prerequisites

- Java (JDK 8 or higher)
- Maven
- TestNG
- Chrome browser
- ChromeDriver (compatible with your browser version)

## 📦 Dependencies

Make sure your `pom.xml` includes the following:

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>
🚀 Running Tests
You can run tests using your IDE's TestNG runner or via Maven:


mvn test
Note: Only enabled test methods will be executed.

📂 Test Methods Overview
Priority	Method Name	Description
1	radioButton	Randomly selects a radio button from the list.
2	autoComplete	Inputs random country initials and selects from autocomplete suggestions.
3	selectTag	Selects a dropdown option by value.
4	checkBoxTest	Clicks a randomly chosen checkbox.
5	window__Example	Opens a new window, switches, interacts, then returns.
6	switch_Tab_Examble	Opens a new tab, switches, then returns.
7	AlertTest	Triggers an alert and handles it.
8	TableTest	Extracts and prints table data.
9	HideAndShow	Tests visibility toggling of a textbox.
10	EnableDisenable	Enables a disabled input field and types text.
11	MouseHover	Uses mouse hover to reveal and click hidden options.
12	Calander	Clicks Booking Calendar link and handles the new tab.
13	Iframe	Switches to iframe, interacts with it, and switches back.
14	DownloadApp	Clicks on a link to download APK files.

⚙️ Setup Method
@BeforeTest method initializes the Chrome browser and opens the practice page with default configurations.

💡 Notes
All test methods are disabled by default (enabled = false). Enable the ones you want to run.

The site used is a public automation practice page and is subject to availability.

Add appropriate exception handling or assertions as needed.