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

WebUI.mouseOver(findTestObject('Object Repository/Page Home/TC110016/div_Kategori'))

WebUI.click(findTestObject('Object Repository/Page Home/TC110016/div_Investasi Asuransi  Pinjaman'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page Home/TC110016/div_Investasi Asuransi  Pinjaman'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Asuransi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Asuransi Perjalanan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_BRI Ceria'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Dana Impian'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Dana Instan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Emas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Home Credit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Insurlater'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Klaim Asuransi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Kredivo'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Modal Toko'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Paylater  Cicilan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Pinjaman Online'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Proteksi Produk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Reksa Dana'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page Home/TC110016/a_Tokopedia Giftcard'))

WebUI.delay(3)

WebUI.closeBrowser()

