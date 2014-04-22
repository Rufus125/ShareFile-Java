
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

public class SFSession extends SFODataObject {

	private SFPrincipal mPrincipal;
	private String mAuthenticationType;
	private String mOAuth2ClientName;
	private String mTool;
	private String mVersion;
	private String mClientIPAddress;
	private Boolean mIsAuthenticated;
	private String mName;
	private SFDeviceUser mDeviceUser;

	public SFPrincipal getPrincipal() {
		return mPrincipal;
	}

	public void setPrincipal(SFPrincipal principal) {
		mPrincipal = principal;
	}
	public String getAuthenticationType() {
		return mAuthenticationType;
	}

	public void setAuthenticationType(String authenticationtype) {
		mAuthenticationType = authenticationtype;
	}
	public String getOAuth2ClientName() {
		return mOAuth2ClientName;
	}

	public void setOAuth2ClientName(String oauth2clientname) {
		mOAuth2ClientName = oauth2clientname;
	}
	public String getTool() {
		return mTool;
	}

	public void setTool(String tool) {
		mTool = tool;
	}
	public String getVersion() {
		return mVersion;
	}

	public void setVersion(String version) {
		mVersion = version;
	}
	public String getClientIPAddress() {
		return mClientIPAddress;
	}

	public void setClientIPAddress(String clientipaddress) {
		mClientIPAddress = clientipaddress;
	}
	public Boolean getIsAuthenticated() {
		return mIsAuthenticated;
	}

	public void setIsAuthenticated(Boolean isauthenticated) {
		mIsAuthenticated = isauthenticated;
	}
	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}
	public SFDeviceUser getDeviceUser() {
		return mDeviceUser;
	}

	public void setDeviceUser(SFDeviceUser deviceuser) {
		mDeviceUser = deviceuser;
	}
}