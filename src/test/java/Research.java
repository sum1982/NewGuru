
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kohli
 */
public class Research {
    private static WebDriver driver;
    private String baseUrl="https://www.cargurus.com/";
    
    @Given("^user is on Cargurupage$")
public void user_is_on_Cargurupage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--headless");  
         driver = new ChromeDriver();
         driver.get(baseUrl);
         driver.manage().window().maximize();
}

@When("^user hover over Research button$")
public void user_hover_over_Research_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//*[contains(@title,'Research')]"));
}

@Then("^user clicks on Research button$")
public void user_clicks_on_Research_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    WebDriverWait wait=new WebDriverWait(driver, 20);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menuUserLink']/span")));
//Actions act=new Actions(driver);
//act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Research')]"))).click().build().perform();
//    driver.findElement(By.xpath("//a[contains(text(),'Research')]")).click();
new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/ul[1]/li[6]/a"))).click();
}

@Then("^user selects make model and year$")
public void user_selects_make_model_and_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   Thread.sleep(3000);
     WebElement e = driver.findElement(By.id("researchTabCarSelector_entitySelectingHelper_selectedEntity_makerSelect"));
        Select make = new Select(e);
        make.selectByVisibleText("Honda");
        e = driver.findElement(By.id("researchTabCarSelector_entitySelectingHelper_selectedEntity_modelSelect"));
        Select model = new Select(e);
        model.selectByVisibleText("Civic");
        e = driver.findElement(By.id("researchTabCarSelector_entitySelectingHelper_selectedEntity_year1Select"));
        Select year = new Select(e);
        year.selectByVisibleText("2017");
}

@Then("^user clicks search$")
public void user_clicks_search() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='content']/main[@id='contentBody']/div[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).click(); 
}

@Then("^user clicks zipcode and enters \"([^\"]*)\"$")
public void user_clicks_zipcode_and_enters(String zipcode) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(3000);
    WebElement e= driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='content']/main[@id='contentBody']/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]"));
    e.sendKeys(zipcode);
}

@Then("^user clicks Find Deals$")
public void user_clicks_Find_Deals() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='content']/main[@id='contentBody']/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/input[3]")).click();  
}

@Then("^user can see Research results$")
public void user_can_see_Research_results() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals("Used Honda Civic for Sale in Hanover Park, IL - CarGurus", driver.getTitle());
     Thread.sleep(2000);
     driver.close();
}

}
