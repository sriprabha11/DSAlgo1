package  stepdefinitions;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclassess.Graphpg;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class graph {
	WebDriver driver = Hooks.driver;
	Graphpg graph;
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		graph = new Graphpg(driver);
		graph.clickhomeGetStarted();
	   
	}
	@When("The user gets the validdata from the datasheet with {string} and {string}")
	public void the_user_gets_the_validdata_from_the_datasheet_with_and(String testId, String sheetName) {
		graph.clicksignIn();
		graph.enterusername(testId, sheetName);
		graph.enterpassword(testId, sheetName);
		Graphpg.clicklogin();
	}

	@When("The user clicks Graph button in the home page")
	public void the_user_clicks_graph_button_in_the_home_page()  {
		graph.clickGraphpg();
	}

	@Then("The user should be directed to graph Page with {string}")
	public void the_user_should_be_directed_to_graph_page_with(String stackpageText) {
		Object graphText = null;
		graph.graphPage(graphText);
		assertEquals(graphText, "Graph");
	}

	@Given("The user is in the Graph page after logged in with input from data sheet under {string} and {string}")
	public void the_user_is_in_the_stack_page_after_logged_in_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		//System.out.println("------"+"user is in Graph page"+ "-------");
		graph = new Graphpg(driver);
		graph.clickhomeGetStarted();
		graph.clicksignIn();
		graph.enterusername(testId, sheetName);
		graph.enterpassword(testId, sheetName);
		graph.clicklogin();
		graph.clickGraphpg();
	   	}

	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
				graph.clickGraphpg();
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_operations_in_graph_page() {
		graph.clicktryhere();
	}

	@When("The User enters python code and run it in graph page")
	public void the_user_enters_pyton_code_and_run_it_in_graph() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		graph.clickenterText();
		graph.clickrun();
	   
	}

	@Then("The user should get print statement on graph page")
	public void the_user_should_get_print_statement__in_graph() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	   
	}

	@When("The user clicks graph representation button")
	public void the_user_clicks_implementation_button() {
				graph.clickgraphrepresentation();
	}

	@When("The user clicks Try Here button in graph representation page")
	public void the_user_clicks_try_here_button_in_graph_representation_page() {
		graph.clicktryhere();
	}

	@When("The User enters python code and run it in representation")
	public void the_user_enters_pyton_code_and_run_it_in_representation() {
		graph.clickenterText();
	     graph.clickrun();
	}

	@Then("The user should get print statement for Representation")
	public void the_user_should_get_print_statement_for_Representation() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	

}