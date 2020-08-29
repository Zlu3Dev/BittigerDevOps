import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest2 {
   @Test
    public void test2() throws MalformedURLException {
  // public static void main(String[] args) throws  MalformedURLException {

       //remote webDriver
       URL url = new URL("http://localhost:4444/wd/hub");
//        ChromeOptions options = new ChromeOptions();
       DesiredCapabilities capabilities = new DesiredCapabilities();
       //capabilities.setCapability("demo_capability", true);
       capabilities.setBrowserName(BrowserType.CHROME);

       RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

       driver.get("http://yahoo.com");
       System.out.println(driver.getTitle());
   }
}
