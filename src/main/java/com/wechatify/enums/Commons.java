package com.wechatify.enums;

/**
 * 
 * @version $Id$
 */
public class Commons
{

   public enum SaveAndNavigationButtonText{
      SAVE("Save"),
      NOTIFYTOUSER("Notify To User"),
      SAVEANDCLOSE("Save & Close"),
      SUBMITFORDRAFTREVIEW("Submit For Draft Review"),
      SUBMITFORTRANSLATION("Submit For Transaltion"),
      SUBMITFORAPPROVAL("Submit For Approval"),
      SUBMITFORTRANSALATIONREVIEW("Submit for Translation Review"),
      APPROVE("Approve"),
      PREVIEW("Preview"),
      REASSIGN("Reassign"),
      CHANGE("Change"),
      SENDFORSCHEDULE("Send For Schedule"),
      CANCEL("Cancel"),
      MOBILEPREVIEW("Mobile Preview"),
      OK("OK");
      
      String label;

      private SaveAndNavigationButtonText(String label)
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
