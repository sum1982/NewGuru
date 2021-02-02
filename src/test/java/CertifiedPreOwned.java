
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
public class CertifiedPreOwned {
    private static WebDriver driver;
    private String baseUrl = "https://www.cargurus.com/";
    
    @Given("^user is already on Carguru$")
public void user_is_already_on_Carguru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();  
}

@When("^user mouses over certified pre owned$")
public void user_mouses_over_certified_pre_owned() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.xpath("//body/div[@id='main']/main[1]/div[3]/div[1]/section[1]/div[1]/div[1]/label[3]/span[1]"));
}

@Then("^user Clicks on Certified Pre-Owned$")
public void user_Clicks_on_Certified_Pre_Owned() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("//body/div[@id='main']/main[1]/div[3]/div[1]/section[1]/div[1]/div[1]/label[3]/span[1]")).click();
}

@Then("^user selects make and model$")
public void user_selects_make_and_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     WebElement e = driver.findElement(By.id("carPickerCpo_makerSelect"));
        e.click();
        Select maker = new Select(e);
        maker.selectByVisibleText("Acura");
        e = driver.findElement(By.id("carPickerCpo_modelSelect"));
        e.click();
        Select model = new Select(e);
        model.selectByVisibleText("MDX");
        e.click();
}

@Then("^user clicks and enters \"([^\"]*)\"$")
public void user_clicks_and_enters(String zip) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     WebElement e = driver.findElement(By.id("dealFinderZipCPOId"));
        e.click();
        e.sendKeys(zip);
}

@Then("^user clicks on Search$")
public void user_clicks_on_Search() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("dealFinderFormCPO_0")).click();
}

@Then("^user can see Certified Pre-Owned cars$")
public void user_can_see_Certified_Pre_Owned_cars() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals("Certified Acura MDX For Sale Hanover Park, IL - CarGurus", driver.getTitle());
        driver.close();
}
}
