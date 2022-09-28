package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ilkclass {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com.tr");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("ceket");

        aramaKutusu.submit();

        driver.findElement(By.xpath("//a[@aria-label='Sonraki sayfaya git, sayfa 2']")).click();

        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//img[@alt='YoungSoul Erkek Kız Su Geçirmez Ceketler Çocuklar Hafif Polar Astarlı Çıkarılabilir Kapüşonlu Yağmurluk']")).click();

        driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']")).click();
        driver.findElement(By.xpath("//option[@data-a-html-content='9-10 Yıl']")).click();
        driver.findElement(By.xpath("//input[@title='Alışveriş Sepetine Ekle']")).click();
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        WebElement mail=driver.findElement(By.id("ap_email"));
        mail.sendKeys("batuuuuu1905@gmail.com");
mail.submit();
        WebElement sifre=driver.findElement(By.id("ap_password"));
        sifre.sendKeys("batu1905");
        sifre.submit();

        driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo clickable-heading']")).click();

        driver.findElement(By.id("a-autoid-1")).click();

        driver.findElement(By.xpath("//input[@aria-label='Sil YoungSoul Erkek Kız Su Ge&ccedil;irmez Ceketler &Ccedil;ocuklar Hafif Polar Astarlı &Ccedil;ıkarılabilir Kap&uuml;şonlu Yağmurluk, siyah kırmızı, 9-10 Years']")).click();



    }




}