import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

//static void main(String[] args){
'Open browser'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://unicrm--engageuat.my.salesforce.com/')

WebUI.setText(findTestObject('Page_Login  Salesforce/input_Username_username'), 'eventsadmin@monash.edu.engageuat')

WebUI.setEncryptedText(findTestObject('Page_Login  Salesforce/input_Password_pw'), 'VWz9qj7gPNou+AqqE2IZfg==')

WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_Login'))

WebUI.waitForPageLoad(6)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Page_Home  Salesforce/span_Campaigns'), 0)

WebUI.navigateToUrl('https://unicrm--engageuat.lightning.force.com/lightning/o/Campaign/list?filterName=Recent', FailureHandling.STOP_ON_FAILURE)

//(findTestObject('Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/div_Sandbox EngageUAT'))
//WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/span_Campaigns_1'))
WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/div_New (1)'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux (1)'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux (1)'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Next (1)'))

//Set the campaign Name
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__71009a (1)'), 'Automated Test Campaign')

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_Status'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Planned'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_group'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Alumni'))

//set event location
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/label_Event Location real (1)'), '21 welington rd')

//set Start date 
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Start_date'), '27/06/2019')

//Set Start Time
//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Start time (1)'))
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Start time (1)'), '')

WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/End_Date (1)'), '30/06/2019')

//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Event_end_time (1)'))
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_end_time (1)'), '')

//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Event_source'))
WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_street (1)'), 'street')

WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_city (1)'), 'city')

WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_state (1)'), 'state')

WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__4091117a'), '3000')

WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__4431117a'), 'Australia')

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Corporate'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Social'))

WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/button_Save'))

//Create a new Guest List for the zkipster event
WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_New (1)'))

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_ERDA Guest List (1)'))

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_Next (1)'))

WebUI.setText(findTestObject('Page_Automated Test Campaign  Salesforce/input__1362495a (1)'), 'Automated Guest List')

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Save (1)'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'), 20)

//Open the Guest List
WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

//Add constituents
WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/div_Add Constituents'))

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/h2_Add Constituents to Campaign'))

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Action_slds-checkbox--faux'))

def Guest = WebUI.getText(findTestObject('Page_Automated Guest List  Salesforce/a_Test Monash constituent'))

print(Guest)

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Next'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/a_Automated Test Campaign'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Event In Zkipster'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Event In Zkipster'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Guest Lists In Zkipster'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Close this window'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Sync Guests to Zkipster'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.navigateToUrl('https://account.zkipster.com/Login/Login?ReturnUrl=%2fGuests%2fEdit')

WebUI.setText(findTestObject('Page_zkipster - Log In/input_Log In_UserName'), 'MonashAdmin1')

WebUI.setEncryptedText(findTestObject('Page_zkipster - Log In/input_Log In_Password'), 'B1Kdm3v38+DzKq91AaaXQg==')

WebUI.click(findTestObject('Page_zkipster - Log In/input_Log In_login_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_zkipster - Events/a_Automated Test Campaign'))

WebUI.click(findTestObject('Page_zkipster - Guest Lists/td_1'))

def GuesFirstName = WebUI.getText(findTestObject('Object Repository/Page_zkipster - Guests/div_Test Monash'))

GuestLastName = WebUI.getText(findTestObject('Object Repository/Page_zkipster - Guests/div_Rabobank'))

GuestName = ((GuesFirstName + ' ') + GuestLastName)

print(GuestName)

//def eventGuest='Test Monash'
if (GuestName == Guest) {
    print('Guest List has been created with Guest details in Zkipster')
} else {
    print('not equal')
}

