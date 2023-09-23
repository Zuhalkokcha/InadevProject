package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
  
public class InadevStepsDef {
	
	
	@Given("I am on http:\\/\\/localhost:{int}\\/ for the first time")
	public void i_am_on_http_localhost_for_the_first_time(Integer int1) throws InterruptedException {
		  // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
	    ChromeDriver driver = new ChromeDriver();
	    //webdriver.chrome.driver-->value of path
	    driver.get("http://localhost:3000");
	    Thread.sleep(5000);
	}

	@Then("I should see No ToDos")
	public void i_should_see_no_to_dos() throws InterruptedException {
		System.out.println("I should see No ToDos");
		  Thread.sleep(5000);


	}
	 


}

