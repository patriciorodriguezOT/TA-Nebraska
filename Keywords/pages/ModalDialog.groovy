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
import com.sun.net.httpserver.Authenticator.Failure

import internal.GlobalVariable

public class ModalDialog {

	private TestObject modalDialogTitle							= findTestObject('Modal Dialog Components/h5_ModalDialogTitleText')
	private TestObject modalDialogContent						= findTestObject('Modal Dialog Components/h5_ModalDialogBodyText')
	private TestObject modalDialogCloseButton					= findTestObject('Modal Dialog Components/button_Close')
	private TestObject modalDialogOkButton						= findTestObject('Modal Dialog Components/button_Close_Ok')
	private TestObject modalDialogOkayButton					= findTestObject('Modal Dialog Components/button_Okay')
	private TestObject inputStartDate							= findTestObject('Modal Dialog Components/input_Start Date')
	private TestObject inputEndDate								= findTestObject('Modal Dialog Components/input_End Date')
	private TestObject inputLicenseBoard						= findTestObject('Modal Dialog Components/input_License Board_fname')
	private TestObject modalDialogConfirmButton					= findTestObject('Modal Dialog Components/button_Confirm')
	private TestObject modalDialogRetrunApplicationBtn			= findTestObject('Modal Dialog Components/button_Return Application')
	private TestObject modalDialogKeepApplicationBtn			= findTestObject('Modal Dialog Components/button_Keep Application')
	private TestObject buttonMergeValue							= findTestObject('Modal Dialog Components/button_Merge Values')





	@Keyword
	def verifyTitleAndBodyText (String title, String body) {
		WebUI.waitForElementVisible(modalDialogTitle, 40)

		WebUI.verifyElementText(modalDialogTitle, title, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyElementText(modalDialogContent, body, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(modalDialogOkButton)
	}


	@Keyword
	def clickOnOkbutton () {
		WebUI.waitForElementVisible(modalDialogOkButton, 40)

		WebUI.click(modalDialogOkButton)
	}

	@Keyword
	def clickOnOkaybutton () {
		WebUI.waitForElementVisible(modalDialogOkayButton, 40)

		WebUI.click(modalDialogOkayButton)
	}

	@Keyword
	def clickOnCloseButton () {
		WebUI.waitForElementVisible(modalDialogCloseButton, 40)

		WebUI.click(modalDialogCloseButton)
	}

	@Keyword
	def clickOnConfirmbutton () {
		WebUI.waitForElementVisible(modalDialogConfirmButton, 40)

		WebUI.click(modalDialogConfirmButton)
	}

	@Keyword
	def clickOnMergeValue () {
		WebUI.waitForElementVisible(buttonMergeValue, 40)

		WebUI.click(buttonMergeValue)
	}

	@Keyword
	def enterRangeOfDate (String startDate, String endDate) {
		WebUI.waitForElementVisible(inputStartDate, 40)

		WebUI.sendKeys(inputStartDate, startDate)

		WebUI.sendKeys(inputEndDate, endDate)
	}

	@Keyword
	def enterLicenseBoard (String token1) {
		WebUI.waitForElementVisible(inputLicenseBoard, 40)

		WebUI.sendKeys(inputLicenseBoard, token1)
	}

	@Keyword
	def verifyTitle (String title) {
		WebUI.waitForElementVisible(modalDialogTitle, 40)

		WebUI.verifyElementText(modalDialogTitle, title, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def verifyBody (String body) {
		WebUI.waitForElementVisible(modalDialogContent, 40)

		WebUI.verifyElementText(modalDialogContent, body, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickOnReturnApplicationBtn () {
		WebUI.waitForElementVisible(modalDialogRetrunApplicationBtn, 40)

		WebUI.click(modalDialogRetrunApplicationBtn)
	}

	@Keyword
	def clickOnKeepApplicationBtn () {
		WebUI.waitForElementVisible(modalDialogKeepApplicationBtn, 40)

		WebUI.click(modalDialogKeepApplicationBtn)
	}

	@Keyword
	def verifyTokensNotFoundMsg () {
		WebUI.waitForElementVisible(modalDialogTitle, 40)

		if (WebUI.verifyElementNotVisible(modalDialogTitle, FailureHandling.CONTINUE_ON_FAILURE)) {
		} else {
			String title = WebUI.getText(modalDialogTitle)

			String body = WebUI.getText(modalDialogContent)

			System.out.println('\nModal Dialog Title: ' + title + '\nModal Dialog Content: ' + body + '\n')

			WebUI.click(modalDialogOkButton)
		}
	}
}

