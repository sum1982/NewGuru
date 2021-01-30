
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
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
public class SellMyCar {
    private static WebDriver driver;
    private String baseUrl = "https://www.cargurus.com/";
    
    @Given("^user is on Carguru$")
public void user_is_on_Carguru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
}

@When("^title of Homepage is Carguru$")
public void title_of_Homepage_is_Carguru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
driver.get("https://www.cargurus.com/");
}

@Then("^user clicks on Sell My Car button$")
public void user_clicks_on_Sell_My_Car_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("//a[contains(text(),'Sell My Car')]")).click();
}

@Then("^user enters data \"([^\"]*)\"$")
public void user_enters_data(String zip) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("//body/main[@id='contentBody']/div[1]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).sendKeys(zip);
}

@Then("^user selects maker model year and trim$")
public void user_selects_maker_model_year_and_trim() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement e = driver.findElement(By.name("carpicker.make"));
        Select make = new Select(e);
        make.selectByVisibleText("Honda");
        e = driver.findElement(By.xpath("//body/main[@id='contentBody']/div[1]/section[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]"));
        Select model = new Select(e);
        model.selectByVisibleText("Civic");
        e = driver.findElement(By.xpath("//body/main[@id='contentBody']/div[1]/section[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]"));
        Select year = new Select(e);
        year.selectByVisibleText("2017");
        Thread.sleep(3000);
        e = driver.findElement(By.xpath("//body/main[@id='contentBody']/div[1]/section[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/select[1]"));
        Select trim = new Select(e);
        trim.selectByVisibleText("EX-L");
}

@Then("^user sees Results Page$")
public void user_sees_Results_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   assertEquals("Sell My Car Simply & Securely - CarGurus", driver.getTitle());
        driver.close();
}
}
