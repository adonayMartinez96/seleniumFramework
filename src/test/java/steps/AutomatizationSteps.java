package steps;

import java.util.List;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PageCar;
import pages.PageResultFInd;
import pages.PaginaPrincipal;
import pages.PaymentPage;

public class AutomatizationSteps {
    PaginaPrincipal firtsPage = new PaginaPrincipal();
    PageResultFInd result = new PageResultFInd();
    PageCar car = new PageCar();
    PaymentPage paymentPage = new PaymentPage();
    
    @Given("Navegamos en la pagina principal, buscamos el producto y agregamos al carrito")
    public void navigate(){
        firtsPage.navigateToPagePrincipal();
    }

    @When("Revisamos la orden en el carrito")
    public void addProductCar(){
       car.seeCar();
    }

    @And("Realizamos el pago")
    public void payment(){
        car.payOrder();
    }   

    @Then("Validamos que el campo total este disponible")
    public void validateComboBox(){
        /*paymentPage.selectCountry();

        List<String> lista = paymentPage.returnPlanDropdownValues();
        for(String i: lista){
            System.out.println(i);
        }
        List<String> listaEsperada = Arrays.asList("Ahuachapán",
                "Cabañas", "Chalatenango","Cuscatlán","La Libertad","La Paz","La Unión","Morazán","San Miguel",
                "San Salvador","San Vicente","Santa Ana","Sonsonate","Usulután");
 
        Assert.assertEquals(listaEsperada, lista);*/
        WebElement total= paymentPage.findTotal();
        Assert.assertTrue(total.isDisplayed(), "El campo de texto no está disponible");
    }
    


  
}
