
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
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

public class SFESignature extends SFODataObject {

	@SerializedName("ID")
	private String ID;
	@SerializedName("ItemID")
	private String ItemID;
	@SerializedName("ReferenceID")
	private String ReferenceID;
	@SerializedName("AlternateReferenceID")
	private String AlternateReferenceID;
	@SerializedName("SignedItemID")
	private String SignedItemID;
	@SerializedName("Provider")
	private SFSafeEnum<SFIntegrationProvider> Provider;
	@SerializedName("UserID")
	private String UserID;
	@SerializedName("Status")
	private SFSafeEnum<SFESignatureDocumentStatus> Status;
	@SerializedName("DateCreated")
	private Date DateCreated;
	@SerializedName("DateLastUpdated")
	private Date DateLastUpdated;
	@SerializedName("DocumentUrl")
	private String DocumentUrl;

	public String getID() {
		return this.ID;
	}

	public void setID(String id) {
		this.ID = id;
	}
	public String getItemID() {
		return this.ItemID;
	}

	public void setItemID(String itemid) {
		this.ItemID = itemid;
	}
	public String getReferenceID() {
		return this.ReferenceID;
	}

	public void setReferenceID(String referenceid) {
		this.ReferenceID = referenceid;
	}
	public String getAlternateReferenceID() {
		return this.AlternateReferenceID;
	}

	public void setAlternateReferenceID(String alternatereferenceid) {
		this.AlternateReferenceID = alternatereferenceid;
	}
	public String getSignedItemID() {
		return this.SignedItemID;
	}

	public void setSignedItemID(String signeditemid) {
		this.SignedItemID = signeditemid;
	}
	public SFSafeEnum<SFIntegrationProvider> getProvider() {
		return this.Provider;
	}

	public void setProvider(SFSafeEnum<SFIntegrationProvider> provider) {
		this.Provider = provider;
	}
	public String getUserID() {
		return this.UserID;
	}

	public void setUserID(String userid) {
		this.UserID = userid;
	}
	public SFSafeEnum<SFESignatureDocumentStatus> getStatus() {
		return this.Status;
	}

	public void setStatus(SFSafeEnum<SFESignatureDocumentStatus> status) {
		this.Status = status;
	}
	public Date getDateCreated() {
		return this.DateCreated;
	}

	public void setDateCreated(Date datecreated) {
		this.DateCreated = datecreated;
	}
	public Date getDateLastUpdated() {
		return this.DateLastUpdated;
	}

	public void setDateLastUpdated(Date datelastupdated) {
		this.DateLastUpdated = datelastupdated;
	}
	public String getDocumentUrl() {
		return this.DocumentUrl;
	}

	public void setDocumentUrl(String documenturl) {
		this.DocumentUrl = documenturl;
	}

}