






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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;


public class SFDeviceUser extends SFODataObject {



	@SerializedName("Account")

	private SFAccount Account;


	@SerializedName("User")

	private SFUser User;


	@SerializedName("Device")

	private SFDevice Device;


	@SerializedName("IsOwner")

	private Boolean IsOwner;


	@SerializedName("FriendlyName")

	private String FriendlyName;


	@SerializedName("Wipe")

	private Boolean Wipe;


	@SerializedName("IsLocked")

	private Boolean IsLocked;


	@SerializedName("IsDeleted")

	private Boolean IsDeleted;


	@SerializedName("Created")

	private Date Created;


	@SerializedName("LastLogin")

	private Date LastLogin;


	@SerializedName("LastWipe")

	private Date LastWipe;


	@SerializedName("WipeToken")

	private String WipeToken;


	@SerializedName("WipeInitiator")

	private String WipeInitiator;


	@SerializedName("WipeInitiatorRole")

	private SFSafeEnum<SFDeviceActionInitiatorRole> WipeInitiatorRole;


	@SerializedName("LockInitiator")

	private String LockInitiator;


	@SerializedName("LockInitiatorRole")

	private SFSafeEnum<SFDeviceActionInitiatorRole> LockInitiatorRole;


	@SerializedName("DeviceType")

	private SFSafeEnum<SFSFTool> DeviceType;


	@SerializedName("LastErrorMessage")

	private String LastErrorMessage;




	public SFAccount getAccount() {
		return Account;
	}


	public void setAccount(SFAccount account) {
		Account = account;
	}


	public SFUser getUser() {
		return User;
	}


	public void setUser(SFUser user) {
		User = user;
	}


	public SFDevice getDevice() {
		return Device;
	}


	public void setDevice(SFDevice device) {
		Device = device;
	}


	public Boolean getIsOwner() {
		return IsOwner;
	}


	public void setIsOwner(Boolean isowner) {
		IsOwner = isowner;
	}


	public String getFriendlyName() {
		return FriendlyName;
	}


	public void setFriendlyName(String friendlyname) {
		FriendlyName = friendlyname;
	}


	public Boolean getWipe() {
		return Wipe;
	}


	public void setWipe(Boolean wipe) {
		Wipe = wipe;
	}


	public Boolean getIsLocked() {
		return IsLocked;
	}


	public void setIsLocked(Boolean islocked) {
		IsLocked = islocked;
	}


	public Boolean getIsDeleted() {
		return IsDeleted;
	}


	public void setIsDeleted(Boolean isdeleted) {
		IsDeleted = isdeleted;
	}


	public Date getCreated() {
		return Created;
	}


	public void setCreated(Date created) {
		Created = created;
	}


	public Date getLastLogin() {
		return LastLogin;
	}


	public void setLastLogin(Date lastlogin) {
		LastLogin = lastlogin;
	}


	public Date getLastWipe() {
		return LastWipe;
	}


	public void setLastWipe(Date lastwipe) {
		LastWipe = lastwipe;
	}


	public String getWipeToken() {
		return WipeToken;
	}


	public void setWipeToken(String wipetoken) {
		WipeToken = wipetoken;
	}


	public String getWipeInitiator() {
		return WipeInitiator;
	}


	public void setWipeInitiator(String wipeinitiator) {
		WipeInitiator = wipeinitiator;
	}


	public SFSafeEnum<SFDeviceActionInitiatorRole> getWipeInitiatorRole() {
		return WipeInitiatorRole;
	}


	public void setWipeInitiatorRole(SFSafeEnum<SFDeviceActionInitiatorRole> wipeinitiatorrole) {
		WipeInitiatorRole = wipeinitiatorrole;
	}


	public String getLockInitiator() {
		return LockInitiator;
	}


	public void setLockInitiator(String lockinitiator) {
		LockInitiator = lockinitiator;
	}


	public SFSafeEnum<SFDeviceActionInitiatorRole> getLockInitiatorRole() {
		return LockInitiatorRole;
	}


	public void setLockInitiatorRole(SFSafeEnum<SFDeviceActionInitiatorRole> lockinitiatorrole) {
		LockInitiatorRole = lockinitiatorrole;
	}


	public SFSafeEnum<SFSFTool> getDeviceType() {
		return DeviceType;
	}


	public void setDeviceType(SFSafeEnum<SFSFTool> devicetype) {
		DeviceType = devicetype;
	}


	public String getLastErrorMessage() {
		return LastErrorMessage;
	}


	public void setLastErrorMessage(String lasterrormessage) {
		LastErrorMessage = lasterrormessage;
	}

}