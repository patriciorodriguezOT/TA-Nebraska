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

public class Page_Home_Admin_ApprovedApplications {



	private TestObject buttonSearchMain 				= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/span_SearchBigBtn')
	private TestObject inputSearchCriteria				= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_Search Criteria')
	private TestObject selectSearchCriteria				= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Select Search Criteria Arrow')
	private TestObject selectFirstNameOpt				= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/li_First Name')
	private TestObject buttonSearch						= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_SearchSmallBtn')
	private TestObject linkOpen							= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Open')

	@Keyword
	def clickOnSearchRecordButton () {
		System.sleep(10000)

		WebUI.waitForElementVisible(buttonSearchMain, 20)

		WebUI.click(buttonSearchMain)
	}


	@Keyword
	def enterSearchCriteria (String Criteria) {
		WebUI.waitForElementVisible(inputSearchCriteria, 20)

		WebUI.sendKeys(inputSearchCriteria, Criteria)
	}


	@Keyword
	def selectFirstNameForSearch () {
		WebUI.waitForElementVisible(selectSearchCriteria, 20)

		WebUI.click(selectSearchCriteria)

		WebUI.click(selectFirstNameOpt)
	}


	@Keyword
	def clickOnSearchButton () {
		WebUI.waitForElementVisible(buttonSearch, 20)

		WebUI.click(buttonSearch)
	}


	@Keyword
	def clickOnOpenLink () {
		WebUI.waitForElementVisible(linkOpen, 20)

		WebUI.click(linkOpen)
	}
}
