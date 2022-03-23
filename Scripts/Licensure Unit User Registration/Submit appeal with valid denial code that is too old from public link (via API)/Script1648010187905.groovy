import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.sun.net.httpserver.Authenticator.Failure
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import ws.GetToken as GetToken

import ws.GetDenialEventRecord as GetDenialEventRecord
import ws.PostDenialEventRecord as PostDenialEventRecord

// Verify Denial Event Record Status was created correctly
GetToken getTokenReq = new GetToken()

ResponseObject getTokenResp = getTokenReq.getToken1()

CustomKeywords.'api_Connection.TokenResp.getToken'(getTokenResp)

if(getTokenReq.getStatusCode(getTokenResp) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(getTokenResp))
}

// Get Object for Denial Event Record that matches Appeal Denial Code saved as variable
GetDenialEventRecord getDenialEventRecordReq = new GetDenialEventRecord()

ResponseObject getDenialEventRecordRes = getDenialEventRecordReq.getDenialEventRecordByDenialCode('229795')

if(getDenialEventRecordReq.getStatusCode(getDenialEventRecordRes) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(getDenialEventRecordRes))
}

// Get Revision ID from Denial Event Record Res
GlobalVariable.G_DenialEvent_RevisionId = CustomKeywords.'api_Connection.DenialEventRecordRes.getDenialEventRecordRevisionId'(getDenialEventRecordRes)

// Post new Denial Event date of Denial for License Application Record
PostDenialEventRecord postDenialEventRecordReq = new PostDenialEventRecord()

ResponseObject postDenialEventRecordRes = postDenialEventRecordReq.postNewDenialDate('2022-03-18T00:33:50Z')

if(getDenialEventRecordReq.getStatusCode(postDenialEventRecordRes) != 200) {
	KeywordUtil.markFailed("Status code is not 200 as expected. It is "	+ GetToken.getStatusCode(postDenialEventRecordRes))
}

// Get denial date from Denial Event Record Res
String newDenialDate = CustomKeywords.'api_Connection.DenialEventRecordRes.getDenialEventRecordDenialDate'(getDenialEventRecordRes)
println newDenialDate

// Open appeal form

// Enter appeal code

// Click next

// Handle error msj/display form