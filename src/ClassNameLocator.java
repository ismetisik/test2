import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class ClassNameLocator
{
    //DOM document object module
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.get("http://www.facebook.com");
        driver.get("http://echoecho.com/htmlforms10.htm");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    Thread.sleep(2000);
       //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ismetsean@gmail.com");
    driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
  //      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[value='Milk']")).click();
  //      driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("contains mai");
        int count=driver.findElements(By.cssSelector("input[type='radio']")).size();
        System.out.println("the number of radio button in froup1 is :"+ count);
        for(int i=0;i<=count;i++)
        {
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
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
}
