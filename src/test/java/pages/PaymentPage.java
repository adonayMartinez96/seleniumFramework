package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends BasePage{

    public PaymentPage() {
        super(driver);
    }

    String cbxCountry = "//select[@id='billing_country_id']";
    String cbxOption = "//option[@value='90' and text()='El Salvador']";
    String cbxCity = "//select[@id='billing_state_id']";

    String total = "//td[@colspan='4' and contains(text(), 'Total')]";



    public WebElement findTotal(){
        return Find(total);
    }
    
    public void selectCountry(){
        clickElement(cbxOption);
        //selectFromDropdownByValue(cbxCountry, "El Salvador");
    }

    public List<String> returnPlanDropdownValues() {
        return getDropdownValues(cbxCity);
    }   

    
}