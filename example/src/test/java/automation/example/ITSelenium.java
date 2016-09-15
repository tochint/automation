package automation.example;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ITSelenium {

private WebDriver driver;
    
    @Before
    public void before() {
        driver = new FirefoxDriver();
    }
    
    @Test
    public void test() {
        driver.get("http://www.google.fi");
        Assert.assertTrue(true);
    }
    
    @After
    public void after() { 
        driver.close();
    }
  }

