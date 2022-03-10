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

import internal.GlobalVariable

public class Page_Licensure_Unit_User_Registration {

	private TestObject inputFirstName 				= findTestObject('Page_Licensure Unit User Registration/input_First Name')
	private TestObject inputLastName 				= findTestObject('Page_Licensure Unit User Registration/input_Last Name')
	private TestObject inputDOB 					= findTestObject('Page_Licensure Unit User Registration/input_Date of Birth')
	private TestObject inputPlaceOfBirth 			= findTestObject('Page_Licensure Unit User Registration/input_Place of Birth')
	private TestObject selectCountry 				= findTestObject('Page_Licensure Unit User Registration/Select Country/span_Select Country-arrow')
	private TestObject selectCountry_USOpt 			= findTestObject('Page_Licensure Unit User Registration/Select Country/li_United States')
	private TestObject selectCountry_UruguayOpt		= findTestObject('Page_Licensure Unit User Registration/Select Country/span_Uruguay')
	private TestObject selectCountry_CanadaOpt		= findTestObject('Page_Licensure Unit User Registration/Select Country/li_Canada')
	private TestObject selectUSCitizen 				= findTestObject('Page_Licensure Unit User Registration/Select Are you a US Citizen/span_Select US Citizen-arrow')
	private TestObject selectUSCitizen_YesOpt 		= findTestObject('Page_Licensure Unit User Registration/Select Are you a US Citizen/li_Yes')
	private TestObject selectUSCitizen_NoOpt 		= findTestObject('Page_Licensure Unit User Registration/Select Are you a US Citizen/li_No')
	private TestObject inputZipCode					= findTestObject('Page_Licensure Unit User Registration/input_Zip Code')
	private TestObject inputAddressLine1			= findTestObject('Page_Licensure Unit User Registration/input_Address Line 1')
	private TestObject inputSSN						= findTestObject('Page_Licensure Unit User Registration/input_SSN')
	private TestObject selectDoYouHaveSSN			= findTestObject('Page_Licensure Unit User Registration/Select Do You have SSN/span_Select Do You Have SSN')
	private TestObject selectDoYouHaveSSN_YesOpt	= findTestObject('Page_Licensure Unit User Registration/Select Do You have SSN/span_YesOpt_DoYouHaveSSN')
	private TestObject selectDoYouHaveSSN_NoOpt		= findTestObject('Page_Licensure Unit User Registration/Select Do You have SSN/span_NoOpt_DoYouHaveSSN')
	private TestObject inputI94						= findTestObject('Page_Licensure Unit User Registration/input_I-94')
	private TestObject inputAlienRegistrationNum	= findTestObject('Page_Licensure Unit User Registration/input_Alien Registration Number')
	private TestObject selectPhoneNumber			= findTestObject('Page_Licensure Unit User Registration/Select Primary Phone Number/span_Select Phone Number Type-arrow')
	private TestObject selectPhoneNumberHome		= findTestObject('Page_Licensure Unit User Registration/Select Primary Phone Number/span_Home')
	private TestObject inputPhoneNumber				= findTestObject('Page_Licensure Unit User Registration/input_Primary Phone Number')
	private TestObject inputEmailAddress			= findTestObject('Page_Licensure Unit User Registration/input_Email Address')
	private TestObject inputRetypeEmailAddress		= findTestObject('Page_Licensure Unit User Registration/input_Retype Email Address')
	private TestObject buttonSubmit					= findTestObject('Page_Licensure Unit User Registration/button_Submit')
	private TestObject msgSubmittedSuccessful		= findTestObject('Page_Licensure Unit User Registration/User has been created - Message/div_Message Registration Completed Successfully')
	private TestObject buttonDialogOk				= findTestObject('Page_Licensure Unit User Registration/User has been created - Message/button_Okay_UserCreated')
	private TestObject msgRegistrationCompleted		= findTestObject('Page_Licensure Unit User Registration/h1_Message Your registration is complete')
	private TestObject selectSameAddress			= findTestObject('Page_Licensure Unit User Registration/Select Same Addresss/span_Select Item_k-icon k-i-arrow-s')
	private TestObject selectSameAddressYes			= findTestObject('Page_Licensure Unit User Registration/Select Same Addresss/li_Yes')
	private TestObject selectSameAddressNo			= findTestObject('Page_Licensure Unit User Registration/Select Same Addresss/li_No')




	@Keyword
	def completeFirstName (String FirstName) {
		WebUI.waitForElementVisible(inputFirstName, 0)

		WebUI.sendKeys(inputFirstName, FirstName)
	}

	@Keyword
	def completeLastName (String LastName) {
		WebUI.waitForElementVisible(inputLastName, 0)

		WebUI.sendKeys(inputLastName, LastName)
	}

	@Keyword
	def completeDOB (String DOB) {
		WebUI.waitForElementVisible(inputDOB, 0)

		WebUI.sendKeys(inputDOB, DOB)
	}

	@Keyword
	def completePlaceOfBirth (String PlaceOfBirth) {
		WebUI.waitForElementVisible(inputPlaceOfBirth, 0)

		WebUI.sendKeys(inputPlaceOfBirth, PlaceOfBirth)
	}

	@Keyword
	def selectCountryEEUU () {
		WebUI.waitForElementVisible(selectCountry, 0)

		WebUI.click(selectCountry)

		WebUI.click(selectCountry_USOpt)
	}


	@Keyword
	def selectCountryUruguay () {
		WebUI.waitForElementVisible(selectCountry, 0)

		WebUI.click(selectCountry)

		WebUI.click(selectCountry_UruguayOpt)
	}


	@Keyword
	def selectCountryCanada () {
		WebUI.waitForElementVisible(selectCountry, 0)

		WebUI.click(selectCountry)

		WebUI.click(selectCountry_CanadaOpt)
	}


