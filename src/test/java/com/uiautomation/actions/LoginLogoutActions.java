package com.uiautomation.actions;

import com.uiautomation.pages.HomePage;
import com.uiautomation.pages.LoginPage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.UserRole;
import com.wechatify.models.UserDetails;
import com.wechatify.utils.Constants;

import net.thucydides.core.annotations.Step;

public class LoginLogoutActions {

	LoginPage loginPage;
	HomePage homePage;

	@Step
	public void navigateWeChatifyLoginPage() {
		CommonUtils.initializeEnvAndUserType();
		loginPage.open();
		loginPage.getDriver().manage().window().maximize();
	}

	@Step
	public boolean isNavigatedToHomePage() {
		return loginPage.getLoginPageHeaderText().contains(Constants.LOGIN_PAGE_HEADERTEXT);
	}

	@Step
	public void clickUserLoginButton() {
		loginPage.clickLoginBtn();
	}

	@Step
	public void performLoginByUserType(String userRole) {
		UserDetails userData = CommonUtils.getUserDetailsByRole(UserRole.valueOf(userRole.toUpperCase()));
		loginPage.loginToWeChatify(userData.getUserId(), userData.getPassword());
	}

	@Step
	public void performLogin(String userEmail, String password) {
		loginPage.open();
		loginPage.loginToWeChatify(userEmail, password);
	}

	@Step
	public boolean isLoginSuccessfull() {
		return homePage.isLogoutBtnDisplayed();
	}

	@Step
	public void performLogout() {
		homePage.logoutFromWeChatify();
	}

	@Step
	public String getValidationErrorMsg() {
		return loginPage.getValidationErrorMsg();
	}

	@Step
	public boolean isLogOutSucessfull() {
		return loginPage.getLoginPageHeaderText().contains(Constants.LOGIN_PAGE_HEADERTEXT);
	}
}
