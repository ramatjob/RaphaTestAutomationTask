# RaphaTestAutomationTask

### Assumptions or Prerequisistes for this Project ###

Please install chrome browser in your machine

Please install Java 8 SDK in your machine and set the class path

### How to compile this project ###

Open command prompt, Download the project into your local machine using the below command

```
git clone git@github.com:ramatjob/RaphaTestAutomationTask.git
```

Now in the command prompt, navigate to the folder (In my case, it is C:\MyProjects\RaphaTestAutomationTask), where you have cloned this project and run the below command
```
mvn clean compile
```

### How to run the test scripts ###

If you want to run the test scripts in WINDOWS machine, please run the below command in the command prompt
```
mvn verify -Dprofile=runRaphaPortalTests -DbrowserType=Chrome -DgridType=Local -DplatformType=WIN32 -DenvironmentType=qa
```

If you want to run the test scripts in MAC machine, please run the below command in the command prompt
```
mvn verify -Dprofile=runRaphaPortalTests -DbrowserType=Chrome -DgridType=Local -DplatformType=MAC -DenvironmentType=qa
```

### How to check the reports ###

Under the project base folder, you can find the `target` folder (In my case, it is `C:\MyProjects\RaphaTestAutomationTask`). So under the `target` folder, please navigate to `/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html`

For example, in my local machine, `RaphaTestAutomationTask` project is kept under `C:\MyProjects\RaphaTestAutomationTask`. So the report will be available in the `C:\MyProjects\RaphaTestAutomationTask\target\cucumber-reports\advanced-reports\cucumber-html-reports\overview-features.html`

So open the `overview-features.html` in any browser, it will show you the full test execution report


### Epic details ###

   ```
   Epic Desciption: In rapha portal, Test the signin functionality using registered user
   Feature file: Tested this epic in @TestCase1 in the RaphaTest.feature file
   ```

   ```
   Epic Desciption: In rapha portal, Test the payment method functionality, by accessing the portal as a Guest and add an item to basket and proceed through checkout
   Feature file: Tested this epic in @TestCase2 in the RaphaTest.feature file
   ```