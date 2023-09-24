package stepdefinations;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
  
public class InadevStepsDef {
	ChromeDriver driver;

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
		WebElement dialog = driver.findElement(By.id("I should see No TODos "));
	     assertFalse(dialog.isDisplayed());
	     Thread.sleep(5000);
	}
	
	

	
	

@Given("I click on Add Task button")
public void i_click_on_add_task_button() throws InterruptedException {
	 driver.findElement(By.cssSelector("button.button_button--primary__09xDJ")).click();
	 Thread.sleep(5000);
}

@Then("I should see a dialog to add tasks")
public void i_should_see_a_dialog_to_add_tasks() throws InterruptedException {
   
	WebElement dialog = driver.findElement(By.id("I should see a dialog to add task"));
     assertTrue(dialog.isDisplayed());
     Thread.sleep(5000);
}
	
@Given("I am on a Add ToDo dialog box")
public void i_am_on_a_add_to_do_dialog_box() throws InterruptedException {

	driver.findElement(By.cssSelector("button.button_button--primary__09xDJ")).click();	
	Thread.sleep(5000);
}



@Given("I provide Title and Status")
public void i_provide_title_and_status() throws InterruptedException {
	driver.findElement(By.id("title")).sendKeys("Testing");
	  WebElement ddown = driver.findElement(By.id("type"));
	  Select select = new Select(ddown);
	  select.selectByValue("complete");
	  select.selectByVisibleText("Completed");
	  select.selectByIndex(1);
	  Thread.sleep(5000);
}
 

@Given("I click Add Task")
public void i_click_add_task() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/div/form/div/button[1]")).click();
	Thread.sleep(5000);
}

@Then("I should see that task on ToDo list home page")
public void i_should_see_that_task_on_to_do_list_home_page() throws InterruptedException {
	WebElement task = driver.findElement(By.id("I should see that task on ToDo list home page "));
	assertTrue(task.isDisplayed());
	Thread.sleep(5000);
}


@Given("I click on Pencil \\(Edit) icon")
public void i_click_on_pencil_edit_icon() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]")).click();
	Thread.sleep(5000);
}

@Then("I should see Update TODO dialog box")
public void i_should_see_update_todo_dialog_box() throws InterruptedException {
	WebElement dialog1 = driver.findElement(By.id("I should see update dialog to add task"));
    assertTrue(dialog1.isDisplayed());
    Thread.sleep(5000);
}
@Given("I am on a Update TODO dialog box")
public void i_am_on_a_update_todo_dialog_box() throws InterruptedException {
	WebElement dialogbox = driver.findElement(By.id("I should see update dialog to add task"));
    assertTrue(dialogbox.isDisplayed());
    Thread.sleep(5000);
}

@Given("I update the Title and Status")
public void i_update_the_title_and_status() throws InterruptedException {
	driver.findElement(By.id("title")).clear();
	 //add updated task to the box
	 driver.findElement(By.id("title")).sendKeys("deploying");
	 Thread.sleep(5000);
	
	
	 WebElement ddown1 = driver.findElement(By.id("type"));
	 Select select1 = new Select(ddown1);
	 select1.selectByValue("incomplete");
	 //select1.selectByVisibleText("incomplete");
	 //select1.selectByIndex(0);
	 Thread.sleep(5000);
}

@Given("I click Update Task")
public void i_click_update_task() throws InterruptedException {

	driver.findElement(By.cssSelector("#root > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div > form > div > button:nth-child(1)")).click();
	Thread.sleep(5000);
}


@Then("I should see the updated task on ToDo list home page")
public void i_should_see_the_updated_task_on_to_do_list_home_page() throws InterruptedException {
	WebElement dialog1 = null;
    assertTrue(dialog1.isDisplayed());
    Thread.sleep(5000);
  
}


@Given("I click on delete icon")
public void i_click_on_delete_icon() {
	driver.findElement(By.cssSelector("#root > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(1) > svg > path:nth-child(2)")).click();
	}


@Then("I should see the corresponding task getting deleted")
public void i_should_see_the_corresponding_task_getting_deleted() {
	WebElement dialog2 = null;
    assertTrue(dialog2.isDisplayed());
}
}





