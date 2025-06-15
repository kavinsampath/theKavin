<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->

This is a Maven webapp project. Follow standard Java and Maven best practices.

- The project contains a `frontend/` folder for static assets (HTML, CSS, JS) that is not included in the Maven WAR build. Treat this as a standalone static site for UI prototyping or static hosting.
- Use `src/main/webapp/` for deployable web resources (JSP, etc.) and `src/main/java/` for Java code.
- Use `src/test/java/` and `src/test/resources/` for TestNG and other test resources.
- Keep frontend and backend code separated and follow best practices for both Java and static web development.
