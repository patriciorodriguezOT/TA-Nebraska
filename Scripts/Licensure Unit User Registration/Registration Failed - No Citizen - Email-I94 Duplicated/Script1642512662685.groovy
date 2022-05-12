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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import generic.generic_functions as Generic_functions



String chars = 'abcdefghijklmnopqrstuvwxyz'
String nums = '1234567890'
String DOB = Generic_functions.randomPastDate(18250, 5840)


// Set Random Variables
String titleMessage = 'Unable To Process Registration'
String bodyMessageEmailDuplicated = 'An error was encountered. There was an error during the submission of this record. Multiple records with matching emails found. Please try again or contact a system administrator if this problem continues.'
String bodyMessageI94Duplicated = 'An error was encountered. Duplicate user information present in the system. Please try again or contact a system administrator if this problem continues.'
String randomFirstName = Generic_functions.randomString(chars, 5)
String randomLastName = Generic_functions.randomString(chars, 5)
String randomI94 = Generic_functions.randomString(nums, 11)
String existingEmail = 'patricio.rodriguez+Applicantorwqw@onetree.com'
String existingI94 = '45688452096'
GlobalVariable.G_Applicant_FirstName = ('PR' + randomFirstName)
GlobalVariable.G_Applicant_LastName = ('Automation' + randomLastName)
GlobalVariable.G_Applicant_Email = (('applicantNoCitizen' + randomFirstName) + GlobalVariable.MailsacDomain)


// Open Browser
WebUI.openBrowser(GlobalVariable.G_Registration_Form)



// Enter Individual Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeFirstName'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeLastName'(GlobalVariable.G_Applicant_LastName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeDOB'(DOB)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePlaceOfBirth'(GlobalVariable.G_Applicant_PlaceOfBirth)



// Enter Mailing Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectCountryUruguay'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeAddressLine'(GlobalVariable.G_Applicant_AddressLine)



// Select Yes on dropdown "Is the Physical address the same?"
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectSameAddress'('Yes')



// Select No on US Citizen option
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectUSCitizen'('No')


// Select No on Do You Have SSN option
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectDoYouHaveSSN'('No')



// Enter Identification Information - Alien Registration Number
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeI94'(randomI94)



// Enter PhoneNumber Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePrimaryPhoneNumber'(GlobalVariable.G_Applicant_PhoneNumber)



// Enter existing Email Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeEmailAddress'(existingEmail)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeRetypeEmailAddress'(existingEmail)



// Click on Submit and complete Registration
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clickOnSubmitBtn'()


// Verify Error Message because user duplicated is displayed - In this case the duplacted error is cause because the Email
CustomKeywords.'pages.ModalDialog.verifyBody'(bodyMessageEmailDuplicated)

CustomKeywords.'pages.ModalDialog.verifyTitle'(titleMessage)

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()



// Clear I94 and Emails fields
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clearI94Field'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clearEmailField'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clearRetypeEmailField'()



// Enter random Email Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeEmailAddress'(GlobalVariable.G_Applicant_Email)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeRetypeEmailAddress'(GlobalVariable.G_Applicant_Email)





// Enter existing Identification Information - Alien Registration Number
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeI94'(existingI94)



// Click on Submit and complete Registration
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clickOnSubmitBtn'()



// Verify Error Message because user duplicated is displayed - In this case the duplacted error is cause because the Email
CustomKeywords.'pages.ModalDialog.verifyBody'(bodyMessageI94Duplicated)

CustomKeywords.'pages.ModalDialog.verifyTitle'(titleMessage)

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()



// Close Browser
WebUI.closeBrowser()

