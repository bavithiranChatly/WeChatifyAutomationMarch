/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasItem;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.uiautomation.pages.RichMediaCreativePage;
import com.uiautomation.pages.HomePage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.Creatives;
import com.wechatify.enums.WechatModules;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomePageActions
{

   HomePage homePage;
   RichMediaCreativePage CreativesPage;

   @Steps
   UserManagementActions userManagementActions;
   @Steps
   RichMediaCreativeActions creativesActions;

   @Step
   public void verifyNavigationToModuleByName(String moduleName)
   {
      if (moduleName.equalsIgnoreCase(WechatModules.USER_MANAGEMENT.toString()))
      {
         userManagementActions.verifyUserNavigationUserMgmtPage();
         userManagementActions.verifyUserMgmtTopHeaders();
         userManagementActions.verifyUserMagmtMenuBackgroundColor();
      }
      else if (moduleName.equalsIgnoreCase(WechatModules.CREATIVES.toString()))
      {
         creativesActions.verifyUserNavigationToCreativePage();
         creativesActions.verifyCreativeTypeOptions(Arrays.asList(Creatives.TopMenuTabs.CRATIVES.toString(), Creatives.TopMenuTabs.LIBRARY.toString()));
         // creativesActions.verifyCreativeMenuBackgroundColor();
      }
   }

   @Step
   public void clickSearchIcon()
   {
      homePage.clickSearchMenuIconIfVisilble();
   }

   @Step
   public void shouldOpenModuleSearch()
   {
      assertThat("Verify Created Rich Media Creative:", homePage.isSearchTextBoxVisible(), equalTo(true));
   }

   @Step
   public void searchModuleByName(String searchModule)
   {
      homePage.searchModuleByName(searchModule);
   }

   @Step
   public void shouldSeeModuleNameInList(String searchModule)
   {
      assertThat("Verify Module name in list:", homePage.getModuleList(), hasItems(searchModule));

   }

   @Step
   public void selectModuleFromListByName(String searchModule)
   {
      homePage.SelectModuleByName(searchModule);
   }
}
