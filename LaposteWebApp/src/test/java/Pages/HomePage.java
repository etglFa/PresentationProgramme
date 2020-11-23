package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
    
	//cookies web element localisation 
    By cookies = By.xpath("//*[@id='footer_tc_privacy_button']");
    //AccesRapide web element localisation
    By AccesRapide = By.xpath("//p[@class='header-title']");
    //monCompte web element localisation
    By monCompte = By.xpath("//i[@class='profile ripple-starter js-open']");

 
    // HomePage constructor 
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    //Set user name in textbox
    public void acceptCookies(){
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(cookies));
	     driver.findElement(cookies).click();
    }
    
    // aller à la rubrique acces rapide
    public void gotoAccesRapide(){
    	driver.findElement(AccesRapide).click();
    }
    
    // aller à la rubrique mon compte
    public void gotoMonCompte(){
    	 driver.findElement(monCompte).click();
    }
    
    //aller à la rubrique Le groupe
    public void gotoLeGroup(){
    	 driver.findElement(By.xpath("//p[@class='header-title js-open']")).click();
    }
}
