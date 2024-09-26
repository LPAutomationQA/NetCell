import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginNew'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/PM/PM-Button'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/Object-Type-Arrow'))

WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/Huawei-4G/PLMN'))

WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/Object-Type-Selection/PLMN/PLMN-CheckBox'))



//Scroll Down 
WebUI.scrollToElement(findTestObject('Object Repository/PM/Huawei-vendor/Include-last-hour'), 0)


//Date Selection 
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/StartDate/StartDate-Button'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/StartDate/Monthly-Selection'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/StartDate/Fep-Selection'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/StartDate/1-Fep'))

/*
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/End-date/End-Time-Button'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/End-date/Monthly-Selection'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/End-date/Fep-Selection'))
WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/End-date/7-Feb'))
*/

WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Apply-Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PM/Huawei-vendor/Export-Charts'), 0)

WebUI.closeBrowser()




