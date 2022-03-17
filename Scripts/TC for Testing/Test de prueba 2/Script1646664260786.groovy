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
import ws.GetToken as GetToken
import generic.generic_functions as GenericFunctions
import ws.GetLicenseDetailsStatus as GetLicenseDetailsStatus
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import java.util.Calendar as Calendar
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import gmail_Connection.getEmailContent as getEmailContent

GlobalVariable.G_Applicant_Email = 'pruebas.onetree+Applicantikbvo@gmail.com'
GlobalVariable.G_Applicant_FirstName = 'PRikbvo'
GlobalVariable.G_Applicant_LastName = 'Automationuqmfa'

// Set variables
String licenseType = 'Physical Therapist'
String licenseStatus = 'On Hold'
String modalDialogTitle = 'On Hold Information3'


// Go to Login Page
WebUI.openBrowser(GlobalVariable.G_Nebraska_Link)

// Login with LU Staff user
CustomKeywords.'pages.Page_Login.login'(GlobalVariable.G_LM_Staff_UserName, GlobalVariable.G_LM_Staff_Pass)


// Go to Applications in Progress
CustomKeywords.'pages.Page_Home_Admin.clickOnLicenseDetails'()

// Search Applicant by First Name
CustomKeywords.'pages.Page_Home_Admin_LicenseDetails.clickOnMainSearchButton'()

CustomKeywords.'pages.Page_Home_Admin_LicenseDetails.selectFirstNameForSearch'()

CustomKeywords.'pages.Page_Home_Admin_LicenseDetails.enterSearchCriteria'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Home_Admin_LicenseDetails.clickOnSearchButton'()

// Click on Review Link on the License Application
CustomKeywords.'pages.Page_Home_Admin_LicenseDetails.clickOnOpenLink'()



// Move to Next Window
int currentTab = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentTab + 1)



//




WebUI.waitForPageLoad(50)

System.sleep(5000)



// Verify Title of Modal Dialog is "Hold Message"
CustomKeywords.'pages.ModalDialog.verifyTitle'(modalDialogTitle)

CustomKeywords.'pages.ModalDialog.clickOnOkbutton'()



// Close License Form
CustomKeywords.'pages.Page_Licensure_Unit_License.clickOnCancelAndContinueButton'()

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()

WebUI.switchToWindowIndex(currentTab)

System.sleep(5000)



// Go to Individuals All section and Look for the License Details Owner
WebUI.navigateToUrl(GlobalVariable.G_IndividualsAll_Link)

CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.clickOnSearchFilterBtn'()

CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.enterSearchCriteria'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.clickOnSearchBtn'()

CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.clickOnOpenLink'()

WebUI.switchToWindowIndex(currentTab + 1)



// Verify Title of Modal Dialog is "Hold Message"
CustomKeywords.'pages.ModalDialog.verifyTitle'(modalDialogTitle)

CustomKeywords.'pages.ModalDialog.clickOnOkbutton'()



// Close Individual Record form
CustomKeywords.'pages.Page_Licensure_Unit_Individual_Record.clickOnCancelAndCloseBtn'()

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()




System.sleep(2000)



