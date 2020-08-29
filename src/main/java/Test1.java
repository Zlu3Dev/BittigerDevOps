import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zhiyong Lu\\Desktop\\Paradyme\\ContainerDemo\\src\\main\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.amazon.com";
        driver.get(baseUrl);
        String title = "";
        String expectTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        title = driver.getTitle();
        System.out.println(title);

        if (expectTitle.contentEquals(title)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       WebElement customService = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
        
        customService.click();
        //driver.close();
    }
}
