/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.utils;

import java.util.List;

import com.wechatify.enums.EnvironmentTypes;
import com.wechatify.models.EnvironmentType;
import com.wechatify.models.UserDetails;
import com.wechatify.models.UserRoleRoot;

public class YamlUtils {

	/**
	 * This method will return the Environment URL by environment type
	 * 
	 * @param userData
	 * @param envType
	 * @return
	 * @throws Exception
	 */
	public static String getEnvUrlByEnyType(final UserRoleRoot userData, final EnvironmentTypes envType) {
		final List<EnvironmentType> userList = userData.getEnvironmentType();
		String envUrl = null;
		for (EnvironmentType environmentType : userList) {
			if (envType.toString().equalsIgnoreCase(environmentType.getEnvironment())) {
				envUrl = environmentType.getEnvUrl();
			}
		}
		return envUrl;
	}

	/**
	 * This method will return the List of Usertype by Environment Type
	 * 
	 * @param userData
	 * @param envType
	 * @return
	 * @throws Exception
	 */
	public static List<UserDetails> getUserTypeListByEnvType(final UserRoleRoot userData,
			final EnvironmentTypes envType) throws Exception {
		final List<EnvironmentType> userList = userData.getEnvironmentType();
		List<UserDetails> userTypeList = null;
		for (EnvironmentType environmentType : userList) {
			if (envType.toString().equalsIgnoreCase(environmentType.getEnvironment())) {
				userTypeList = environmentType.getUserType();
			}
		}
		return userTypeList;
	}

	/**
	 * This method will return the user detail by environment type and user role
	 * 
	 * @param userRoleRoot
	 * @param envType
	 * @param userRole
	 * @return
	 * @throws Exception
	 */
	public static UserDetails getUserDetailByRole(final UserRoleRoot userRoleRoot, final EnvironmentTypes envType,
			final String userRole) throws Exception {
		List<UserDetails> userTypeList = getUserTypeListByEnvType(userRoleRoot, envType);
		UserDetails userTypeFilter = null;
		for (UserDetails userType : userTypeList) {
			if (userRole.equalsIgnoreCase(userType.getUserRole())) {
				userTypeFilter = userType;
			}
		}
		return userTypeFilter;
	}
}
