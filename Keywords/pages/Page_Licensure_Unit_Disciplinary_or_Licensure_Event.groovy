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
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable

public class Page_Licensure_Unit_Disciplinary_or_Licensure_Event {


	private TestObject inputSummaryOfEvent						= findTestObject('Licensure Unit Disciplinary or Licensure Event/Event Details/input_Summary of Event')
	private TestObject dropdownEventType						= findTestObject('Licensure Unit Disciplinary or Licensure Event/Event Details/Dropdown Event Type/span_Event Type-arrow')
	private TestObject dropdownEventTypeFacilityOpt				= findTestObject('Licensure Unit Disciplinary or Licensure Event/Event Details/Dropdown Event Type/li_Facility')
	private TestObject dropdownEventTypeOrganizationOpt			= findTestObject('Licensure Unit Disciplinary or Licensure Event/Event Details/Dropdown Event Type/li_Organization')
	private TestObject dropdownEventTypeProfessionalOpt			= findTestObject('Licensure Unit Disciplinary or Licensure Event/Event Details/Dropdown Event Type/li_Professional')
	private TestObject inputEstimatedDateOfEvent				= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/input_Estimated Date of Event')
	private TestObject inputEffectiveDate						= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/input_Effective Date')
	private TestObject inputDateEnded							= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/input_Date Ended')
	private TestObject testareaDescriptionOfEvent				= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/textarea_Description of Event')
	private TestObject inputDocketNum							= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/input_Docket Number')
	private TestObject inputCaseNum								= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/input_Case Number')
	private TestObject buttonSave								= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/button_Save')
	private TestObject buttonSaveAndContinue					= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/button_Save and Continue')
	private TestObject buttonCancelAndContinue					= findTestObject('Licensure Unit Disciplinary or Licensure Event/Tab Details/button_Cancel and Continue')





	@Keyword
	def completeSummaryOfEvent (String summaryOfEvent) {
		WebUI.waitForElementVisible(inputSummaryOfEvent, 0)

		WebUI.sendKeys(inputSummaryOfEvent, summaryOfEvent)
	}


	@Keyword
	def selectEventType (String eventType) {
		WebUI.waitForElementVisible(dropdownEventType, 0)

		WebUI.click(dropdownEventType)

		switch (eventType) {
			case "Facility":
				WebUI.click(dropdownEventTypeFacilityOpt);
				break;

			case "Organization":
				WebUI.click(dropdownEventTypeOrganizationOpt);
				break;

			case "Professional":
				WebUI.click(dropdownEventTypeProfessionalOpt);
				break;

			default:
				break;
		}
	}


	@Keyword
	def completeEstimatedDateOfEvent (String estimatedDateofEvent) {
		WebUI.sendKeys(inputEstimatedDateOfEvent, estimatedDateofEvent)
	}


	@Keyword
	def completeEffectiveDate (String effectiveDate) {
		WebUI.sendKeys(inputEffectiveDate, effectiveDate)
	}

	@Keyword
	def completeDateEnded (String dateEnded) {
		WebUI.sendKeys(inputDateEnded, dateEnded)
	}


	@Keyword
	def completeDescriptionOfEvent (String description) {
		WebUI.sendKeys(testareaDescriptionOfEvent, description)
	}


	@Keyword
	def completeDocketNum (String docketNum) {
		WebUI.sendKeys(inputDocketNum, docketNum)
	}

	@Keyword
	def completeCaseNum (String caseNum) {
		WebUI.sendKeys(inputCaseNum, caseNum)
	}


	@Keyword
	def clickOnSaveBtn () {
		WebUI.click(buttonSave)
	}


	@Keyword
	def clickOnSaveAndContinueBtn () {
		WebUI.click(buttonSaveAndContinue)
	}


	@Keyword
	def clickOnCancelAndContinueBtn () {
		WebUI.click(buttonCancelAndContinue)
	}
}
