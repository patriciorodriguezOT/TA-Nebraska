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

// Verify Parents TC have not failed ---
// Set TCs dependency
String[] parentsTC = ['Test Cases/Licensure Unit License Application/Deny License Application']
// Verify any TC dependency has failed
CustomKeywords.'tc_listener.tcl.checkErrors'(parentsTC)

// Go to Appeal Public Link
WebUI.openBrowser(GlobalVariable.G_Appeal_Link)

// Enter Appeal Code and click Next
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterAppealCode'(GlobalVariable.G_Appeal_Code)
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.clickOnNextBtn'()

// Dismiss appeal info modal
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.clicOnCloseModalBtn'()

// Update address info
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterUpdatedPhone'('3333333333') 		// Update phone number
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterUpdatedAddressL1'('PO BOX 5') 	// Update address line 1
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterUpdatedAddressL2'('1234 Street') // Update address line 2
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterUpdatedAddressL2'('5678 Street') // Update address line 3
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterUpdatedAddressL2'('81611') 		// Update zip code (Aspen,CO)

// Enter appeal reason
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.enterAppealReason'('Because I can')

//Upload file to attach MISSING

// Click on submit appeal
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.clicOnAppealSubmitBtn'()

// Verify appeal was submitted
CustomKeywords.'pages.Page_Licensure_Unit_Appeals.verifyAppealSubmitted'()

// Close Browser
WebUI.closeBrowser()