/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.models;

public class UserDetails
{
    private String password;

    private String userRole;

    private String userId;

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getUserRole ()
    {
        return userRole;
    }

    public void setUserRole (String userRole)
    {
        this.userRole = userRole;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "UserDetails [password = "+password+", userRole = "+userRole+", userId = "+userId+"]";
    }
}
