
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFTrialPeriod extends SFODataObject {

	@SerializedName("ProductID")
	private String ProductID;
	@SerializedName("AppStore")
	private String AppStore;
	@SerializedName("DurationInDays")
	private Integer DurationInDays;

	public String getProductID() {
		return this.ProductID;
	}

	public void setProductID(String productid) {
		this.ProductID = productid;
	}
	public String getAppStore() {
		return this.AppStore;
	}

	public void setAppStore(String appstore) {
		this.AppStore = appstore;
	}
	public Integer getDurationInDays() {
		return this.DurationInDays;
	}

	public void setDurationInDays(Integer durationindays) {
		this.DurationInDays = durationindays;
	}

}