import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class JavaScriptAlert extends Base{

    @Test
    public void javaScriptAlert(){
        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
       driver.switchTo().alert().accept();
       driver.findElement(By.id("result")).getText();
        System.out.println("output is " + driver.findElement(By.id("result")).getText());
        





    }

}
