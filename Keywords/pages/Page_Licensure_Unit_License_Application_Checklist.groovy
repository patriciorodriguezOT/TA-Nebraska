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

public class Page_Licensure_Unit_License_Application_Checklist {


	private TestObject buttonApplicationApprove				= findTestObject('Page_Licensure Unit License Application/Checklist/button_Application Approve')
	private TestObject linkCitizenshipDocumentation			= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Citizensihp Documentation')
	private TestObject linkNDEN								= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open NDEN')
	private TestObject linkTranscript						= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Transcripts')
	private TestObject linkMinimumEducation					= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Minimum Education')
	private TestObject linkExamDocumentation				= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Exam Documentation')
	private TestObject linkFeesPaid							= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Fees Paid')
	private TestObject linkFingerprints						= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Fingerprints')
	private TestObject linkUniqueIdentifier					= findTestObject('Page_Licensure Unit License Application/Checklist/Open Links for Checklist Tasks/a_Open Unique Identifier')






	@Keyword
	def clickOnOpenCitizenshipDocumentation () {
		WebUI.waitForElementVisible(linkCitizenshipDocumentation, 0)

		WebUI.click(linkCitizenshipDocumentation)
	}

	@Keyword
	def clickOnOpenNDEN () {
		WebUI.waitForElementVisible(linkNDEN, 0)

		WebUI.click(linkNDEN)
	}

	@Keyword
	def clickOnOpenTranscript () {
		WebUI.waitForElementVisible(linkTranscript, 0)

		WebUI.click(linkTranscript)
	}

	@Keyword
	def clickOnOpenMinimumEducation () {
		WebUI.waitForElementVisible(linkMinimumEducation, 0)

		WebUI.click(linkMinimumEducation)
	}

	@Keyword
	def clickOnOpenExamDocumentation () {
		WebUI.waitForElementVisible(linkExamDocumentation, 0)

		WebUI.click(linkExamDocumentation)
	}

	@Keyword
	def clickOnOpenFeesPaid () {
		WebUI.waitForElementVisible(linkFeesPaid, 0)

		WebUI.click(linkFeesPaid)
	}

	@Keyword
	def clickOnOpenFingerPrints () {
		WebUI.waitForElementVisible(linkFingerprints, 0)

		WebUI.click(linkFingerprints)
	}

	@Keyword
	def clickOnOpenUniqueIdentifier () {
		WebUI.waitForElementVisible(linkUniqueIdentifier, 0)

		WebUI.click(linkUniqueIdentifier)
	}


	@Keyword
	def clickOnApplicationApprove () {
		WebUI.waitForElementVisible(buttonApplicationApprove, 0)

		WebUI.click(buttonApplicationApprove)
	}
}
