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

public class Page_License_Information {


	private TestObject dropdownProfessionalLicense			= findTestObject('Page_Licensure Unit License Application/License Type/span_Professioanl License')
	private TestObject dropdownPhysicalTherapyOpt			= findTestObject('Page_Licensure Unit License Application/License Type/li_Physical Therapy')
	private TestObject dropdownProfessionalLicenseType		= findTestObject('Page_Licensure Unit License Application/License Type/span_Professioanl License Type')
	private TestObject dropdownPhysicalTherapistOpt			= findTestObject('Page_Licensure Unit License Application/License Type/License Type for Physical Therapy/li_Physical Therapist')
	private TestObject buttonNext							= findTestObject('Page_Licensure Unit License Application/License Type/button_Next')

	@Keyword
	def selectPhisicalTherapyProfessionalLicense () {
		WebUI.waitForElementVisible(dropdownProfessionalLicense, 0)

		WebUI.click(dropdownProfessionalLicense)

		WebUI.click(dropdownPhysicalTherapyOpt)
	}


	@Keyword
	def selectPhisicalTherapistProfessionalLicenseType () {
		WebUI.waitForElementVisible(dropdownProfessionalLicenseType, 0)

		WebUI.click(dropdownProfessionalLicenseType)

		WebUI.click(dropdownPhysicalTherapistOpt)
	}


	@Keyword
	def clickOnNextButton () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}
}