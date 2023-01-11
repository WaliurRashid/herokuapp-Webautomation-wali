import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Editor extends Base{


        @Test
        public void Editor() {
            String url = "https://the-internet.herokuapp.com/";
            driver.get(url);
            driver.findElement(By.cssSelector("body p")).getText();



        }
}
