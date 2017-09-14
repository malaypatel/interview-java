![Build Status](https://travis-ci.org/skatra/interview-java.svg?branch=master)
# Java Interview Shell
## Required Software
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [GIT](https://git-scm.com/downloads)

## Interview Prep
### Concepts to review before the interview
1. [Test Driven Development](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd)
2. [Pair Programming](https://www.thoughtworks.com/insights/blog/effective-navigation-in-pair-programming)
3. [Java 1.8](http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html)
4. [REST Web Services](https://www.thoughtworks.com/insights/blog/rest-api-design-resource-modeling)
5. [Object Oriented Design](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod)

## Setup

### If you are using [Eclipse] and have the GIT plugin for Eclipse installed with the Git Repositories view (http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/neonr) please follow these steps.

1. Run Eclipse, and go to the Git Repositories view
2. Select "Clone a Git Repository"
3. Select "Clone URI"
4. In the URI field enter "https://github.com/skatra/interview-java.git" and hit Finish
5. Select the Repo in your Git Repositories view and select "Import Projects"
6. Select the project for the Interview and click Finish
7. The project should now be imported into your Package Explorer view

### If you are using [Eclipse] and want to clone the project from the command line (http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/neonr) please follow these steps.

1. Install Java
2. Setup JAVA_HOME environment variable
3. Add JAVA_HOME to the PATH environment variable
4. Install GIT
5. Add GIT to the PATH environment variable
6. Clone the repository at https://github.com/skatra/interview-java
7. Change directories to the interview project you will work on. By default the Eclipse project files should be already created so you can now import the project into Eclipse.
If the project files for Eclipse need to be regenerated follow the next steps.
7. Setup files specific for eclipse
   
   <pre>
    <code>//Windows 
    gradlew.bat cleanEclipse eclipse
    //Linux
    ./gradlew cleanEclipse eclipse</code>
   </pre>
8. Compile Project and Execute Tests
   <pre>
    <code>//Windows
    gradlew.bat clean build
    //Linux
    ./gradlew clean build</code>
   </pre>
9. Validate gradle output message from build is:
   <pre>
   <code>
    BUILD SUCCESSFUL in 3s
    5 actionable tasks: 5 executed</code>
   </pre>
   
### If you are using [IntelliJ](https://www.jetbrains.com/idea/) please follow these steps.

1. Install Java
2. Setup JAVA_HOME environment variable
3. Add JAVA_HOME to the PATH environment variable
4. Install GIT
5. Add GIT to the PATH environment variable
6. Clone the repository at https://github.com/skatra/interview-java
7. Change directories to the interview project you will work on
8. Setup files specific for eclipse
   <pre>
    <code>//Windows
    gradlew.bat cleanIdea idea
    //Linux
    ./gradlew cleanIdea idea</code>
   </pre>
9. Compile Project and Execute Tests
   <pre>
    <code>//Windows
    gradlew.bat clean build
    //Linux
    ./gradlew clean build</code>
   </pre>
10. Validate gradle output message from build is:
   <pre>
   <code>
    BUILD SUCCESSFUL in 3s
    5 actionable tasks: 5 executed</code>
   </pre>
