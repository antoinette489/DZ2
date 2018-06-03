import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", Test1.class.getResource("chromedriver.exe").getPath());
        WebDriver driverChrome = new ChromeDriver();
        driverChrome.get("https://bing.com");
        Thread.sleep(1000);
        WebElement adminPanel = driverChrome.findElement(By.id("id_sc"));
        adminPanel.click();
        Thread.sleep(1000);
        List<WebElement> menuList = driverChrome.findElements(By.className("hb_titlerow"));
        menuList.get(0).click();
        Thread.sleep(1000);
        menuList.get(1).click();
        driverChrome.navigate().back();
        Thread.sleep(1000);

        WebElement adminPanel2 = driverChrome.findElement(By.id("id_sc"));
        adminPanel2.click();
        Thread.sleep(1000);
        List<WebElement> menuList1 = driverChrome.findElements(By.className("hb_titlerow"));
        menuList1.get(0).click();
        Thread.sleep(2000);
        menuList1.get(2).click();
        driverChrome.navigate().back();
        Thread.sleep(1000);

        WebElement adminPanel3 = driverChrome.findElement(By.id("id_sc"));
        adminPanel3.click();
        Thread.sleep(1000);
        List<WebElement> menuList2 = driverChrome.findElements(By.className("hb_titlerow"));
        menuList2.get(0).click();
        Thread.sleep(2000);
        menuList2.get(3).click();
        driverChrome.navigate().back();
        Thread.sleep(1000);

        WebElement adminPanel4 = driverChrome.findElement(By.id("id_sc"));
        adminPanel4.click();
        Thread.sleep(1000);
        List<WebElement> menuList3 = driverChrome.findElements(By.className("hb_titlerow"));
        menuList3.get(4).click();
        driverChrome.navigate().back();
        Thread.sleep(1000);

        WebElement adminPanel5 = driverChrome.findElement(By.id("id_sc"));
        adminPanel5.click();
        Thread.sleep(1000);
        List<WebElement> menuList4 = driverChrome.findElements(By.className("hb_titlerow"));
        menuList4.get(5).click();
        Thread.sleep(1000);
        WebElement cancelButton = driverChrome.findElement(By.id("fbpgdgcnclbt"));
        cancelButton.click();
        Thread.sleep(1000);

        WebElement adminPanel6 = driverChrome.findElement(By.id("id_sc"));
        adminPanel6.click();
        Thread.sleep(1000);
        List<WebElement> menuList5 = driverChrome.findElements(By.className("hb_titlerow"));
        menuList5.get(6).click();
        Thread.sleep(1000);
        driverChrome.navigate().back();
        Thread.sleep(1000);

        WebElement adminPanel7 = driverChrome.findElement(By.id("id_sc"));
        adminPanel7.click();
        Thread.sleep(1000);
        WebElement showMenuPanButton = driverChrome.findElement(By.id("hpqs_DisableNav_label"));
        showMenuPanButton.click();
        Thread.sleep(1000);
        WebElement showPageImageButton = driverChrome.findElement(By.id("hpqs_DisableIOTD_label"));
        showPageImageButton.click();
        Thread.sleep(1000);
        showMenuPanButton.click();
        Thread.sleep(1000);
        showPageImageButton.click();

    }
}
