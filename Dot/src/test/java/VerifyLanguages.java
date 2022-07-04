import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import classes.Base;
import pageObjectModel.HomePagePOM;

public class VerifyLanguages extends Base {
	private Logger log = LogManager.getLogger(VerifyLanguages.class.getName());
	SoftAssert softAssertion = new SoftAssert();
	HomePagePOM homepom;
	int statusCode = 200;

	@Test(dataProvider = "English")
	public void verifyLanguageIsEnglishAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.getEnglishLink().getAttribute("href");
		String langtext = homepom.getEnglishBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed English Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Russian")
	public void verifyLanguageIsRussianAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.russiaLink().getAttribute("href");
		String langtext = homepom.russiaBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Russian Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Spanish")
	public void verifyLanguageIsSpanishAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.spanishLink().getAttribute("href");
		String langtext = homepom.spanishBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Spanish Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Italian")
	public void verifyLanguageIsItalianAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.italianLink().getAttribute("href");
		String langtext = homepom.italianBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Italian Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Portugal")
	public void verifyLanguageIsPortugalAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.portugeseLink().getAttribute("href");
		String langtext = homepom.portugeseBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Portugal Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Japanese")
	public void verifyLanguageIsJapaneseAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.japaneseLink().getAttribute("href");
		String langtext = homepom.japaneseBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Japanese Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Deutsch")
	public void verifyLanguageIsDeutschAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.deutshLink().getAttribute("href");
		String langtext = homepom.deutshBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Deutsch Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "French")
	public void verifyLanguageIsFrenchAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.frenchLink().getAttribute("href");
		String langtext = homepom.frenchBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed French Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Chinese")
	public void verifyLanguageIsChineseAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.chineseLink().getAttribute("href");
		String langtext = homepom.chineseBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Chinese Language is Present and Hyperlink not broken");

	}

	@Test(dataProvider = "Poland")
	public void verifyLanguageIsPolandAndConnection(String lang) throws MalformedURLException, IOException {
		homepom = new HomePagePOM(driver);
		String url = homepom.polandLink().getAttribute("href");
		String langtext = homepom.polandBtn().getText();
		softAssertion.assertEquals(langtext, lang);
		softAssertion.assertEquals(checkConnection(url), statusCode);
		softAssertion.assertAll();
		log.info("Successfull confirmed Poland Language is Present and Hyperlink not broken");

	}

	@DataProvider(name = "English")
	public Object[][] getLanguage1() {
		Object[][] data = new Object[1][1];
		data[0][0] = "English";
		return data;
	}

	@DataProvider(name = "Russian")
	public Object[][] getLanguage2() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Русский";
		return data;
	}

	@DataProvider(name = "Spanish")
	public Object[][] getLanguage3() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Español";
		return data;
	}

	@DataProvider(name = "Italian")
	public Object[][] getLanguage4() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Italiano";
		return data;
	}

	@DataProvider(name = "Portugal")
	public Object[][] getLanguage5() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Português";
		return data;
	}

	@DataProvider(name = "Japanese")
	public Object[][] getLanguage6() {
		Object[][] data = new Object[1][1];
		data[0][0] = "日本語";
		return data;
	}

	@DataProvider(name = "Deutsch")
	public Object[][] getLanguage7() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Deutsch";
		return data;
	}

	@DataProvider(name = "French")
	public Object[][] getLanguage8() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Français";
		return data;
	}

	@DataProvider(name = "Chinese")
	public Object[][] getLanguage9() {
		Object[][] data = new Object[1][1];
		data[0][0] = "中文";
		return data;
	}

	@DataProvider(name = "Poland")
	public Object[][] getLanguage10() {
		Object[][] data = new Object[1][1];
		data[0][0] = "Polski";
		return data;
	}
}
