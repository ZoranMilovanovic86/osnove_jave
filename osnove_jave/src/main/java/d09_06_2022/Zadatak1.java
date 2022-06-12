package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.manage().window().maximize();
        driver.navigate().to(url);

        List<WebElement> ratings = driver.findElements(By.xpath("//*[contains(@id, 'rating-star')]"));

        Scanner s = new Scanner(System.in);

        System.out.print("Rate how cool this program is? (1-5): ");
        int rate = s.nextInt();

        ratings.get(rate - 1).click();

        driver.quit();
    }
}
