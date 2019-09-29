import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaSearch {

        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.expedia.com");
            WebDriverWait dr=new WebDriverWait(driver,20);
            Thread.sleep(2000);
          //  dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
            driver.manage().window().maximize();
           // Thread.sleep(2000);

            dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
            driver.findElement(By.id("tab-flight-tab-hp")).click();
         Thread.sleep(2000);

         dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tab-hotel-tab-hp"))));
            driver.findElement(By.id("tab-hotel-tab-hp")).click();
          //


         Thread.sleep(2000);
            dr.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"))));
            driver.findElement(By.id("tab-package-tab-hp")).click();


            Thread.sleep(2000);
            driver.findElement(By.id("tab-car-tab-hp")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("tab-cruise-tab-hp")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("tab-activity-tab-hp")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("tab-vacation-rental-tab-hp")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-flight")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-hotel")).click();
            dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hotel-destination-hlp"))));
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-package")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-car")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-cruise")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-activity")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-vacationRental")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-deals")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-rewards")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("primary-header-mobile")).click();
            Thread.sleep(2000);

        }
    }
/*
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
    sean = new ChromeDriver();
    }


 */



