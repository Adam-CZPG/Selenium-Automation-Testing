import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authorization {
    WebDriver driver = new ChromeDriver();
    UserData getDate = new UserData();

    private By btnLogin = By.xpath("/html/body/div/div/header/nav/div[5]/a[1]");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btnJoin = By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");


    @Test
    public void Authorization(){

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement( btnJoin).click();

}

}