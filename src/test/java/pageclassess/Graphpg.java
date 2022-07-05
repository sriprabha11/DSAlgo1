package pageclassess;



	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import stepdefinitions.Excelsheet;
import stepdefinitions.Hooks;
    import stepdefinitions.signin;

import org.openqa.selenium.support.FindBy;
	
	public class Graphpg {


		private static final WebElement LoggedIn = null;
		@FindBy (xpath="//a[@href='graph']") WebElement graphGS;
		@FindBy (xpath="//a[@href='graph/graph']") WebElement graph;
		@FindBy (xpath="//a[@class='btn-info']") WebElement tryEditor;
		@FindBy (xpath="//pre[@class='CodeMirror-line']") WebElement enterText1;
	    @FindBy (xpath="//*[contains(text(),'Run']") WebElement run1;
	    @FindBy (xpath="//a[@href='graph-representations']") WebElement representation;
		@FindBy (xpath="//a[@class='btn-info']") WebElement tryhere2;
		@FindBy (xpath="//pre[@class='CodeMirror-line']") WebElement enterText2;
		@FindBy (xpath="//*[contains(text(),'Run']") WebElement run2;
		private WebDriver driver;
		private WebElement graphpage;

		public Graphpg(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

		public void clickhomeGetStarted() {
			WebElement homeGetStarted = null;
			// driver.findElement(By.xpath("//button[@class='btn']")).click();
			homeGetStarted.click();
		}

		public void clicksignIn() {
			signin.click();

		}

		public void enterusername(String testId, String sheetName) {
			Excelsheet signinexcel = new Excelsheet(testId, sheetName);
			WebElement username = null;
			username.sendKeys(signinexcel.readusername());		
			
		}

		public void enterpassword(String testId, String sheetName) {
			Excelsheet signinexcel = new Excelsheet(testId, sheetName);
			WebElement password = null;
			password.sendKeys(signinexcel.readpassword());

		}

		public static void clicklogin() {
			WebElement login = null;
			login.click();

		}

		public String loggedIn(String output) {

			String loggedInPage = LoggedIn.getText();
			// assertEquals(loggedInPage, "You are logged in");
			return loggedInPage;

		}

		public void clickDataStructureDD() {
			WebElement dataStructureDD = null;
			dataStructureDD.click();
		}

		public void clickGraphpg() {
			Graphpg.clicklogin();

		}

		public String graphPage(Object graphText) {
			String redirectgraphpage = graphpage.getText();
			return redirectgraphpage;

		}

		public void clickgraphrepresentation() {
			//WebElement representation = null;
			representation.click();
		}

		public String gorepresentationpage() {
			WebElement representationPage = null;
			String gorepresentationPage = representationPage.getText();
			// assertEquals(redrictoperationPage, "Operations in Stack");
			return gorepresentationPage;

		}

		public void clickpracticeQuest() {
			WebElement pracQuest = null;
			pracQuest.click();
		}

		public String practiceQuestPage() {
			WebElement practiceQuestPage = null;
			String redirectpracticeQuestPage = practiceQuestPage.getText();
			// assertEquals(redirectpracticeQuestPage , "Search the array");
			return redirectpracticeQuestPage;
		}

		public void clicktryhere() {
			WebElement tryhere = null;
			tryhere.click();
		}

		public String run() {
			WebElement run=null;
			String tryEditorPage = run.getText();
			// assertEquals(tryEditorPage , "Run");
			return tryEditorPage;
		}

		public void clickenterText() {
			WebElement enterText = null;
			enterText.sendKeys("print('hello world')");
		}

		public void clickrun() {
			WebElement run = null;
			run.click();
		}

	}




