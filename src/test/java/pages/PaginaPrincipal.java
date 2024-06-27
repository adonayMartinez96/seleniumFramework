package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;

public class PaginaPrincipal extends BasePage {
    String inputSearch = "//input[@placeholder='Busca en nuestra tienda']";
    String btnBuscar = "//button[@class='bg-main text-white px-2 py-1 border-t-3 border-b-3 border-main rounded-r']";
    private PageResultFInd result = new PageResultFInd();

    public PaginaPrincipal(){
        super(driver);
    }

    public void navigateToPagePrincipal(){
        navigateTo("https://www.omnisport.com/");
        findProduct();
    }

    public void findProduct(){
         List<String> products = productsList();
        for(String e: products){
            clickElement(inputSearch);
            write(inputSearch, e);//rellenar buscador
            clickElement(btnBuscar);//buscar producto
            result.addProduct();
        }       
    }

    public static List<String> productsList(){

        List<String> prods = new ArrayList<>();
        prods.add("Consola PS5 Digital Core - LATAM");
        prods.add("Telefono Galaxy A54 5G Negro");
        prods.add("Telefono G84 Negro Espacial | 256GB");
        prods.add("Aire Acondicionado Inverter VM121C6A | 12,000 BTU");
        return prods;
    }

    
    
}
