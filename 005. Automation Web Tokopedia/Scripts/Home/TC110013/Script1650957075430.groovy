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

WebUI.mouseOver(findTestObject('Object Repository/Page Home/TC110013/div_Kategori'))

WebUI.click(findTestObject('Object Repository/Page Home/TC110013/div_Featured'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110013/div_Featured'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Market  Museum'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Tagihan Kartu Kredit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Zakat Fitrah'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Tokopedia Affiliate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Kotak Amal Tokopedia'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Quest'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Promo'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Handphone  Tablet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Komputer  Laptop'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110013/a_Tukar Tambah'))

WebUI.delay(3)

WebUI.closeBrowser()

