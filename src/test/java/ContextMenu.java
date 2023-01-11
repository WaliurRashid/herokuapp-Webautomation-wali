import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContextMenu extends Base{

    @Test
    public void contextMenu() throws InterruptedException {

        String url  = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Context Menu")).click();
        driver.findElement(By.id("hot-spot")).click();

        Thread.sleep(10000);
    }
}
