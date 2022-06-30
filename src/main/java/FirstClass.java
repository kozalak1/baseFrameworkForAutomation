import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
       // dependency leri ekledikten sonra artık bu ayarlamayı setup ile yapıyoruz

       WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.ebay.com/");
    }
}
