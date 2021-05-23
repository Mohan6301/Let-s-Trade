package Pages; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
public class ordering {
    
	WebDriver driver;
By item1=By.id("add-to-cart-sauce-labs-backpack");
By item2=By.id("add-to-cart-sauce-labs-bike-light");
By opencart=By.xpath("//a[@class='shopping_cart_link']");
By checkout=By.id("checkout");
By firstname=By.id("first-name");
By lastname=By.id("last-name");
By Zipcode=By.id("postal-code");
By Continue=By.id("continue");
By finish=By.id("finish");

public ordering(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void Clickitem1()
{
    driver.findElement(item1).click();
}
public void Clickitem2()
{
    driver.findElement(item2).click();
}
public void Opencart()
{
    driver.findElement(opencart).click();
}
public void checkout()
{
    driver.findElement(checkout).click();
}
public void Fristname(String F)
{
    driver.findElement(firstname).sendKeys(F);
}
public void Lastname(String L)
{
	driver.findElement(lastname).sendKeys(L);
}
public void Zipcode(String Z)
{
	driver.findElement(Zipcode).sendKeys(Z);
}
public void continues()
{
	driver.findElement(Continue).click();
}
public void Bookorder()
{
    driver.findElement(finish).click();
}
  

public void Orderingitems(String F,String L,String Z)
{
   this.Clickitem1();
   this.Clickitem2();
   this.Opencart();
   this.checkout();
   this.Fristname(F);
   this.Lastname(L);
   this.Zipcode(Z);
   this.continues();
   this.Bookorder();
   
}


 

}