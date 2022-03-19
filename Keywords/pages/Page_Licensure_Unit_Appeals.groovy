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

import internal.GlobalVariable

/*************
 * Objects
 *************/
public class Page_Licensure_Unit_Appeals {

	private TestObject inputAppealCode			= findTestObject('Page_Licensure_Unit_Appeals/input_Appeal_Code')
	private TestObject btnModalClose			= findTestObject('Page_Licensure_Unit_Appeals/button_Modal_Close')
	private TestObject btnNext					= findTestObject('Page_Licensure_Unit_Appeals/button_Next')
	private TestObject btnAppealSubmit			= findTestObject('Page_Licensure_Unit_Appeals/button_Appeal_Submit')
	private TestObject checkboxOutsideUSA		= findTestObject('Page_Licensure_Unit_Appeals/checkbox_OutsideUSA')
	private TestObject inputPhone				= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Phone')
	private TestObject inputPhoneExt			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Phone_Ext')
	private TestObject inputAddressL1			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L1')
	private TestObject inputAddressL2			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L2')
	private TestObject inputAddressL3			= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Address_L3')
	private TestObject inputZip					= findTestObject('Page_Licensure_Unit_Appeals/input_Applicant_Zip')
	private TestObject textareaAppealReason		= findTestObject('Page_Licensure_Unit_Appeals/textarea_ReasonForAppeal')
	private TestObject divAppealSubmitted		= findTestObject('Page_Licensure_Unit_Appeals/Page_Appeal_Submitted/div_Appeal_Submitted')

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
		WebUI.waitForElementVisible(btnNext, 0)
		WebUI.click(btnNext)
	}

	@Keyword
	def clicOnCloseModalBtn () {
		WebUI.waitForElementVisible(btnModalClose, 0)
		WebUI.click(btnModalClose)
	}

	@Keyword
	def clicOnAppealSubmitBtn () {
		WebUI.waitForElementVisible(btnAppealSubmit, 0)
		WebUI.click(btnAppealSubmit)
	}

	/****************
	 * Validations
	 ****************/
	@Keyword
	def verifyAppealSubmitted () {
		WebUI.verifyElementPresent(divAppealSubmitted, 0)
	}
}
