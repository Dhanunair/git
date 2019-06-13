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


RunConfiguration.setExecutionSettingFile('C:\\Users\\dche0053\\AppData\\Local\\Temp\\Katalon\\Test Cases\\testdn\\20190326_163714\\execution.properties')

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
not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/div_New'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/span_Next'))

//Set the campaign Name
not_run: WebUI.setText(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/input__71009a'), 
    'Automated Test Campaign')

not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/div_Event Group--None--'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/a_Alumni'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/label_Event Location-copy'), 
    '21 welington rd')

//set Start date 
WebUI.setText(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/label_Event Location'), 
    '27/03/2019')

//Set Start Time
WebUI.setText(findTestObject('Object Repository/Page_Home  Salesforce/Page_Recently Viewed  Campaigns  Salesforce/Start time'), 
    '10.00 AM')

''', 'Test Cases/testdn', new TestCaseBinding('Test Cases/testdn',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
