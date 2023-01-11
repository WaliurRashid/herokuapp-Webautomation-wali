import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadFile extends Base{

    @Test
    public void uploadFile() throws InterruptedException {
        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);

        //Navigate to Upload

        driver.findElement(By.linkText("File Upload")).click();

        //Created a WebElement to Upload desire file

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        //Used sendKeys to provide the path of the document
        chooseFile.sendKeys("/Users/Smrity/Documents/Employee.xlsx");


        //finally clicked Upload button to uplaod the file
        driver.findElement(By.id("file-submit")).click();



    }
}
