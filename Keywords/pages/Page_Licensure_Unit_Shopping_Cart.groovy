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
import com.kms.katalon.core.webui.constants.CoreWebuiMessageConstants
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable

public class Page_Licensure_Unit_Shopping_Cart {


	private TestObject buttonRefresh						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/button_Refresh')
	private TestObject opt1FeeDescription					= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/div_Fee Description Opt1')
	private TestObject opt1FeeAmount						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/td_Fee Amount Opt1')
	private TestObject opt1TotalToPay						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/td_Total to Pay Opt1')
	private TestObject opt1FeeId							= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/div_Fee Id Opt1')
	private TestObject buttonCancelAndClose					= findTestObject('Page_Licensure Unit Shopping Cart/button_Cancel and Close')
	private TestObject dropdownPaymentType					= findTestObject('Page_Licensure Unit Shopping Cart/span_Select Payment Type')
	private TestObject optionPaymentTypeCreditCard			= findTestObject('Page_Licensure Unit Shopping Cart/li_Credit Card')
	private TestObject buttonPayOnline						= findTestObject('Page_Licensure Unit Shopping Cart/button_Pay Online')
	private TestObject inputCardFirstName					= findTestObject('Page_Licensure Unit Shopping Cart/input_Cardholder Name_FIRSTNAME')
	private TestObject inputCardLastName					= findTestObject('Page_Licensure Unit Shopping Cart/input_Cardholder Name_LASTNAME')
	private TestObject inputCardNumber						= findTestObject('Page_Licensure Unit Shopping Cart/input_Card Number_ACCT')
	private TestObject inputCardExpMonth					= findTestObject('Page_Licensure Unit Shopping Cart/input__EXPMONTH')
	private TestObject inputCardExpYear						= findTestObject('Page_Licensure Unit Shopping Cart/input__EXPYEAR')
	private TestObject inputCardSecurityCode				= findTestObject('Page_Licensure Unit Shopping Cart/input_Security Code_CSC')
	private TestObject buttonSubmit							= findTestObject('Page_Licensure Unit Shopping Cart/button_Submit')







	@Keyword
	def clickOnRefreshbutton () {
		WebUI.waitForElementVisible(buttonRefresh, 0)

		WebUI.click(buttonRefresh)
	}


	@Keyword
	def verifyOpt1OnRRC (String feeDescription, String feeAmount, String totalToPay, String feeID) {
		WebUI.waitForElementVisible(opt1FeeDescription, 0)

		String currentFeeDescription = WebUI.getText(opt1FeeDescription)

		String currentFeeAmount = WebUI.getText(opt1FeeAmount)

		String currentTotalToPay = WebUI.getText(opt1TotalToPay)

		String currentFeeId = WebUI.getText(opt1FeeId)

		WebUI.verifyMatch(currentFeeDescription, feeDescription, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentFeeAmount, feeAmount, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentTotalToPay, totalToPay, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentFeeId, feeID, false, FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Keyword
	def clickOnCancelAndClose () {
		WebUI.waitForElementClickable(buttonCancelAndClose, 20)

		WebUI.click(buttonCancelAndClose)
	}


	@Keyword
	def clickOnPayOnline () {
		WebUI.waitForElementClickable(buttonPayOnline, 20)

		WebUI.click(buttonPayOnline)
	}


	@Keyword
	def clickOnSubmitButton () {
		WebUI.waitForElementClickable(buttonSubmit, 20)

		WebUI.click(buttonSubmit)
	}


	@Keyword
	def selectPaymentType (String paymentType) {
		WebUI.waitForElementClickable(dropdownPaymentType, 20)

		WebUI.waitForElementVisible(dropdownPaymentType, 20)

		WebUI.click(dropdownPaymentType)


		switch (paymentType) {
			case "Credit Card":
				WebUI.click(optionPaymentTypeCreditCard);
				break;

			default:
				break;
		}
	}

	@Keyword
	def completeCreditCardInfo (String firstName, String lastName, String cardNumber, String cardExpMonth, String cardExpYear, String secCode) {
		WebUI.sendKeys(inputCardFirstName, firstName)

		WebUI.sendKeys(inputCardLastName, lastName)

		WebUI.sendKeys(inputCardNumber, cardNumber)

		WebUI.sendKeys(inputCardExpMonth, cardExpMonth)

		WebUI.sendKeys(inputCardExpYear, cardExpYear)

		WebUI.sendKeys(inputCardSecurityCode, secCode)
	}
}
