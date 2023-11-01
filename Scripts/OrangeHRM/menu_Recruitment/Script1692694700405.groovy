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

WebUI.verifyElementVisible(findTestObject('OrangeHRM/menu_Recruitment'))

WebUI.click(findTestObject('OrangeHRM/menu_Recruitment'))

WebUI.verifyElementText(findTestObject('OrangeHRM/title_Recruitment'), 'Recruitment')

WebUI.verifyElementVisible(findTestObject('OrangeHRM/dropdown_JobTitle'))

WebUI.click(findTestObject('OrangeHRM/dropdown_JobTitle'))

WebUI.click(findTestObject('OrangeHRM/option_JobTitle', [('jobTitle') : jobTitle]))

WebUI.verifyElementText(findTestObject('OrangeHRM/title_vacancy'), 'Vacancy')

WebUI.verifyElementVisible(findTestObject('OrangeHRM/dropdown_Vacancy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM/dropdown_Vacancy'))

WebUI.click(findTestObject('OrangeHRM/option_Vacancy', [('vacancy') : vacancy]))

