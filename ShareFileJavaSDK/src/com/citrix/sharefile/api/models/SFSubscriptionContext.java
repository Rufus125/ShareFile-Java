
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFSubscriptionContext extends SFODataObject {

	@SerializedName("ResourceType")
	private String ResourceType;
	@SerializedName("ResourceId")
	private String ResourceId;

		/**
		* The Context Resource Type
		*/
	public String getResourceType() {
		return this.ResourceType;
	}

		/**
		* The Context Resource Type
		*/
	public void setResourceType(String resourcetype) {
		this.ResourceType = resourcetype;
	}
		/**
		* The Context Resource Id, Can only be empty for Account Context
		*/
	public String getResourceId() {
		return this.ResourceId;
	}

		/**
		* The Context Resource Id, Can only be empty for Account Context
		*/
	public void setResourceId(String resourceid) {
		this.ResourceId = resourceid;
	}

}