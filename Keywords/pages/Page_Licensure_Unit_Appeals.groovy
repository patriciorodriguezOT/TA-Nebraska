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
import com.kms.katalon.core.mobile.keyword.builtin.WaitForElementAttributeValueKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementVisibleKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

/*************
 * Objects
 *************/
public class Page_Licensure_Unit_Appeals {

	private TestObject inputAppealCode			= findTestObject('Page_Licensure_Unit_Appeals/input_Appeal_Code')
	private TestObject btnNext					= findTestObject('Page_Licensure_Unit_Appeals/button_Next')
	private TestObject btnSubmit				= findTestObject('Page_Licensure_Unit_Appeals/button_Submit')
	private TestObject checkboxOutsideUSA		= findTestObject('Page_Licensure_Unit_Appeals/checkbox_OutsideUSA')
	private TestObject inputPhone				= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Phone')
	private TestObject inputPhoneExt			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Phone_Ext')
	private TestObject inputAddressL1			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L1')
	private TestObject inputAddressL2			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L2')
	private TestObject inputAddressL3			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L3')
	private TestObject inputZip					= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Zip')
	private TestObject textareaAppealReason		= findTestObject('Page_Licensure_Unit_Appeals/textarea_ReasonForAppeal')
	private TestObject h1AppealSubmitted		= findTestObject('Page_Licensure_Unit_Appeals/h1_Your appeal has been submitted')

	/*************
	 * Inputs
	 *************/	
	@Keyword
	def enterAppealCode (String appealCode) {
		WebUI.waitForElementVisible(inputAppealCode, 0)
		WebUI.sendKeys(inputAppealCode, appealCode)
	}

	@Keyword
	def enterUpdatedPhone (String phone) {
		WebUI.waitForElementVisible(inputPhone, 0)
		WebUI.setText(inputPhone, phone)
	}
	@Keyword
	def enterUpdatedPhonExt (String ext) {
		WebUI.waitForElementVisible(inputPhoneExt, 0)
		WebUI.setText(inputPhoneExt, ext)
	}

	@Keyword
	def enterUpdatedAddressL1 (String address) {
		WebUI.waitForElementVisible(inputAddressL1, 0)
		WebUI.setText(inputAddressL1, address)
	}
	@Keyword
	def enterUpdatedAddressL2 (String address) {
		WebUI.waitForElementVisible(inputAddressL2, 0)
		WebUI.setText(inputAddressL2, address)
	}

	@Keyword
	def enterUpdatedAddressL3 (String address) {
		WebUI.waitForElementVisible(inputAddressL3, 0)
		WebUI.setText(inputAddressL3, address)
	}

	@Keyword
	def enterUpdatedZip (String zip) {
		WebUI.waitForElementVisible(inputZip, 0)
		WebUI.setText(inputZip, zip)
	}

	@Keyword
	def enterAppealReason (String text) {
		WebUI.waitForElementVisible(textareaAppealReason, 0)
		WebUI.sendKeys(textareaAppealReason, text)
	}

	/*************
	 * Buttons
	 *************/
	@Keyword
	def clickOnNextBtn () {
		WebUI.waitForElementVisible(btnNext, 10)
		WebUI.click(btnNext)
	}

	@Keyword
	def clicOnModalSubmitBtn () {
		WebUI.waitForElementVisible(btnModalSubmit, 10)
		WebUI.click(btnModalSubmit)
	}

	@Keyword
	def clicOnSubmitBtn () {
		WebUI.waitForElementVisible(btnSubmit, 10)
		WebUI.click(btnSubmit)
	}

	/****************
	 * Validations
	 ****************/
	@Keyword
	def verifyAppealSubmitted () {
		WebUI.waitForElementVisible(h1AppealSubmitted, 10)
		if (!WebUI.verifyElementPresent(h1AppealSubmitted, 10)) {
			KeywordUtil.markFailed("\nThe test case can not be completed. Appeal submission confirmation webpage did not load")
		}
	}

	@Keyword
	def verifyErrorAlert (String alertObj, String errorText) {
		if (!alertObj.contains(errorText)) {
			// Stop tc execution
			KeywordUtil.markFailed("\nThe test case can not be completed. Error alert won't show due VALID denial code entered")
		}
	}

	@Keyword
	def verifyValidDenialCode () {
		WebUI.waitForElementVisible(findTestObject('Modal Dialog Components/button_Okay'), 10)
		if (!WebUI.verifyElementPresent(findTestObject('Modal Dialog Components/button_Okay'), 10)) {
			// Stop tc execution
			KeywordUtil.markFailed("\nThe test case can not be completed. Error alert won't show due INVALID denial code entered")
		}
	}
}
