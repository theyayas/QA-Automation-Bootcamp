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

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - username'), 'batch288208')

WebUI.setText(findTestObject('Object Repository/1.1. Register/TC110002/input - email'), 'batch288208@xa.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1.1. Register/TC110002/input - password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/1.1. Register/TC110002/input - repassword'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.selectOptionByValue(findTestObject('Object Repository/1.1. Register/TC110002/Gender - Male'), '1', true)

WebUI.click(findTestObject('Object Repository/1.1. Register/TC110002/input - I agree'))

WebUI.click(findTestObject('Object Repository/1.1. Register/TC110002/Button - Sign Up'))

WebUI.verifyElementVisible(findTestObject('1.1. Register/TC110002/Text - User is successfully Register'))

String text = WebUI.getText(findTestObject('1.1. Register/TC110002/Text - User is successfully Register'))

if (text == 'User is successfully Register. Now You can Login') {
    KeywordUtil.markPassed('Berhasil Register')
}

WebUI.delay(3)

WebUI.closeBrowser()

