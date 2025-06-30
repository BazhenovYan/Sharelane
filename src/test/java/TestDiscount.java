import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestDiscount {
    @Test
    public void checkDiscount0() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://sharelane.com/cgi-bin/register.py?page=2&zip_code=123456&first_name=test&last_name=test&email=123456%40mail.ru&password1=Db123456%21&password2=Db123456%21");
        String email = driver.findElement(By.xpath("//tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String passesMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(passesMessage, "0");
        String passMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[6]")).getText();
        softAssert.assertEquals(passMessage, "0");
        String pasMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[7]")).getText();
        softAssert.assertEquals(pasMessage, "190.00");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount3() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://sharelane.com/cgi-bin/register.py?page=2&zip_code=123456&first_name=test&last_name=test&email=123456%40mail.ru&password1=Db123456%21&password2=Db123456%21");
        String email = driver.findElement(By.xpath("//tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String passesMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(passesMessage, "3");
        String passMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[6]")).getText();
        softAssert.assertEquals(passMessage, "15.0");
        String pasMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[7]")).getText();
        softAssert.assertEquals(pasMessage, "485.00");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount5() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://sharelane.com/cgi-bin/register.py?page=2&zip_code=123456&first_name=test&last_name=test&email=123456%40mail.ru&password1=Db123456%21&password2=Db123456%21");
        String email = driver.findElement(By.xpath("//tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://sharelane.com/cgi-bin/add_to_cart.py?book_id=2");
        driver.get("https://sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String passesMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[5]/p/b")).getText();
        softAssert.assertEquals(passesMessage, "5");
        String passMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[6]")).getText();
        softAssert.assertEquals(passMessage, "250.0");
        String pasMessage = driver.findElement(By.xpath("//../tr[5]/../tr[2]/td[7]")).getText();
        softAssert.assertEquals(pasMessage, "4750.00");
        driver.quit();
        softAssert.assertAll();
    }
}
// https://sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name=Yan&last_name=Baz&email=yan%40yan.su&password1=1234567qwerty&password2=1234567qwerty
// /html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b
// /html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]
// https://www.sharelane.com/cgi-bin/main.py
// value=Login
