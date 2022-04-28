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
import java.util.Calendar as Calendar
import internal.GlobalVariable



public class Page_Licensure_Unit_License {

	private TestObject inputFirstName 						= findTestObject('Page_Licensure Unit License/input_First Name')
	private TestObject inputLastName 						= findTestObject('Page_Licensure Unit License/input_Last Name')
	private TestObject inputIssueDate 						= findTestObject('Page_Licensure Unit License/input_Issue Date')
	private TestObject inputEffectiveDate 					= findTestObject('Page_Licensure Unit License/input_Effective Date')
	private TestObject inputExpirationDate					= findTestObject('Page_Licensure Unit License/input_Expiration Date')
	private TestObject selectLicenseType					= findTestObject('Page_Licensure Unit License/span_Select License Type')
	private TestObject tabManage							= findTestObject('Page_Licensure Unit License/button_Manage')
	private TestObject tabDiscipline						= findTestObject('Page_Licensure Unit License/button_Discipline')
	private TestObject buttonMakeLicenseInactive			= findTestObject('Page_Licensure Unit License/button_Make License Inactive')
	private TestObject spanLicenseId						= findTestObject('Page_Licensure Unit License/READ ONLY SECTION/input_License ID')
	private TestObject dropdownStatus						= findTestObject('Page_Licensure Unit License/READ ONLY SECTION/kendo-dropdownlist_Status')
	private TestObject buttonAddFee							= findTestObject('Page_Licensure Unit License/button_Add Fee')
	private TestObject buttonClose							= findTestObject('Page_Licensure Unit License/button_Close')
	private TestObject buttonCancelAndContinue				= findTestObject('Page_Licensure Unit License/button_Cancel and Continue')
	private TestObject buttonSaveAndContinue				= findTestObject('Page_Licensure Unit License/button_Save and Continue')
	private TestObject buttonPrintWallCertificate			= findTestObject('Page_Licensure Unit License/button_Print Wall Certificate')
	private TestObject buttonPrintWaWalletCard				= findTestObject('Page_Licensure Unit License/button_Print Wallet Card')
	private TestObject divWalletCardContent					= findTestObject('Page_Licensure Unit License/div_Wallet Card Content')
	private TestObject buttonDisciplinary					= findTestObject('Page_Licensure Unit License/Tab_Dischipline/button_Disciplinary or Licensure Event')
	private TestObject OpenLinkDiscipline1					= findTestObject('Page_Licensure Unit License/Tab_Dischipline/a_Open Link_Discipline1')
	private TestObject buttonPlaceOnHold					= findTestObject('Page_Licensure Unit License/button_Place on Hold')
	private TestObject buttonReleaseHold					= findTestObject('Page_Licensure Unit License/button_Release Hold')







	// General Actions
	@Keyword
	def clickOnManageTab () {
		WebUI.waitForElementVisible(tabManage, 40)

		WebUI.click(tabManage)
	}

	@Keyword
	def clickOnDischiplineTab () {
		WebUI.waitForElementVisible(tabDiscipline, 40)

		WebUI.click(tabDiscipline)
	}

