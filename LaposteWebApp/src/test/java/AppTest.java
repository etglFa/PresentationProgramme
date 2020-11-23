
import org.testng.annotations.Test;
import CommonMethods.WebElementsClass;
import Pages.HomePage;

public class AppTest extends BaseTest{
  @Test
  public void navigate() {
	 
	  	// instanciation et création d'un objet de la classe HomePage
	    HomePage homePage = new HomePage(driver);
	    // instanciation et création d'un objet de la classe WebElementsClass
	    WebElementsClass webElemObject = new WebElementsClass(driver);
	    //aller à la page de l'app laposte.fr
	    webElemObject.gotoUrl(System.getProperty("url"));
	    //renvoyer le titre de la page d'accueil
	    webElemObject.returnTitle();
	    //accepter les cookies
	    homePage.acceptCookies();
	    // rafraichir la page
	    webElemObject.refresh();
	    homePage.gotoAccesRapide();
	    // rafraichir la page
	    webElemObject.refresh();
	    homePage.gotoMonCompte();
	    // rafraichir la page
	    webElemObject.refresh();
	    homePage.gotoLeGroup();
	    // rafraichir la page
	    webElemObject.refresh();
	    

  }
}