	@Keyword
	def selectSameAddress (String sameAddress) {
		WebUI.waitForElementVisible(selectSameAddress, 0)

		WebUI.click(selectSameAddress)

		if (sameAddress == 'Yes') {
			WebUI.click(selectSameAddressYes)
		} else {
			WebUI.click(selectSameAddressNo)
		}
	}


	@Keyword
	def selectUSCitizen (String USCitizen) {
		WebUI.waitForElementVisible(selectUSCitizen, 0)

		WebUI.click(selectUSCitizen)

		if (USCitizen == 'Yes') {
			WebUI.click(selectUSCitizen_YesOpt)
		} else {
			WebUI.click(selectUSCitizen_NoOpt)
		}
	}


	@Keyword
	def selectDoYouHaveSSN (String HaveSSN) {
		WebUI.waitForElementVisible(selectDoYouHaveSSN, 0)

		WebUI.click(selectDoYouHaveSSN)

		if (HaveSSN == 'Yes') {
			WebUI.click(selectDoYouHaveSSN_YesOpt)
		} else {
			WebUI.click(selectDoYouHaveSSN_NoOpt)
		}
	}


	@Keyword
	def completeZipCode (String ZipCode) {
		WebUI.waitForElementVisible(inputZipCode, 0)

		WebUI.sendKeys(inputZipCode, ZipCode)
	}


	@Keyword
	def completeAddressLine (String AddressLine) {
		WebUI.waitForElementVisible(inputAddressLine1, 0)

		WebUI.sendKeys(inputAddressLine1, AddressLine)
	}


	@Keyword
	def completeSSN (String SSN) {
		WebUI.waitForElementVisible(inputSSN, 0)

		WebUI.sendKeys(inputSSN, SSN)
	}


	@Keyword
	def completeI94 (String I94) {
		WebUI.waitForElementVisible(inputI94, 0)

		WebUI.sendKeys(inputI94, I94)
	}


	@Keyword
	def completeAlienRegistrationNum (String AlienRegistrationNum) {
		WebUI.waitForElementVisible(inputAlienRegistrationNum, 0)

		WebUI.sendKeys(inputAlienRegistrationNum, AlienRegistrationNum)
	}


	@Keyword
	def completePrimaryPhoneNumber (String PhoneNumber) {
		WebUI.waitForElementVisible(selectPhoneNumber, 0)

		WebUI.click(selectPhoneNumber)

		WebUI.click(selectPhoneNumberHome)

		WebUI.sendKeys(inputPhoneNumber, PhoneNumber)
	}


	@Keyword
	def completeEmailAddress (String EmailAddress) {
		WebUI.waitForElementVisible(inputEmailAddress, 0)

		WebUI.sendKeys(inputEmailAddress, EmailAddress)
	}


	@Keyword
	def completeRetypeEmailAddress (String EmailAddress) {
		WebUI.waitForElementVisible(inputRetypeEmailAddress, 0)

		WebUI.sendKeys(inputRetypeEmailAddress, EmailAddress)
	}


	@Keyword
	def clickOnSubmitBtn () {
		WebUI.waitForElementVisible(buttonSubmit, 0)

		WebUI.click(buttonSubmit)
	}

	@Keyword
	def verifyRegistrationCompletedSuccessfully () {
		WebUI.waitForElementVisible(msgSubmittedSuccessful, 0)

		WebUI.verifyElementText(msgSubmittedSuccessful, 'The user account has been created, and the user has been notified of their login information via email. The record has been saved.')

		WebUI.click(buttonDialogOk)

		WebUI.waitForElementVisible(msgRegistrationCompleted, 5)

		WebUI.verifyElementText(msgRegistrationCompleted, 'Your registration is complete')
	}


	@Keyword
	def verifyRegistrationExistingUserCompletedSuccessfully () {
		WebUI.waitForElementVisible(msgSubmittedSuccessful, 0)

		WebUI.verifyElementText(msgSubmittedSuccessful, 'An existing User record has been found matching the information you have entered. An account has been created for that User Registration record and login credentials have been sent by email.')

		WebUI.click(buttonDialogOk)

		//WebUI.waitForElementVisible(msgRegistrationCompleted, 5) --> Currently it is not happening
	}


	@Keyword
	def verifyDuplicatedErrorMessage () {
		WebUI.waitForElementVisible(msgSubmittedSuccessful, 0)

		WebUI.verifyElementText(msgSubmittedSuccessful, 'An error was encountered. A record for you already exists in the system based upon one of the key identifying criteria. Please go to https://vv5qa.visualvault.com/ to sign in or use the forgot username/password link. If you need further assistance, please e-mail DHHS.LanceSupport@nebraska.gov.')

		WebUI.click(buttonDialogOk)

		WebUI.waitForElementVisible(msgRegistrationCompleted, 5)
	}


	@Keyword
	def clearFirstNameField () {
		WebUI.clearText(inputFirstName)
	}


	@Keyword
	def clearLastNameField () {
		WebUI.clearText(inputLastName)
	}


	@Keyword
	def clearDOBField () {
		WebUI.clearText(inputDOB)
	}


	@Keyword
	def clearSSNField () {
		WebUI.clearText(inputSSN)
	}


	@Keyword
	def clearI94Field () {
		WebUI.clearText(inputI94)
	}


	@Keyword
	def clearAlienRegistrationNumField () {
		WebUI.clearText(inputAlienRegistrationNum)
	}


	@Keyword
	def clearEmailField () {
		WebUI.clearText(inputEmailAddress)
	}


	@Keyword
	def clearRetypeEmailField () {
		WebUI.clearText(inputRetypeEmailAddress)
	}
}
