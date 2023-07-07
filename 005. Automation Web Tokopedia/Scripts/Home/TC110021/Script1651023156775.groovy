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

WebUI.mouseOver(findTestObject('Object Repository/Page Home/TC110021/div_Kategori'))

WebUI.click(findTestObject('Object Repository/Page Home/TC110021/div_Travel  Entertainment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110021/div_Travel  Entertainment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Food  Voucher'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Hiburan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Hotel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_M-Tix XXI'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Streaming'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Tiket Event'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Tiket Kereta Api'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Tiket Pesawat'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110021/a_Voucher Game'))

WebUI.delay(3)

WebUI.closeBrowser()

