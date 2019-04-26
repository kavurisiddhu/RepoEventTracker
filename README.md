# RepoEventTracker
Application to track or view events in a repository in GitHub

Build the application:
1. To build the application, please use maven command below
		mvn clean install
	If building without test cases and wants to skip them
		mvn clean install  -Dmaven.test.skip=true

Once buuld successfully, depending on the server you are using please deploy repo-event-viewer-1.0-SNAPSHOT.war file.

IF you are using Jeety, 
Follow below configuration in Run Configuration in Eclipse.

	Project: RepoEventTracker
	WebApp Folder: target/repo-event-viewer-1.0-SNAPSHOT
	Context Path: /
	Port: 8080 (If this port is not available, feel free to change)