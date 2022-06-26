import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.advantageonlineshopping.com/#/")
selenium.click("id=menuUser")
selenium.click("link=CREATE NEW ACCOUNT")
selenium.click("xpath=//div[@id='formCover']/div/div/sec-view/div")
selenium.click("name=usernameRegisterPage")
selenium.type("name=usernameRegisterPage", "Jhon23")
selenium.type("name=emailRegisterPage", "Jhon")
selenium.type("name=passwordRegisterPage", "123Jhon")
selenium.type("name=confirm_passwordRegisterPage", "123Jhon")
selenium.click("name=emailRegisterPage")
selenium.type("name=emailRegisterPage", ("Jhon@gmail.com").toString())
selenium.click("id=formCover")
selenium.click("name=phone_numberRegisterPage")
selenium.type("name=phone_numberRegisterPage", "345432345")
selenium.click("id=formCover")
selenium.click("name=countryListboxRegisterPage")
selenium.select("name=countryListboxRegisterPage", "label=Argentina")
selenium.click("xpath=//div[@id='formCover']/div[3]/div/sec-view[2]/div/label")
selenium.type("name=cityRegisterPage", ("Buenos Aires").toString())
selenium.click("name=addressRegisterPage")
selenium.type("name=addressRegisterPage", ("calle 23 45 6").toString())
selenium.click("name=i_agree")
selenium.click("id=register_btnundefined")
selenium.click("xpath=//a[@id='menuUserLink']/span")
selenium.click("xpath=//div[@id='loginMiniTitle']/label")
selenium.click("link=Edit")
selenium.click("name=first_nameAccountDetails")
selenium.type("name=first_nameAccountDetails", "Jhon")
selenium.type("name=last_nameAccountDetails", "Martinez")
selenium.click("xpath=//div[@id='form']/div[2]/div[2]/sec-view[2]/div/label")
selenium.type("name=postal_codeAccountDetails", "5432345")
selenium.click("id=save_btnundefined")
selenium.click("link=HOME")
selenium.click("id=tabletsImg")
selenium.click("id=16")
selenium.click("xpath=//div[@id='productProperties']/div/div/span[2]")
selenium.click("xpath=//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")
selenium.click("name=save_to_cart")
selenium.click("id=menuCart")
selenium.click("id=checkOutButton")
selenium.click("id=next_btn")
selenium.click("name=masterCredit")
selenium.click("id=creditCard")
selenium.type("id=creditCard", ("4543 2234 5543").toString())
selenium.click("xpath=//div[@id='paymentMethod']/div/div[4]/sec-form/div/sec-view[2]/div/label")
selenium.type("name=cvv_number", "454")
selenium.click("name=mmListbox")
selenium.select("name=mmListbox", "label=04")
selenium.click("name=yyyyListbox")
selenium.select("name=yyyyListbox", "label=2026")
selenium.click("xpath=//div[@id='paymentMethod']/div/div[4]/sec-form/div[2]/sec-view/div/label")
selenium.type("name=cardholder_name", ("Jhon M").toString())
selenium.click("xpath=//div[@id='paymentMethod']/div/div[4]/sec-form/div/sec-view[2]")
selenium.click("id=pay_now_btn_ManualPayment")
selenium.click("id=pay_now_btn_ManualPayment")
selenium.click("xpath=//a[@id='menuUserLink']/span")
selenium.click("xpath=//div[@id='loginMiniTitle']/label[2]")
