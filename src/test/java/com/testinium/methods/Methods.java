package com.testinium.methods;

import com.testinium.driver.BaseSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;


    public Methods() {

        driver = BaseSetup.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

    }
    public List<WebElement> findToAll(By by)  {

        return driver.findElements(by);

    }

    public void randomSelect(By by) {

        Random random = new Random();
        findToAll(by).get(random.nextInt(findToAll(by).size())).click();

    }


    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }


    public void click(By by) {

        findElement(by).click();

    }

    public void clear(By by) {

        findElement(by).clear();
    }


    public void waitBySeconds(long seconds) {

        try {

            Thread.sleep(1500);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public boolean isElementVisiable(By by) {


        try {

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;

        } catch (Exception e) {

            return false;

        }
    }

    public void sendKey(By by, String text) {

        findElement(by).sendKeys(text);

    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }

}
