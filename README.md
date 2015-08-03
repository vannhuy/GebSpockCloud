[![Build Status](https://drone.io/github.com/geb/geb-example-gradle/status.png)](https://drone.io/github.com/geb/geb-example-gradle/latest)

# Description

This is an example of incorporating Geb into a Gradle build run on SauceLabs and BrowserStack. It shows the use of Spock tests.

The build is setup to work with Firefox, Safari, Chrome and Android browser. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

# Usage

The following commands will launch the tests with the individual browsers:
    
    ./gradlew firefoxlinux39Test
    ./gradlew safariMac8Test
    ./gradlew internetexplorer11Test
    ./gradlew nexus4Test
To run all SauceLabs test, use: ./gradlew allSauceLabsTests

    ./gradlew chromewindows7Test
    ./gradlew chromemacTest
To run all SauceLabs test, use: ./gradlew allBrowserStackTests

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

# Questions and issues

Please ask questions and raise issues on [Viblo](https://viblo.asia/datnt/posts/N0bDM6B6M2X4).