import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def email = 'rizkyathallah@rocketmail.com';
def password = 'notAPassword';

WebUI.openBrowser('web.facebook.com');

WebUI.waitForElementPresent(findTestObject('Object Repository/Facebook/input-email'), 10);

WebUI.setText(findTestObject('Object Repository/Facebook/input-email'), email);

WebUI.setText(findTestObject('Object Repository/Facebook/input-password'), password);

WebUI.click(findTestObject('Object Repository/Facebook/button-masuk'));
