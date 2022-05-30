import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration extends UserData {

    private By btnSignup = By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]");
    private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputUserName = By.xpath("//div[@class='form-group']//input[@id='user_username']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btnJoin = By.xpath("//div[@class='form-group']//a[@class='btn btn-default btn-block-level js-fake-join-form-submit-button']");


@Test

    public void registration(){

    WebDriver driver = new ChromeDriver();
    UserData getDate;
    getDate = new UserData();

    driver.findElement(btnSignup).click();
    driver.findElement(inputFirstName).sendKeys(getDate.firstName);
    driver.findElement(inputLastName).sendKeys(getDate.lastName);
    driver.findElement(inputEmail).sendKeys(getDate.email);
    driver.findElement(inputUserName).sendKeys(getDate.userName);
    driver.findElement(inputPassword).sendKeys(getDate.password);
    driver.findElement(btnJoin).click();
    driver.quit();

    }

}
