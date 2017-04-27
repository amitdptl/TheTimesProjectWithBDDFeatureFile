package com.thetimes;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by User on 27/04/2017.
 */
public class MyStepdefs {

       WebDriver driver;

      @Given("^user is on home page$")

    public void userIsOnHomePage()  {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.thetimes.co.uk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @When("^user click on subscribe services$")
    public void user_click_on_subscribe_services()  {

  driver.findElement(By.linkText("Subscribe")).click();
    }

    @When("^user select digital service fro (\\d+) week$")
    public void user_select_digital_service_fro_week(int arg1)  {
driver.findElement(By.linkText("View all Subscriptions")).click();
driver.findElement(By.linkText("Digital Packs")).click();
driver.findElement(By.xpath("(//a[contains(text(),'View full details')])[2]")).click();
    }

    @Then("^user should get digital servies subscription for (\\d+) weeks$")
    public void user_should_get_digital_servies_subscription_for_weeks(int arg1)  {
                Assert.assertEquals(driver.findElement(By.cssSelector("div.productName")).getText(),"The Digital Pack");

    }


}
