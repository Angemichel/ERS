package com.ers.sel.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateNewRequest {
	public static WebDriver driver;
	@Given("User is on home page and get to Employee page")
	public void user_is_on_home_page_and_get_to_employee_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kouam\\OneDrive\\Desktop\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
		WebElement uname = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		uname.sendKeys("a");
		uname.sendKeys("b");
		WebElement empBtn = driver.findElement(By.id("employee"));
		empBtn.click();
		WebElement loginBtn = driver.findElement(By.id("submit"));
		loginBtn.click();
		System.out.println("::: Login");
	}

	@Given("User clicks on create new request button")
	public void user_clicks_on_create_new_request_button() {
		WebElement newReqst = driver.findElement(By.id("NewRequest"));
		newReqst.click();
		System.out.println("::: Go to New Request Page");
	}

	@Then("User creates sends request information")
	public void user_creates_sends_request_information() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful ...");
		driver.quit();
	}

}
