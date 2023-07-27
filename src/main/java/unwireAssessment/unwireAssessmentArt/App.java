package unwireAssessment.unwireAssessmentArt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

 
public class App 
{
    public static void main( String[] args )  throws AWTException, InterruptedException, FindFailed
    {
    	System.setProperty("webdriver.chrome.driver","D://driver//chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
//		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		opt.setExperimentalOption("debuggerAddress", "localhost:9988");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://petstore.swagger.io/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[1]/button[1]/span[1]")).click();
		
		//petId 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[2]/div/div[1]/div[1]/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys("286");
		
		
		//additionalMetadata
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/input")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("Pet286");
		
		
		//Upload of pet photo Using Sikuli API


		Robot robo = new Robot();
		robo.mouseMove(300, 620);
		Thread.sleep(1000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		String Imagefilepath = "D:\\driver\\sikuli\\New folder\\";
		String inputfilepath = "D:\\driver\\sikuli\\New folder\\";
		
	    Screen s = new Screen();
	    
	    Pattern fileinputpath  = new Pattern(Imagefilepath+"fi.png");
	    Pattern openbutton  = new Pattern(Imagefilepath+"op.png");
	    
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
	    s.wait(fileinputpath,20);
	    s.type(fileinputpath,inputfilepath+"pet786.png");
	    s.click(openbutton);
	    
	    
		

		driver.findElement(By.xpath("//*[@id=\"operations-pet-uploadFile\"]/div[2]/div/div[2]/button")).click();

/*		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		
		driver.findElement(By.xpath("")).click();

    	*/
        
    }
}
