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

WebUI.navigateToUrl('https://os-test.acc.co.id/accone/Homepage')

WebUI.click(findTestObject('Object Repository/TC110001/Menu - Kalkulator Kredit'))

WebUI.click(findTestObject('TC110001/input - Tenor'))

WebUI.verifyElementVisible(findTestObject('TC110010/div_12'))

WebUI.verifyElementVisible(findTestObject('TC110010/div_24'))

WebUI.verifyElementVisible(findTestObject('TC110010/div_36'))

//WebUI.scrollToElement(findTestObject('TC110009/div_25'), 0)
WebUI.verifyElementVisible(findTestObject('TC110010/div_48'))

WebUI.verifyElementVisible(findTestObject('TC110010/div_60'))

WebUI.delay(0)

WebUI.closeBrowser()

