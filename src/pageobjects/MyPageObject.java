package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="TalkTalk"
     )             
public class MyPageObject {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Cases']")
	public WebElement cases;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='00001087']")
	public WebElement CASES_CASE_NUMBER;
	@LinkType()
	@FindBy(xpath = "//div[11]//a[normalize-space(.)='New']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea")
	public WebElement body;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input")
	public WebElement published;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement saveButton;
	@LinkType()
	@FindBy(xpath = "//div[11]//a[normalize-space(.)='New']")
	public WebElement New1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') an contains(@class,'oneContent')]//a[normalize-space(.)='Show actions for Case Comments']")
	public WebElement CaseComments;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Case Comments(0)']")
	public WebElement CaseComments1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Show actions for Case Comments']/lightning-primitive-icon")
	public WebElement CaseComments2;
	@LinkType()
	@FindBy(xpath = "//div[11]//a[normalize-space(.)='New']")
	public WebElement New11;
	@ButtonType(file = true)
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Upload Files']")
	public WebElement fileInput;
	@ButtonType(file = true)
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Upload Files']")
	public WebElement fileInput1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Show more actions']")
	public WebElement trigger;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-case_-record_-page___-case___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_case_record_page_case__view_js').shadowRoot.querySelector('lst-related-list-container').shadowRoot.querySelectorAll('lst-related-list-single-container')[4].shadowRoot.querySelector('lst-related-list-single-aura-wrapper').shadowRoot.querySelector('a')")
	public WebElement AttachedContentDocuments;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Add Files']")
	public WebElement NewFile;
	@BooleanType()
	@FindBy(xpath = "//label[contains(@class, \"uiLabel\")]//span[2]")
	public WebElement checkBox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[starts-with(normalize-space(.),'Add')]")
	public WebElement add;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Edit']")
	public WebElement Edit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-1054']")
	public WebElement Status;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Waiting on Customer']")
	public WebElement PathAssistantStep_Waiting_on_Customer;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark as Current Status']")
	public WebElement PathAssistantStep_MarkAsCurrentStatus;
			
}
