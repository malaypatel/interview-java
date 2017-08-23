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
### If you are using [Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/neonr) please follow these steps.

1. Install Java
2. Setup JAVA_HOME environment variable
3. Add JAVA_HOME to the PATH environment variable
4. Install GIT
5. Add GIT to the PATH environment variable
6. Setup files specific for eclipse
   <pre>
    <code>gradlew.bat cleanEclipse eclipse</code>
   </pre>
7. Compile Project and Execute Tests
   <pre>
    <code>gradlew.bat clean build</code>
   </pre>
8. Validate gradle output message from build is:
   <pre>
   <code>
    C:\workspace\interview-java>gradlew.bat clean build
    
    BUILD SUCCESSFUL in 3s
    5 actionable tasks: 5 executed</code>
   </pre>
   
### If you are using [IntelliJ](https://www.jetbrains.com/idea/) please follow these steps.

1. Install Java
2. Setup JAVA_HOME environment variable
3. Add JAVA_HOME to the PATH environment variable
4. Install GIT
5. Add GIT to the PATH environment variable
6. Setup files specific for eclipse
   <pre>
    <code>gradlew.bat cleanIdea idea</code>
   </pre>
7. Compile Project and Execute Tests
   <pre>
    <code>gradlew.bat clean build</code>
   </pre>
8. Validate gradle output message from build is:
   <pre>
   <code>
    C:\workspace\interview-java>gradlew.bat clean build
    
    BUILD SUCCESSFUL in 3s
    5 actionable tasks: 5 executed</code>
   </pre>