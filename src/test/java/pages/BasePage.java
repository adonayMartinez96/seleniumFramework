package pages;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */
    static{
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    //metodo para navegar en la URL
    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    //buscamos un locator
    public WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    
    //escribimos en un selector
    public void write(String locator, String text){
        Find(locator).clear();
        Find(locator).sendKeys(text);
    }

    //click en un elemento
    public void clickElement(String locator){
        Find(locator).click();
        //Find(locator).sendKeys("hola munod")
        
    }
    
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByValue(value);
    }
 
    public void selectFromDropdownByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByIndex(index);
    }
 
    public int dropdownSize(String locator){
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
 
        return dropdownOptions.size();
    }

    public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();

         // Filtrar las opciones con valores entre 1167 y 1180
         for (WebElement option : dropdownOptions) {
            String value = option.getAttribute("value");
            try {
                int intValue = Integer.parseInt(value);
                if (intValue >= 1167 && intValue <= 1180) {
                    values.add(option.getText());
                }
            } catch (NumberFormatException e) {
                // Manejar el caso donde el valor no es un número, si es necesario
                System.out.println("fallo");
            }
        }
       
        return values;
    }
   
}
