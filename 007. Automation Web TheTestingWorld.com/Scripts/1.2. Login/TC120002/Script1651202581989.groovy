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

WebUI.click(findTestObject('Object Repository/1.2. Login/TC120002/label_Login'))

WebUI.setText(findTestObject('Object Repository/1.2. Login/TC120002/input - UserName'), 'batch288203')

WebUI.setEncryptedText(findTestObject('Object Repository/1.2. Login/TC120002/input - Password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/1.2. Login/TC120002/input'))

WebUI.switchToWindowUrl('https://www.thetestingworld.com/testings/dashboard.php')

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/img - TheTestingWorld'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - Home'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - My Account'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - Hover'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - Download'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - logout'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/Text Link - Welcome Mr. batch288203'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.2. Login/TC120002/foto profile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/img - TheTestingWorld 2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/form -Select Your Image'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/form - My Profile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/form - Items to Drag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.2. Login/TC120002/form - pick list'))

WebUI.delay(3)

WebUI.closeBrowser()

