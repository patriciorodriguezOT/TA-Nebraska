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


public class Page_Reset_Password_Complete_Registration {

	private TestObject inputNewPassword							= findTestObject('Page_Reset Password - Complete Registration/input_New Password')
	private TestObject inputConfirmNewPassword					= findTestObject('Page_Reset Password - Complete Registration/input_Confirm New Password')
	private TestObject buttonResetPassword						= findTestObject('Page_Reset Password - Complete Registration/button_ResetPassword')
	private TestObject spanUserId								= findTestObject('Page_Reset Password - Complete Registration/span_User Id')


	@Keyword
	def completePasswords () {
		WebUI.waitForElementVisible(inputNewPassword, 0)

		WebUI.sendKeys(inputNewPassword, GlobalVariable.G_ApplicantPass)

		WebUI.sendKeys(inputConfirmNewPassword, GlobalVariable.G_ApplicantPass)
	}


	@Keyword
	def clickOnResetPasswordbtn () {
		WebUI.waitForElementVisible(buttonResetPassword, 0)

		WebUI.click(buttonResetPassword)
	}


	@Keyword
	def verifyUserId (String expectedUserId) {

		String currentUserId = WebUI.getText(spanUserId)

		WebUI.verifyMatch(currentUserId, expectedUserId, false, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
