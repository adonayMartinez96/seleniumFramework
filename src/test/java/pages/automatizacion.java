package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automatizacion {

    private WebDriver webDriver;

    @BeforeMethod
    public void setup() {
        // inicializa webdriver para chrome
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void iniSiman() {
        webDriver.get("https://sv.siman.com/");
    }

    @AfterMethod
    public void tearDown(){
        if(webDriver != null){
            webDriver.quit();
        }
    }

    

}
