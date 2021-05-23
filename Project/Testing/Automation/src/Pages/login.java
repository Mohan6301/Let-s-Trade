package Pages; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
public class login {
    WebDriver driver;
By user=By.id("user-name");
By Pass=By.id("password");
By login=By.id("login-button");

public login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void setuser(String U)
{
    driver.findElement(user).sendKeys(U);
}
public void setpass(String P)
{
    driver.findElement(Pass).sendKeys(P);
}
public void logintodashboard()
{
    driver.findElement(login).click();
}

 

public void logintoDashboard(String U, String P)
{
    this.setuser(U);
    this.setpass(P);
    this.logintodashboard();
}


 

}