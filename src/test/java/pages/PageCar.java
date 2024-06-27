package pages;

import org.openqa.selenium.WebDriver;

public class PageCar extends BasePage{
    private String seeCar = "//a[@class='link-basic no-underline']";
    private String payOrder = "//a[normalize-space()='Procede a pagar']";

    public PageCar() {
        super(driver);
    }

    public void seeCar(){
        clickElement(seeCar);
    }

    public void payOrder(){
        clickElement(payOrder);
    }

}
