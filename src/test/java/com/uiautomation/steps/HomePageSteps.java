package com.uiautomation.steps;

import com.uiautomation.actions.HomePageActions;
import com.uiautomation.actions.UserManagementActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps
{
   @Steps
   UserManagementActions userManagementActions;
   @Steps
   HomePageActions homePageActions;

   @Then("^User should see User Management module Home Page$")
   public void user_should_see_User_Management_module_Home_Page() throws Exception
   {
      userManagementActions.verifyUserNavigationUserMgmtPage();
   }

   @Then("^User Management background colour should be Red$")
   public void user_Management_background_colour_should_be_Red() throws Exception
   {
      userManagementActions.verifyUserMagmtMenuBackgroundColor();
   }

   @When("^Click on search icon in the Left corner$")
   public void click_on_search_icon_in_the_Left_corner() throws Exception
   {
      homePageActions.clickSearchIcon();
   }

   @Then("^It should open the search field$")
   public void it_should_open_the_search_field() throws Exception
   {
      homePageActions.shouldOpenModuleSearch();
   }

   @When("^User enter search by module name \"([^\"]*)\"$")
   public void user_enter_search_by_module_name(String searchModule) throws Exception
   {
      homePageActions.searchModuleByName(searchModule);
   }

   @Then("^User should automatically search the module name under list \"([^\"]*)\"$")
   public void user_should_automatically_search_the_module_name_under_list(String searchModule) throws Exception
   {
      homePageActions.shouldSeeModuleNameInList(searchModule);
   }

   @When("^User clicks module name underlist  \"([^\"]*)\"$")
   public void user_clicks_module_name_underlist(String searchModule) throws Exception
   {
      homePageActions.selectModuleFromListByName(searchModule);
   }

   @Then("^User should automatically navigate to module name page \"([^\"]*)\"$")
   public void user_should_automatically_navigate_to_module_name_page(String moduleName) throws Exception
   {
      homePageActions.verifyNavigationToModuleByName(moduleName);
   }

}
