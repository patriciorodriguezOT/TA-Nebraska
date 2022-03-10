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
import com.kms.katalon.core.mobile.keyword.builtin.WaitForElementAttributeValueKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementVisibleKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable



public class Page_Licensure_Unit_Appeals {


	private TestObject inputAppealCode						= findTestObject('Page_Licensure Unit Appeals/input_Appeal Code')
	private TestObject buttonNext							= findTestObject('Page_Licensure Unit Appeals/button_Next')
	private TestObject inputEmail							= findTestObject('Page_Licensure Unit Appeals/input_Applicant Email')

	@Keyword
	def enterAppealCode (String appealCode) {
		WebUI.waitForElementVisible(inputAppealCode, 0)

		WebUI.sendKeys(inputAppealCode, appealCode)
	}

	@Keyword
	def clickOnNextButton () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}

	@Keyword
	def verifyEmail (String email) {
		WebUI.waitForElementVisible(inputEmail, 0)

		WebUI.verifyElementAttributeValue(inputEmail, 'value', email, 0)
	}
}
