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

'membuka browser'
WebUI.openBrowser('')

'membuka website'
WebUI.navigateToUrl('https://www.saucedemo.com/')

'menuju input Username'
WebUI.verifyElementVisible(findTestObject('login_page/username'))

'ambil gambar setelah url terbuka'
WebUI.takeScreenshot()

'input username'
WebUI.setText(findTestObject('login_page/username'), username)

'menuju input password'
WebUI.verifyElementVisible(findTestObject('login_page/password'))

'input username'
WebUI.setText(findTestObject('login_page/password'), password)

'ambil gambar setelah memasukkan input username dan password'
WebUI.takeScreenshot()

'menuju verifikasi button login apakah button login sudah muncul atau belum'
WebUI.verifyElementVisible(findTestObject('login_page/button_login'))

'menuju verifikasi button login apakah button login sudah dapat diklik atau belum'
WebUI.verifyElementClickable(findTestObject('login_page/button_login'))

'klik button login'
WebUI.click(findTestObject('login_page/button_login'))

'ambil gambar setelah klik button login'
WebUI.takeScreenshot()

