package Week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Geetha");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Geetha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Srinivasan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8754837652");
		driver.findElement(By.xpath("//input[@data-type='password']']")).sendKeys("Srinivasan");
		WebElement eleDropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select daydrop = new Select(eleDropdown);
		daydrop.selectByValue("20");
	WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(monthDropdown);
		month.selectByVisibleText("Dec");
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(yearDropdown);
		year.selectByValue("1989");
driver.findElement(By.xpath("//label[conatins(text),'Female']")).click();
		
}

}