import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateEntry {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("package-departing-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-year='2019'][data-month='11'][data-day='29']")).click();
    }
}
/*
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
    sean = new ChromeDriver();
    }


 */

