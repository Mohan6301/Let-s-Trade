package Pages; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
public class logout {
    WebDriver driver;
By menu=By.id("react-burger-menu-btn");
By logOut=By.id("logout_sidebar_link");


public logout(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void Menu()
{
    driver.findElement(menu).click();
}
public void Logout()
{
    driver.findElement(logOut).click();
}


 

public void LogOut()
{
   this.Menu();
   this.Logout();
}


 

}