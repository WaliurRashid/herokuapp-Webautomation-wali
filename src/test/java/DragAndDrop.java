import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends Base{

    @Test
    public void dragAndDrop() throws InterruptedException {

        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Drag and Drop")).click();

        //WebElement on which drag and drop operation needs to be performed
        WebElement from = driver.findElement(By.id("column-a"));

        //WebElement to which the above object is dropped
        WebElement to = driver.findElement(By.id("column-b"));

        // //Using Action class for drag and drop.
        Actions act = new Actions(driver);

        //Performing the drag and drop action
        act.dragAndDrop(from,to).build().perform();

        Thread.sleep(5000);

        String expectedTest = "Drag and Drop";
        String actualTest = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        Assert.assertEquals(expectedTest,actualTest);
    }

}
