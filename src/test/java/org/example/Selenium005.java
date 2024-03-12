package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium005 {

    @Test
        public void AutomateLogin() throws InterruptedException {
        WebDriverManager.edgedriver().setup();

        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">

        //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //								</button>

        //<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        //Flow to Automation
        // Navigate to the URL
        //Find the First element username and enter email Id
        //Find the Second Element password and enther the password
        //Find the Third Element button sign in and click/submit

        // create a session via API and session ID is generated
        EdgeDriver edgeDriver = new EdgeDriver();

        //launch the Browser with the URL mentioned
        edgeDriver.get("https://app.vwo.com/");
        edgeDriver.manage().window().maximize();

        WebElement username = edgeDriver.findElement(By.id("login-username"));
        username.sendKeys("sandeepkaur@gmail.com");

        WebElement password = edgeDriver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement submit_button = edgeDriver.findElement(By.id("js-login-btn"));
        submit_button.click();

        Thread.sleep(3000);

        WebElement message = edgeDriver.findElement(By.id("js-notification-box-msg"));
        System.out.println(message.getText());
        edgeDriver.quit();

        Assert.assertEquals(message.getText(),"Your email, password, IP address or location did not match");




    }
}
