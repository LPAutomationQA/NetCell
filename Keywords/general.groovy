import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import java.text.SimpleDateFormat;
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent






public class general {

	@Keyword
	WebDriver createWebDriver() {
		String executedBrowser = DriverFactory.getExecutedBrowser().getName()
		WebDriver driver
		println(executedBrowser)
		switch (executedBrowser) {

			case 'FIREFOX_DRIVER':
				String geckoDriverPath = DriverFactory.getGeckoDriverPath()
				WebUI.comment(">>> geckoDriverPath=${geckoDriverPath}")
				System.setProperty("webdriver.gecko.driver", geckoDriverPath)
			// browser customization with DesiredCapabilities here --- TODO
				driver = new FirefoxDriver()
				break
			case 'CHROME_DRIVER':
				String chromeDriverPath = DriverFactory.getChromeDriverPath()
				println chromeDriverPath
				WebUI.comment(">>> chromeDriverPath=${chromeDriverPath}")
				System.setProperty("webdriver.chrome.driver", chromeDriverPath)
				ChromeOptions options = new ChromeOptions()
				options.setAcceptInsecureCerts(true)
				options.addArguments("--ignore-certificate-errors")
				options.addArguments("--disable-notifications")

			// browser customization with DesiredCapabilities here --- TODO
				driver = new ChromeDriver(options)
				break
			case 'IE_DRIVER':
				String ieDriverPath = DriverFactory.getIEDriverPath()
				WebUI.comment(">>> ieDriverPath=${ieDriverPath}")
				System.setProperty("webdriver.ie.driver", ieDriverPath)
				driver = new InternetExplorerDriver()
				break
			case 'EDGE_DRIVER':
				String edgeDriverPath = DriverFactory.getEdgeDriverPath()
				WebUI.comment(">>> edgeDriverPath=${edgeDriverPath}")
				System.setProperty("webdriver.edge.driver", edgeDriverPath)
			// you can insert code for browser customization here --- TODO
				driver = new EdgeDriver()
				break
			default:
			//	String chromeDriverPath = 'C:\\Users\\LP-FatimaIbeid\\.katalon\\packages\\Katalon_Studio_Windows_64-8.6.8\\Katalon_Studio_Windows_64-8.6.8\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe'
			//	WebUI.comment(">>> chromeDriverPath=${chromeDriverPath}")
			//System.setProperty("webdriver.chrome.driver", chromeDriverPath)

			// browser customization with DesiredCapabilities here --- TODO
			//	driver = new ChromeDriver()



				String geckoDriverPath ='C:\\Users\\LP-FatimaIbeid\\.katalon\\packages\\Katalon_Studio_Windows_64-8.6.8\\Katalon_Studio_Windows_64-8.6.8\\configuration\\resources\\drivers\\\firefox_win64\\geckodriver.exe'
				WebUI.comment(">>> geckoDriverPath=${geckoDriverPath}")
				System.setProperty("webdriver.gecko.driver", geckoDriverPath)
			// browser customization with DesiredCapabilities here --- TODO
				driver = new FirefoxDriver()
		}
		return driver
	}


	@Keyword
	StartUp() {


		/*WebUI.openBrowser(GlobalVariable.SwagerURL)
		 WebUI.maximizeWindow()
		 WebUI.delay(2)
		 // Initialize WebDriver
		 //WebDriver driver = DriverFactory.getWebDriver()
		 // Execute JavaScript to open a new tab
		 WebUI.executeJavaScript("window.open();", null)
		 WebUI.switchToWindowIndex(1)
		 WebUI.navigateToUrl ("https://netcellcert.com/#/login")
		 */
	}


	@Keyword
	WebDriver start(def url1, def url2) {

		def general = new general()
		WebDriver driver=general.createWebDriver()
		DriverFactory.changeWebDriver(driver)
		WebUI.maximizeWindow()
		driver.navigate().to(url1);
		WebUI.executeJavaScript("window.open();", null)
		WebUI.switchToWindowIndex(1)
		driver.navigate().to(url2);

		return driver
	}

	//------------Generate random number between 0 and 100------------------------------
	@Keyword
	String getRandomNumberUsingNextInt() {
		Random random = new Random();
		String x = Integer.toString(random.nextInt(100 - 1) + 1);
		return x;
	}

	//------------Generate random number ForObjectTybe between 0 and 5 ------------------------------
	@Keyword
	String getRandomNumberForObjectTybe() {
		Random random = new Random();
		String x = Integer.toString(random.nextInt(5 - 1) + 1);
		return x;
	}

	//------------Generate random number between 1 and 2------------------------------
	@Keyword
	String getRandomNumberToSelectFDDorTDD() {
		Random random = new Random();
		String x = Integer.toString(1 + random.nextInt(2));
		return x;
	}




}


