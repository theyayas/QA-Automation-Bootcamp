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

WebUI.click(findTestObject('Object Repository/Page Home/TC110012/button_Daftar'))

WebUI.switchToWindowUrl('https://www.tokopedia.com/register')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110012/Text - Daftar Sekarang'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110012/Text - Sudah punya akun Tokopedia'))

WebUI.verifyElementVisible(findTestObject('Page Home/TC110012/Linked text - Masuk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110012/Linked text - Masuk'))

WebUI.verifyElementVisible(findTestObject('Page Home/TC110012/button - Google'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110012/button - Google'))

WebUI.verifyElementVisible(findTestObject('Page Home/TC110012/Linked text - Syarat dan Ketentuan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110012/Linked text - Syarat dan Ketentuan'))

WebUI.verifyElementVisible(findTestObject('Page Home/TC110012/Linked text - Kebijakan Privasi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110012/Linked text - Kebijakan Privasi'))

WebUI.delay(3)

WebUI.closeBrowser()

