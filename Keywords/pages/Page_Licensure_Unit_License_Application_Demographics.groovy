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

public class Page_Licensure_Unit_License_Application_Demographics {


	private TestObject checkboxExperience				= findTestObject('Page_Licensure Unit License Application/Demographics/input_Experience Check-box')
	private TestObject inputAKA							= findTestObject('Page_Licensure Unit License Application/Demographics/input_AKA')
	private TestObject selectSameAddress				= findTestObject('Page_Licensure Unit License Application/Demographics/span_Is the Physical address the same_arrow')
	private TestObject selectSameAddressYesOpt			= findTestObject('Page_Licensure Unit License Application/Demographics/li_Yes_Same Address')
	private TestObject selectSameAddressNoOpt			= findTestObject('Page_Licensure Unit License Application/Demographics/li_No Same Address')
	private TestObject inputPlaceOfBirth				= findTestObject('Page_Licensure Unit License Application/Demographics/input_Place of Birth')
	private TestObject selectSpouseOfUSAF				= findTestObject('Page_Licensure Unit License Application/Demographics/span_Select Spouse of member USAF')
	private TestObject selectSpouseOfUSAFYesOpt			= findTestObject('Page_Licensure Unit License Application/Demographics/li_Yes spouse USAF')
	private TestObject selectSpouseOfUSAFNoOpt			= findTestObject('Page_Licensure Unit License Application/Demographics/li_No spouse USAF')
	private TestObject selectProvisionalLicense			= findTestObject('Page_Licensure Unit License Application/Demographics/span_dropdown Applicant Want Provisional License')
	private TestObject selectProvisionalLicenseYesOpt	= findTestObject('Page_Licensure Unit License Application/Demographics/li_Applicant Want Provisional License_Yes')
	private TestObject selectProvisionalLicenseNoOpt	= findTestObject('Page_Licensure Unit License Application/Demographics/li_Applicant Want Provisional License_No')
	private TestObject buttonNext						= findTestObject('Page_Licensure Unit License Application/Demographics/button_Next')




	@Keyword
	def checkCheckboxExperience () {
		WebUI.waitForElementVisible(checkboxExperience, 0)

		WebUI.check(checkboxExperience)
	}


	@Keyword
	def enterAKA (String aka) {
		WebUI.waitForElementVisible(inputAKA, 0)

		WebUI.sendKeys(inputAKA, aka)
	}


	@Keyword
	def selectSameAddres (String sameAddress) {
		if (sameAddress == 'Yes') {
			WebUI.waitForElementVisible(selectSameAddress, 0)

			WebUI.click(selectSameAddress)

			WebUI.click(selectSameAddressYesOpt)
		} else {
			WebUI.waitForElementVisible(selectSameAddress, 0)

			WebUI.click(selectSameAddress)

			WebUI.click(selectSameAddressNoOpt)
		}
	}


	@Keyword
	def verifyPlaceOfBirth (String placeOfBirth) {
		WebUI.waitForElementVisible(inputPlaceOfBirth, 0)

		WebUI.verifyElementAttributeValue(inputPlaceOfBirth, 'value', placeOfBirth, 0)
	}


	@Keyword
	def selectSpouseMemberUSAF (String answer) {
		if (answer == 'Yes') {
			WebUI.waitForElementVisible(selectSpouseOfUSAF, 0)

			WebUI.click(selectSpouseOfUSAF)

			WebUI.click(selectSpouseOfUSAFYesOpt)
		} else {
			WebUI.waitForElementVisible(selectSpouseOfUSAF, 0)

			WebUI.click(selectSpouseOfUSAF)

			WebUI.click(selectSpouseOfUSAFNoOpt)
		}
	}


	@Keyword
	def selectProvisionalLicense (String answer) {
		if (answer == 'Yes') {
			WebUI.waitForElementVisible(selectProvisionalLicense, 0)

			WebUI.click(selectProvisionalLicense)

			WebUI.click(selectProvisionalLicenseYesOpt)
		} else {
			WebUI.waitForElementVisible(selectProvisionalLicense, 0)

			WebUI.click(selectProvisionalLicense)

			WebUI.click(selectProvisionalLicenseNoOpt)
		}
	}

	@Keyword
	def clickOnNextButton () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}
}
