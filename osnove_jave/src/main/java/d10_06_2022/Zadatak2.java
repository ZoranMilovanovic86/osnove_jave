package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        Random random = new Random();

        String url = "https://geodata.solutions/";

        driver.navigate().to(url);

        Select country = new Select(driver.findElement(By.xpath("//*[contains(@id, 'countryId')]")));
        List<WebElement> countryOptions = country.getOptions();
        int countryNumber = random.nextInt((countryOptions.size()));
        country.selectByIndex(countryNumber);
        Thread.sleep(50);

        Select state = new Select(driver.findElement(By.xpath("//*[contains(@id, 'stateId')]")));
        List<WebElement> stateOptions = state.getOptions();
        int stateNumber = random.nextInt((stateOptions.size()));
        state.selectByIndex(stateNumber);
        Thread.sleep(50);


        Select city = new Select(driver.findElement(By.xpath("//*[contains(@id, 'cityId')]")));
        List<WebElement> cityOptions = city.getOptions();
        int cityNumber = random.nextInt((cityOptions.size()));
        city.selectByIndex(cityNumber);
        Thread.sleep(50);



    }
}