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
import generic.generic_functions as Generic_functions

// Numbers variable
String nums = '1234567890'

// Set random appeal code variable
String randomAppealCode = Generic_functions.randomString(nums, 6)

// Open Browser
WebUI.openBrowser(GlobalVariable.G_Nebraska_Link)

// Go to Appeal form public link
WebUI.navigateToUrl(GlobalVariable.G_Appeal_Link)

// Enter incorrect appeal code
CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.clickOnSearchFilterBtn'()

// Click on Next
CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.enterSearchCriteria'()

// Shows modal with error message indicating denial code is invalid
CustomKeywords.'pages.Page_Home_Admin_Manage_Individual_IndividualsAll.clickOnSearchBtn'()

// Close Browser
//WebUI.closeBrowser()