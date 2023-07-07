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

WebUI.click(findTestObject('Object Repository/TC110002/a_Kalkulator Kredit'))

WebUI.click(findTestObject('Object Repository/TC110002/input_Brand_b5-Input_Brand'))

WebUI.click(findTestObject('Object Repository/TC110002/span_DAIHATSU'))

WebUI.click(findTestObject('Object Repository/TC110002/span_ALL NEW SIRION'))

WebUI.click(findTestObject('Object Repository/TC110002/span_1.3 D FMC AT'))

WebUI.click(findTestObject('Object Repository/TC110002/div_Tahun'))

WebUI.click(findTestObject('Object Repository/TC110002/span_2022'))

WebUI.setText(findTestObject('Object Repository/TC110002/input_Harga OTR_b5-b12-Input_Mask_1'), '-1,005,000,000')

WebUI.click(findTestObject('Object Repository/TC110002/input_DP()_b5-Input_Dp'))

WebUI.click(findTestObject('Object Repository/TC110002/span_20'))

WebUI.click(findTestObject('Object Repository/TC110002/input_Tenor_b5-TenorPeminjaman'))

WebUI.click(findTestObject('Object Repository/TC110002/span_24'))

WebUI.click(findTestObject('Object Repository/TC110002/input_Area Pengajuan_b5-AreaPengajuan'))

WebUI.click(findTestObject('Object Repository/TC110002/span_DKI Jakarta dan Banten'))

WebUI.click(findTestObject('Object Repository/TC110002/button_Hitung Simulasi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC110002/div_Angsuran Per BulanRp 4.040.000TDPRp 30._3403c6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/TC110002/div_Ajukan Pembiayaan'))

WebUI.delay(3)

WebUI.closeBrowser()

