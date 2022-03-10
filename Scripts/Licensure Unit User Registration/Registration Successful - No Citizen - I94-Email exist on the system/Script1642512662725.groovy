import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LU Staff User/Create Individual Record - No Citizen - with I94'), [:], FailureHandling.STOP_ON_FAILURE)



// Open Browser
WebUI.openBrowser(GlobalVariable.G_Registration_Form)



// Enter Individual Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeFirstName'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeLastName'(GlobalVariable.G_Applicant_LastName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeDOB'(GlobalVariable.G_Applicant_DOB)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePlaceOfBirth'(placeOfBirth)



// Enter Mailing Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectCountryCanada'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeZipCode'(zipCode)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeAddressLine'(addressLine)



// Enter Identification Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectUSCitizen'('No')

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectDoYouHaveSSN'('No')

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeI94'(GlobalVariable.G_Applicant_I94)



// Enter PhoneNumber Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePrimaryPhoneNumber'(phoneNumber)



// Enter Email Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeEmailAddress'(GlobalVariable.G_Applicant_Email)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeRetypeEmailAddress'(GlobalVariable.G_Applicant_Email)



// Take Screenshot
WebUI.takeScreenshot(('C:\\Users\\patricior-ot\\Katalon Studio\\ScreenShots\\Screenshot' + GlobalVariable.G_Applicant_Email) + 
    '.png')



// Click on Submit and complete Registration
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clickOnSubmitBtn'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.verifyRegistrationExistingUserCompletedSuccessfully'()



// Close Browser
WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Admin User/Verify Unique Existing of User'), [:], FailureHandling.STOP_ON_FAILURE)

