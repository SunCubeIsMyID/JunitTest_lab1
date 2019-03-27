package seleniumpacket;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenOneWeb {
    public String oneweb(WebDriver driver,String baseUrl, String id, String psd) {
    	driver.get(baseUrl + "/");	    
	    driver.findElement(By.name("id")).click();
	    driver.findElement(By.name("id")).clear();
	    driver.findElement(By.name("id")).sendKeys(id);
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(psd);
	    driver.findElement(By.id("btn_login")).click();
	    return driver.findElement(By.id("student-git")).getText();
    }
}
