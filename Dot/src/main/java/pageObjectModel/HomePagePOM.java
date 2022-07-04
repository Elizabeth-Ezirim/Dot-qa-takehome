package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePagePOM {
	
	private WebDriver driver;
	private By englishBtn = By.xpath("//strong[contains(text(),'English')]");
	private By englishLink = By.cssSelector("#js-link-box-en");
	private By russiaBtn = By.xpath("//strong[contains(text(),'Русский')]");
	private By russiaLink = By.cssSelector("#js-link-box-ru");
	private By spanishBtn = By.xpath("//strong[contains(text(),'Español')]");
	private By spanishLink = By.cssSelector("#js-link-box-es");
	private By italianBtn = By.xpath("//strong[contains(text(),'Italiano')]");
	private By italianLink = By.cssSelector("#js-link-box-it");
	private By portugeseBtn = By.xpath("//strong[contains(text(),'Português')]");
	private By portugeseLink = By.cssSelector("#js-link-box-pt");
	
	private By japaneseBtn = By.xpath("//strong[contains(text(),'日本語')]");
	private By japaneseLink = By.cssSelector("#js-link-box-ja");
	private By deutshBtn = By.xpath("//strong[contains(text(),'Deutsch')]");
	private By deutshLink = By.cssSelector("#js-link-box-de");
	private By frenchBtn = By.xpath("//strong[contains(text(),'Français')]");
	private By frenchLink = By.cssSelector("#js-link-box-fr");
	private By chineseBtn = By.xpath("//strong[contains(text(),'中文')]");
	private By chineseLink = By.cssSelector("#js-link-box-zh");
	
	private By polandBtn = By.xpath("//strong[contains(text(),'Polski')]");
	private By polandLink = By.cssSelector("#js-link-box-pl");
	
	public HomePagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEnglishBtn() {
		return driver.findElement(englishBtn);
	}
	
	public WebElement getEnglishLink() {
		return driver.findElement(englishLink);
	}
	
	public WebElement russiaBtn() {
		return driver.findElement(russiaBtn);
	}
	
	public WebElement russiaLink() {
		return driver.findElement(russiaLink);
	}
	public WebElement spanishBtn() {
		return driver.findElement(spanishBtn);
	}
	
	public WebElement spanishLink() {
		return driver.findElement(spanishLink);
	}
	public WebElement italianBtn() {
		return driver.findElement(italianBtn);
	}
	
	public WebElement italianLink() {
		return driver.findElement(italianLink);
	}
	
	public WebElement portugeseBtn() {
		return driver.findElement(portugeseBtn);
	}
	
	public WebElement portugeseLink() {
		return driver.findElement(portugeseLink);
	}
	public WebElement japaneseBtn() {
		return driver.findElement(japaneseBtn);
	}	
	public WebElement japaneseLink() {
		return driver.findElement(japaneseLink);
	}
	
	public WebElement deutshBtn() {
		return driver.findElement(deutshBtn);
	}
	
	public WebElement deutshLink() {
		return driver.findElement(deutshLink);
	}
	public WebElement frenchBtn() {
		return driver.findElement(frenchBtn);
	}
	
	public WebElement frenchLink() {
		return driver.findElement(frenchLink);
	}
	
	public WebElement chineseBtn() {
		return driver.findElement(chineseBtn);
	}
	
	public WebElement chineseLink() {
		return driver.findElement(chineseLink);
	}
	
	public WebElement polandBtn() {
		return driver.findElement(polandBtn);
	}
	public WebElement polandLink() {
		return driver.findElement(polandLink);
	}	
		
}
