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
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.thetestingworld.com/testings/')

WebUI.click(findTestObject('Object Repository/1.3. Profile/TC130001/Page_Login  Sign Up Forms/label_Login'))

WebUI.setText(findTestObject('Object Repository/1.3. Profile/TC130001/Page_Login  Sign Up Forms/input_Login__txtUserName'), 
    GlobalVariable.USER_NAME_2)

WebUI.setEncryptedText(findTestObject('Object Repository/1.3. Profile/TC130001/Page_Login  Sign Up Forms/input_Login__txtPassword'), 
    GlobalVariable.PASSWORD_2)

WebUI.click(findTestObject('Object Repository/1.3. Profile/TC130001/Page_Login  Sign Up Forms/input'))

WebUI.switchToWindowUrl('https://www.thetestingworld.com/testings/dashboard.php')

WebUI.verifyElementVisible(findTestObject('1.3. Profile/TC130006/label - Date of birth'))

WebUI.verifyElementVisible(findTestObject('1.3. Profile/TC130006/icon - Date of birth'))

WebUI.verifyElementVisible(findTestObject('1.3. Profile/TC130006/field - Date of birth'))

String values = WebUI.getAttribute(findTestObject('1.3. Profile/TC130006/field - Date of birth'), 'value')

if (values.contains('04/01/2022')) {
    KeywordUtil.markPassed('Sesuai')
}

WebUI.setText(findTestObject('1.3. Profile/TC130006/field - Date of birth'), '06/04/1999')

WebUI.delay(3)

WebUI.closeBrowser()

