/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.wechatify.enums;

/*
 * TODO: 
 * @auther Narottam Singh  
 * @created 19-Apr-2019 2019 5:37:55 PM
 */
public class UserMangment
{
   public enum UserMagementTopHeader
   {
      USERMGMT("USER MANAGEMENT"),
      ROLEMGMT("ROLE MANAGEMENT");

      String label;

      private UserMagementTopHeader(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      public String toString()
      {
         return this.label;
      }
   }

}
