import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadFile extends Base{

    @Test
    public void downloadFile() throws InterruptedException {

        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("File Download")).click();
        driver.findElement(By.linkText("Employee.xlsx")).click();

        Thread.sleep(10000);
    }
}
