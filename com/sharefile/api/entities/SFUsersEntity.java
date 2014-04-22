
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

package com.sharefile.api.entities;


import java.util.stream;

public class SFUsersEntity extends SFODataEntityBase
{
    /**
	* Get User
	* Retrieve a single user, by ID or email, or the currently authenticated user.
	* @param id 	
	* @param emailAddress 	
	* @return the requested User object
    */
	public SFApiQuery<SFUser> get(String id = null, String emailAddress = null)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addQueryString("id", id);
		sfApiQuery.addQueryString("emailAddress", emailAddress);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Customer
    * {
    * "Email":"user.one@domain.com",
    * "FirstName":"Name",
    * "LastName":"Last Name",
    * "Company":"Company",
    * "Password":"password",
    * "Preferences":
    * {
    * "CanResetPassword":true,
    * "CanViewMySettings":true
    * },
    * "DefaultZone":
    * {
    * "Id":"zoneid"
    * }
    * }
	* The following parameters from the input object are used: Email, FirstName, LastName, Company,
	* DefaultZone, Password, Preferences.CanResetPassword and Preferences.CanViewMySettingsOther parameters are ignored
	* @param user 	
	* @param pushCreatorDefaultSettings 	
	* @param addshared 	
	* @param notify 	
	* @param ifNecessary 	
	* @return The new user
    */
	public SFApiQuery<SFUser> create(SFUser user, Boolean pushCreatorDefaultSettings = false, Boolean addshared = false, Boolean notify = false, Boolean ifNecessary = false)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addQueryString("pushCreatorDefaultSettings", pushCreatorDefaultSettings);
		sfApiQuery.addQueryString("addshared", addshared);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("ifNecessary", ifNecessary);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Create Employee
    * {
    * "Email":"user.one@domain.com",
    * "FirstName":"Name",
    * "LastName":"Last Name",
    * "Company":"Company",
    * "Password":"password",
    * "StorageQuotaLimitGB":50,
    * "Preferences":
    * {
    * "CanResetPassword":true,
    * "CanViewMySettings":true
    * },
    * "DefaultZone":
    * {
    * "Id":"zoneid"
    * },
    * "IsAdministrator": false,
    * "CanCreateFolders": false,
    * "CanUseFileBox": true,
    * "CanManageUsers": false,
    * "Roles": [
    * "CanChangePassword", "CanManageMySettings",
    * "CanUseFileBox, "CanManageUsers, "CanCreateFolders, "CanUseDropBox, "CanSelectFolderZone,
    * "AdminAccountPolicies", "AdminBilling", "AdminBranding", "AdminChangePlan", "AdminFileBoxAccess",
    * "AdminManageEmployees", "AdminRemoteUploadForms", "AdminReporting", "AdminSharedDistGroups",
    * "AdminSharedAddressBook", "AdminViewReceipts", "AdminDelegate", "AdminManageFolderTemplates",
    * "AdminEmailMessages", "AdminSSO", "AdminSuperGroup", "AdminZones", "AdminCreateSharedGroups", "AdminConnectors"
    * ]
    * }
	* Create a new Employee user (AccountUser)
	* The following parameters from the input object are used: Email, FirstName, LastName, Company,
	* DefaultZone, Password, IsEmployee, IsAdministrator, CanCreateFolders, CanUseFileBox, CanManageUsers,
	* Preferences.CanResetPassword and Preferences.CanViewMySettings.
	* Other parameters are ignoredStorageQuotaLimitGB parameter is optional. If not specified or equal to -1 the account default storage quota value will be set for the user.
	* @param user 	
	* @param pushCreatorDefaultSettings 	
	* @param addshared 	
	* @param notify 	
	* @param ifNecessary 	
	* @return The new employee user
    */
	public SFApiQuery<SFUser> createAccountUser(SFAccountUser user, Boolean pushCreatorDefaultSettings = false, Boolean addshared = false, Boolean notify = false, Boolean ifNecessary = false)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AccountUser");
		sfApiQuery.addQueryString("pushCreatorDefaultSettings", pushCreatorDefaultSettings);
		sfApiQuery.addQueryString("addshared", addshared);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("ifNecessary", ifNecessary);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update User
    * {
    * "FirstName":"FirstName",
    * "LastName":"LastName",
    * "Company":"Company",
    * "Email":"user@domain.com",
    * "Security":
    * {
    * "IsDisabled":false
    * }
    * "DefaultZone":
    * {
    * "Id":"newzoneid"
    * }
    * }
	* Modifies an existing user object
	* The following parameters can be modified through this call: FirstName, LastName, Company,
	* Email, IsDisabled, DefaultZone Id
	* @param id 	
	* @param user 	
	* @return a modified user record
    */
	public SFApiQuery<SFUser> update(String id, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addIds(id);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Add Roles
    * {
    * "Roles" : [ "CanManageUsers", "CanSelectFolderZone" ]
    * }
	* Modifies an existing user object to ADD a new role
	* The following roles can be added to the user through this call (depending on User type):
	* CanCreateFolders,
	* CanSelectFolderZone,
	* CanUseFileBox,
	* CanManageUsers,
	* AdminSharedAddressBook,
	* CanChangePassword,
	* CanManageMySettings
	* @param parentid 	
	* @param user 	
	* @return a modified user record
    */
	public SFApiQuery<SFUser> updateRoles(String parentid, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Roles");
		sfApiQuery.addIds(parentid);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Set Roles
    * {
    * "Roles" : [ "CanManageUsers", "CanSelectFolderZone" ]
    * }
	* Sets the roles for a user (roles not provided will be disabled.)
	* The following roles can be set to the user through this call (depending on User type):
	* CanCreateFolders,
	* CanSelectFolderZone,
	* CanUseFileBox,
	* CanManageUsers,
	* AdminSharedAddressBook,
	* CanChangePassword,
	* CanManageMySettings
	* @param parentid 	
	* @param user 	
	* @return a modified user record
    */
	public SFApiQuery<SFUser> patchRoles(String parentid, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Roles");
		sfApiQuery.addIds(parentid);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PUT");
		return sfApiQuery;
	}

    /**
	* Update Employee or Promote Customer
    * {
    * "FirstName":"FirstName",
    * "LastName":"LastName",
    * "Company":"Company",
    * "Email":"user@domain.com",
    * "StorageQuotaLimitGB":100,
    * "Security":
    * {
    * "IsDisabled":false
    * }
    * "DefaultZone":
    * {
    * "Id":"newzoneid"
    * }
    * }
	* Modifies an existing user object
	* The following parameters can be modified through this call: FirstName, LastName, Company,
	* Email, IsEmployee, IsDisabled, DefaultZone Id, StorageQuotaLimitGB.During a promotion (the user id points to Customer), the following parameters can be
	* modified: CanCreateFolders, CanUseFileBox, CanManageUsers. StorageQuotaLimitGB equal to -1 sets the user quota to the account default storage quota value.
	* @param id 	
	* @param user 	
	* @return a modified user record
    */
	public SFApiQuery<SFUser> updateAccountUser(String id, SFAccountUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AccountUser");
		sfApiQuery.addActionIds(id);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Get HomeFolder
	* Returns a user's home folder
	* @param id 	
	* @return A folder record representing the requesting user home folder
    */
	public SFApiQuery<SFItem> getHomeFolder(String id)
	{
		SFApiQuery<SFItem> sfApiQuery = new SFApiQuery<SFItem>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("HomeFolder");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public SFApiQuery<SFODataFeed<SFItem>> topFolders(String userId)
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TopFolders");
		sfApiQuery.addIds(userId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public SFApiQuery<SFODataFeed<SFItem>> box(String userId)
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Box");
		sfApiQuery.addIds(userId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get User Preferences
	* Retrieves the User preferences record - all user-selected prefernces, such as timezone,
	* time format, sort preferences, etc.
	* @param id 	
	* @return the user selected preferences
    */
	public SFApiQuery<SFUserPreferences> getPreferences(String id)
	{
		SFApiQuery<SFUserPreferences> sfApiQuery = new SFApiQuery<SFUserPreferences>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Preferences");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Reset Password
    * {
    * "NewPassword":"new password",
    * "OldPassword":"old password"
    * }
    * {
    * "NewPassword":"new password",
    * "OldPassword":"old password"
    * }
	* Resets a user password. A user can reset his own password providing the old and new
	* passwords. Administrators can issue this call without providing the old password.
	* @param id 	
	* @param properties 	
	* @param notify 	
	* @return The modified user record
    */
	public SFApiQuery<SFUser> resetPassword(String id, SFODataObject properties, Boolean notify = false)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("ResetPassword");
		sfApiQuery.addIds(id);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.setBody(properties);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Send Welcome Email
	* Resends the 'welcome' email to the given user
	* @param id 	
    */
	public SFApiQuery resendWelcome(String id)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("ResendWelcome");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Delete User
	* Removes an user
	* @param id 	
	* @param completely 	
    */
	public SFApiQuery delete(String id, Boolean completely = false)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addIds(id);
		sfApiQuery.addQueryString("completely", completely);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the list of shared folders the authenticated user has access to
	* @return A list of Folder objects, representing shared folders of an user
    */
	public SFApiQuery<SFODataFeed<SFItem>> getAllSharedFolders()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AllSharedFolders");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the top-level folders for this user. This method requires the account to be
	* in the new UI model of "My Files", "Shared", "Connectors", "Favorites" tab - otherwise
	* it will return an empty list (new UX model is the default since May 2013).
	* @return A list of Folder objects, representing shared folders of an user
    */
	public SFApiQuery<SFODataFeed<SFItem>> getTopFolders()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TopFolders");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the connector folders that are associated with a network share service
	* @return A list of Folder objects, representing network shared connector folders of an user
    */
	public SFApiQuery<SFODataFeed<SFItem>> networkShareConnectors()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("NetworkShareConnectors");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the connector folders that are associated with a sharepoint service
	* @return A list of Folder objects, representing sharepoint folders of an user
    */
	public SFApiQuery<SFODataFeed<SFItem>> sharepointConnectors()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("SharepointConnectors");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Confirm the current user logging in for the first time
    * {
    * "FirstName":"",
    * "LastName":"",
    * "Company":"",
    * "Password":"",
    * "DayLightName":"",
    * "UTCOffset":"",
    * "DateFormat":"",
    * "TimeFormat":"",
    * "EmailInterval":0
    * }
	* @param settings 	
	* @return no data on success
    */
	public SFApiQuery confirm(SFUserConfirmationSettings settings)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Confirm");
		sfApiQuery.setBody(settings);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Get Current User Info
	* @return UserInfo
    */
	public SFApiQuery<SFUserInfo> getInfo()
	{
		SFApiQuery<SFUserInfo> sfApiQuery = new SFApiQuery<SFUserInfo>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Info");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

