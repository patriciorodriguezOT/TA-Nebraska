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

public class Page_Home_Admin {

	private TestObject tabApplicationsInProcess			= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Home_Tabs/span_Applications In Process')
	private TestObject tabApprovedApplications			= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Home_Tabs/span_Approved Applications')
	private TestObject tabLicenseDetails				= findTestObject('Page_Home_Admin_VisualVault/Home_Section/Home_Tabs/span_License Details')
	private TestObject individualLink					= findTestObject('Page_Home_Admin_VisualVault/Home_Section/a_Individual Link')



	@Keyword
	def clickOnApplicationsInProcess () {
		WebUI.waitForElementVisible(tabApplicationsInProcess, 0)

		WebUI.click(tabApplicationsInProcess)
	}


	@Keyword
	def clickOnApprovedApplications () {
		WebUI.waitForElementVisible(tabApprovedApplications, 0)

		WebUI.click(tabApprovedApplications)
	}


	@Keyword
	def clickOnLicenseDetails () {
		WebUI.waitForElementVisible(tabLicenseDetails, 0)

		WebUI.click(tabLicenseDetails)
	}


	@Keyword
	def clickOnIndividualLink () {
		WebUI.waitForElementVisible(individualLink, 0)

		WebUI.click(individualLink)
	}
}