	@Keyword
	def verifyStatus (String status) {
		WebUI.waitForElementVisible(dropdownStatus, 40)

		String licenseStatus = WebUI.getText(dropdownStatus)

		WebUI.verifyMatch(licenseStatus, status, true, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickOnCloseButton () {
		WebUI.waitForElementVisible(buttonClose, 40)

		WebUI.click(buttonClose)
	}

	@Keyword
	def clickOnCancelAndContinueButton () {
		WebUI.waitForElementVisible(buttonCancelAndContinue, 40)

		WebUI.click(buttonCancelAndContinue)
	}

	@Keyword
	def clickOnSaveAndContinueButton () {
		WebUI.waitForElementVisible(buttonSaveAndContinue, 40)

		WebUI.click(buttonSaveAndContinue)
	}





	// Actions On Detail Tab
	@Keyword
	def verifyLicenseInformation (String firstName, String lastName, String licenseType) {
		WebUI.waitForElementVisible(inputFirstName, 40)

		WebUI.verifyElementAttributeValue(inputFirstName, 'value', firstName, 40)

		WebUI.verifyElementAttributeValue(inputLastName, 'value', lastName, 40)

		WebUI.verifyElementText(selectLicenseType, licenseType)
	}

	@Keyword
	def verifyIssueDate (String issueDate) {
		WebUI.waitForElementVisible(inputIssueDate, 40)

		WebUI.verifyElementAttributeValue(inputIssueDate, 'value', issueDate, 40)
	}

	@Keyword
	def verifyEffectiveDate (String effectiveDate) {
		WebUI.waitForElementVisible(inputEffectiveDate, 40)

		WebUI.verifyElementAttributeValue(inputEffectiveDate, 'value', effectiveDate, 40)
	}

	@Keyword
	def verifyExpirationDate (String expirationDate) {
		WebUI.waitForElementVisible(inputExpirationDate, 40)

		WebUI.verifyElementAttributeValue(inputExpirationDate, 'value', expirationDate, 40)
	}

	@Keyword
	def obtainLicenseId () {
		WebUI.waitForElementVisible(spanLicenseId, 40)

		String licenseId = WebUI.getAttribute(spanLicenseId, 'value')

		System.out.println('\nLicenseID:' + licenseId + '\n')

		return licenseId
	}

	@Keyword
	def obtainIssueDate () {
		WebUI.waitForElementVisible(inputIssueDate, 40)

		String issueDate = WebUI.getAttribute(inputIssueDate, 'value')

		return issueDate
	}

	@Keyword
	def completeIssueDate (String issueDate) {
		WebUI.clearText(inputIssueDate)

		WebUI.waitForElementVisible(inputIssueDate, 40)

		WebUI.sendKeys(inputIssueDate, issueDate)
	}





	// Actions on Discipline Tab
	@Keyword
	def clickOnDisciplinaryButton () {
		WebUI.waitForElementVisible(buttonDisciplinary, 40)

		WebUI.click(buttonDisciplinary)
	}

	@Keyword
	def verifyDisciplineIsNotPresent () {
		WebUI.waitForElementVisible(OpenLinkDiscipline1, 40)

		WebUI.verifyElementNotPresent(OpenLinkDiscipline1, 40, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def verifyDisciplineIsPresent () {
		WebUI.waitForElementVisible(OpenLinkDiscipline1, 40)

		WebUI.verifyElementVisible(OpenLinkDiscipline1, FailureHandling.CONTINUE_ON_FAILURE)
	}





	//Actions on Manage TAB
	@Keyword
	def clickOnMakeLicenseInactive () {
		WebUI.waitForElementVisible(buttonMakeLicenseInactive, 40)

		WebUI.click(buttonMakeLicenseInactive)
	}

	@Keyword
	def clickOnAddFee () {
		WebUI.waitForElementVisible(buttonAddFee, 40)

		WebUI.click(buttonAddFee)
	}

	@Keyword
	def verifyCloseButtonNotVisible () {
		WebUI.verifyElementNotPresent(buttonClose, 40, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickOnPrintWallCertificateButton () {
		WebUI.waitForElementVisible(buttonPrintWallCertificate, 40)

		WebUI.click(buttonPrintWallCertificate)
	}

	@Keyword
	def clickOnPrintWalletCardButton () {
		WebUI.waitForElementVisible(buttonPrintWaWalletCard, 40)

		WebUI.click(buttonPrintWaWalletCard)
	}

	@Keyword
	def clickOnPlaceOnHoldBtn () {
		WebUI.waitForElementVisible(buttonPlaceOnHold, 40)

		WebUI.click(buttonPlaceOnHold)
	}

	@Keyword
	def clickOnReleaseHoldBtn () {
		WebUI.waitForElementVisible(buttonReleaseHold, 40)

		WebUI.click(buttonReleaseHold)
	}

	@Keyword
	def verifyReleaseHoldBtnIsNotVisible () {
		WebUI.waitForElementVisible(buttonReleaseHold, 40)

		WebUI.verifyElementNotVisible(buttonReleaseHold, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	@Keyword
	def verifyReleaseHoldBtnIsNotPresent () {
		WebUI.waitForElementVisible(buttonReleaseHold, 40)

		WebUI.verifyElementNotPresent(buttonReleaseHold, 40, FailureHandling.CONTINUE_ON_FAILURE)
	}

}
