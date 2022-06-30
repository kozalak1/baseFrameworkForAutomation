import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SecondClass {

    // pom.xml'e 2 adet dependency (webdrivermanager ve selenium-java) eklendikten sonraki class (MAVEN CLASS)


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // ARTIK JAR DOSYALARINI ELLE MANUEL OLARAK KUTUPHANEYE EKLEMEYE GEREK YOK
        WebDriver driver = new ChromeDriver();
    // ustteki 2 satır kod ile gerekli ayarlamayı yapıyoruz

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// ornek test :

// 1- https://www.ebay.com/ sayfasina gidelim
    driver.get("https://www.ebay.com/");
//2- arama kutusunu locate edelim
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search for anything']"));
        //3- “Samsung headphones” ile arama yapalim
        searchBox.sendKeys("Samsung headphones" + Keys.ENTER);
        //WebElement searchButton = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
        //searchButton.submit();
        //4- Bulunan sonuc sayisini yazdiralim
        WebElement resultNumber = driver.findElement(By.xpath("//div/h1/span"));
        System.out.println(resultNumber.getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//h3[@class='s-item__title'])[2]")).click();
        //6- urun baslıgında samsung ya da headphones kelimelerinden en az birinin geçtiğini dogrulayın





    }

}
