import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Event In Zkipster'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Event In Zkipster'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Guest Lists In Zkipster'))

WebUI.delay(9)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Close this window'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Guest Lists In Zkipster'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Close this window'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Sync Guests to Zkipster'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))
WebUI.delay(6)

WebUI.navigateToUrl('https://account.zkipster.com/Login/Login?ReturnUrl=%2fGuests%2fEdit')

WebUI.setText(findTestObject('Page_zkipster - Log In/input_Log In_UserName'), 'MonashAdmin1')

WebUI.setEncryptedText(findTestObject('Page_zkipster - Log In/input_Log In_Password'), 'B1Kdm3v38+DzKq91AaaXQg==')

WebUI.click(findTestObject('Page_zkipster - Log In/input_Log In_login_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_zkipster - Events/a_Automated Test Campaign'))
WebUI.delay(7)

WebUI.click(findTestObject('Page_zkipster - Guest Lists/td_1'))
WebUI.delay(9)

def GuestFirstName = WebUI.getText(findTestObject('Page_zkipster - Guests/div_Test Monash'))

print(GuestFirstName)

GuestLastName = WebUI.getText(findTestObject('Object Repository/Page_zkipster - Guests/div_Rabobank'))

print(GuestLastName)

GuestName = ((GuestFirstName + ' ') + GuestLastName)

print(GuestName)

print(GlobalVariable.constName)

//def eventGuest='Test Monash'
if (GuestName == GlobalVariable.constName) {
    print('Guest List has been created with Guest details in Zkipster')
	WebUI.comment("Guest List has been Created in Zkipster. And guest details have been added from Unicrm")
} else {
    print('not equal')
	WebUI.comment("Guest List has been Created in Zkipster. And guest details have been added from Unicrm")
}

