package selenium

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetup {
  val BASE_URL = "http://www.flipkart.com/"
  val INVALIDEMAIL ="vandana.yadav@knoldus.in"
  val INVALIDPASSWORD = "vandy"
  val EMAIl = ""
  val password = ""
  val firstelement = "google pixel"
  val secondelement = "apple iphone 7"
  val name ="vandana yadav"
  val pincode = "110019"
  val add = "knoldus llp noida"
  val phone = "9891272119"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
}
