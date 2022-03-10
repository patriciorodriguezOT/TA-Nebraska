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

public class Page_Licensure_Unit_Letter_Management {


	private TestObject dropdownLicenseType						= findTestObject('Page_Licensure Unit Letter Management/dropdown_License Type arrow')
	private TestObject optionPhysicalTherapist					= findTestObject('Page_Licensure Unit Letter Management/li_Physical Therapist')
	private TestObject dropdownTemplateList						= findTestObject('Page_Licensure Unit Letter Management/dropdown_Template List')
	private TestObject optionDeficiencyNotification				= findTestObject('Page_Licensure Unit Letter Management/li_Deficiency Notification - Initial License')
	private TestObject optionDenialNotification					= findTestObject('Page_Licensure Unit Letter Management/li_Denial Notification - Initial License')
	private TestObject pdfContent								= findTestObject('Page_Licensure Unit Letter Management/kendo-PDF container')
	private TestObject buttonSave								= findTestObject('Page_Licensure Unit Letter Management/button_Save')
	private TestObject buttonCancelAndContinue					= findTestObject('Page_Licensure Unit Letter Management/button_Cancel and Continue')
	private TestObject buttonMergeLanceData						= findTestObject('Page_Licensure Unit Letter Management/button_Merge LANCE Data')
	private TestObject buttonSetDynamicValues					= findTestObject('Page_Licensure Unit Letter Management/button_Set Dynamic Values')
	private TestObject buttonPreviewPrint						= findTestObject('Page_Licensure Unit Letter Management/button_PreviewPrint')
	private TestObject buttonSendEmail							= findTestObject('Page_Licensure Unit Letter Management/button_Send Email')
	private TestObject popupPrintTab							= findTestObject('Page_Licensure Unit Letter Management/embed_PrintPopUP')







	@Keyword
	def selectPhysicalTherapistOnLicenseType () {
		WebUI.waitForElementVisible(dropdownLicenseType, 0)

		WebUI.click(dropdownLicenseType)

		WebUI.click(optionPhysicalTherapist)
	}


	@Keyword
	def selectDeficiencyNotificationtOnTemplate () {
		WebUI.waitForElementVisible(dropdownTemplateList, 0)

		WebUI.click(dropdownTemplateList)

		WebUI.click(optionDeficiencyNotification)
	}


	@Keyword
	def selectDenialNotificationtOnTemplate () {
		WebUI.waitForElementVisible(dropdownTemplateList, 0)

		WebUI.click(dropdownTemplateList)

		WebUI.click(optionDenialNotification)
	}


	@Keyword
	def getPdfContent () {
		WebUI.waitForElementVisible(pdfContent, 0)

		String pdfContent = WebUI.getText(pdfContent)

		return pdfContent
	}


	@Keyword
	def clickOnSaveBtn () {
		WebUI.waitForElementVisible(buttonSave, 0)

		WebUI.click(buttonSave)
	}


	@Keyword
	def clickOnCancelAndContinueBtn () {
		WebUI.waitForElementVisible(buttonCancelAndContinue, 0)

		WebUI.click(buttonCancelAndContinue)
	}

	@Keyword
	def clickOnPreviewPrintBtn () {
		WebUI.waitForElementVisible(buttonPreviewPrint, 0)

		WebUI.click(buttonPreviewPrint)
	}

	@Keyword
	def clickOnSendEmailBtn () {
		WebUI.waitForElementVisible(buttonSendEmail, 0)

		WebUI.click(buttonSendEmail)
	}


	@Keyword
	def clickOnMergeLanceDataBtn () {
		WebUI.waitForElementVisible(buttonMergeLanceData, 0)

		WebUI.click(buttonMergeLanceData)
	}


	@Keyword
	def clickOnSetDynamicValuesBtn () {
		WebUI.waitForElementVisible(buttonSetDynamicValues, 0)

		WebUI.click(buttonSetDynamicValues)
	}


	@Keyword
	def verifyTokensReplacedForDenial () {
		WebUI.verifyTextNotPresent('[Current Date]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Full Name]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record street]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record street1]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record street2]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record city]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record state]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record zip Code]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Individual Record email Address]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Full Name]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Type]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Application reason for Denial]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Application denial Code]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Coordinator Full Name]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Coordinator emailAddress]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Coordinator phoneNumber]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Chief Medical Officer full Name]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Chief Medical Officer Suffix]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[Chief Medical Officer job Title]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[P and O Administrator full Name]', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent('[License Application reason for Denial]', false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def verifyDynamicValuesReplacedForDenial () {
		WebUI.verifyTextNotPresent('{License Board}', false, FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	def verifyBtnsPrintAndEmailAreVisible () {
		WebUI.waitForElementVisible(buttonPreviewPrint, 10)

		WebUI.verifyElementVisible(buttonPreviewPrint, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyElementVisible(buttonSendEmail, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def verifyPrintTabIsVisible () {
		WebUI.waitForElementVisible(popupPrintTab, 10)

		WebUI.verifyElementVisible(popupPrintTab, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
