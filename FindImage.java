import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindImage {

    WebDriver driver = new ChromeDriver();
    UserData getDate = new UserData();

    private By btnOpenWindow = By.xpath("//div[@class='TkpKu']//button[@type='button']");


    @Test
    public void findImage(){

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnOpenWindow).click();

    }



}
