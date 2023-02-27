package Test;

import Base.BaseClass;
import com.google.j2objc.annotations.Weak;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBrowserOpen {
    WebDriver driver;
    BaseClass b = new BaseClass();

    @BeforeTest
    public void Beforemethod() {
        driver = new ChromeDriver();
        driver.get(b.URL);
        driver.manage().window().maximize();
    }

    @Test
    public  void TestMethod() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(b.link_computer_xpath)).click();
        driver.findElement(By.xpath(b.link_notebooks_xpath)).click();
        driver.findElement(By.xpath(b.link_picture_xpath)).click();
        String Actual_title=driver.findElement(By.xpath(b.item_title_xpath)).getText();
        Assert.assertEquals(b.Expected_item_title,Actual_title);

        System.out.println("Test is Pass");
    }

    @Test
    public void TestMethod2()
    {
        System.out.println("Test2 is run");
    }
    @AfterTest
    public void Aftermethod()
    {
        driver.close();
        driver.quit();

    }

}
