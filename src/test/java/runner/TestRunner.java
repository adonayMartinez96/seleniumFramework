package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

import org.junit.AfterClass;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", //direcctorio donde estan nuestros archivos .feature
    glue = "steps",//paquete donde tenemos nuestras clases definiendo los steps escritos en el feature file,
    plugin = {"pretty","html:target/cucumber-report"})
public class TestRunner {

   /*  @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }*/ 
}
