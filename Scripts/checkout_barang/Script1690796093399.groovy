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

WebUI.verifyElementVisible(findTestObject('checkout_barang/button_cart'))

'menunggu button cart'
WebUI.click(findTestObject('checkout_barang/button_cart'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('checkout_barang/button_checkout'))

WebUI.click(findTestObject('checkout_barang/button_checkout'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('checkout_barang/input_first_name'))

WebUI.setText(findTestObject('checkout_barang/input_first_name'), 'Nurul')

WebUI.verifyElementVisible(findTestObject('checkout_barang/input_last_name'))

WebUI.setText(findTestObject('checkout_barang/input_last_name'), 'Alfiana')

WebUI.verifyElementVisible(findTestObject('checkout_barang/input_zip_postalcode'))

WebUI.setText(findTestObject('checkout_barang/input_zip_postalcode'), '68168')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('checkout_barang/button_continue'))

WebUI.click(findTestObject('checkout_barang/button_continue'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('checkout_barang/button_finish'))

WebUI.click(findTestObject('checkout_barang/button_finish'))

WebUI.takeScreenshot()

