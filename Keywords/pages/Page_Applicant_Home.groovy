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

public class Page_Applicant_Home {

	private TestObject linkApplyForALicense			= findTestObject('Page_Applicant Pages VV/Home/a_Apply for aLicense (1)')
	private TestObject linkViewYourFinances			= findTestObject('Page_Applicant Pages VV/Home/a_View your Finances (1)')
	private TestObject linkViewYourProfile			= findTestObject('Page_Applicant Pages VV/Home/a_View your Profile (1)')
	private TestObject linkOpenApplication			= findTestObject('Page_Applicant Pages VV/Home/a_Open Application (1)')
	private TestObject linkViewAndPrintLicense		= findTestObject('Page_Applicant Pages VV/Home/a_View and Print')
	private TestObject linkOpenTask1				= findTestObject('Page_Applicant Pages VV/Home/a_Open Task1')
	private TestObject linkOpenTask2				= findTestObject('Page_Applicant Pages VV/Home/a_Open Task2')
	private TestObject iframePrincipal				= findTestObject('Page_Applicant Pages VV/Home/iframe 1')
	private TestObject iframeViewYourFinances		= findTestObject('Page_Applicant Pages VV/Home/iframe View Your Finances')
	private TestObject iframeApplyForALicense		= findTestObject('Page_Applicant Pages VV/Home/iframe Apply For a License')
	private TestObject spanUserId					= findTestObject('Page_Applicant Pages VV/Home/span_User Id')




	@Keyword
	def clickOnApplyForALicense () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.switchToFrame(iframeApplyForALicense, 0)

		WebUI.waitForElementVisible(linkApplyForALicense, 0)

		WebUI.click(linkApplyForALicense)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def clickOnViewYourFinances () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.switchToFrame(iframeViewYourFinances, 0)

		WebUI.waitForElementVisible(linkViewYourFinances, 0)

		WebUI.click(linkViewYourFinances)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def clickOnViewYourProfile () {
		WebUI.waitForElementVisible(linkViewYourProfile, 0)

		WebUI.click(linkViewYourProfile)
	}


	@Keyword
	def clickOnViewAndPrintLicense () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.waitForElementVisible(linkViewAndPrintLicense, 0)

		WebUI.click(linkViewAndPrintLicense)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def clickOnOpenTask1 () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.waitForElementVisible(linkOpenTask1, 0)

		WebUI.click(linkOpenTask1)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def clickOnOpenTask2 () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.waitForElementVisible(linkOpenTask2, 0)

		WebUI.click(linkOpenTask2)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def clickOnOpenApplication () {
		WebUI.waitForElementVisible(iframePrincipal, 0)

		WebUI.switchToFrame(iframePrincipal, 0)

		WebUI.waitForElementVisible(linkOpenApplication, 0)

		WebUI.click(linkOpenApplication)

		WebUI.switchToDefaultContent()
	}


	@Keyword
	def verifyUserIsLogged (String expectedUserID) {
		WebUI.waitForElementVisible(spanUserId, 0)

		String currentUserId = WebUI.getText(spanUserId)

		WebUI.verifyMatch(currentUserId, expectedUserID, false, FailureHandling.CONTINUE_ON_FAILURE)
	}
}
