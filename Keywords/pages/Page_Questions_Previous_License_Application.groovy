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

public class Page_Questions_Previous_License_Application {



	private TestObject dropdownYesNoQuestion				= findTestObject('Page_Licensure Unit License Application/Question/YES-NO question-arrow')
	private TestObject dropdownYesOpt						= findTestObject('Page_Licensure Unit License Application/Question/li_Yes')
	private TestObject dropdownNoOpt						= findTestObject('Page_Licensure Unit License Application/Question/li_No')
	private TestObject buttonNext							= findTestObject('Page_Licensure Unit License Application/Question/button_Next')
	private TestObject buttonConfirmAnswers					= findTestObject('Page_Licensure Unit License Application/Question/ConfirmAnswer/button_Yes, these answers are correct')
	private TestObject labelOpt1							= findTestObject('Page_Licensure Unit License Application/Question/Options/label_Opt1')
	private TestObject labelOpt2							= findTestObject('Page_Licensure Unit License Application/Question/Options/label_Opt2')
	private TestObject labelOpt3							= findTestObject('Page_Licensure Unit License Application/Question/Options/label_Opt3')



	@Keyword
	def answerYesNoQuestion (String answer) {
		WebUI.waitForElementVisible(dropdownYesNoQuestion, 0)

		if (answer == 'Yes') {
			WebUI.click(dropdownYesNoQuestion)

			WebUI.click(dropdownYesOpt)
		} else {
			WebUI.click(dropdownYesNoQuestion)

			WebUI.click(dropdownNoOpt)
		}
	}


	@Keyword
	def clickOnNextButtonm () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}


	@Keyword
	def clickOnConfirmAnswers () {
		WebUI.waitForElementVisible(buttonConfirmAnswers, 0)

		WebUI.click(buttonConfirmAnswers)
	}

	@Keyword
	def selectAnswer (String answer) {
		WebUI.waitForElementVisible(labelOpt1, 0)

		if (answer == 'Opt1') {
			WebUI.click(labelOpt1)
		} else if (answer == 'Opt2') {
			WebUI.click(labelOpt2)
		} else if (answer == 'Opt3') {
			WebUI.click(labelOpt3)
		}
	}
}
