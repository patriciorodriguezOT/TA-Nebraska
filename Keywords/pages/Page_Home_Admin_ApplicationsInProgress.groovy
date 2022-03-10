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

public class Page_Home_Admin_ApplicationsInProgress {

	@Keyword
	def clickOnSearchRecordButton () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/span_Search'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/span_Search'))
	}


	@Keyword
	def enterSearchCriteria (String Criteria) {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/input_Search Criteria'), 0)

		WebUI.sendKeys(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/input_Search Criteria'), Criteria)
	}


	@Keyword
	def selectFirstNameForSearch () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/a_Search By Arrow'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/a_Search By Arrow'))

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/li_First Name'))
	}


	@Keyword
	def clickOnSearchButton () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/input_Search Button'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/input_Search Button'))
	}


	@Keyword
	def clickOnReviewLink () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/a_Review'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Applications In Progress/a_Review'))
	}
}
