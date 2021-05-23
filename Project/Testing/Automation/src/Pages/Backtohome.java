package Pages; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
public class Backtohome {
    WebDriver driver;
By Allitems=By.id("inventory_sidebar_link");


public Backtohome(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void All()
{
    driver.findElement(Allitems).click();;
}


 

public void backtoHome()
{
    this.All();
}
}