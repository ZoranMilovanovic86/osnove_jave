package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://s.bootsnipp.com/iframe/Dq2X";

        driver.navigate().to(url);

        List<WebElement> closeButtons = driver.findElements(By.xpath("//div/button[@type='button']"));

        for (int i = closeButtons.size(); i > 0; i--) {
            if (elementExist(driver, By.xpath("//div[last()]/button[@type='button']"))) {
                driver.findElement(By.xpath("//div[last()]/button[@type='button']")).click();
                System.out.println("Element " + (i) + " je obrisan");
            } else {
                System.out.println("Element " + (i + 1) + " nije obrisan");
            }
        }

    }


    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}

