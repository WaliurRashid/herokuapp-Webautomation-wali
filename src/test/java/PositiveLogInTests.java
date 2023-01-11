import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogInTests extends Base {
    @Test
    public void logInTest() throws InterruptedException {
        System.out.println("This is starting of the log in test");

        String url = "https://the-internet.herokuapp.com";
        driver.get(url);
        System.out.println("Main page is opened.");

        driver.findElement(By.linkText("Form Authentication")).click();

        System.out.println("click on the form authentication");

        Thread.sleep(1000);

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);
        driver.findElement(By.className("radius")).click();

        Thread.sleep(1000);

        //verify if we get the login page
        String expectedUrl =("https://the-internet.herokuapp.com/secure");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //is log out button displayed
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).isDisplayed(),("login button is not visible"));

        String expectedMassage = "You logged in a secure area!";
        String actualMassage = driver.findElement(By.id("flash")).getText();

        








    }
}
