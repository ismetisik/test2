import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassNameLocator
{
    //DOM document object module
    static WebDriver sean;

    public static void main(String[] args) throws InterruptedException

    {
    invokeChromeBrowser();
    sean.get("https://www.turkishairlines.com");
    Thread.sleep(3000);
    sean.findElement(By.className("thyHeaderLing")).click();

    }

    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sean\\Downloads\\chromedriver_win32\\chromedriver.exe");
    sean = new ChromeDriver();

    }
}
