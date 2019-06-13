import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\dche0053\\AppData\\Local\\Temp\\Katalon\\Test Cases\\testdn\\20190416_164911\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://unicrm--engageuat.my.salesforce.com/')

not_run: WebUI.setText(findTestObject('Page_Login  Salesforce/input_Username_username'), 'eventsadmin@monash.edu.engageuat')

not_run: WebUI.setEncryptedText(findTestObject('Page_Login  Salesforce/input_Password_pw'), 'VWz9qj7gPNou+AqqE2IZfg==')

not_run: WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_Login'))

not_run: WebUI.waitForPageLoad(6)

not_run: WebUI.maximizeWindow()

not_run: WebUI.waitForElementClickable(findTestObject('Page_Home  Salesforce/span_Campaigns'), 0)

not_run: WebUI.navigateToUrl('https://unicrm--engageuat.lightning.force.com/lightning/o/Campaign/list?filterName=Recent', 
    FailureHandling.STOP_ON_FAILURE)

//(findTestObject('Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/div_Sandbox EngageUAT'))
//WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/span_Campaigns_1'))
not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/div_New (1)'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux (1)'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux (1)'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/span_Next (1)'))

//Set the campaign Name
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__71009a (1)'), 'Automated Test Campaign')

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_Status'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Planned'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_group'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Alumni'))

//set event location
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/label_Event Location real (1)'), '21 welington rd')

//set Start date 
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Start_date'), '27/04/2019')

//Set Start Time
//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Start time (1)'))
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Start time (1)'), '')

not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/End_Date (1)'), '30/04/2019')

//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Event_end_time (1)'))
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/Event_end_time (1)'), '')

//WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Campaigns  Salesforce/Event_source'))
not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_street (1)'), 'street')

not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_city (1)'), 'city')

not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/event_state (1)'), 'state')

not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__4091117a'), '3000')

not_run: WebUI.setText(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/input__4431117a'), 'Australia')

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Corporate'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/a_Social'))

not_run: WebUI.click(findTestObject('Page_Recently Viewed  Campaigns  Salesforce/button_Save'))

//Create a new Guest List for the zkipster event
not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_New (1)'))

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_ERDA Guest List (1)'))

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_Next (1)'))

not_run: WebUI.setText(findTestObject('Page_Automated Test Campaign  Salesforce/input__1362495a (1)'), 'Automated Guest List')

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Save (1)'))

not_run: WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'), 
    20)

//Open the Guest List
not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'))

not_run: WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

//Add constituents
not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/div_Add Constituents'))

not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/h2_Add Constituents to Campaign'))

not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Action_slds-checkbox--faux'))

not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Next'))

not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Submit'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/a_Automated Test Campaign'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Event In Zkipster'))

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Create Guest Lists In Zkipster'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Close this window'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/div_Sync Guests to Zkipster'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/lightning-primitive-icon'))

WebUI.navigateToUrl('https://account.zkipster.com/Login/Login?ReturnUrl=%2fGuests%2fEdit')

WebUI.setText(findTestObject('Page_zkipster - Log In/input_Log In_UserName'), 'MonashAdmin1')

WebUI.setEncryptedText(findTestObject('Page_zkipster - Log In/input_Log In_Password'), 'B1Kdm3v38+DzKq91AaaXQg==')

WebUI.click(findTestObject('Page_zkipster - Log In/input_Log In_login_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_zkipster - Events/a_Automated Test Campaign'))

WebUI.click(findTestObject('Page_zkipster - Guest Lists/td_1'))

def eventname = WebUI.getText(findTestObject('Page_zkipster - Guests/div_Test Monash'))

print(eventname)

def event = 'Test Monash'

if (eventname == event) {
    print('equal')
} else {
    print('not equal')
}

''', 'Test Cases/testdn', new TestCaseBinding('Test Cases/testdn',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
