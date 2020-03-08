# Project Title

selenium-pageobject-containerisation

## Getting Started

This selenium framework has been created to allow users to detach their testing from the local machine and move to a dockerized solution using Java/Selenium/PO/Docker/VNC.


### Prerequisites

* Intermediate knowledge of JAVA 
* JAVA compatible IDE
* Maven access - https://mvnrepository.com/artifact/org.seleniumhq.selenium
* VNC viewer installed (.DEB for Linux) - https://www.realvnc.com/en/connect/download/viewer/
* Docker installed locally - https://docs.docker.com/install/linux/docker-ce/ubuntu/
* Working internet


## Running the tests

To execute tests on the Docker Container the following commands need to be executed:

* docker run -d -p 4545:4444 --name selenium-hub selenium/hub (Starts selenium hub on localhost:4545)
* docker run -d -P --link  selenium-hub:hub selenium/node-chrome-debug (Starts Chrome node with port)
* Point non test browser at http://localhost:4545/
* In order to locate your port number to input into the VNC URL, simply run  docker ps. Default password for VNC viewer is "secret"


## Built With

* Language:JAVA (Page object model)
* [Maven](https://maven.apache.org/) - Dependency Management
* Selenium version:3.141.5
* Docker
* VNC viewer


## Authors

* **Steve Warburton** 
