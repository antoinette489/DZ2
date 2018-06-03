import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", Test1.class.getResource("chromedriver.exe").getPath());
        WebDriver driverChrome = new ChromeDriver();
        driverChrome.get("https://bing.com");
        WebElement signInButton = driverChrome.findElement(By.id("id_s"));
        Thread.sleep(1000);
        signInButton.click();
        Thread.sleep(1000);
        WebElement emailField = driverChrome.findElement(By.name("loginfmt"));
        emailField.sendKeys("annbubl@gmail.com");
        WebElement submitButton = driverChrome.findElement(By.id("idSIButton9"));
        submitButton.click();
        Thread.sleep(1000);
        WebElement passwButton = driverChrome.findElement(By.name("passwd"));
        passwButton.sendKeys("grass101");
        passwButton.submit();
        Thread.sleep(2000);
        WebElement accountButton = driverChrome.findElement(By.id("id_n"));
        accountButton.click();
        Thread.sleep(1000);
        WebElement exitButton = driverChrome.findElement(By.className("id_link_text"));
        exitButton.click();
    }
}
