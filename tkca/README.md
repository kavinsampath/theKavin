# tkca Maven Webapp

This is a Maven-based Java web application project generated using the `maven-archetype-webapp` archetype.

## Project Structure
- `src/main/webapp/` - Web application resources (JSP, HTML, etc.)
  - `index.jsp` - Main JSP page
  - `WEB-INF/web.xml` - Web application deployment descriptor
- `src/main/resources/` - Application resources
- `src/main/java/` - Java source code (create this if you add servlets or other classes)
- `src/test/java/` - Test source code (for TestNG or other test frameworks)
- `src/test/resources/` - Test resources
  - `testng.xml` - TestNG configuration file
- `frontend/` - Static assets for the frontend (not part of the WAR build)
  - `index.html` - Standalone static HTML page
  - `css/` - CSS stylesheets
  - `js/` - JavaScript files
- `pom.xml` - Maven project configuration
- `target/` - Build output directory

## Build and Run
To build the project, run:

```
mvn clean package
```

The generated WAR file will be in the `target/` directory. Deploy it to a servlet container (e.g., Tomcat) to run the application.

## Testing
TestNG is supported. Place your test classes in `src/test/java` and configure your test suites in `src/test/resources/testng.xml`.

## Frontend Static Assets
The `frontend/` folder contains static HTML, CSS, and JS files for UI prototyping or static hosting. These are not included in the Maven WAR build by default.

## Requirements
- Java JDK 8 or higher
- Maven 3.x

## Customization
Edit `src/main/webapp/index.jsp`, `web.xml`, and other resources as needed for your application. For static assets, update files in `frontend/` as needed.
