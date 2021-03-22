package com.mindmjx.keywords

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

/*public class MyonwKeywords {
	
	
	Mycredentials = def LoginToFaceBook(String username, String password){
		
		WebUI.commet
	}
	*/
@Keyword
def browserinit(){
	WebUI.openBrowser("www.mindmajix.com")
	WebUI.maximizeWindow()	
	WebUI.navigateToUrl("www.blazedemo.com")
			
	}


@Keyword
def browserexit(){
	
	WebUI.deleteAllCookies()
	WebUI.closeBrowser()
	
	}

 @Keyword
def browsernavigation(){
	WebUI.back()
	WebUI.forward()
	WebUI.refresh()
	
	}
	
@Keyword
def browserResize(){
	WebUI.setViewPortSize(724, 561)
	WebUI.delay(3)
	WebUI.setViewPortSize(800, 400)
	}

