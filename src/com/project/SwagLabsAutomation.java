package com.project;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabsAutomation {
	  public static void main(String[] args) throws InterruptedException {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Launch a website
	        driver.get("https://www.saucedemo.com/");
	        Thread.sleep(500);
	        
	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        WebElement username = driver.findElement(By.id("user-name"));
	        WebElement password = driver.findElement(By.id("password"));
	        WebElement loginbutton = driver.findElement(By.id("login-button"));
	        Thread.sleep(1000);
	        username.sendKeys("standard_user");
	        Thread.sleep(1000);
	        password.sendKeys("secret_sauce");
	        Thread.sleep(1000);
	        loginbutton.click();
	        
	        Thread.sleep(1000);
	        Actions actions = new Actions(driver);
	        Thread.sleep(1000);
	        actions.sendKeys(Keys.PAGE_DOWN).perform();
	        Thread.sleep(1000);
	        WebElement item1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
            new Actions(driver).moveToElement(item1);
            Thread.sleep(1000);
            WebElement Onesie = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
            Onesie.click();
            Thread.sleep(1000);
            actions.sendKeys(Keys.PAGE_UP).perform();
	        Thread.sleep(1000);


            WebElement backPack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            backPack.click();
            Thread.sleep(1000);
            
            WebElement cart = driver.findElement(By.className("shopping_cart_link"));
            cart.click();
            Thread.sleep(1000);
            //
            
            WebElement checkoutButton = driver.findElement(By.id("checkout"));
            checkoutButton.click();
            Thread.sleep(1000);
            
	        WebElement firstname = driver.findElement(By.id("first-name"));
	        WebElement lastname = driver.findElement(By.id("last-name"));
	        WebElement postalcode = driver.findElement(By.id("postal-code"));
	        
	        firstname.sendKeys("Reed");
	        Thread.sleep(1000);
	        lastname.sendKeys("Richards");
	        Thread.sleep(1000);
	        postalcode.sendKeys("N2J6R4");
	        Thread.sleep(1000);
	        
            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();
            Thread.sleep(1000);
            
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(1000);
            WebElement finishButton = driver.findElement(By.id("finish"));
            finishButton.click();
            Thread.sleep(1000);
            
            WebElement btpButton = driver.findElement(By.id("back-to-products"));
            btpButton.click();
            Thread.sleep(1000);
            
            WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
            menu.click();
            Thread.sleep(1000);
            
            WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
            logout.click();
            Thread.sleep(1000);
            
            System.out.println("End to End Testing Completed");
	        // Close the browser
	        driver.quit();
	        
	        
	  }

}
