/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.steps;

import java.util.List;

import com.uiautomation.actions.UserDefinedMenuActions;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UserDefinedMenuSteps
{
   @Steps
   UserDefinedMenuActions usermenuActions;
   
   @Then("^UserDefinedMenu should have following sections$")
   public void UserDefinedMenu_page_should_have_following_sections(List<String> menuTopMenuOptions) throws Exception
   {
      usermenuActions.verifyTopMenuOptions(menuTopMenuOptions);
   }
   
   @Then("^User chooses \"([^\"]*)\" tab$")
   public void User_chooses_tab(String menuType)
   {
      usermenuActions.menuTypesubTab(menuType);
   }
   
   @Then("^User creates a new alternate menu with name \"([^\"]*)\"$")
   public void User_clicks_on_ADDMENU_button(String menuName)
   {
      usermenuActions.addMenu(menuName);
   }

}
