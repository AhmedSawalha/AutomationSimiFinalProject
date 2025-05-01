package AutomationSimiFinalProject.AutomationSimiFinalProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
    
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();

	@BeforeTest
	public void mySetup() {
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	}

	@Test(priority = 1, enabled = false)
	public void radioButton() {
	    List<WebElement> allRadioButtons = driver.findElements(By.className("radioButton"));
	    int totalRadioButtons = allRadioButtons.size();
	    int RandomRabioButtonIndex = rand.nextInt(totalRadioButtons);
	    allRadioButtons.get(RandomRabioButtonIndex).click();
	 // _if you need to select spcific radio button to be clicked_
	 		/*  
	 		  AllRadioButton.get(0).click();
	 		  AllRadioButton.get(1).click();
	 		  AllRadioButton.get(2).click();
	 		 */
	    
	    
	}

	@Test(priority = 2, enabled = false)
	public void autoComplete() throws InterruptedException {

		WebElement autoCompleteInputFaild = driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input"));

		String[] countries = { "jo", "sy", "ja", "ya" };

		int randomIndex = rand.nextInt(countries.length);

		autoCompleteInputFaild.sendKeys(countries[randomIndex]);
		Thread.sleep(2000);
		autoCompleteInputFaild.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));

		System.out.println(randomIndex);
	}

	@Test(priority = 3,enabled = false)
	public void selectTag() {

		WebElement TheSelector = driver.findElement(By.id("dropdown-class-example"));
		Select mySelect = new Select(TheSelector);
		// mySelect.selectByVisibleText("Appium");
		// mySelect.selectByIndex(1);
		mySelect.selectByValue("option3");

	}

	@Test(priority = 4,enabled = false)
	public void checkBoxTest() {
		WebElement DivOfCheckBox = driver.findElement(By.id("checkbox-example"));
		List<WebElement> AllCheckBox = DivOfCheckBox.findElements(By.tagName("input"));

		int randomIndex = rand.nextInt(AllCheckBox.size());
		AllCheckBox.get(randomIndex).click();

		// for(int i=0 ;i<AllCheckBox.size();i++) {
		// AllCheckBox.get(i).click();
		// }

	}
	@Test(priority = 5,enabled = false)

	public void window__Example() throws InterruptedException {
		WebElement switchWindowButton = driver.findElement(By.id("openwindow"));
		switchWindowButton.click();
	Set<String> handeles = driver.getWindowHandles();
	List<String> windowList = new ArrayList<>(handeles);
	driver.switchTo().window(windowList.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"menu-item-9660\"]/a/span[1]")).click();
	driver.switchTo().window(windowList.get(0));
	
	
	}
	@Test(priority = 6,enabled = false)

	public void switch_Tab_Examble() throws InterruptedException {
		WebElement switchWindowButton = driver.findElement(By.id("opentab"));
		switchWindowButton.click();
	Set<String> handeles = driver.getWindowHandles();
	List<String> TabList = new ArrayList<>(handeles);
	driver.switchTo().window(TabList.get(1));
	Thread.sleep(2000);
	
	
	driver.switchTo().window(TabList.get(0));
	System.out.println(driver.getTitle());
	
	
	}
	@Test(priority = 7,enabled = false)
	public void AlertTest() throws InterruptedException {
		Thread.sleep(2000);
	WebElement InputFieldForTheName = driver.findElement(By.id("name"));
	InputFieldForTheName.sendKeys("sawalha");
	WebElement AlertButton = driver.findElement(By.id("alertbtn"));
	AlertButton.click();
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
		
	}
	@Test(priority=8,enabled = false)
	public void TableTest() {
		//the print all the rows
		WebElement theTable = driver.findElement(By.id("product"));
		
		List<WebElement> AllRows = theTable.findElements(By.tagName("tr"));
		List<WebElement> AllData = theTable.findElements(By.tagName("td"));
		
		//this is the logic ti print random row
		//int randomRow = rand.nextInt(AllRows.size());
		//System.out.println(AllRows.get(randomRow).getText());
		//to print all the rows
//		for (int i=0;i<AllRows.size();i++) {
//			System.out.println(AllRows.get(i).getText());
//		}
		for (int i =0;i<AllData.size();i++) {
			System.out.println(AllData.get(i).getText());
		}	
		
		
			
		}
	@Test(priority=9,enabled = false)
	public void HideAndShow() throws InterruptedException {
	JavascriptExecutor	js = (JavascriptExecutor) driver;
	js.executeAsyncScript("window.scrollTo(0,1600)");
	
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		Thread.sleep(2000);
		WebElement ShowButton = driver.findElement(By.id("show-textbox"));
		ShowButton.click();

		
		
	}
	@Test(priority=10,enabled = false)
	public void EnableDisenable() throws InterruptedException {
	
	
		
		
		WebElement DisableButton = driver.findElement(By.id("disabled-button"));
		DisableButton.click();
		Thread.sleep(2000);
		WebElement InputField = driver.findElement(By.id("enabled-example-input"));
		
		WebElement EnableButton = driver.findElement(By.id("enabled-button"));
		
		EnableButton.click();
		InputField.sendKeys("hey");
	  

		
		
	}
	@Test(priority=11, enabled = false)
	public void MouseHover() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,1750)");
	    Thread.sleep(2000);

	    WebElement TheElementINeedToMoveTo = driver.findElement(By.id("mousehover"));
	    Actions action = new Actions(driver);
	    action.moveToElement(TheElementINeedToMoveTo).click().perform();
	}
	
	
	@Test(priority=12, enabled = false)
	public void Calander() throws InterruptedException {
	    WebElement CalanderTap = driver.findElement(By.linkText("Booking Calendar"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,1900)");
	    
	    String originalWindow = driver.getWindowHandle();
	    CalanderTap.click();
	    Thread.sleep(2000);
	    
	    Set<String> handles = driver.getWindowHandles();
	    List<String> tabList = new ArrayList<>(handles);
	    
	    if (tabList.size() > 1) {
	        driver.switchTo().window(tabList.get(1));
	    } else {
	        System.out.println("لم يتم فتح تبويب جديد بعد الضغط على Booking Calendar");
	        driver.switchTo().window(originalWindow);}
	            
	    }
	        
	  @Test(priority = 13,enabled = false)
	  public void Iframe() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollTo(0,2200)");
			Thread.sleep(2000);
			driver.switchTo().frame("iframe-name");		

			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu")).click();
			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();

			List<String> TabList = new ArrayList<>(handles);

			driver.switchTo().window(TabList.get(0));
			Thread.sleep(2000);

			WebElement CalenderTab = driver.findElement(By.linkText("Booking Calendar")); 
			CalenderTab.click();
			
			Set<String> handles2 = driver.getWindowHandles();

			List<String> TabList2 = new ArrayList<>(handles2);

			driver.switchTo().window(TabList2.get(1));
			
			System.out.println(driver.getTitle());
		}
	  @Test(priority = 14,enabled = true)
		public void DownloadApp() {
			WebElement DownloadButton = driver.findElement(By.linkText("Download Apk files"));
					DownloadButton.click();
		}
}
