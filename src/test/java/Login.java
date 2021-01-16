
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kohli
 */
public class Login {
    private static WebDriver driver;
    private String baseUrl = "https://www.cargurus.com/";
    
    @Given("^Carguru is Home Page$")
public void carguru_is_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
driver.manage().window().maximize();
}

@When("^title of Home Page is Carguru$")
public void title_of_Home_Page_is_Carguru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 driver.get("https://www.cargurus.com/");
}

@Then("^user clicks on My account dropdown$")
public void user_clicks_on_My_account_dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.id("account-menu-username")).click();
}

@Then("^user clicks on Sign in/Ragister button$")
public void user_clicks_on_Sign_in_Ragister_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("authLink")).click();
}

@Then("^user enters \"([^\"]*)\"$")
public void user_enters(String email) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.name("registerEmail")).sendKeys(email);
}

@Then("^user clicks on Next button and enters \"([^\"]*)\"$")
public void user_clicks_on_Next_button_and_enters(String Password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys(Password);  
}

@Then("^user clicks on Sign in button$")
public void user_clicks_on_Sign_in_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
}

@Then("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.get(baseUrl);
}

@Then("^user clicks on Car Values$")
public void user_clicks_on_Car_Values() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//a[contains(text(),'Car Values')]")).click();
}

@Then("^user selects make model year and trim$")
public void user_selects_make_model_year_and_trim() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   Thread.sleep(5000);
        WebElement e = driver.findElement(By.id("carPicker_makerSelect"));
        Select make = new Select(e);
        make.selectByVisibleText("Toyota");
        e = driver.findElement(By.id("carPicker_modelSelect"));
        Select model = new Select(e);
        model.selectByVisibleText("Camry");
        e = driver.findElement(By.id("carPicker_year1Select"));
        Select year = new Select(e);
        year.selectByVisibleText("2015");
        Thread.sleep(3000);
        e = driver.findElement(By.id("carPicker_trimSelect"));
        Thread.sleep(2000);
        Select trim = new Select(e);
        trim.selectByVisibleText("XLE");
}

@Then("^user clicks zip and enters \"([^\"]*)\"$")
public void user_clicks_zip_and_enters(String zip) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 driver.findElement(By.name("carDescription.postalCode")).sendKeys(zip);   
}

@Then("^user clicks mileage and enters mileage$")
public void user_clicks_mileage_and_enters_mileage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.id("mileage")).sendKeys("45000"); 
}

@Then("^user selects transmission and engine$")
public void user_selects_transmission_and_engine() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  WebElement e = driver.findElement(By.name("carDescription.transmission"));
        Select transmission = new Select(e);
        transmission.selectByVisibleText("6-Speed Automatic");
        e = driver.findElement(By.id("carDescription.engineId"));
        Thread.sleep(3000);
        Select engineId = new Select(e);
        engineId.selectByVisibleText("2.5L 178 hp I4");  
}

@Then("^user can see Market Value$")
public void user_can_see_Market_Value() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 Assert.assertEquals("What's My Car Worth? Calculate Your Cars Value on CarGurus", driver.getTitle());
        Thread.sleep(2000);
        driver.close();
}
@Then("^user close browser$")
public void user_close_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}
}
