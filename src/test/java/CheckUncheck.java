import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckUncheck extends Base {

    @Test
    public void checkedUnchecked() throws InterruptedException {

        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Checkboxes")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("checkboxes")).click();
        Thread.sleep(5000);
    }
}
