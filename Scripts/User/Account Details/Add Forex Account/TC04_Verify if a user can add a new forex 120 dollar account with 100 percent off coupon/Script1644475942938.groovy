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

WebUI.click(findTestObject('Index Page/Login_button'))

WebUI.setText(findTestObject('Login Page/Username_textbox'), GlobalVariable.Username)

WebUI.setText(findTestObject('Login Page/Password_textbox'), GlobalVariable.Password)

WebUI.click(findTestObject('Login Page/Login_button'))

WebUI.click(findTestObject('User/Account Details Page/AccountDetails_link'))

WebUI.click(findTestObject('User/Account Details Page/Add_Forex_Account_button'))

WebUI.click(findTestObject('User/Account Details Page/Add Forex Account/120plan_select_button'))

WebUI.setText(findTestObject('User/Account Details Page/Add Forex Account/EmailID_textbox'), 'email@email.com')

WebUI.setText(findTestObject('User/Account Details Page/Add Forex Account/Couponcode_textbox'), GlobalVariable.forexCoupon100)

WebUI.click(findTestObject('User/Account Details Page/Add Forex Account/Coupon_apply_button'))

WebUI.check(findTestObject('User/Account Details Page/Add Futures Account/I_agree_checkbox'))

WebUI.click(findTestObject('User/Account Details Page/Add Forex Account/Credit_card_button'))

WebUI.setText(findTestObject('User/Account Details Page/Add Futures Account/Stripe_card_number_textbox'), GlobalVariable.CardNumber)

WebUI.setText(findTestObject('User/Account Details Page/Add Futures Account/Stripe_card_month_textbox'), GlobalVariable.CardDate)

WebUI.setText(findTestObject('User/Account Details Page/Add Futures Account/Stripe_card_cvc_textbox'), GlobalVariable.CVC)

WebUI.setText(findTestObject('User/Account Details Page/Add Futures Account/Stripe_card_name_textbox'), 'John Doe')

WebUI.click(findTestObject('User/Account Details Page/Add Futures Account/Stripe_card_subscribe_button'))

WebUI.verifyElementPresent(findTestObject('User/Account Details Page/Add Futures Account/add_rhithimc_success_message'), 0)

WebUI.click(findTestObject('User/Logout_button'))

WebUI.closeBrowser()

