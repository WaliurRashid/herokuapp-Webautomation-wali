import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hovers extends Base {

   @Test
    public void hovers(){
        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Hovers")).click();
       WebElement element= driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();


    }

}
