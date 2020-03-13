/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.enums;

public class Creatives
{

   public enum Type
   {

      RICHMEDIA("Rich Media"), TEXT("Text"), VIDEO("Video"), AUDIO("Audio"), IMAGE("Image");

      String label;

      private Type(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
   
   public enum TopMenuTabs{
      CRATIVES("CREATIVES"),
      LIBRARY("LIBRARY");
      
      String label;

      private TopMenuTabs(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
   
   public enum CreativesSubTabs{
      DRAFTS("Drafts"),
      DRAFTSREVIEW("Drafts Review"),
      TRANSLATION("Translation"),
      TRANSLATIONREVIEW("Translation Review"),
      APPROVE("Approve");
      
      
      String label;

      private CreativesSubTabs(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
   
   public enum MoveToSubTabs{
      MOVETODRAFTSREVIEW("Move to drafts review"),
      MOVETOTRANSLATION("Move to translation"),
      MOVETOTRANSALATIONREVIEW("Move to translation review"),
      MOVETOAPPROVAL("Move to approval"),
      MOVETOLIBRARY("Move to library");
      
      
      String label;

      private MoveToSubTabs(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
   
   public enum CreativeNotificationBaseContent{
      RICHMEDIA("TMG Gallery - Rich Message: "),
      NOTIFICATION_RICHMEDIA_SUBJECT("TMG Gallery - ");

      String label;

      private CreativeNotificationBaseContent(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label;
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
   
   
   public enum NotifiactionContent{
      DRAFT("has been updated successfully"),
      DRAFTREVIEW("has been submitted to the Draft Review phase by"),
      TRANSLATION("has been submitted to the Translate phase by"),
      TRANSLATIONREVIEW("has been submitted to the Translate Review phase by"),
      APPROVE("has been submitted to the Approval phase by"),
      LIBRARY("has been submitted to the Library phase by");
      
      String label;

      private NotifiactionContent(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label;
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
      
   public enum CreaiveInnerPageHeaderText{
      DRAFT("Draft Messages: Rich Media"),
      DRAFTREVIEW("Review Message Drafts: Rich Media"),
      TRANSLATION("Messages for Translation: Rich Media"),
      TRANSLATIONREVIEW("Review Message Translation: Rich Media"),
      APPROVE("Approve Translated Messages: Rich Media"),
      LIBRARY("Message Library: Rich Media");
      
      String label;

      private CreaiveInnerPageHeaderText(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }
}