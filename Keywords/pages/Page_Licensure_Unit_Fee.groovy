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

public class Page_Licensure_Unit_Fee {


	private TestObject dropdownLicenseName						= findTestObject('Page_Licensure Unit Fee/dropdown License Name/dropdown_License Name-arrow')
	private TestObject dropdownPhysicalTherapistOpt				= findTestObject('Page_Licensure Unit Fee/dropdown License Name/li_Physical Therapist')
	private TestObject dropdownFeeType							= findTestObject('Page_Licensure Unit Fee/dropdown Fee Type/dropdown_Fee Type-arrow')
	private TestObject dropdownLapFeeOpt						= findTestObject('Page_Licensure Unit Fee/dropdown Fee Type/li_LAP Fee')
	private TestObject inputFeeAmount							= findTestObject('Page_Licensure Unit Fee/input_Fee Amount')
	private TestObject dropdownAllowPayments					= findTestObject('Page_Licensure Unit Fee/dropdown Allow Payments/dropdown_Allow Payments-arrow')
	private TestObject optAllowPaymentsYes						= findTestObject('Page_Licensure Unit Fee/dropdown Allow Payments/li_Yes')
	private TestObject optAllowPaymentsNo						= findTestObject('Page_Licensure Unit Fee/dropdown Allow Payments/li_No')
	private TestObject buttonSave								= findTestObject('Page_Licensure Unit Fee/button_Save')
	private TestObject buttonSaveAndContinue					= findTestObject('Page_Licensure Unit Fee/button_Save and Continue')
	private TestObject buttonCancelAndContinue					= findTestObject('Page_Licensure Unit Fee/button_Cancel and Continue')
	private TestObject columnTotalDue							= findTestObject('Page_Licensure Unit Fee/Repeating Row Control/td_Total Due')
	private TestObject columnTotalPaid							= findTestObject('Page_Licensure Unit Fee/Repeating Row Control/td_Total Paid')
	private TestObject columnDescription						= findTestObject('Page_Licensure Unit Fee/Repeating Row Control/div_Description')
	private TestObject columnStatus								= findTestObject('Page_Licensure Unit Fee/Repeating Row Control/td_Status')
	private TestObject spanRecordId								= findTestObject('Page_Licensure Unit Fee/Read Only Section/span_Record Id')






	@Keyword
	def selectPhysicalTherapistOnLicenseName () {
		WebUI.waitForElementVisible(dropdownLicenseName, 0)

		WebUI.click(dropdownLicenseName)

		WebUI.click(dropdownPhysicalTherapistOpt)
	}


	@Keyword
	def selectLapFeeOnFeeType () {
		WebUI.click(dropdownFeeType)

		WebUI.click(dropdownLapFeeOpt)
	}


	@Keyword
	def completeFeeAmount (String amount) {
		WebUI.sendKeys(inputFeeAmount, amount)
	}


	@Keyword
	def selectAllowPayments (String answer) {
		WebUI.click(dropdownAllowPayments)

		if (answer == 'Yes') {
			WebUI.click(optAllowPaymentsYes)
		} else {
			WebUI.click(optAllowPaymentsNo)
		}
	}


	@Keyword
	def clickOnSave () {
		WebUI.click(buttonSave)
	}


	@Keyword
	def clickOnSaveAndContinue () {
		WebUI.click(buttonSaveAndContinue)
	}


	@Keyword
	def clickOnCancelAndContinue () {
		WebUI.click(buttonCancelAndContinue)
	}

	@Keyword
	def verifyRepeatingRawControlInfo (String expectedTotalDue, String expectedTotalPaid, String expectedDescription, String expectedStatus) {
		WebUI.waitForElementVisible(columnTotalDue, 0)

		String totalDue = WebUI.getText(columnTotalDue)

		System.out.println('\nTotalDue = ' + totalDue + '\nTotalDue2= ' + expectedTotalDue + '\n')

		WebUI.verifyMatch(totalDue, expectedTotalDue, false, FailureHandling.CONTINUE_ON_FAILURE)



		String totalPaid = WebUI.getText(columnTotalPaid)

		System.out.println('\nTotalPaid = ' + totalPaid + '\nTotalPaid2= ' + expectedTotalPaid + '\n')

		WebUI.verifyMatch(totalPaid, expectedTotalPaid, false, FailureHandling.CONTINUE_ON_FAILURE)



		String description = WebUI.getText(columnDescription)

		System.out.println('\nDescription = ' + description + '\nDescription2= ' + expectedDescription + '\n')

		WebUI.verifyMatch(description, expectedDescription, false, FailureHandling.CONTINUE_ON_FAILURE)



		String status = WebUI.getText(columnStatus)

		System.out.println('\nDescription = ' + status + '\nDescription2= ' + expectedStatus + '\n')

		WebUI.verifyMatch(status, expectedStatus, false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def getRecordId () {
		String feeId = WebUI.getText(spanRecordId)

		System.out.println(feeId)

		return feeId
	}
}
