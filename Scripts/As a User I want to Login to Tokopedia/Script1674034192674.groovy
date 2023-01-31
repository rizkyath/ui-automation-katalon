import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def email = "rizky.items1@gmail.com"
def password = "notAPassword";

WebUI.openBrowser("https://tokopedia.com");

WebUI.waitForElementPresent(findTestObject('Object Repository/button-masuk-header'), 10);

WebUI.click(findTestObject('Object Repository/button-masuk-header'));

WebUI.waitForElementPresent(findTestObject('Object Repository/input-email-ph'), 10);

WebUI.setText(findTestObject('Object Repository/input-email-ph'), email);

WebUI.click(findTestObject('Object Repository/button-selanjutnya-after-input-email'));

WebUI.waitForElementPresent(findTestObject('Object Repository/input-password'), 10);

WebUI.setText(findTestObject('Object Repository/input-password'), password);

WebUI.click(findTestObject('Object Repository/button-masuk-after-input-password'));

WebUI.waitForElementPresent(findTestObject('Object Repository/div-header-authenticated'), 10);







