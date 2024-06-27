package pages;

import org.openqa.selenium.WebDriver;

public class PageResultFInd extends BasePage{

    private String btnAddCar = "//button[@class='bt success w-full']";
    private String barSearch = "//input[@placeholder='Busca en nuestra tienda']";
    private String btnSearch = "//button[@class='bg-main text-white px-2 py-1 border-t-3 border-b-3 border-main rounded-r']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]";
    

    public PageResultFInd() {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    public void addProduct(){
        clickElement(btnAddCar);
    }

    
}
