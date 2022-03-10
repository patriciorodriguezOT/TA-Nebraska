package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.support.FindBy

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

public class Page_Licensure_Unit_License_Application_Manage {


	private TestObject inputAppealCode						= findTestObject('Page_Licensure Unit License Application/Manage/input_Appeal Code')
	private TestObject buttonApplicantDeficient				= findTestObject('Page_Licensure Unit License Application/Manage/button_Application Deficient')
	private TestObject buttonApplicantApprove				= findTestObject('Page_Licensure Unit License Application/Manage/button_Application Approve')
	private TestObject dropdownStatus						= findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status')
	private TestObject buttonCancelAndClose					= findTestObject('Page_Licensure Unit License Application/Manage/button_Cancel and Close')
	private TestObject buttonStartReview					= findTestObject('Page_Licensure Unit License Application/Manage/button_Start Review')
	private TestObject modalDialogTitle						= findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title')
	private TestObject buttonMDOkay							= findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Okay')
	private TestObject buttonMDOk							= findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Ok')
	private TestObject buttonMDOReturnToForm				= findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Return to Form')
	private TestObject buttonMDClose						= findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Close')
	private TestObject buttonApplicationDeny				= findTestObject('Page_Licensure Unit License Application/Manage/button_Application Deny')
	private TestObject buttonIssueLicense					= findTestObject('Page_Licensure Unit License Application/Manage/button_Issue License')
	private TestObject buttonCreateLetter					= findTestObject('Page_Licensure Unit License Application/Manage/button_Create Letter')
	private TestObject dropdownReasonForDenial				= findTestObject('Page_Licensure Unit License Application/Manage/span_ReaseonForDenial-arrow')
	private TestObject optDenialBadCheck					= findTestObject('Page_Licensure Unit License Application/Manage/li_Bad Check_Option')






	// Actions on Manage TAB
	@Keyword
	def clickOnApplicationApprove () {
		WebUI.waitForElementVisible(buttonApplicantApprove, 0)

		WebUI.click(buttonApplicantApprove)
	}


	@Keyword
	def clickOnCancelAndClose () {
		WebUI.waitForElementVisible(buttonCancelAndClose, 0)

		WebUI.click(buttonCancelAndClose)
	}


	@Keyword
	def clickOnCreateLetter () {
		WebUI.waitForElementVisible(buttonCreateLetter, 0)

		WebUI.click(buttonCreateLetter)
	}


	@Keyword
	def StartReview () {
		WebUI.waitForElementVisible(buttonStartReview, 0)

		WebUI.click(buttonStartReview)

		WebUI.waitForElementVisible(modalDialogTitle, 0)

		WebUI.verifyElementText(modalDialogTitle, 'Create Application', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(buttonMDOkay)

		WebUI.verifyElementText(dropdownStatus, 'Pending', FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	def ApproveApplication () {
		WebUI.waitForElementVisible(buttonApplicantApprove, 0)

		WebUI.click(buttonApplicantApprove)

		WebUI.waitForElementVisible(modalDialogTitle, 0)

		WebUI.verifyElementText(modalDialogTitle, 'Application Approved', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(buttonMDOReturnToForm)

		WebUI.verifyElementText(dropdownStatus, 'Approved', FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def DenyApplication () {
		WebUI.waitForElementVisible(buttonApplicationDeny, 0)

		WebUI.click(dropdownReasonForDenial)

		WebUI.click(optDenialBadCheck)

		WebUI.click(buttonApplicationDeny)

		WebUI.waitForElementVisible(modalDialogTitle, 0)

		WebUI.verifyElementText(modalDialogTitle, 'Application Denied', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(buttonMDClose)

		WebUI.verifyElementText(dropdownStatus, 'Denied', FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def IssueLicense () {
		WebUI.waitForElementVisible(buttonIssueLicense, 0)

		WebUI.click(buttonIssueLicense)

		WebUI.waitForElementVisible(modalDialogTitle, 0)

		WebUI.verifyElementText(modalDialogTitle, 'Issue License', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(buttonMDOk)

		WebUI.waitForElementVisible(modalDialogTitle, 0)

		WebUI.verifyElementText(modalDialogTitle, 'License Issued', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(buttonMDOkay)
	}

	@Keyword
	def setApplicationDeficient () {
		WebUI.waitForElementVisible(buttonApplicantDeficient, 0)

		WebUI.click(buttonApplicantDeficient)
	}


	@Keyword
	def getAppealCode () {
		String appealCode = WebUI.getAttribute(inputAppealCode, 'value')

		return appealCode
	}


	@Keyword
	def verifyStatus (String status) {
		WebUI.waitForElementVisible(dropdownStatus, 0)

		WebUI.verifyElementText(dropdownStatus, status, FailureHandling.CONTINUE_ON_FAILURE)
	}

}
