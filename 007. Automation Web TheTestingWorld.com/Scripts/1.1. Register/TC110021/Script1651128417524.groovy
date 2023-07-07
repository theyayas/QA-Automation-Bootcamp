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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.thetestingworld.com/testings/')

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - username'), username)

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/1.1. Register/TC110002/input - password'), password)

WebUI.setEncryptedText(findTestObject('Object Repository/1.1. Register/TC110002/input - repassword'), rePassword)

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/dob - 1 april 2022'), dob)

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - phone'), phone)

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - address'), address)

if (gender.toString().toLowerCase().equals("male")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/1.1. Register/TC110002/Gender - Male'), '1', true)
}
else if (gender.toString().toLowerCase().equals("female")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/1.1. Register/TC110002/Gender - Male'), '2', true)
}


WebUI.click(findTestObject('Object Repository/1.1. Register/TC110002/input - I agree'))

WebUI.click(findTestObject('Object Repository/1.1. Register/TC110002/Button - Sign Up'))

WebUI.verifyElementVisible(findTestObject('1.1. Register/TC110002/Text - User is successfully Register'))

String text = WebUI.getText(findTestObject('1.1. Register/TC110002/Text - User is successfully Register'))

if (text == 'User is successfully Register. Now You can Login') {
    KeywordUtil.markPassed('Berhasil Register')
} else {
    KeywordUtil.markPassed('Tidak berhasil Register, email sudah terdaftar')
}

WebUI.delay(3)

WebUI.closeBrowser()

