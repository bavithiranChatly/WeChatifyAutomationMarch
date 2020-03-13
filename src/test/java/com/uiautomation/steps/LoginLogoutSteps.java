package com.uiautomation.steps;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uiautomation.actions.LoginLogoutActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginLogoutSteps
{

   private static final Logger LOG = LoggerFactory.getLogger(LoginLogoutSteps.class);

   @Steps
   LoginLogoutActions loginLogoutActions;

   @Given("^User navigated to Wechatify login page$")
   public void user_navigated_to_Wechatify_login_page() throws Exception
   {
      LOG.info("User navigated to Wechatify login page");
      loginLogoutActions.navigateWeChatifyLoginPage();
      Assert.assertTrue(loginLogoutActions.isNavigatedToHomePage());
   }

   @When("^User enters login details of users with userid as \"([^\"]*)\" and password as \"([^\"]*)\"$")
   public void user_enteres_login_details_of_users_with_userid_as_and_password_as(String userEmail, String password) throws Exception
   {
      loginLogoutActions.performLogin(userEmail, password);
   }

   @When("^User clicks login button of Wechatify$")
   public void user_clicks_login_button_of_Wechatify() throws Exception
   {
      loginLogoutActions.clickUserLoginButton();
   }

   @Then("^User should not able to see Home page$")
   public void user_should_not_able_to_see_login_page() throws Exception
   {
      Assert.assertFalse(loginLogoutActions.isLoginSuccessfull());
      Assert.assertTrue(loginLogoutActions.isNavigatedToHomePage());
   }

   @Then("^User should see validation message on login page as \"([^\"]*)\"$")
   public void user_should_see_validation_message_on_login_page_as(String errorMsg) throws Exception
   {
      Assert.assertEquals(errorMsg, loginLogoutActions.getValidationErrorMsg());
   }

   @When("^User logins as usertype \"([^\"]*)\" with valid credentials$")
   public void user_logins_as_usertype_with_valid_credentials(String userType) throws Exception
   {
      loginLogoutActions.performLoginByUserType(userType);
   }

   @Then("^User should see application home page$")
   public void user_should_see_application_home_page() throws Exception
   {
      Assert.assertTrue(loginLogoutActions.isLoginSuccessfull());
   }

   @When("^User perform logout from Wechatify$")
   public void user_perform_logout_from_Wechatify() throws Exception
   {
      loginLogoutActions.performLogout();
   }

   @Then("^User should see application login page$")
   public void user_should_see_application_login_page() throws Exception
   {
      Assert.assertTrue(loginLogoutActions.isNavigatedToHomePage());

   }
}
