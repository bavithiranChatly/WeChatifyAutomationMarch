/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

import com.uiautomation.pages.UserManagementPage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.UserMangment.UserMagementTopHeader;
import com.wechatify.utils.Constants;

import net.thucydides.core.annotations.Step;

/*
 * TODO: 
 * @auther Narottam Singh  
 * @created 19-Apr-2019 2019 5:30:17 PM
 */
public class UserManagementActions
{
   UserManagementPage userManagementPage;

   @Step
   public void verifyUserMgmtTopHeaders()
   {

      assertThat(
         "Verify Top headers of user management:",
         userManagementPage.getUserManagementTopHeadersLists(),
         hasItems(UserMagementTopHeader.ROLEMGMT.toString(), UserMagementTopHeader.USERMGMT.toString()));

   }

   @Step
   public void verifyUserNavigationUserMgmtPage()
   {
      assertThat("Verify User maangement top tab displayed:", userManagementPage.isUserManagementTopTabDisplayed(), is(equalTo(true)));
      assertThat("Verify User role top tab displayed:", userManagementPage.isUserRoleTopTabDisplayed(), is(equalTo(true)));
   }

   @Step
   public void verifyUserMagmtMenuBackgroundColor()
   {
      System.out.println("Background color: " + userManagementPage.getUserManagementMenuBackgroundColor());
      assertThat(
         "Verify User Management nav menu background color:",
         CommonUtils.getColorHex(userManagementPage.getUserManagementMenuBackgroundColor()),
         is(equalTo(Constants.HEXCOD_RAYMARINE)));
   }
}
