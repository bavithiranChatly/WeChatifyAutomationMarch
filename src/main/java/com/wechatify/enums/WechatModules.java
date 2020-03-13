/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.wechatify.enums;

/*
 * TODO: 
 * @auther Narottam Singh  
 * @created 19-Apr-2019 2019 8:37:35 PM
 */
public enum WechatModules
{

   CREATIVES("CREATIVES"),
   BROADCAST_CONFIGURATION("BROADCAST CONFIGURATION"), 
   RESPONSE_CONFIGURATION("RESPONSE_CONFIGURATION"),
   USER_MANAGEMENT("USER MANAGEMENT");

   String label;

   private WechatModules(String label)
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
