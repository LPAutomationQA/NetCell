import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class SON {

	@Keyword
	def son(String Vendor,String Technology ,String ObjectType ,String SonType) {
		
		def general = new general()
		//Click on the SON
		WebUI.click(findTestObject('Object Repository/SON/sonBtn'))

		//Switch to the New opened tab
		WebUI.switchToWindowIndex(2)

		if (Vendor=="Nokia") {

		}

		switch (Technology) {

			case '2G' :
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Technology/Technology-Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Technology/2G'))

				break
			case '3G' :
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Technology/Technology-Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Technology/3G'))

				break
		}
       //---Select the Object Type
		selectObjectType( ObjectType ,Technology )
		
		WebUI.click(findTestObject('Object Repository/SON/SonType/Type-Arrow'))
		WebDriver driver = DriverFactory.getWebDriver();
		
		//-----Select SonType
		driver.findElement(By.xpath('//span[contains(text(),"'+SonType+'")]')).click();



		//Apply and Verify
		WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Apply-Button'))

	}

	//------select Object Type-----------------------------------------------------
	@Keyword
	def selectObjectType(String ObjectType ,String Technology) {

		WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
		WebUI.delay(1)
		switch (ObjectType)
		{
			case 'PLMN' :
			//Object Selection (PLMN)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN'))
				WebUI.delay(1)
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
				break
			//-------------------------------------------------------------
			case 'Region' :
			//Object Selection (Region)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))



				break
			//-------------------------------------------------------------
			case 'Site' :
			//Object Selection (Site)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Site'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)



				if (Technology=='2G') {
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/East Amman site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/South Amman site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/East Jordan site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/North Jordan site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/South Jordan site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))}
				else {
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))


					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))

					WebUI.click(findTestObject('Object Repository/SON/ObjectType/South Amman site1'+" "+ Technology ))
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
				}
				if (Technology=='4G') {
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others site1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))
				}
				else {
					WebUI.click(findTestObject('Object Repository/SON/ObjectType/Other Site'))
				}


				break
			//-------------------------------------------------------------
			case 'Cell':

			//Object Selection (Cell)


				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Cell'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


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
				WebUI.click(findTestObject('Object Repository/SON/ObjectType/South Amman Site1 Cell1'+" "+ Technology))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX East Jordan Site1 Arrow'))
				WebUI.click(findTestObject('Object Repository/SON/ObjectType/East Jordan Site1 Cell1'+" "+ Technology))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX North Jordan Site1 Arrow'))
				WebUI.click(findTestObject('Object Repository/SON/ObjectType/North Jordan Site1 Cell1'+" "+ Technology))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX South Jordan Site1 Arrow'))
				WebUI.click(findTestObject('Object Repository/SON/ObjectType/South Jordan Site1 Cell1'+" "+ Technology))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))

				if (Technology=='2G') {WebUI.click(findTestObject('Object Repository/SON/ObjectType/Other Site'))}
				else {
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Others Site1 Arrow'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cells/TopX Others Site1 Cell1'))
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))

				}
				break

			//-------------------------------------------------------------
			case 'Region Band' :
			//Object Selection (Region Band)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX Reagion Band'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


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


				break
			//-------------------------------------------------------------
			case 'Region XDD' :
			//Object Selection (Region XDD)

			
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX Region XDD'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


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


				break
			//-------------------------------------------------------------
			case 'Cluster Band' :
			//Object Selection (Cluster Band)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Cluster Band'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))

				break
			//-------------------------------------------------------------
			case 'Cluster' :
			//Object Selection (Cluster)
		
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX Cluster'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

				if (Technology== '2G') {
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX East Amman Cluster 3'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX East Amman Cluster 13'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX West Amman Cluster 2'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX West Amman Cluster 5'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX North Jordan Cluster 4'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX North Jordan Cluster 14'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX South Jordan Cluster 7'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX South Jordan Cluster 8'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX South Amman Cluster 1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX South Amman Cluster 6'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX East Jordan Cluster 10'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX East Jordan Cluster 11'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX Others Cluster 60'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX Others Cluster 61'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))
						}
				
				
				else {
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))
				}
				break
			//-------------------------------------------------
			case 'PLMN XDD' :
			//Object Selection (PLMN XDD)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs XDD/TopX PLMN XDD'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))

				break

			//-------------------------------------------------

			case 'Sector' :
			//Object Selection (Sector)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX Sector'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX West Amman 1601A'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX South Amman 101B'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX East Jordan 1001C'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX North Jordan 1401A'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX South Jordan1203B'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX Others 6307C'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))


				break

			//-------------------------------------------------

			case 'Governorate' :
			//Object Selection (Governorate)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Governorate'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)



				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Irbid'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Aqaba'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Jerash'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Mafraq'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Zarqa'))

				break

			//-------------------------------------------------

			case 'Governorate XDD' :
			//Object Selection (Governorate XDD)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates XDD/TopX Governorate XDD'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Irbid'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Aqaba'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Jerash'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Mafraq'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Zarqa'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))

				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Amman'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Irbid'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Aqaba'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Jerash'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Mafraq'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Zarqa'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))

				break

			//-------------------------------------------------

			case 'Governorate Band' :
			//Object Selection (Governorate Band)
				
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates Band/TopX Governorate Band'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)


				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))

				break
			//----------------------------------------------------
			case 'BSC' :
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC'))
				WebUI.delay(1)
				WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC Ader'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC Fifa'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC HQ 02'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC AA 01'))
				WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX BSCs/TopX BSC 415044'))
				break
		}
	}



}
