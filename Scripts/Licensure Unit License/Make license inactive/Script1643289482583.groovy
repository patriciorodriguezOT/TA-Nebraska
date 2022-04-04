import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.logging.Handler
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
import com.kms.katalon.core.testobject.ResponseObject


// Verify Parents TC have not failed ---
// Set TCs dependency
String[] parentsTC = ['Test Cases/Licensure Unit License Application/Issue License']
// Verify any TC dependency has failed
CustomKeywords.'tc_listener.tcl.checkErrors'(parentsTC)



GenericFunctions genericFunctions = new GenericFunctions()
GetToken getTokenReq = new GetToken()
int currentTab
String licenseType = 'Physical Therapist'
String startDate
String endDate
String alertTextExpected = 'The License has been set to Inactive and the License Details Status record has been created.'
String alertText
String expectedLicenseStatus = 'Inactive'



// Go to Login Page
WebUI.openBrowser(GlobalVariable.G_Nebraska_Link)

// Login with LU Staff user
CustomKeywords.'pages.Page_Login.login'(GlobalVariable.G_Admin_Username, GlobalVariable.G_Admin_Pass)


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
currentTab = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentTab + 1)



// Verify License Information
CustomKeywords.'pages.Page_Licensure_Unit_License.verifyLicenseInformation'(GlobalVariable.G_Applicant_FirstName, GlobalVariable.G_Applicant_LastName, licenseType)

// Get License Id form the form
String licenseId = CustomKeywords.'pages.Page_Licensure_Unit_License.obtainLicenseId'()

System.out.println('\nLicense Id: ' + licenseId + '\n')

// Go to Manage tab
CustomKeywords.'pages.Page_Licensure_Unit_License.clickOnManageTab'()

// Click on Make License Inactive button
CustomKeywords.'pages.Page_Licensure_Unit_License.clickOnMakeLicenseInactive'()



// Set start date(today) and end date from generic functions
startDate = genericFunctions.getTodayDate()

endDate = genericFunctions.getTodayDatePlusDays(5)

// Enter range of dates that License will be inactive
CustomKeywords.'pages.ModalDialog.enterRangeOfDate'(startDate, endDate)

// Click on Confirm button of Modal Dialog
CustomKeywords.'pages.ModalDialog.clickOnConfirmbutton'()

// Verify Alert Text and Click on accept button
WebUI.waitForAlert(30)

alertText = WebUI.getAlertText()

//Verify text alert is correct or not
WebUI.verifyMatch(alertText, alertTextExpected, true, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.acceptAlert()



// Verify License Status 
CustomKeywords.'pages.Page_Licensure_Unit_License.verifyStatus'(expectedLicenseStatus)



// Get token to Api connection and assign it to the Global Variable
ResponseObject getTokenResp = getTokenReq.getToken1()

CustomKeywords.'api_Connection.TokenResp.getToken'(getTokenResp)



// Request License Details Status using the License Id obtained
GetLicenseDetailsStatus getLicenseDetailsStatusReq = new GetLicenseDetailsStatus()

ResponseObject getLicenseDetailsStatuspResp = getLicenseDetailsStatusReq.getLicenseDetailsStatusByLicenseId(licenseId)

CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyEffectivetDate'(getLicenseDetailsStatuspResp, startDate)

CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyExpirationDate'(getLicenseDetailsStatuspResp, endDate)

CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyStatus'(getLicenseDetailsStatuspResp, expectedLicenseStatus)

WebUI.closeBrowser()




