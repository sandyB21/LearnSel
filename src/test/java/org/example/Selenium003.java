package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium003 {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start maximized");
        edgeOptions.addArguments("--incognito");  // This means running in a safe/private mode
        //edgeOptions.addArguments("--window-size = 800,600");
       // edgeOptions.setHeadless(true);

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
