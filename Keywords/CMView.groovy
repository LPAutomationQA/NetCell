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

public class CMView {
	@Keyword
	Stats (String Technology , String ObjectType ,boolean Aggregation ,String MonitoringTargetType) {
		def general = new general()
		//Click on the PM
		WebUI.click(findTestObject('Object Repository/CM/CM'))

		//Switch to the New opened tab
		WebUI.switchToWindowIndex(2)


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
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
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
				//-------------------------------------------------------------
				case 'Cluster Band' :
				//Object Selection (Cluster Band)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Cluster Band'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)
					if (Aggregation == true)
					{
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
					else
					{/*
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Amman Cluster 3'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Amman Cluster 13'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX West Amman Cluster 2'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX West Amman Cluster 5'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX North Jordan Cluster 4'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX North Jordan Cluster 14'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Jordan Cluster 7'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Jordan Cluster 8'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))*/

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Amman Cluster 1'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Amman Cluster 6'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Jordan Cluster 10'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Jordan Cluster 11'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Others Cluster 60'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Others Cluster 61'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))

					}
					break
				//-------------------------------------------------------------
				case 'Cluster' :
				//Object Selection (Cluster)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Clusters/TopX Cluster'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)
					if (Aggregation == true)
					{
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
					else
					{

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Amman Cluster 3'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Amman Cluster 13'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Amman CloseArrow'))
						/*
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX West Amman Cluster 2'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX West Amman Cluster 5'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX West Amman CloseArrow'))
					 */
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan Arrow'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX North Jordan Cluster 4'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX North Jordan Cluster 14'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX North Jordan CloseArrow'))
						/*
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Jordan Cluster 7'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Jordan Cluster 8'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Jordan CloseArrow'))
					 */
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))
						/*
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Amman Cluster 1'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX South Amman Cluster 6'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX South Amman CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Jordan Cluster 10'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX East Jordan Cluster 11'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX East Jordan CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others Arrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Others Cluster 60'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Others Cluster 61'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sites/TopX Others CloseArrow'))
					 WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))*/
					}
					break
				//-------------------------------------------------
				case 'PLMN XDD' :
				//Object Selection (PLMN XDD)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs XDD/TopX PLMN XDD'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)
					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
					}
					else
					{
						//Select the PLMN XDD Random

						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX FDD'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions XDD/TopX TDD'))
					}

					break

				//-------------------------------------------------

				case 'Sector' :
				//Object Selection (Sector)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Sectors/TopX Sector'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
					}
					else
					{
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

					}
					break

				//-------------------------------------------------

				case 'Governorate' :
				//Object Selection (Governorate)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Governorate'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
					}
					else
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Amman'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Irbid'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Aqaba'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Jerash'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Mafraq'))
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates/TopX Zarqa'))
					}
					break
				//-------------------------------------------------

				case 'Governorate XDD' :
				//Object Selection (Governorate XDD)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/TopX/TopX Object Type'))
					WebUI.delay(1)
					WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Governorates XDD/TopX Governorate XDD'))
					WebUI.delay(1)
					WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

					if (Aggregation == true)
					{
						WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX PLMNs/TopX PLMN checkbox'))
					}
					else
					{
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
					}
					break






				//------------------------------End Switch
			}



			//ScrollDown
			WebUI.scrollToElement(findTestObject('Object Repository/CM/View/Target type/Target Type Arrow'), 0)

			//Choose target type
			WebUI.click(findTestObject("Object Repository/CM/View/Target type/Target Type Arrow"))
			if (ObjectType=='Cell') {WebUI.click(findTestObject("Object Repository/CM/View/Target type/Cell 2"))}
			else {
				WebUI.click(findTestObject("Object Repository/CM/View/Target type/Cell"))}

			WebUI.scrollToElement(findTestObject('Object Repository/CM/View/MOs/MO-4GCaCroupSCellCfg'), 0)
			// Choose MOs
			WebUI.click(findTestObject("Object Repository/CM/View/MOs/MO-4G-BcchCfg"))
			WebUI.click(findTestObject("Object Repository/CM/View/MOs/MO-4G-CaMgtCfg"))
			WebUI.click(findTestObject("Object Repository/CM/View/MOs/MO-4G-CLZeroBufferzone"))
			WebUI.click(findTestObject("Object Repository/CM/View/MOs/MO-4G-CSFallBackHo"))

			//Apply and Verify
			WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Apply-Button'))
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/PM/Huawei-vendor/Error'), 0)
			//WebUI.verifyElementPresent(findTestObject('Object Repository/CM/Table header'), 0)


			//WebUI.delay(10)
			WebUI.closeBrowser()




		}


	}



}


