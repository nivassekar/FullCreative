package test.auto;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Create_Repository {
	

	public static void main(String[] args)
	{
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\SLP08932\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(); //initialize web driver
		driver.get("https://github.com"); //load the url
		driver.manage().window().maximize(); //maximise window
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();//click the sign
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));  //wait declaration
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_field")));//login click
        WebElement passwordField = driver.findElement(By.id("password"));//password
        WebElement signInButton = driver.findElement(By.name("commit"));//click login to github
        usernameField.sendKeys("testing@gmail.com");//passing email
        passwordField.sendKeys("password");//passing pwd
        signInButton.click();//click signing
        WebElement newRepoLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New")));//click new repository
        newRepoLink.click();
        WebElement repoNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Repository']")));//repo name field
        repoNameField.click();
        repoNameField.sendKeys("testing_4");
  
        WebElement element = driver.findElement(By.xpath("//span[text()='Create repository']"));//click create repository
//        System.out.println(element.getLocation());
//        System.out.println(element.getText());
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        try
        {
        	Thread.sleep(5000);
        }
        	catch(InterruptedException e){
        		e.printStackTrace();
        		
        	}
        element.click();
        WebElement reps = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3']")));
        reps.click();
        WebElement newissue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/nivassekar/testing_3/issues']")));
        newissue.click();
        
}}