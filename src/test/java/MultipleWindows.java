import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultipleWindows extends Base {

    @Test
    public void multipleWindows() throws InterruptedException {
        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.className("example")).click();


        Thread.sleep(10000);


    }
}
