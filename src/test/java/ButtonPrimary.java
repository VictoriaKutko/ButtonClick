import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ButtonPrimary {
    @Test
    public void buttonClick() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // open the site:
        driver.get("http://uitestingplayground.com/classattr");
        // find the primary button by xpath and click:
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        // Switch to Alert
        Alert alert = driver.switchTo().alert();
        // Accept alert
        alert.accept();

        /*
        variant with selenide failed - didn't manage to find how to switch to alert message and confirm it:

        // open the site:
        open("http://uitestingplayground.com/classattr");
        // find the primary button by xpath and click:
        $(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        // Switch to Alert and confirm:
        ???
        */
    }
}
