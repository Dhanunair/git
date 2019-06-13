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


RunConfiguration.setExecutionSettingFile('C:\\Users\\dche0053\\AppData\\Local\\Temp\\Katalon\\20190326_164954\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\n\'Open browser\'\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://unicrm--engageuat.my.salesforce.com/\')\n\nWebUI.setText(findTestObject(\'Page_Login  Salesforce/input_Username_username\'), \'eventsadmin@monash.edu.engageuat\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Login  Salesforce/input_Password_pw\'), \'VWz9qj7gPNou+AqqE2IZfg==\')\n\nWebUI.click(findTestObject(\'Page_Login  Salesforce/input_Password_Login\'))\n\nWebUI.waitForPageLoad(6)\n\nWebUI.maximizeWindow()\n\nWebUI.waitForElementClickable(findTestObject(\'Page_Home  Salesforce/span_Campaigns\'), 0)\n\nWebUI.navigateToUrl(\'https://unicrm--engageuat.lightning.force.com/lightning/o/Campaign/list?filterName=Recent\', FailureHandling.STOP_ON_FAILURE)\n\n//(findTestObject(\'Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/div_Sandbox EngageUAT\'))\n//WebUI.click(findTestObject(\'Object Repository/Page_Home  Salesforce/Page_Home  Salesforce/span_Campaigns_1\'))\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/div_New\'))\n\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux\'))\n\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/span_Guest List Containing Campaign Members_slds-radio--faux\'))\n\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/span_Next\'))\n\n//Set the campaign Name\nWebUI.setText(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/input__71009a\'), \'Automated Test Campaign\')\n\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/div_Event Group--None--\'))\n\nWebUI.click(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/a_Alumni\'))\n\nWebUI.setText(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/label_Event Location real\'), \'21 welington rd\')\n\n//set Start date \nWebUI.setText(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/label_Event Location\'), \'27/03/2019\')\n\n//Set Start Time\nWebUI.setText(findTestObject(\'Page_Recently Viewed  Campaigns  Salesforce/Start time\'), \'10.00 AM\')\n\n', FailureHandling.STOP_ON_FAILURE, true)

