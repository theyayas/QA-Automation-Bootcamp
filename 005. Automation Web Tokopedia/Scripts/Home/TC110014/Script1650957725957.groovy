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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.mouseOver(findTestObject('Object Repository/Page Home/TC110014/div_Kategori'))

WebUI.click(findTestObject('Object Repository/Page Home/TC110014/div_Brand Unggulan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110014/div_Brand Unggulan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Tefal'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Informa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Vone Sanitary'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Inthebox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Locknlock'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Bayer Health'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_COTTONINK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Dettol'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Havaianas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Jansport'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Keds'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_LOreal Paris'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Levis Official'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Marks  Spencer'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Nestle Indonesia'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Ramayana'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_SOGO'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_The Watch Co'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110014/a_Wakai'))

WebUI.delay(3)

WebUI.closeBrowser()

