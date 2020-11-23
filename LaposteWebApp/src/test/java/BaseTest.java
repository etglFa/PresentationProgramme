import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	public static WebDriver driver;  
	public static String urlpropertiesFile = "C:\\Users\\fa_samba\\SeleniumPoste\\LaposteWebApp\\src\\ressources\\test.properties";
    
    @BeforeClass  
    public static void initialiseDriverAndProperties() {  
          loadTestProperties();  
          
          System.setProperty(System.getProperty("webdrivergecko"), System.getProperty("webdrivergeckoUrl"));
          driver = new FirefoxDriver();  
          driver.manage().window().maximize();  
     }  

    @AfterClass  
    public static void closeBrowser() {  
          driver.quit();  
    }  

    private static void loadTestProperties(){  
          Properties properties = System.getProperties();  
          try {  
                properties.load(new FileInputStream(new File(urlpropertiesFile)));  
          } catch(Exception ex) {  
                ex.printStackTrace();  
                System.exit(-1);  
          }  
    
  }
}
