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

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.click(findTestObject('Index Page/Forex_account_button'))

WebUI.click(findTestObject('Index Page/120_forexplan_select_button'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Register Page/Firstname_textbox'), 'asdasdas')

WebUI.sendKeys(findTestObject('Register Page/Lastname_textbox'), 'sdasdadsa')

WebUI.sendKeys(findTestObject('Register Page/Phonenumber_textbox'), '123131')

int RN

RN = ((Math.random() * 1000) as int)

WebUI.sendKeys(findTestObject('Register Page/Emailid_textbox'), ('john' + RN) + '@email.com')

WebUI.selectOptionByValue(findTestObject('Register Page/Language_dropdown'), '1', false)

WebUI.sendKeys(findTestObject('Register Page/Username_textbox'), 'john' + RN)

WebUI.sendKeys(findTestObject('Register Page/Password_textbox'), 'Test@123')

WebUI.sendKeys(findTestObject('Register Page/Confirmpassword_textbox'), 'Test@123')

WebUI.sendKeys(findTestObject('Register Page/Address_textbox'), 'address')

WebUI.sendKeys(findTestObject('Register Page/City_textbox'), 'city')

WebUI.sendKeys(findTestObject('Register Page/Postcode_textbox'), '123')

WebUI.selectOptionByValue(findTestObject('Register Page/Country_dropdown'), '14', false)

WebUI.sendKeys(findTestObject('Register Page/Cardnumber_textbox'), GlobalVariable.CardNumber)

WebUI.sendKeys(findTestObject('Register Page/Carddate_textbox'), GlobalVariable.CardDate)

WebUI.sendKeys(findTestObject('Register Page/CVC_textbox'), GlobalVariable.CVC)

WebUI.check(findTestObject('Register Page/Agree_checkbox'))

WebUI.click(findTestObject('Register Page/Submit_button'))

url = 'https://staging.speeduptrader.com/ForexRegister/RegistrationSuccessful'

WebUI.delay(5)

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, url, false)

WebUI.closeBrowser()

