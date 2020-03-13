/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.models;

import java.util.List;

public class EnvironmentType
{
    private String environment;
    private String envUrl;
    private List<UserDetails> userType;

    public String getEnvironment ()
    {
        return environment;
    }

    public void setEnvironment (String environment)
    {
        this.environment = environment;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [environment = "+environment+", userType = "+userType+"]";
    }

	/**
	 * @return the envUrl
	 */
	public String getEnvUrl() {
		return envUrl;
	}

	/**
	 * @param envUrl the envUrl to set
	 */
	public void setEnvUrl(String envUrl) {
		this.envUrl = envUrl;
	}

	/**
	 * @return the userType
	 */
	public List<UserDetails> getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(List<UserDetails> userType) {
		this.userType = userType;
	}
}
			