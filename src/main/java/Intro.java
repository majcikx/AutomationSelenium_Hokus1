import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
    public static void main(String[] args){
        System.out.println("tests");
        System.setProperty("webdriver.chrome.driver","/Users/majcikx/Documents/Programming/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://xchat.cz");


    }
}
