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

public class Page_Licensure_Unit_License_Application_Checklist_Management {


	private TestObject buttonNext				= findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Next')
	private TestObject buttonUploadFile			= findTestObject('Page_Licensure Unit License Application/Checklist Management/input_Open Related Form_btnChecklistTaskUpload')
	private TestObject buttonDialogConfirmation	= findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok')
	private TestObject buttonAcknowledge		= findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Acknowledge')
	private TestObject buttonOpenRelatedForm	= findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Open Related Form')




	@Keyword
	def clickOnOkDialogButton () {
		WebUI.waitForElementVisible(buttonDialogConfirmation, 0)

		WebUI.click(buttonDialogConfirmation)
	}

	@Keyword
	def clickOnNextButton () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}

	@Keyword
	def clickOnAcknowledgeButton () {
		WebUI.waitForElementVisible(buttonAcknowledge, 0)

		WebUI.click(buttonAcknowledge)
	}


	@Keyword
	def clickOnUploadButton () {
		WebUI.waitForElementVisible(buttonUploadFile, 0)

		WebUI.click(buttonUploadFile)
	}


	@Keyword
	def clickOnOpenRelatedFormButton () {
		WebUI.waitForElementVisible(buttonOpenRelatedForm, 0)

		WebUI.click(buttonOpenRelatedForm)
	}
}
