
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

package com.sharefile.api.models;

public class SFEnsSubscriptionRequest extends SFODataObject {

	private String mEnsServerUrl;
	private String mClientId;
	private SFODataObject mEntity;
	private SFSafeEnum<SFEnsEventType> mEventTypes;
	private Boolean mIncludeProgeny;

	public String getEnsServerUrl() {
		return mEnsServerUrl;
	}

	public void setEnsServerUrl(String ensserverurl) {
		mEnsServerUrl = ensserverurl;
	}
	public String getClientId() {
		return mClientId;
	}

	public void setClientId(String clientid) {
		mClientId = clientid;
	}
	public SFODataObject getEntity() {
		return mEntity;
	}

	public void setEntity(SFODataObject entity) {
		mEntity = entity;
	}
	public SFSafeEnum<SFEnsEventType> getEventTypes() {
		return mEventTypes;
	}

	public void setEventTypes(SFSafeEnum<SFEnsEventType> eventtypes) {
		mEventTypes = eventtypes;
	}
	public Boolean getIncludeProgeny() {
		return mIncludeProgeny;
	}

	public void setIncludeProgeny(Boolean includeprogeny) {
		mIncludeProgeny = includeprogeny;
	}
}