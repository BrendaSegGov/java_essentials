package mFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");
        
        WebElement singIn = driver.findElement(By.xpath("//div [@class= '_3cMNCrSVkxQhCkVs1JLIib navbar__user sc-kgoBCf iTQkiJ'] //div [contains(@class, 'ipc-button__text')]"));
        singIn.click();
        
        WebElement crearCuenta = driver.findElement(By.xpath("//*[@class= 'list-group']//a [@class= 'list-group-item create-account ']"));
        crearCuenta.click();
        
        WebElement campoNombre = driver.findElement(By.xpath("//input [contains (@type, \"text\")]"));
        campoNombre.sendKeys("James P Arthur");
        
        WebElement campoEmail = driver.findElement(By.xpath("//input [contains (@type, \"email\")]"));
        campoEmail.sendKeys("test2test.test@gmail.com");
        
        WebElement campoPassword = driver.findElement(By.xpath("//input [contains (@type, \"password\")]"));
        campoPassword.sendKeys("PasswordTest123");
		
        WebElement passCheck = driver.findElement(By.xpath("//input [contains (@name, \"passwordCheck\")]"));
        passCheck.sendKeys("PasswordTest123");
        
        WebElement botonCrear = driver.findElement(By.xpath("//input [contains (@id, \"continue\")]"));
        botonCrear.click();
        
        //te debe loguear, debe aparecer tu nombre en vez de la liga de sign in
        WebElement nombre = driver.findElement(By.xpath("//span[contains(@class, 'toggle__name')]"));
        if(nombre.isDisplayed() && "James P Arthur".contains(nombre.getText())) {
        	System.out.print("El usuario esta logueado");
        } else {
        	System.out.print("Error en la creacion del usuario");
        	driver.close();
        	System.exit(-1);
        }
        
      //input [contains (@name, "passwordCheck")]
        /*WebElement imagesLink = driver.findElements(By.linkText("Imágenes")).get(0);
		imagesLink.click();
        searchField.sendKeys("Harry Potter logo");
		searchField.sendKeys(Keys.ENTER);
        String expectedTitle = "Welcome: Mercury Tours"
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }*/
        
        driver.close();
    }
}

