
package com.uiautomation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/creative/negetive/VideoMediaCreativeNegative.feature" }, glue = { "com.uiautomation.steps" }
//,tags = {"@check"}

)
public class VideoCreativeNegetiveTest
{
  
}
