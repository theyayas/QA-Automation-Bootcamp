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

WebUI.navigateToUrl('https://www.thetestingworld.com/testings/')

WebUI.click(findTestObject('1.1. Register/TC110001 - Sukses/label_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/label_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - username'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - re-password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - dob'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - phone'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - Address type'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - Choose Gender'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - Select Country'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - Select State'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - Select City'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - zip code'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/field - I agree with terms and conditionss'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.1. Register/TC110001 - Sukses/Text link - Read Detail'))

WebUI.delay(3)

WebUI.closeBrowser()

