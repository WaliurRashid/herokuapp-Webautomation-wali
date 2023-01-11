import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddRemoveElements extends Base {

    public void addRemoveElements(){
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("add_remove_elements")).click();
        driver.findElement(By.tagName("button")).click();



    }

}
