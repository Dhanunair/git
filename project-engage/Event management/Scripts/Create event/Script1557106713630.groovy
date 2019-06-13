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
WebUI.delay(2)

WebUI.comment("Even has been created in unicrm")


