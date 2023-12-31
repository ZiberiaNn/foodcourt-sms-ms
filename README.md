<br />
<div align="center">
<h3 align="center">FoodCourt SMS microservice</h3>
  <p align="center">
     SMS microservice for sending SMS to FoodCourt users phone with Twilio
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 11 [https://jdk.java.net/java-se-ri/11](https://jdk.java.net/java-se-ri/11)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation
1. Clone https://github.com/ZiberiaNn/foodcourt-users-ms repo, follow its instructions and run the microservice
2. Clone the repo
3. Change directory
   ```sh
   cd foodcourt-sms-ms
   ```
4. Edit src/main/resources/application.yml and change the Twilio credentials
   ```sh
   twilio:
     accountSid: <your account sid>
     authToken: <your auth token>
     trialNumber: <your trial number>
   ```

<!-- USAGE -->
## Usage

1. Right-click the class PowerUpApplication and choose Run
2. Open [http://localhost:8083/swagger-ui/index.html](http://localhost:8083/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests

- Right-click the test folder and choose Run tests with coverage


