package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        driver.manage().window().maximize();
        driver.navigate().to(url);

        String name = "Zoran Mil";
        String department = "QA Engineer";
        String phone = "(063) 888-3321";

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//button[contains(@class, 'add-new')]")).click();
            driver.findElement(By.name("name")).sendKeys(name);
            driver.findElement(By.name("department")).sendKeys(department);
            driver.findElement(By.name("phone")).sendKeys(phone);
            driver.findElement(By.xpath("//tbody/tr[last()]/td[last()]/a[1]")).click();
            Thread.sleep(500);
        }

        driver.quit();

    }
}
