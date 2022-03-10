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

public class Page_Licensure_Unit_License_Application {

	// Tabs
	private TestObject buttonChecklistTab					= findTestObject('Page_Licensure Unit License Application/Tabs/button_Checklist')
	private TestObject buttonManageTab						= findTestObject('Page_Licensure Unit License Application/Tabs/button_Manage')
	private TestObject inputAppealCode						= findTestObject('Page_Licensure Unit License Application/Manage/input_Appeal Code')
	private TestObject buttonChecklistMang					= findTestObject('Page_Licensure Unit License Application/Tabs/button_Checklist Management')
	private TestObject buttonSubbmit						= findTestObject('Page_Licensure Unit License Application/Pay/button_Submit')
	private TestObject buttonClose							= findTestObject('Page_Licensure Unit License Application/Pay/button_Close')


	// Manage section
	private TestObject buttonApplicantDeficient				= findTestObject('Page_Licensure Unit License Application/Manage/button_Application Deficient')
	private TestObject dropdownStatus						= findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status')


	// Application Instruction Section
	private TestObject buttonAcknowledge					= findTestObject('Page_Licensure Unit License Application/Instructions/button_Acknowledge')


	// Go to x Tab
	@Keyword
	def clickOnChecklistTab () {
		WebUI.waitForElementVisible(buttonChecklistTab, 0)

		WebUI.click(buttonChecklistTab)
	}

	@Keyword
	def clickOnManageTab () {
		WebUI.waitForElementVisible(buttonManageTab, 0)

		WebUI.click(buttonManageTab)
	}

	@Keyword
	def clickOnChecklistManagementTab () {
		WebUI.waitForElementVisible(buttonChecklistMang, 0)

		WebUI.click(buttonChecklistMang)
	}

	@Keyword
	def clickOnSubmitBtn () {
		WebUI.waitForElementVisible(buttonSubbmit, 0)

		WebUI.click(buttonSubbmit)
	}

	@Keyword
	def clickOnCloseBtn () {
		WebUI.waitForElementVisible(buttonClose, 0)

		WebUI.click(buttonClose)
	}



	// Section APPLICATION INSTRUCTIONS
	@Keyword
	def clickOnAcknowledgeBtn () {
		WebUI.waitForElementVisible(buttonAcknowledge, 0)

		WebUI.click(buttonAcknowledge)
	}




	// Actions on Manage TAB
	@Keyword
	def clickOnApplicationApprove () {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Approve'), 0)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Approve'))
	}

	@Keyword
	def StartReview () {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/button_Start Review'), 0)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/button_Start Review'))

		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 0)

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 'Create Application')

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Okay'))

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status'), 'Pending')
	}

	@Keyword
	def ApproveApplication () {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Approve'), 0)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Approve'))

		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 0)

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 'Application Approved')

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Return to Form'))

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status'), 'Approved')
	}


	// Deny License Application, complete the process and verify Message displayed and Status
	@Keyword
	def DenyApplication () {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Deny'), 0)

		// Select Reason for Denial
		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/span_ReaseonForDenial-arrow'))

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/li_Bad Check_Option'))

		// Click on button Application Deny
		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/button_Application Deny'))

		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 0)

		// Verify Title of the Message
		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 'Application Denied', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Close'))

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status'), 'Denied', FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def IssueLicense () {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/button_Issue License'), 0)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/button_Issue License'))

		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 0)

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 'Issue License', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Ok'))

		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 0)

		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/h5_Title'), 'License Issued', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Page_Licensure Unit License Application/Manage/Dialog Message/button_Okay'))
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




	// Other functions
	@Keyword
	def verifyLicenseApplicationOpened (String FirstName, String LastName) {
		WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Demographics/input_First Name'), 0)

		WebUI.verifyElementAttributeValue(findTestObject('Page_Licensure Unit License Application/Demographics/input_First Name'), 'value', FirstName, 0, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyElementAttributeValue(findTestObject('Page_Licensure Unit License Application/Demographics/input_Last Name'), 'value', LastName, 0, FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	def verifyStatus (String status) {
		WebUI.waitForElementVisible(dropdownStatus, 0)

		WebUI.verifyElementText(dropdownStatus, status, FailureHandling.CONTINUE_ON_FAILURE)
	}

}
