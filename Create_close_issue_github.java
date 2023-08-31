package test.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Create_close_issue_github {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.get("https://github.com");
            driver.manage().window().maximize();
            WebElement signInLink = driver.findElement(By.linkText("Sign in"));
            signInLink.click();
            
            WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_field")));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement signInButton = driver.findElement(By.name("commit"));
            usernameField.sendKeys("testing@gmail.com");
            passwordField.sendKeys("password");
            signInButton.click();
            
            WebElement reps = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3']")));
            reps.click();
           WebElement newissue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3/issues']")));
            newissue.click();
            int n=2,t=5;
            for(int i=0;i<n;i++)
            {
            	 WebElement createissue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New issue']")));
                 createissue.click();
                 WebElement title=wait.until(ExpectedConditions.elementToBeClickable(By.id("issue_title")));
                 title.click();
                 title.sendKeys("Testing issue "+t);
                 t++;
                 WebElement submitissue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary btn ml-2']")));
                 submitissue.click();
                 
            }
            /* WebElement createissue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New issue']")));
            createissue.click();
            WebElement title=wait.until(ExpectedConditions.elementToBeClickable(By.id("issue_title")));
            title.click();
            title.sendKeys("Testing issue 2");
            WebElement submitissue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary btn ml-2']")));
            submitissue.click();
            WebElement createissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New issue']")));
            createissue2.click(); 
            WebElement title2=wait.until(ExpectedConditions.elementToBeClickable(By.id("issue_title")));
            title2.click();
            title2.sendKeys("Testing issue 3");
            WebElement submitissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary btn ml-2']")));
            submitissue2.click();
             WebElement newissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_2/issues/2']")));
            newissue2.click();
            WebElement closeissue1 = wait.until(ExpectedConditions.elementToBeClickable(By.className("js-form-action-text")));
            closeissue1.click();
            */
         
            
            WebElement openissue1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3/issues']")));
            openissue1.click();
            	WebElement newissue1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3/issues/1']")));
                newissue1.click();
                WebElement closeissue1 = wait.until(ExpectedConditions.elementToBeClickable(By.className("js-form-action-text")));
                closeissue1.click();
                WebElement openissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3/issues']")));
                openissue2.click();
                WebElement newissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/nivassekar/testing_3/issues/2']")));
                newissue2.click();
                WebElement closeissue2 = wait.until(ExpectedConditions.elementToBeClickable(By.className("js-form-action-text")));
                closeissue2.click();
                
           
            
            
    }
}

