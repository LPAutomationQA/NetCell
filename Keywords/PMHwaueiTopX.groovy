import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.poi.hssf.record.PageBreakRecord.Break

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
import org.openqa.selenium.Keys
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory

public class PMHwaueiTopX {

	//------------------------------------------------- TOP X --------------------------------------------------------------------------------------------
	@Keyword
	TopX (String Technology , String ObjectType ,boolean Aggregation ,String ResolutionTemp ,boolean LowX , String AggregationLevel)
	{
		def general = new general()
		//Click on the PM
		WebUI.click(findTestObject('Object Repository/PM/PM-Button'))

		//Switch to the New opened tab
		WebUI.switchToWindowIndex(2)
		//Data view TopX
		WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Data-view/TopX'))
		//WebUI.delay(2)


		//---------------------------4G----------------------------------

		//The Technology will be 4G by default

		if (Technology == "4G")
		{

			switch (ObjectType)
			{
				case 'PLMN' :
				//Object Selection (PLMN)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNS/TopX PLMN'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNS/TopX PLMN checkbox'))
					break
				//-------------------------------------------------------------
				case 'Region' :
				//Object Selection (Region)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)
					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))
					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
					}
					break
				//-------------------------------------------------------------
				case 'Site' :
				//Object Selection (Site)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Site'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))

					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan site1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))
					}
					break
				//-------------------------------------------------------------
				case 'Cell':

				//Object Selection (Cell)

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Cell'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Amman Site1 Arrow'))
						WebUI.delay(2)
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Amman Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX West Amman Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX West Amman Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Amman Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Amman Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Jordan Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Jordan Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX North Jordan Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX North Jordan Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Jordan Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Jordan Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Others Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Others Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))

					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Amman Site1 Arrow'))
						WebUI.delay(1)
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Amman Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX West Amman Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX West Amman Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX North Jordan Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX North Jordan Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Jordan Site1 Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Jordan Site1 Cell1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))
					}

					break

				//-------------------------------------------------------------
				case 'Region Band' :
				//Object Selection (Region Band)

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX Reagion Band'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))

					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD 900'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD F2'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD 1800'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD F1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))
					}
					break
				//-------------------------------------------------------------
				case 'Region XDD' :
				//Object Selection (Region XDD)

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX Region XDD'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX FDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX TDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))

					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX FDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX TDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX FDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX TDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))
					}
					break


			}


			//Aggregation
			//No Aggregation FOR TopX
			/*if (Aggregation == true)
			 {
			 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Aggregation-CheckBox'))
			 }
			 */

			//ScrollDown
			WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/LowXlabel"), 0)


			switch (ResolutionTemp)
			{
				case 'Hourly' :
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/BeforeDate'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Choose Month'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Feb'))
				//WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Day 1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Button OK'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/After Date'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Choose Month'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Feb'))
				//WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Day 7'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopXDate/Button OK'))
					break

			}


			//LowX
			if (LowX == true)
			{
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/LowXCheckBox'))
			}

			//Apply and Verify
			WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Apply-Button'))
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/PM/Huawei-vendor/Error'), 0)
			WebUI.verifyElementPresent(findTestObject('Object Repository/PM/Huawei-vendor/Chart'), 0)
			WebUI.verifyElementPresent(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Export Chart'), 0)
			WebUI.waitForElementPresent(findTestObject('Object Repository/PM/Huawei-vendor/TopX/Table View'), 0)
			WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/Table View'))
			WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/Reordering the table view'))
			WebUI.closeBrowser()


		}


	}


























}
