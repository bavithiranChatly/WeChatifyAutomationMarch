package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class LoginPage extends CommonPage
{

   @FindBy(css = ".LoginHeadingText h3")
   private WebElement loginPageHeader;

   @FindBy(id = "Email")
   private WebElement userEmailTxBx;

   @FindBy(id = "Password")
   private WebElement userPasswordTxBx;

   @FindBy(css = "[onclick='validateForm()']")
   private WebElement loginBtn;

   @FindBy(css = ".validation-summary-errors.text-danger li,.text-danger.field-validation-error")
   private WebElement validationErrorMsg;

   public String getLoginPageHeaderText()
   {
      waitFor(loginPageHeader).waitUntilVisible();
      return loginPageHeader.getText();
   }

   public void loginToWeChatify(String userEmail, String password)
   {
      userEmailTxBx.clear();
      userEmailTxBx.sendKeys(userEmail);
      userPasswordTxBx.clear();
      userPasswordTxBx.sendKeys(password);
      loginBtn.click();
   }

   public void clickLoginBtn()
   {
      waitFor(loginBtn).waitUntilClickable();
      loginBtn.click();

   }

   public String getValidationErrorMsg()
   {
      waitFor(validationErrorMsg).waitUntilVisible();
      return validationErrorMsg.getText();
   }
}