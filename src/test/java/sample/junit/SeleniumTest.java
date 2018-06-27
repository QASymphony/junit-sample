package sample.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    WebDriver driver = new ChromeDriver();

    @After
    public void afterEachTest() {
    	driver.close();
    	driver.quit();
    }

    @Test
    public void googleTitleTest() {
        driver.navigate().to("https://www.google.com/");


        Assert.assertEquals("Title check failed!", "Google", driver.getTitle());

    }

    @Test
    public void amazonTitleTest() {
    	driver.navigate().to("https://www.amazon.com");

    	Assert.assertEquals("Title check failed!", "Amazon", driver.getTitle());

    }

    @Test
    public void youtubeTitleTest() {
    	driver.navigate().to("https://www.youtube.com");

    	Assert.assertEquals("Title check failed!", "YouTube", driver.getTitle());
    }

}