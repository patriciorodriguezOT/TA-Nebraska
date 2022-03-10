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


WebUI.callTestCase(findTestCase('TC for Testing/Test de prueba'), [:], FailureHandling.STOP_ON_FAILURE)

// Login with LU Staff user
CustomKeywords.'pages.Page_Login.login'(GlobalVariable.G_LM_Staff_UserName, GlobalVariable.G_LM_Staff_Pass)


