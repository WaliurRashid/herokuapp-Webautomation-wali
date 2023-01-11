import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown extends Base{

    @Test
    public void dropDown() throws InterruptedException {
        String url ="https://the-internet.herokuapp.com/";

        driver.get(url);
        driver.findElement(By.linkText("Dropdown")).click();

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 2");
        Thread.sleep(5000);

        String expectedTest = "Dropdown List";
        String actualTest = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        Assert.assertEquals(expectedTest,actualTest);
    }
}
