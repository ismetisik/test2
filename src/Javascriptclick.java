import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptclick {

        //DOM document object module
        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            //  driver.get("http://www.facebook.com");
            driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ismetsean@gmail.com");
            driver.findElement(By.cssSelector("input[type='button']")).click();
            Thread.sleep(2000);
            String expectedValue = "Are you sure you want to give us the deed to your house?";
            if (expectedValue.contains(driver.switchTo().alert().getText())) {
                Thread.sleep(2000);
                driver.switchTo().alert().accept();
                Thread.sleep(2000);
                Thread.sleep(2000);
                Thread.sleep(2000);
            }
        }}
/*
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
    sean = new ChromeDriver();
    }


 */
