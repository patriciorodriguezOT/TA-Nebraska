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



public class Page_Licensure_Unit_Checklist_Task {


	private TestObject tabApprove						= findTestObject('Page_Licensure Unit Checklist Task/button_Approve')
	private TestObject tabComplete						= findTestObject('Page_Licensure Unit Checklist Task/button_Complete')
	private TestObject buttonComplete					= findTestObject('Page_Licensure Unit Checklist Task/Complete Section/button_Complete')
	private TestObject buttonApprove					= findTestObject('Page_Licensure Unit Checklist Task/Approve Section/button_Approve')
	private TestObject dropdownStatus					= findTestObject('Page_Licensure Unit Checklist Task/kendo-dropdownlist_Status')
	private TestObject buttonClose						= findTestObject('Page_Licensure Unit Checklist Task/Approve Section/button_Close')
	private TestObject buttonRequestMoreInfo			= findTestObject('Page_Licensure Unit Checklist Task/Approve Section/button_Request More Info')






	@Keyword
	def clickOnApproveTab () {
		WebUI.waitForElementVisible(tabApprove, 40)

		WebUI.click(tabApprove)
	}


	@Keyword
	def clickOnCompleteTab () {
		WebUI.waitForElementVisible(tabComplete, 40)

		WebUI.click(tabComplete)
	}


	@Keyword
	def clickOnCompleteBtn () {
		WebUI.waitForElementVisible(buttonComplete, 40)

		WebUI.click(buttonComplete)
		
	}


	@Keyword
	def clickOnApproveButton () {
		WebUI.waitForElementVisible(buttonApprove, 40)

		WebUI.click(buttonApprove)
	}


	@Keyword
	def clickOnRequestMoreInfoButton () {
		WebUI.waitForElementVisible(buttonRequestMoreInfo, 40)

		WebUI.click(buttonRequestMoreInfo)
	}


	@Keyword
	def clickOnCloseButton () {
		WebUI.waitForElementVisible(buttonClose, 40)

		WebUI.click(buttonClose)
	}

	@Keyword
	def verifyStatus (String statutsExpected) {
		System.sleep(1000)

		String currentStatus =  WebUI.getText(dropdownStatus)

		WebUI.verifyMatch(currentStatus, statutsExpected, false, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
