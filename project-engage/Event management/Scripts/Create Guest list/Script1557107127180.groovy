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

//Create a new Guest List for the zkipster event
WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/a_New (1)'))

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_ERDA Guest List (1)'))

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/span_Next (1)'))

WebUI.setText(findTestObject('Page_Automated Test Campaign  Salesforce/input__1362495a (1)'), 'Automated Guest List')

WebUI.click(findTestObject('Page_Automated Test Campaign  Salesforce/button_Save (1)'))

WebUI.delay(10)
WebUI.comment("Guest List has been created in unicrm")