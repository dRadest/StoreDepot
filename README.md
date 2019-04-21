Simple Java RESTful webservice (JAX-RS) designed using [Jersey](https://jersey.github.io/) framework 
that keeps the data on articles available in the depot in a simple file. It exposes the data via 
HTTP methods. A small tester client is provided for testing.

## Getting Started
#### Eclipse
Clone this project to a desired location on your computer. </br>
`File > Import` under `General` select `Existing Projects into Workspace` and click `next` </br>
_Select root directory:_ navigate to where you cloned the project and click `finish`
#### Running a server
Download [Apache Tomcat](http://tomcat.apache.org/) 
and extract it to a desired directory (e.g. `C:\apache_tomcat`) </br>
To start the server, run `startup.bat` (Win) or `startup.sh` (Linux) from `\bin` directory</br>
To test if the server is running, go to `http://localhost:8080` in your web browser
#### Deploying the webservice
In project explorer in Eclipse, right-click on the project and go to `Export > Export...` </br>
Under `Web` select `WAR file` and save it under Tomcat's `\webapps` directory (e.g. `C:\apache_tomcat\webapps\`) </br>
Navigating to `http://localhost:8080/StoreDepot/rest/ArticleService/articles` should display an XML response
#### Running the client
Once the web service is deployed to the server and the server is up and running,</br>
client can be run by right clicking on `StoreClient.java` and selecting `Run As > Java Application`