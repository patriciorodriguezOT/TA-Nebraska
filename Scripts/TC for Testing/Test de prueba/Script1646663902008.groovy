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
import com.kms.katalon.core.testobject.ResponseObject
import java.util.Calendar as Calendar
import com.kms.katalon.core.util.KeywordUtil
import gmail_Connection.getEmailContent as getEmailContent
import ws.GetLicenseLookup as GetLicenseLookup
import ws.GetLicenseDetails as GetLicenseDetails
import ws.GetLicenseDetailsStatus as GetLicenseDetailsStatus
import ws.GetToken as GetToken



int currentTab
String licenseName = 'Physical+Therapist'
GetToken getTokenReq = new GetToken()



GlobalVariable.G_Applicant_FirstName = 'PRarcnd'							//In case that FirstName has not been set
GlobalVariable.G_Applicant_LastName = 'Automationqjkux' 					//In case that FirstName has not been set
GlobalVariable.G_Applicant_Email = 'pruebas.onetree+Applicantarcnd@gmail.com'



// Verify License Details Status was created correctly
ResponseObject getTokenResp = getTokenReq.getToken1()

CustomKeywords.'api_Connection.TokenResp.getToken'(getTokenResp)

if(getTokenReq.getStatusCode(getTokenResp) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(getTokenResp))
}



// Get Object for License Detail
GetLicenseDetails getLicenseDetailsReq = new GetLicenseDetails()

ResponseObject getLicenseDetailsResp = getLicenseDetailsReq.getLicenseDetailsByApplicantFirstName(GlobalVariable.G_Applicant_FirstName)

if(getLicenseDetailsReq.getStatusCode(getLicenseDetailsResp) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(getLicenseDetailsResp))
}



// Get issue date from License Detail form
String issueDate = CustomKeywords.'api_Connection.LicenseDetailsResp.getIssueDate'(getLicenseDetailsResp)



// Get License Lookup Information
GetLicenseLookup getLicenseLookupReq = new GetLicenseLookup()

ResponseObject getLicenseLookupResp = getLicenseLookupReq.getLicenseLookupByLicenseName(licenseName)

if(getLicenseDetailsReq.getStatusCode(getLicenseLookupResp) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(getLicenseLookupResp))
}

System.out.println(getLicenseLookupReq.getResponseText(getLicenseLookupResp))

// Calculate expiration date based on the issue date of the License Details and License Lookup information
String expirationDate = CustomKeywords.'api_Connection.LicenseLookupResp.calculateExpirationDate'(getLicenseLookupResp, issueDate)



// Verify Information of the License Detail created
CustomKeywords.'api_Connection.LicenseDetailsResp.verifyIssueDate'(getLicenseDetailsResp)

CustomKeywords.'api_Connection.LicenseDetailsResp.verifyEffectiveDate'(getLicenseDetailsResp)

CustomKeywords.'api_Connection.LicenseDetailsResp.verifyExpirationDate'(getLicenseDetailsResp, expirationDate)

// Get License ID from License Details Resp
String licenseId = CustomKeywords.'api_Connection.LicenseDetailsResp.getLicenseId'(getLicenseDetailsResp)



// Look for License Detail Status by License Id
GetLicenseDetailsStatus getLicenseDetailsStatusReq = new GetLicenseDetailsStatus()

ResponseObject getLicenseDetailsStatusResp = getLicenseDetailsStatusReq.getLicenseDetailsStatusByLicenseId(licenseId)

// Verify License Details Status information
CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyOriginalEffectivetDate'(getLicenseDetailsStatusResp, issueDate)

CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyOriginalExpirationDate'(getLicenseDetailsStatusResp, expirationDate)

CustomKeywords.'api_Connection.LicenseDetailsStatusResp.verifyStatusReason'(getLicenseDetailsStatusResp, 'License Issued')






