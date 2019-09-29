import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);

        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
        Thread.sleep(2000);
        System.out.println("is selected"+driver.findElements(By.cssSelector("input#partialHotelBooking-hp-package")).isEmpty());
        Thread.sleep(2000);

        Thread.sleep(2000);


    }
}
