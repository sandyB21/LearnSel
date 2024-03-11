package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Selenium001 {
    public static void main(String[] args) {

        // to manage the driver automatically
        WebDriverManager.edgedriver().setup();

      //intialiiate the driver
       WebDriver driver = new EdgeDriver();
       driver.get("https://courses.thetestingacademy.com/");
       driver.quit();


    }
}
