package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class Page_Home_Admin_Manage_Individual_IndividualsAll {

	//Import captured object variables
	private TestObject	btnSearchFilter					= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/btnSearchFilters');
	private TestObject	dropdownSearchCriteria			= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/dropdown_search_criteria');
	private TestObject	optionSearchCriteriaFirstName	= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/option_search_criteria_firstName');
	private TestObject	dropdownSearchOperator			= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/dropdown_search_operator');
	private TestObject	optionSearchOperatorContains	= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/option_search_op_contains');
	private	TestObject	textboxSearch					= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/textbox_search');
	private TestObject	btnSearch						= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/btnSearch');
	private TestObject	checkboxIndividualRecord		= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/checkbox_individual_record');
	private TestObject openLinkOpt1						= findTestObject('Page_Home_Admin_VisualVault/Manage_Section/Individual/IndividualsAll/a_Open Link Opt1')

	@Keyword
	def clickOnSearchFilterBtn () {
		System.sleep(5000)

		WebUI.waitForElementVisible(btnSearchFilter, 20);

		WebUI.click(btnSearchFilter);
	}

	@Keyword
	def enterSearchCriteria (String searchCriteriaValue) {

		//Select criteria type
		WebUI.waitForElementVisible(dropdownSearchCriteria, 20);
		WebUI.click(dropdownSearchCriteria);
		WebUI.click(optionSearchCriteriaFirstName);

		//Select operator
		WebUI.waitForElementVisible(dropdownSearchOperator, 20);
		WebUI.click(dropdownSearchOperator);
		WebUI.click(optionSearchOperatorContains);

		//Input search value
		WebUI.waitForElementVisible(textboxSearch, 20);
		WebUI.sendKeys(textboxSearch, searchCriteriaValue);
	}

	@Keyword
	def clickOnSearchBtn () {
		WebUI.waitForElementVisible(btnSearch, 20);
		WebUI.click(btnSearch);
	}

	@Keyword
	def verifyIndividualRecordCreated () {
		WebUI.waitForElementVisible(checkboxIndividualRecord, 20)
		WebUI.verifyElementPresent(checkboxIndividualRecord, 20)
	}


	@Keyword
	def clickOnOpenLink () {
		WebUI.waitForElementVisible(openLinkOpt1, 20)

		WebUI.click(openLinkOpt1)
	}
}