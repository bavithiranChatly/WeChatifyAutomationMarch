package com.uiautomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.uiautomation.utils.CommonUtils;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class VideoCreativePages extends CommonPage
{
   
   @FindBy(xpath = "//ul[@class=\"pagination\"]//li//a[text()='»»']")
   private WebElement LastPagination;
   
   @FindBy(xpath = "/html/body/section/section/div[3]/div[4]/div[5]/div/ul")
   private WebElement TotalPaginationSize;

   @FindBy(css = "#Title.form-control") // title field
   private WebElement TextTitle;

   @FindBy(css = "input#Title.form-control") // Message field
   private WebElement TextDescription;

   @FindBy(xpath = "//*[@id=\"fltr-wrap\"]/div/ul/li[1]/a") // it is to select media type sub tabs
   private WebElement Richmeida;

   @FindBy(xpath = "//*[@id=\"fltr-wrap\"]/div/ul/li[2]/a")
   private WebElement Text;

   @FindBy(xpath = "//*[@id=\"fltr-wrap\"]/div/ul/li[3]/a")
   private WebElement Video;

   @FindBy(xpath = "//*[@id=\"fltr-wrap\"]/div/ul/li[4]/a")
   private WebElement Audio;

   @FindBy(xpath = "//*[@id=\"fltr-wrap\"]/div/ul/li[5]/a")
   private WebElement Image;

   @FindBy(css = "#fdr-select")
   private WebElement MoveToFolderSelect;

   @FindBy(css = "#FdrMoveClose") // cancel btn in move to folder
   private WebElement CancelBtnMoveToFolder;

   @FindBy(css = "#MoveFolderSub") // Move btn in move to folder
   private WebElement MoveBtnMoveToFolder;

   @FindBy(css = "body > section > section > div.containerTabs.ForExtraMargin > div.row > div > p") // Element to check the "Create New Message Card: Video"
   private WebElement VideoPageHeader;

   @FindBy(css = ".add-msg li a")
   private List<WebElement> creativeTypes; // Type of creative element.

   @FindBy(css = "li#Broadcastcreatives>a")
   private WebElement creativeHeader; // Creative top menu text check // Creative.

   @FindBy(css = "#BroadcastLibrary a")
   private WebElement libraryHeader; // Library header element

   @FindBy(css = "li#Broadcastcreatives>a, #BroadcastLibrary a")
   private List<WebElement> creativepageTopMenus; // creative top menu :creatie and library

   @FindBy(css = "#creativeDivSubId > li.creativeSub > a")
   private List<WebElement> creativeSubTabs;

   @FindBy(css = "input#Title.form-control.text-box.single-line") // Video title field Element
   private WebElement VideoTitleField;

   @FindBy(xpath = "//li[contains(@class,\"active creativeSub\")]//a") /// getting tect from the creative sub tab.
   private WebElement CreativesubTabGetText;

   @FindBy(css = "input#TransTitle.form-control.text-box.single-line") // Video Translation title field.
   private WebElement VideoTransTitleField;

   @FindBy(css = "textarea#Description.form-control") // Video Description Field Element
   private WebElement VideoDescriptionField;

   @FindBy(css = "textarea#TransDescription.form-control") // trans Video description Field Element
   private WebElement VideoTransDescriptionField;

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div/div[1]/div/div/div/div/div/div[3]/div/div/button")
   private WebElement VideoUploadClick; // Video Upload Click button

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div/div[1]/div/div/div/div/div/div[3]/div/div/button")
   private WebElement VideoUploadEnglishClick; // Video Upload English

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div[3]/div/div/button")
   private WebElement VideoUploadChineseClick; // Video Upload Chinese

   @FindBy(xpath = "//*[@id=\"VideoId\"]")
   private WebElement uploadedVideoIcon; // After video uploaded Image

   @FindBy(xpath = "//*[@id=\"OriginalFolderID\"]")
   private WebElement extraFolderDropDown;

   @FindBy(css = "input[value='Save']")
   private WebElement saveVideoBtn;
   
   @FindBy(xpath = "/html/body/section/section/div[3]/div[4]/div[5]/div/ul")
   private WebElement Paginationlist;

   @FindBy(css = "#FormVideoId > div > div > div > div > div.col-lg-12 > div > div.col-md-11.col-sm-11 > div > input.btn.btn-default.btn-save.submitFornext.forImageDisabled")
   private WebElement submitDraftReviewBtn; // submit for draft review button element

   @FindBy(css = "#SubmitForTranslationBtnId")
   private WebElement submitTranslationBtn; // submit for translation button element

   @FindBy(css = "#UE_FormButtons > div > input:nth-child(6)")
   private WebElement submitTranslationReviewBtn; // submit for translation Review button element.

   @FindBy(css = "#FormVideoId > div > div > div > div.row.translateReview > div.col-md-9.col-sm-9.saveBtnGrp > div > input:nth-child(4)")
   private WebElement moveToApproval; // move to approval button element.

   @FindBy(css = "#SubmitForApprovalBtnId")
   private WebElement approvaAndSendToLibrary; // Approve and send to library

   @FindBy(css = "#ShareApproveBtn")
   private WebElement shareAndSendToLibrary; // Share and send to library.

   @FindBy(css = "#FormVideoId > div > div > div > div > div.col-lg-12 > div > div.col-md-11.col-sm-11 > div > input:nth-child(3)")
   private WebElement SaveAndCloseVideoBtn;

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div/div[2]/div/div[1]/div/a") // Video backtolist Btn
   private WebElement VideoBackToListBtn;

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div/div[1]/div/div/div/div/div/div[3]/div/div/span[1]/em[2]") // Video tooltip text
   private WebElement VideotoolTip;

   @FindBy(xpath = "*//div[contains(@id,'popover')]") // video tooltip text
   private WebElement uploadVideoToolTipText;

   @FindBy(xpath = "/html/body/div[38]/ul/li[3]/a")
   private WebElement VideoPicker; // directly picking the Video Creative

   @FindBy(css = "#descriptionErr")
   private WebElement TextMessageValidationError;
   
   @FindBy(css = "#TransDescriptionErr")
   private WebElement TransTextMessageValidationError;
   
   @FindBy(css = "#Title-error")
   private WebElement titleValidationError;
   
   @FindBy(css = "#TransTitle-error")
   private WebElement TransTitleValidationError;
   

   @FindBy(css = "#Alert")
   private WebElement VideoPopUpAlert; // Please upload only MP4 Video format

   @FindBy(css = "")
   private WebElement VideoPopUpValidationError; // Please upload only MP4 Video format , Getting Text

   @FindBy(xpath = "//*[@id=\"VideoVaildationId\"]")
   private WebElement VideoVaildation;

   @FindBy(xpath = "//*[@id=\"FormVideoId\"]/div/div/div/div/div[2]/div/div[2]/div/input[2]")
   private WebElement SaveBtn;

   @FindBy(xpath = "//*[@id=\"PreviewBtnIdn\"]") // Preview CLick
   private WebElement PreviewClick;

   @FindBy(xpath = "//*[@id=\"previewForFollowerNew\"]") // preview to follower click.
   private WebElement PreviewToFollowerClick;

   @FindBy(css = "select#OriginalFolderID")
   private WebElement VideoFolder;

   // @FindBy(xpath = "//*[@id=\"follower_ouO5OxOmJXfVNGs_0sCH8Vu1xPWA\"]")
   @FindBy(css = "//input[contains(@id,'follower')]")
   private List<WebElement> selectFollowerCheckBoxList;

   @FindBy(xpath = "//*[@id=\"btnPreview\"]")
   private WebElement PreTofollowerBtn;

   @FindBy(css = "#deletepopformId > input.btn.btn-primary.PopOkbtn")
   private WebElement modelDeleteOKButton;

   @FindBy(xpath = "//*[@id=\"FolderName\"]") // To enter a New folder name .
   private WebElement FolderNameField;

   @FindBy(xpath = "//*[@id=\"folderSubmitbtn\"]")
   private WebElement FolderSubmitBtn;

   @FindBy(xpath = "//*[@id=\"form0\"]/div/div/div/div/div[3]/input[2]")
   private WebElement FolderCancelBtn;

   /** The FolderName Validation Check. */
   @FindBy(xpath = "//*[@id=\"folderValid\"]")
   private WebElement FolderNameFieldValidation;

   /** The folder Option button Click */
   @FindBy(css = "#fdrWrap > li.fdr-active > span")
   private WebElement FolderOptionBtn;

   /** Folder Edit Option */
   @FindBy(xpath = "/html/body/div[38]/a[1]")
   private WebElement FolderEditBtn;

   /** Folder Delete option */
   @FindBy(xpath = "/html/body/div[38]/a[2]")
   private WebElement FolderDeleteBtn;

   /** Folder delete Ok button */
   @FindBy(xpath = "//*[@id=\"FolderDelOk\"]")
   private WebElement FolderDelOptOkBtn;

   /** Folder Delete Cancel button */
   @FindBy(xpath = "//*[@id=\"popup-del\"]/div/div/div/a[2]")
   private WebElement FolderDelOptCancelBtn;

   @FindBy(xpath = "//ul[@id =\"fdrWrap\" ]//li//span[@class=\"fdr-name\"]")
   private List<WebElement> TotalFolderCount;

   @FindBy(xpath = "//*[@id=\"FdrMove\"]") // Move to folder icon
   private WebElement MoveToFolderIcon;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//input[@type=\"submit\"]") // transfer icon Ok button
   private WebElement TransferIconOkBtn;

   @FindBy(xpath = "//div[@class=\"modal-footer\"]//a[@id=\"DeleteCancelButtonUrl\"]")
   private WebElement TransferIconCancelBtn;

   @FindBy(xpath = "//div[@class=\"item-holder cover grid-item mov-fdr selectedTile\"]")
   private List<WebElement> CardSelectionInFolder;

   @FindBy(xpath = "//input[contains(@id,\"PreviewBtnId\")]")
   private WebElement PreviewClickBtn;

   @FindBy(xpath = "//a[@data-original-title=\"Preview\"]")
   private WebElement LibPreviewClickBtn;

   @FindBy(xpath = "//*[@id=\"previewForFollowerNew\"]")
   private WebElement PreviewToFollowerBtn;

   @FindBy(xpath = "//*[@id=\"MessageCardviewClose\"]")
   private WebElement PreviewToFollowerCloseBtn;

   @FindBy(xpath = "//*[@id=\"followerData\"]/div[2]/div[2]/div/div[1]/div/div/div/input")
   private WebElement PreviewSearchField;

   @FindBy(xpath = "//*[@id=\"followerData\"]/div[2]/div[2]/div/div[1]/div/div/div/span/button")
   private WebElement PreviewSearchOPt;

   @FindBy(xpath = "//*[@id=\"followerData\"]/div[3]/button[3]")
   private WebElement PreviewCancelOpt;

   @FindBy(xpath = "//*[@id=\"btnPreview\"]")
   private WebElement SendPreviewBtn;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//select[@class=\"form-control text-center previewMobile\"]")
   private WebElement MobilePreviewClick;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"iphone6\"]")
   private WebElement PreviewIphone6;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"iphone5\"]")
   private WebElement PreviewIphone5;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"iphoneX\"]")
   private WebElement PreviewIphonex;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"ipadPro\"]")
   private WebElement iPadPro;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"ipad\"]")
   private WebElement iPad;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"pixel2\"]")
   private WebElement Pixel2;

   @FindBy(xpath = "//div[@class=\"messageCardpreviewpage\"]//div[@id=\"mobileContainer\"][@class=\"galaxyS9\"]")
   private WebElement galaxy9;

   // storing the number cards in the selected folder
   String NumberOfCradsInFolder;

   String UsernamePreview;

   String Videoname;

   /** ok decalaration of the delete folder button */
   String FolderDeleteOkBtn = "Ok";
   /** Cancel Decalaration of the Delete folder button */
   String FolderDeleteCancelBtn = "Cancel";
   // public WebDriver driver;
   String GetTextFromCreativeSubTabs;

   public boolean VerifyFolderName(String FolderName)
   {

      // List<String> folderList = new ArrayList<>();
      // for (WebElement folder : TotalFolderCount)
      // {
      // folderList.add(folder.getText());

      // }
      // return folderList;
      try
      {
         getDriver().findElement(By.xpath("//ul[@id=\"fdrWrap\"]//span[text()='" + FolderName + "']"));
         CommonUtils.waitForSeconds(2);
         return true;
      }
      catch (org.openqa.selenium.NoSuchElementException e)
      {
         return false;
      }

   }

   public boolean VerifyCardInFolder(String VideoName) // verifying the card by name
   {

      // List<String> folderList = new ArrayList<>();
      // for (WebElement folder : TotalFolderCount)
      // {
      // folderList.add(folder.getText());

      // }
      // return folderList;
      try
      {
         getDriver().findElement(By.xpath("//div[@class=\"item-holder cover grid-item mov-fdr  \"]//h3[text()='" + VideoName + "']"));
         CommonUtils.waitForSeconds(2);
         return true;
      }
      catch (org.openqa.selenium.NoSuchElementException e)
      {
         return false;
      }

   }

   public boolean isCreativeHeaderDisplayed() // To check top menu creative Header.
   {
      waitFor(creativeHeader);
      return creativeHeader.isDisplayed();
   }

   public void navigateToCreativeListPage()
   {
      clickCreativeNavMenu(); // creative nav menu in the left side module list

   }

   public boolean isLibraryHeaderDsplayed()
   {
      waitFor(libraryHeader);
      return libraryHeader.isDisplayed();
   }

   public List<String> getCreativeTopMenuOptions() // to check the Creative top menu's Text | Creative and Library |
   {
      List<String> options = new ArrayList<>();
      for (WebElement creative : creativepageTopMenus)
      {
         options.add(creative.getText().trim());
      }
      return options;
   }

   public List<String> getCreativeTypeTabsAsList() // To check the Creaive 2nd top menu |Draft|Draft Review|Translation|Translation Review|Approve|
   {
      List<String> creativeList = new ArrayList<>();
      for (WebElement creative : creativeSubTabs)
      {
         creativeList.add(creative.getText());
      }
      return creativeList;
   }

   public List<String> getCreativeTypeAsList() // to check the creative types - dropdown option od add button
   {
      List<String> creativeList = new ArrayList<>();
      for (WebElement creative : creativeTypes)
      {
         creativeList.add(creative.getText());
      }
      return creativeList;
   }

   public boolean isVideoPageHeaderDisplayed() // to check the "Create New Message Card: Video"
   {
      waitFor(VideoPageHeader);
      return VideoPageHeader.isDisplayed();
   }

   public void getTextFromCreativeSubTabPages()
   {
      String getTextActiveCreative = CreativesubTabGetText.getText();

      // getting text from the Active creative sub tabs
      GetTextFromCreativeSubTabs = getTextActiveCreative;

      Log.info("CreativeSub Tabs" + GetTextFromCreativeSubTabs);
   }

   public void VideoCreativeActivity(String title, final String Description, final String ClearOrSend)
   {

      // title = title + GetTextFromCreativeSubTabs;
      // Log.info("CreativeSub Tabs in sendkeys" +title);
      // Videoname = title;
      if (ClearOrSend.equalsIgnoreCase("Send"))
      {
         VideoTitleField.clear();
         VideoTitleField.sendKeys(title);

         VideoDescriptionField.clear();
         VideoDescriptionField.sendKeys(Description);
         CommonUtils.waitForSeconds(6);
      }
      else if (ClearOrSend.equalsIgnoreCase("Clear"))
      {
         VideoTitleField.clear();
         VideoDescriptionField.clear();
      }

   }

   public void PreviewTofollowerBtnClick(String PreviewOpt)// Clicking the Preview option in the create/edit Page
   {
      if (PreviewOpt.equalsIgnoreCase("Creatives"))
      {
         CommonUtils.waitForSeconds(8);
         waitFor(PreviewClickBtn);
         PreviewClickBtn.click();
         CommonUtils.waitForSeconds(5);
      }
      else if (PreviewOpt.equalsIgnoreCase("Library"))
      {
         CommonUtils.waitForSeconds(8);
         waitFor(LibPreviewClickBtn);
         LibPreviewClickBtn.click();
         CommonUtils.waitForSeconds(5);
      }
   }

   public void ClickPreviewTofollowerOrExitPreview(String PreviewTofollowerOrExit) // Clicking the Preview to follower / Exit Preview option functionality.
   {
      if (PreviewTofollowerOrExit.equalsIgnoreCase("PreviewTofollower"))
      {
         waitFor(PreviewToFollowerBtn);
         PreviewToFollowerBtn.click();

      }
      else if (PreviewTofollowerOrExit.equalsIgnoreCase("Exit"))
      {
         waitFor(PreviewToFollowerCloseBtn);
         PreviewToFollowerCloseBtn.click();
      }
      CommonUtils.waitForSeconds(5);
   }

   public void mobilePreviewModalClick() // Mobile preview types modal click
   {

   }

   // mobilePreview.selectByIndex(1);

   // mobilePreview.selectByVisibleText("iPhone 6/7/8");
   // CommonUtils.waitForSeconds(3);

   // mobilePreview.selectByVisibleText("iPhone 5/5SE");
   // CommonUtils.waitForSeconds(3);
   // mobilePreview.selectByVisibleText("iPhone X");
   // CommonUtils.waitForSeconds(3);
   // mobilePreview.selectByVisibleText("iPad Pro");
   // CommonUtils.waitForSeconds(3);
   // mobilePreview.selectByVisibleText("iPad");
   // CommonUtils.waitForSeconds(3);
   // mobilePreview.selectByVisibleText("Pixel 2");
   // CommonUtils.waitForSeconds(3);
   // mobilePreview.selectByVisibleText("Galaxy S9");
   // CommonUtils.waitForSeconds(3);

   public void ClickingTheDifferentPreviewList()
   {

   }

   public void EnterUsernameAndSearchInPreviewTofollower(String Username) // Entering Username to send Preview to follower and click on Search
   {
      PreviewSearchField.clear();
      PreviewSearchField.sendKeys(Username);

      UsernamePreview = Username;

      CommonUtils.waitForSeconds(1);
      PreviewSearchOPt.click();
      CommonUtils.waitForSeconds(5);
   }

   public void UsernameCheckBoxSearch(String UserPreviewName)// To click the checkboc in Preview to follower
   {
      WebElement Checkbox = getDriver()
         .findElement(
            By
               .xpath(
                  "//*[@class='text-center table-responsive choosefollwers']//..//td[contains(text(),'" + UserPreviewName
                     + "')]//..//input[@class='ng-pristine ng-untouched ng-valid ng-empty']"));
      Checkbox.click();
      CommonUtils.waitForSeconds(2);

   }

   public void ClickOnSendOrClosePage(String SendOrClose)
   {

      if (SendOrClose.equalsIgnoreCase("Send"))
      {
         waitFor(SendPreviewBtn);
         SendPreviewBtn.click();
      }
      else if (SendOrClose.equalsIgnoreCase("close"))
      {
         waitFor(PreviewCancelOpt);
         PreviewCancelOpt.click();
      }
      CommonUtils.waitForSeconds(6);

   }

   public void TransVideoCreativeActivity(final String TransTitle, final String TransDescription)
   {
     

      VideoTransTitleField.clear();
      VideoTransTitleField.sendKeys(TransTitle);

      VideoTransDescriptionField.clear();
      VideoTransDescriptionField.sendKeys(TransDescription);
      CommonUtils.waitForSeconds(6);
      
   }
   
   public void TransFieldClearActivity()
   {
      VideoTransTitleField.clear();
      VideoTransDescriptionField.clear();
      CommonUtils.waitForSeconds(3);
   }
   
   public void EnterTransDescriptionActivity(final String TransDescription)
   {
      VideoTransDescriptionField.clear();
      VideoTransDescriptionField.sendKeys(TransDescription);
      CommonUtils.waitForSeconds(6);
   }

   // public void uploadVideo(String path) // public static final String VIDEO_PATH = "src/test/resources/test-data/video.MP4";
   // {
   // VideoUploadClick.click();
   // CommonUtils.uploadFile(Constants.VIDEO_PATH);// In common Page doubt
   // CommonUtils.uploadFile(path);

   // }

   public void uploadVideoNew(String path, String Lang)
   {

      if (Lang.equalsIgnoreCase("English"))
      {
         VideoUploadEnglishClick.click();

         CommonUtils.uploadFile(path);
         ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", saveVideoBtn);
         CommonUtils.waitForSeconds(8);
         // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      }
      else if (Lang.equalsIgnoreCase("Chinese"))
      {
         VideoUploadChineseClick.click();

         CommonUtils.uploadFile(path);
         ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", saveVideoBtn);
         CommonUtils.waitForSeconds(8);
      }

   }

   public void selectFolderVByName(String selectFolderName) // folder selection in card creation
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", SaveBtn);
      VideoFolder.click();
      CommonUtils.waitForSeconds(3);
      WebElement element = getDriver().findElement(org.openqa.selenium.By.cssSelector("#OriginalFolderID"));
      // element.click();
      CommonUtils.waitForSeconds(3);
      // getDriver().findElement(org.openqa.selenium.By.xpath("//select[@class='form-control valid']//option[text()='" + folderNameV + "']")).click();

      Select ss = new Select(element);
      ss.selectByVisibleText(selectFolderName);
      CommonUtils.waitForSeconds(3);

   }

   public void selectFolderInMoveToFolder(String CreatedFolderName)
   {
      MoveToFolderSelect.click();
      CommonUtils.waitForSeconds(3);

      WebElement MoveToFolderElement = getDriver().findElement(org.openqa.selenium.By.cssSelector("#fdr-select"));
      CommonUtils.waitForSeconds(2);

      Select moveFolder = new Select(MoveToFolderElement);
      moveFolder.selectByVisibleText(CreatedFolderName);
      CommonUtils.waitForSeconds(3);
   }

   // video name kop
   public void clickVideoDraftReviewEditBtn(String VideoName) // Video creative button
   {
      CommonUtils.waitForSeconds(5);
      WebElement VideodraftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + VideoName + "']//following-sibling::div//a[@title='Edit']"));
      VideodraftReviewEditBtn.click();
      CommonUtils.waitForSeconds(15);
   }

   // Video name
   public void SelectingVideoMoveToFolderAction(String VideoName) // selecting card in for moving to another folder
   {
      CommonUtils.waitForSeconds(2);
      WebElement MoveToFolderSelectBtn = getDriver()
         .findElement(
            By
               .xpath(
                  "//div[contains(@class ,'item-holder')]/h3[text()='" + VideoName
                     + "']//following-sibling::div[contains(@class,'img-tit clearfix movetofolder')][2]"));
      MoveToFolderSelectBtn.click();

      // to get number cards selected.
      int number = CardSelectionInFolder.size();
      Log.info("Creatices list size: " + number);

      CommonUtils.waitForSeconds(1);

   }

   // Video name
   public void clickVideoDraftReviewViewBtn(String VideoName)
   {
      CommonUtils.waitForSeconds(5);
      WebElement VideodraftReviewViewBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + VideoName + "']//following-sibling::div//a[@title='View']"));
      VideodraftReviewViewBtn.click();
      CommonUtils.waitForSeconds(5);
   }

   public void clickVideoDraftReviewDeleteBtn(String VideoName) // delete Icon
   {
      CommonUtils.waitForSeconds(5);
      WebElement VideodraftReviewDeleteBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + VideoName + "']//following-sibling::div//a[@title='Delete']"));
      VideodraftReviewDeleteBtn.click();
   }

   public void clickTransferIcon(String VideoName, String TransferIcon) // Transfer Icon functionality
   {
      CommonUtils.waitForSeconds(5);
      WebElement TransferIconElement = getDriver()
         .findElement(
            By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + VideoName + "']//following-sibling::div//a[@title='" + TransferIcon + "']"));
      TransferIconElement.click();
   }

   public void ClickDeleteOKBtn()
   {
      modelDeleteOKButton.click();
      CommonUtils.waitForSeconds(5);
   }

   public boolean isVideoUploaded()
   {
      waitFor(uploadedVideoIcon);
      return uploadedVideoIcon.isDisplayed(); // checking whether the video is uploaded or not
   }

   public void clickUploadVideoClickToolTipIcon() // Click Video Upload
   {
      waitFor(VideoUploadClick);
      VideoUploadClick.click();
   }

   public void clickUploadVideo1ClickToolTipIcon() // Click the Video tooltip icon
   {
      waitFor(VideotoolTip);
      VideotoolTip.click();
   }

   public String getVideoToolTipText() // checking video tooltip text
   {
      waitFor(uploadVideoToolTipText);
      CommonUtils.waitForSeconds(2);
      return uploadVideoToolTipText.getText();

   }

   public void clickOnAddNewFolder(String FoldernametoSelected) // Selecting Folder by Name
   {

      String CardBadgeNumber = getDriver()
         .findElement(By.xpath("//span[@class=\"fdr-name\"][text()='" + FoldernametoSelected + "']//following-sibling::span[@class=\"badge\"]"))
         .getText();

      NumberOfCradsInFolder = CardBadgeNumber;
      Log.info("Creatives list size: " + NumberOfCradsInFolder);

      int NumberOfCardsInt = Integer.parseInt(NumberOfCradsInFolder);

      CommonUtils.waitForSeconds(4);

      getDriver().findElement(By.xpath("//ul[@id=\"fdrWrap\"]//span[text()='" + FoldernametoSelected + "']")).click();
      CommonUtils.waitForSeconds(2);

   }
   
   

   public void ClickCreatedFolderAction(String AddNewFolder) // Add New Folder
   {
      getDriver().findElement(By.xpath("//span[text()='" + AddNewFolder + "']")).click();
      CommonUtils.waitForSeconds(2);

   }

   public void VideoCreativePagesActions()
   {
      CommonUtils.waitForSeconds(1);
      waitFor(MoveToFolderIcon);
      MoveToFolderIcon.click();

      CommonUtils.waitForSeconds(3);
   }

   @Override
   public void selectingSubMediaTypeAction(String MediaType) // selecting subtype Media types
   {
      if (MediaType.equalsIgnoreCase("Richmedia"))
      {
         Richmeida.click();
      }
      else if (MediaType.equalsIgnoreCase("Text"))
      {
         Text.click();
      }
      else if (MediaType.equalsIgnoreCase("Video"))
      {
         Video.click();
      }
      else if (MediaType.equalsIgnoreCase("Audio"))
      {
         Audio.click();
      }
      else if (MediaType.equalsIgnoreCase("Image"))
      {
         Image.click();
      }

   }

   public void CancelOrMoveActionInMoveToFolder(String CancelOrMove)
   {
      if (CancelOrMove.equalsIgnoreCase("Cancel"))
      {
         CancelBtnMoveToFolder.click();
      }
      else if (CancelOrMove.equalsIgnoreCase("Move"))
      {
         MoveBtnMoveToFolder.click();
      }
      CommonUtils.waitForSeconds(8);
   }

   public void ClickOkOrCancelInDelAction(String OkOrCancel)
   {

      if (OkOrCancel.equalsIgnoreCase("Ok"))
      {
         FolderDelOptOkBtn.click();
      }

      else if (OkOrCancel.equalsIgnoreCase("Cancel"))
      {
         FolderDelOptCancelBtn.click();
      }

   }

   public void ClickCreativeSubTabs(String TabName)
   {
      CommonUtils.waitForSeconds(5);
      WebElement CreativeSubTabElement = getDriver().findElement(By.xpath("//ul[@id=\"creativeDivSubId\"]//a[text()='" + TabName + "']"));
      CreativeSubTabElement.click();
      CommonUtils.waitForSeconds(5);
   }

   public void ClickHeaderTabs(String HeaderTabs) // to click Header Tabs // click header Tabs Creative or Library
   {
      CommonUtils.waitForSeconds(5);
      WebElement HeaderTabsElement = getDriver().findElement(By.xpath("//div[@class=\"topNavigation\"]//a[text()='" + HeaderTabs + "']"));
      HeaderTabsElement.click();
      CommonUtils.waitForSeconds(5);
   }

   public void TransferIconOkOrCancelBtnClick(String TransferOkOrCancel) //
   {

      if (TransferOkOrCancel.equalsIgnoreCase("Ok"))
      {
         TransferIconOkBtn.click();
      }
      else if (TransferOkOrCancel.equalsIgnoreCase("Cancel"))
      {
         TransferIconCancelBtn.click();
      }
      CommonUtils.waitForSeconds(3);
   }

   public void OptionFolderBtnAction() // option folder button Click
   {
      waitFor(FolderOptionBtn);
      FolderOptionBtn.click();
   }

   public void EditOptionFolderBtnAction() // Clicking edit option in folder
   {
      waitFor(FolderEditBtn);
      FolderEditBtn.click();
      CommonUtils.waitForSeconds(2);
   }

   public void DeleteOptionFolderBtnAction() // Clicking delete option in folder
   {
      waitFor(FolderDeleteBtn);
      FolderDeleteBtn.click();
      CommonUtils.waitForSeconds(2);
   }

   public void EnterFolderNamePage(String FolderName) // Enter Folder Name
   {
      FolderNameField.clear();
      FolderNameField.sendKeys(FolderName);
      CommonUtils.waitForSeconds(2);
      // String CreatedFolderName = FolderName;
   }

   public void CreatedFolderNameCheck() // Created folder Name check
   {
      List<WebElement> VisibleFolderNAme = (List<WebElement>) getDriver().findElement(By.cssSelector("#fdrWrap > li > a > span.fdr-name"));

      int TotalFolderPresent = VisibleFolderNAme.size();
      // Printing the Folder Total Count
      // LOG.info("No.Of Folder Present" + TotalFolderPresent);

   }

   public void clickSubmitPages() // Clicking Submit button in the Folder name Creation Popup.
   {
      FolderSubmitBtn.click();
      // getDriver().findElement(By.xpath("//span[text()='" + AddNewFolder + "']"))
      // getDriver().findElement(By.xpath("//input[@value='" + SubmitOrCancel + "']"));

      CommonUtils.waitForSeconds(7);
   }

   public String getFolderFieldValidationError() // common method for checking the FolderName Validation
   {
      waitFor(FolderNameFieldValidation);
      return FolderNameFieldValidation.getText();
   }

   public void clickCancelPages() // Clicking Cancel button in the Folder name Creation Popup.
   {
      FolderCancelBtn.click();
      CommonUtils.waitForSeconds(2);
   }

   public void clickCreativeVideoSaveBtn()
   {
      saveVideoBtn.click();
      CommonUtils.waitForSeconds(8);
   }

   public void clickCreativeVideosubmitForDraftReviewBtn() // Submit for Draft Review Click flow.
   {
      submitDraftReviewBtn.click();
      CommonUtils.waitForSeconds(13);
   }

   public void clickCreativeVideosubmitForTranslationBtn() // submit for translation Click flow
   {
      submitTranslationBtn.click();
      CommonUtils.waitForSeconds(13);
   }

   public void clickCreativeVideosubmitForTranslationReviewBtn() // submit for TranslationReview Click flow
   {
      submitTranslationReviewBtn.click();
      CommonUtils.waitForSeconds(13);
   }

   public void clickCreativeVideosubmitForApprovalBtn() // submit for approval click flow
   {
      moveToApproval.click();
      CommonUtils.waitForSeconds(13);
   }

   public void clickCreativeVideoPreviewToFollowerBtn()
   {
      PreviewClick.click();
      CommonUtils.waitForSeconds(5);
      PreviewToFollowerClick.click();
      CommonUtils.waitForSeconds(5);

      // JavascriptExecutor js = (JavascriptExecutor)driver;
      // js.executeScript("arguments[0].click();", selectFollowerCheckBoxList);
      // getDriver().findElement(org.openqa.selenium.By.xpath("//*[@value=" + Openid + "]")).click();
      // selectFollowerCheckBoxList.get(1).click();
      // CommonUtils.waitForSeconds(5);
      PreTofollowerBtn.click();
      CommonUtils.waitForSeconds(5);

   }

   public void ClickOnPreUser()
   {
      // JavascriptExecutor js = (JavascriptExecutor)driver;
      // js.executeScript("arguments[0].click();", selectFollowerCheckBoxList);
   }

   public void clickCreativeVideoBackToListBtn(String BackToList)
   {

      CommonUtils.waitForSeconds(2);
      WebElement BackToListLocator = getDriver().findElement(By.xpath("//div[@class=\"button-group DraftBacklist\"]//a[text()='" + BackToList + "']"));
      BackToListLocator.click();
      CommonUtils.waitForSeconds(5);

    }

   public void clickCreativeVideoSaveAndCloseBtn()
   {
      SaveAndCloseVideoBtn.click();
      CommonUtils.waitForSeconds(14);
   }
   
   public String getTitleTextValidationError()
   {
      waitFor(titleValidationError);
      return titleValidationError.getText();
   }
   
   public String getTransTitleTextValidationError()
   {
      waitFor(TransTitleValidationError);
      return TransTitleValidationError.getText();
   }

   public String getMessageTextValidationError()
   {
      waitFor(TextMessageValidationError);
      return TextMessageValidationError.getText();

   }
   
   public String getTransMessageTextValidationError()
   {
      waitFor(TransTextMessageValidationError);
      return TransTextMessageValidationError.getText();

   }

   // public void getBadgeValue()
   // {
   // waitFor(CardSelectionInFolder);
   // String CardSelectionBadge = CardSelectionInFolder.getText();

   // }

   public String getVideoUploadValidationError() // Please upload video to get text.
   {
      waitFor(VideoVaildation);
      return VideoVaildation.getText();
   }

   public String getVideoInvalidValidationError()
   {
      waitFor(VideoPopUpValidationError);
      return VideoPopUpValidationError.getText();
   }
   
   @SuppressWarnings("unchecked")
   public void CheckPaginationAction()
   {
      getDriver().manage().window().maximize();
      
      
         
         //getDriver().findElement(By.xpath("/html/body/section/section/div[3]/div[4]/div[5]/div/ul"));
         //System.out.println("Working");
       //((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Paginationlist);
      // CommonUtils.waitForSeconds(2);
      //LastPagination.click();
       //WebElement pagination = getDriver().findElement(By.xpath("/html/body/section/section/div[3]/div[4]/div[5]/div/ul/li"));
       //int i = pagination.
       
      
       // if(pagination.size()>0)
       // { 
       //    Log.info("pagination exists");

         // click on pagination link 

         //  for(int i=0; i<pagination .size(); i++)
        //   { 
         //     pagination.get(i).click(); 
        //  } 
       //  } 
      //   else { 
       //     Log.info("pagination not exists");
      //  } 
      
     // catch(Exception e)
     // {
      //   System.out.println("Something went wrong.");
     // }
   }

   public static void main(String[] args)
   {

      // TODO Auto-generated method stub

   }

   // TODO Auto-generated method stub

}