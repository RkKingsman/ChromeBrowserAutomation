PROJECT SETUP:
1. Setting up POM.xml with proper dependencies required to run the test
2. Creating Cucumber feature file in gherkin language to show the steps involved in the test
3. Create StepDefinition package and add a LoginSteps class (empty)
4. Create Test Runner class to map the feature file , to gule the step definition package and also plugins to generate cucumber reports all these from Cucumber options.
5. Craate BasePage, Utility to have all the desired capabilities and commonly used methods
6. Create Hooks.class in stepDefinitions package to hook driver and desired capapbilities with loginSteps.Class and LoginPageObjects extending BasePage class.
7. From TestRunner Run as JUnit -> Whch generates snippets on console. Copy and paste on loginSteps class
8. For getting locators on Chrome browser app of android device, I used Desktop chrome browser Xpath by switching into Toggle device toolbar option on DOM page and selected a android device that is similar to my device.
9. Find the elements for all the steps to function.
10. Assigned variables and data on loginSteps page globally. Can also be given in Scenario outline as examples.
10. Fluent wait method is now moved to utility class. can be called wherever needed
11. Run the test from TestRunner class by Run as Test NG or JUnit or from Terminal cd /MobileAppAutomation> mvn clean install.

Note:
Latest Java version 22 was downgrated to JAVA 11 for stability. Preferences> java> Complier> java11
Dependencies versions was modified accordingly to solve Jsonconversion error and rotatable errors.


APPIUM SERVER:
Install appium server and keep it running on backround.

Note:
Appium Server URL : "http://127.0.0.1:4723/wd/hub"
for Remote Appium server: "http://127.0.0.1:4723/"


ANDROID STUDIO:
Install Android studio to create and launch mobile device emulator with preferred android version from Device Manager.

Note:
Deivce: Pixel 5
Platform: Android
Andorid version: VanillaIceCream


APPIUM INSPECTOR:
Install and set desired capabilities and start session to connect with the emulator device.
Mention the chrome driver path.
Use emulator to find all the locators and package name
Also we can directly take locators from desktop chrome browser using Toggle device toolbar from the DOM and select a similar device from the list

Note:
platformName: Android
deviceName: emulator-5554 or "realdevice name" - if real device is being tested
browserName: Chrome
automationName: UiAutomator2
chromedriverExecutable: C:\\Users\\rathnac\\Downloads\\chromedriver.exe