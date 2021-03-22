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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//CustomKeywords.'com.mindmjx.keywords.MyonwKeywords.browsernavigation'()
WebUI.openBrowser('www.instagram.com')

TestVeriable = WebUI.verifyElementClickable(findTestObject('Instagram_OR/SignUP'))

if (TestVeriable == false) {
    // if clickable then 
    WebUI.setText(findTestObject('Instagram_OR/UserName'), 'Myabdul')

    WebUI.setEncryptedText(findTestObject('Instagram_OR/Password'), '+YBPRF8ijAM=')

    WebUI.comment('not clickble')
} else {
WebUI.click(findTestObject('Instagram_OR/SignUP'))
}



