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

WebUI.waitForElementVisible(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'), 20)

//Open the Guest List
WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_Automated Guest List (1)'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

//Add constituents
WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/div_Add Constituents'))

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/h2_Add Constituents to Campaign'))

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Action_slds-checkbox--faux'))


//Guest = WebUI.getText(findTestObject('Page_Automated Guest List  Salesforce/a_Test Monash constituent'))

//
GlobalVariable.constName=WebUI.getText(findTestObject('Page_Automated Guest List  Salesforce/a_Test Monash constituent'))
print(GlobalVariable.constName)

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Next'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/span_Submit'))

WebUI.delay(8)

//go to the campaign page
WebUI.click(findTestObject('Page_Automated Guest List  Salesforce/a_Automated Test Campaign'))

WebUI.delay(3)

WebUI.comment("Guest is added to Guest list in unicrm")