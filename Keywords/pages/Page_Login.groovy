package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Page_Login {


	@Keyword
	def login (String username, String pass) {
		WebUI.sendKeys(findTestObject('Page_Login_VisualVault/input_UserName'), username)

		WebUI.sendKeys(findTestObject('Page_Login_VisualVault/input_Password'), pass)

		WebUI.click(findTestObject('Page_Login_VisualVault/span_LoginButton'))
	}


	@Keyword
	def enterUserName (String username) {
		WebUI.waitForElementVisible(findTestObject('Page_Login_VisualVault/input_UserName'), 0)

		WebUI.sendKeys(findTestObject('Page_Login_VisualVault/input_Password'), username)
	}


	@Keyword
	def enterPassword (String pass) {
		WebUI.waitForElementVisible(findTestObject('Page_Login_VisualVault/input_UserName'), 0)

		WebUI.sendKeys(findTestObject('Page_Login_VisualVault/input_Password'), pass)
	}


	@Keyword
	def clickLoginBtn() {
		WebUI.click(findTestObject('Page_Login_VisualVault/span_LoginButton'))
	}
}
