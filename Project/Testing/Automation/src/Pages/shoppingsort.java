package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingsort {
    WebDriver driver;
By sort=By.xpath("//span[@class='select_container']");
By linktext=By.xpath("//option[contains(text(),'Price (low to high)')]");
By addTocart=By.id("add-to-cart-sauce-labs-onesie");
By openCart=By.xpath("//a[@class='shopping_cart_link']");
By remove=By.id("remove-sauce-labs-onesie");

public shoppingsort(WebDriver driver)
{
    this.driver=driver;
}
public void setsorting()
{
    driver.findElement(sort).click();
    
}
public void setLinktext()
{
    driver.findElement(linktext).click();
}
public void setAdd()
{
    driver.findElement(addTocart).click();
}
public void setcart()
{
    driver.findElement(openCart).click();
}
public void removefromCart()
{
    driver.findElement(remove).click();
}

public void shoppingsorting()
{
    this.setsorting();
    this.setLinktext(); 
    this.setAdd();
    this.setcart();
    this.removefromCart();
}
}
