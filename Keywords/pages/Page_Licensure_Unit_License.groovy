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
		WebUI.waitForElementVisible(tabManage, 10)

		WebUI.click(tabManage)
	}

	@Keyword
	def clickOnDischiplineTab () {
		WebUI.waitForElementVisible(tabDiscipline, 0)

		WebUI.click(tabDiscipline)
	}

	@Keyword
	def verifyStatus (String status) {
		WebUI.waitForElementVisible(dropdownStatus, 0)

		String licenseStatus = WebUI.getText(dropdownStatus)

		WebUI.verifyMatch(licenseStatus, status, true, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickOnCloseButton () {
		WebUI.waitForElementVisible(buttonClose, 0)

		WebUI.click(buttonClose)
	}

	@Keyword
	def clickOnCancelAndContinueButton () {
		WebUI.waitForElementVisible(buttonCancelAndContinue, 0)

		WebUI.click(buttonCancelAndContinue)
	}

	@Keyword
	def clickOnSaveAndContinueButton () {
		WebUI.waitForElementVisible(buttonSaveAndContinue, 0)

		WebUI.click(buttonSaveAndContinue)
	}





	// Actions On Detail Tab
	@Keyword
	def verifyLicenseInformation (String firstName, String lastName, String licenseType) {
		WebUI.waitForElementVisible(inputFirstName, 0)

		WebUI.verifyElementAttributeValue(inputFirstName, 'value', firstName, 0)

		WebUI.verifyElementAttributeValue(inputLastName, 'value', lastName, 0)

		WebUI.verifyElementText(selectLicenseType, licenseType)
	}

	@Keyword
	def verifyIssueDate (String issueDate) {
		WebUI.waitForElementVisible(inputIssueDate, 0)

		WebUI.verifyElementAttributeValue(inputIssueDate, 'value', issueDate, 0)
	}

	@Keyword
	def verifyEffectiveDate (String effectiveDate) {
		WebUI.waitForElementVisible(inputEffectiveDate, 0)

		WebUI.verifyElementAttributeValue(inputEffectiveDate, 'value', effectiveDate, 0)
	}

	@Keyword
	def verifyExpirationDate (String expirationDate) {
		WebUI.waitForElementVisible(inputExpirationDate, 0)

		WebUI.verifyElementAttributeValue(inputExpirationDate, 'value', expirationDate, 0)
	}

	@Keyword
	def obtainLicenseId () {
		WebUI.waitForElementVisible(spanLicenseId, 0)

		String licenseId = WebUI.getAttribute(spanLicenseId, 'value')

		System.out.println('\nLicenseID:' + licenseId + '\n')

		return licenseId
	}

	@Keyword
	def obtainIssueDate () {
		WebUI.waitForElementVisible(inputIssueDate, 0)

		String issueDate = WebUI.getAttribute(inputIssueDate, 'value')

		return issueDate
	}

	@Keyword
	def completeIssueDate (String issueDate) {
		WebUI.clearText(inputIssueDate)

		WebUI.waitForElementVisible(inputIssueDate, 0)

		WebUI.sendKeys(inputIssueDate, issueDate)
	}





	// Actions on Discipline Tab
	@Keyword
	def clickOnDisciplinaryButton () {
		WebUI.waitForElementVisible(buttonDisciplinary, 20)

		WebUI.click(buttonDisciplinary)
	}

	@Keyword
	def verifyDisciplineIsNotPresent () {
		WebUI.waitForElementVisible(OpenLinkDiscipline1, 10)

		WebUI.verifyElementNotPresent(OpenLinkDiscipline1, 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def verifyDisciplineIsPresent () {
		WebUI.waitForElementVisible(OpenLinkDiscipline1, 20)

		WebUI.verifyElementVisible(OpenLinkDiscipline1, FailureHandling.CONTINUE_ON_FAILURE)
	}





	//Actions on Manage TAB
	@Keyword
	def clickOnMakeLicenseInactive () {
		WebUI.waitForElementVisible(buttonMakeLicenseInactive, 0)

		WebUI.click(buttonMakeLicenseInactive)
	}

	@Keyword
	def clickOnAddFee () {
		WebUI.waitForElementVisible(buttonAddFee, 0)

		WebUI.click(buttonAddFee)
	}

	@Keyword
	def verifyCloseButtonNotVisible () {
		WebUI.verifyElementNotPresent(buttonClose, 0, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickOnPrintWallCertificateButton () {
		WebUI.waitForElementVisible(buttonPrintWallCertificate, 0)

		WebUI.click(buttonPrintWallCertificate)
	}

	@Keyword
	def clickOnPrintWalletCardButton () {
		WebUI.waitForElementVisible(buttonPrintWaWalletCard, 0)

		WebUI.click(buttonPrintWaWalletCard)
	}

	@Keyword
	def clickOnPlaceOnHoldBtn () {
		WebUI.waitForElementVisible(buttonPlaceOnHold, 0)

		WebUI.click(buttonPlaceOnHold)
	}

	@Keyword
	def clickOnReleaseHoldBtn () {
		WebUI.waitForElementVisible(buttonReleaseHold, 0)

		WebUI.click(buttonReleaseHold)
	}

	@Keyword
	def verifyReleaseHoldBtnIsNotVisible () {
		WebUI.waitForElementVisible(buttonReleaseHold, 5)

		WebUI.verifyElementNotVisible(buttonReleaseHold, FailureHandling.CONTINUE_ON_FAILURE)
	}

}
