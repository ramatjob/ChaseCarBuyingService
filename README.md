# ChaseCarBuyingService

### Assumptions or Prerequisistes for this Project ###

Please install chrome browser in your machine

Please install Java 8 SDK in your machine and set the class path

Please add cucumber for java plugin to your IDE (Intellij/Eclipse etc)

Please add testNG plugin to your IDE (Intellij/Eclipse etc)

### How to compile this project ###

Download the project into your local machine using the below command

```
git clone git@github.com:ramatjob/ChaseCarBuyingService.git
```

Now in the command prompt, navigate to the folder (In my case, it is C:\MyProjects\ChaseCarBuyingService), where you have cloned this project and run the below command
```
mvn clean compile
```

### How to run the test scripts ###

If you want to run the test scripts in WINDOWS machine, please run the below command in the command prompt
```
mvn verify -Dprofile=runChasePortalTests -DbrowserType=Chrome -DgridType=Local -DplatformType=WIN32 -DenvironmentType=qa
```

If you want to run the test scripts in MAC machine, please run the below command in the command prompt
```
mvn verify -Dprofile=runChasePortalTests -DbrowserType=Chrome -DgridType=Local -DplatformType=MAC -DenvironmentType=qa
```

### How to check the reports ###

Under the project base folder, you can find the `target` folder (In my case, it is `C:\MyProjects\ChaseCarBuyingService`). So under the `target` folder, please navigate to `/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html`

For example, in my local machine, `ChaseCarBuyingService` project is kept under `C:\MyProjects\ChaseCarBuyingService`. So the report will be available in the `C:\MyProjects\ChaseCarBuyingService\target\cucumber-reports\advanced-reports\cucumber-html-reports\overview-features.html`

So open the `overview-features.html` in any browser, it will show you the full test execution report


### Epic details ###

   ```
   Epic Desciption: 1. Check the controls in the Chase Car Buying Service home screen
   Feature file: Tested this epic in @TestCase1 in the NewCarSearch.feature file
   WAGA requirements: Perceivable,Operable,Understandable,Robust
   ```

   ```
   Epic Desciption: 2. Check the new car search functionality
   Feature file: Tested this epic in @TestCase1 in the NewCarSearch.feature file
   WAGA requirements: Perceivable,Operable,Understandable,Robust
   ```

   ```
   Epic Desciption: 3. Check the used car search functionality
   Feature file: Tested this epic in @TestCase2 in the UsedCarSearch.feature  file
   WAGA requirements: Perceivable,Operable,Understandable,Robust
   ```