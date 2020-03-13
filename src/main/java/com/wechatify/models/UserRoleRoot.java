/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.models;

import java.util.List;

public class UserRoleRoot
{
    private List<EnvironmentType> environmentType;

    public List<EnvironmentType> getEnvironmentType ()
    {
        return environmentType;
    }

    public void setEnvironmentType (List<EnvironmentType> environmentType)
    {
        this.environmentType = environmentType;
    }

    @Override
    public String toString()
    {
        return "UserRoleRoot [environmentType = "+environmentType+"]";
    }
}
	
