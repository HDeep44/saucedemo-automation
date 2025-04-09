# saucedemo-automation
This is a automation code for website Saucedemo - Swag Labs webpage


---

## Tech Stack Requirements
- Java
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Chrome (tested with v134+)

---

## Step 1 - Import Project from Git

Clone or download the project from Git using Git commands:

```bash
git clone <GitURL>
```

---

## Step 2 - Importing Project into Your IDE

1. Open IntelliJ IDEA or Eclipse
2. Select **"Import Project"**
3. Choose **"Existing Maven Project"**
4. Click **Next**
5. In the root directory, click **Browse** and select the project folder you cloned
6. Click **Finish**
7. Wait until the Maven dependencies finish loading

---

## Step 3 - Build and Install the Project

1. Right-click the project → **Run As → Maven Clean**  
   Wait for build to complete. You should see **"BUILD SUCCESS"**

2. Then, right-click again → **Run As → Maven Install**  
   This compiles and runs the tests. You should see the test cases executing in Chrome.

---

## Step 4 - View Test Reports (HTML)

After execution:

Navigate to:  
```
target/cucumber-reports.html
```

Double-click the file or open it in your browser to view the test results.

---

## Running Individual Test Scenarios Using @Tags

### Step 1:
Go to:  
```
src/test/java/runners/TestRunner.java
```

### Step 2:
Find this section in the code:
```java
tags = "@Regression"
```
Replace `"@Regression"` with any tag you want to execute (like `@Smoke`, `@Login`, etc.)

---

## How to Find Tags in Feature Files

### Step 1:
Go to:  
```
src/test/resources/features/
```

### Step 2:
Open any `.feature` file. At the top of each scenario, look for a line like:
```gherkin
@Login
Scenario: Valid login functionality
```

### Step 3:
Copy the tag (e.g., `@Login`) and paste it into the `tags` value inside `TestRunner.java`.

---

## Executing Tests Using TestRunner.java

After setting the tag in `TestRunner.java`:

1. Right-click the `TestRunner.java` file
2. Select **Run As → JUnit Test**
3. Chrome will launch and execute the test

To verify the results:
- Open the report at `target/cucumber-reports.html`

---

## Summary of Test Execution Options

| Task                                | How to Run |
|-------------------------------------|------------|
| Run All Tests                       | Right-click Project → Run As → Maven Test |
| Run Smoke Tests                     | Set `@Smoke` tag in TestRunner → Run as JUnit |
| Run Regression Tests                | Set `@Regression` tag in TestRunner → Run as JUnit |
| Run Login Feature Only              | Set `@Login` tag in TestRunner → Run as JUnit |
| Run AddToCartCheckout Feature Only  | Set `@AddToCartCheckout` tag in TestRunner → Run as JUnit |

---














