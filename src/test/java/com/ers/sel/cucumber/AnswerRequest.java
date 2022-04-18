package com.ers.sel.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnswerRequest {
	public static WebDriver driver;
	@When("User selects Manager button")
	public void user_selects_manager_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kouam\\OneDrive\\Desktop\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//throw new io.cucumber.java.PendingException();
		driver.get("http://localhost:8080/");
		System.out.println("User is on Home page");
	}

	@Then("Manager page is displayed")
	public void manager_page_is_displayed() {
		WebElement uname = driver.findElement(By.id("username"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		uname.sendKeys("Steve Nash");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sn");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		System.out.println("::: Login");
	}

	@Given("Manager selects view update status")
	public void manager_selects_view_update_status() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		WebElement manBtn = driver.findElement(By.id("manager"));
		manBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		WebElement loginBtn = driver.findElement(By.id("submit"));
		loginBtn.click();
		WebElement status = driver.findElement(By.id("updateStatus"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		status.click();
		System.out.println("::: Update status page");
	}

	@When("Manager enters {string} {string} and {string}")
	public void manager_enters_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ERname = driver.findElement(By.id("ERname"));
		WebElement ERreason = driver.findElement(By.id("ERreason"));
		WebElement ERstatus = driver.findElement(By.id("ERstatus"));
		ERname.sendKeys("Michel");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		ERreason.sendKeys("Health");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		ERstatus.sendKeys("Approved");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		WebElement subBtn = driver.findElement(By.id("requestSub"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200000));
		subBtn.click();
		System.out.println("::: Information Sent");
	}

	@Then("Manager submits answers")
	public void manager_submits_answers() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("::: Answer submitted");
	}

}
