package CommonMethods;

import org.openqa.selenium.WebDriver;

public class WebElementsClass {
	
	WebDriver driver;
	
	//WebElementsClass constructor
	public WebElementsClass(WebDriver driver){
        this.driver = driver;
    }
	
	//retourner le titre de la page
	public String returnTitle (){
		return driver.getTitle();
	}
	
	//rafraichir le navigateur
	public void refresh (){
		driver.navigate().refresh();	
	}
	
	// Naviger dans un url
	public void gotoUrl (String url){
		driver.get((url));
	}
}
