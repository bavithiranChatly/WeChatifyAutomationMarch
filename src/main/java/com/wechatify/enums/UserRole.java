/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.wechatify.enums;

public enum UserRole {

	ADMIN("Admin"),
	NORMAL("Normal");
	
	String label;

	private UserRole(String label)
	{
		this.label = label;
	}

	public String getLabel()
	{
		return this.label;
	}

	public String toString()
	{
		return this.label;
	}
}
