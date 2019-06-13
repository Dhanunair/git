import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Event Management')

suiteProperties.put('name', 'Event Management')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("\\\\ad.monash.edu\\home\\User080\\dche0053\\Desktop\\Automation PE\\testdn\\Reports\\Event Management\\20190509_164603\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Event Management', suiteProperties, [new TestCaseBinding('Test Cases/Login to unicrm', 'Test Cases/Login to unicrm',  null), new TestCaseBinding('Test Cases/Create event', 'Test Cases/Create event',  null), new TestCaseBinding('Test Cases/Create Guest list', 'Test Cases/Create Guest list',  null), new TestCaseBinding('Test Cases/Add Guests', 'Test Cases/Add Guests',  [ 'variable' : null ,  ]), new TestCaseBinding('Test Cases/Create Event and Guest list in Zkipster', 'Test Cases/Create Event and Guest list in Zkipster',  null)])
