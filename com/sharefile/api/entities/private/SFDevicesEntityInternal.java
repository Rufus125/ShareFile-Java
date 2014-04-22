
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

public class SFDevicesEntityInternal extends SFODataEntityBase
{
    /**
	* Get Device Users for Current User
	* @return A feed of DeviceUser objects
    */
	public SFApiQuery<SFODataFeed<SFDeviceUser>> get()
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> sfApiQuery = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Device by ID
	* @param id 	
	* @return Device
    */
	public SFApiQuery<SFDevice> get(String id)
	{
		SFApiQuery<SFDevice> sfApiQuery = new SFApiQuery<SFDevice>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public SFApiQuery<SFODataFeed<SFDeviceUser>> getByUser(String userId)
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> sfApiQuery = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		sfApiQuery.setFrom("User");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(userId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Delete Device
	* @param id 	
	* @return no data on success
    */
	public SFApiQuery delete(String id)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	public SFApiQuery deleteByUser(String userId, String deviceId)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("User");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(userId);
		sfApiQuery.addActionIds(deviceId);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	public SFApiQuery<SFDeviceUser> createByUser(String userId, SFDeviceUser du)
	{
		SFApiQuery<SFDeviceUser> sfApiQuery = new SFApiQuery<SFDeviceUser>();
		sfApiQuery.setFrom("User");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(userId);
		sfApiQuery.setBody(du);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Wipe Device
	* @param deviceID 	
	* @param userid 	
	* @return no data on success
    */
	public SFApiQuery wipe(String deviceID, String userid = null)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("Wipe");
		sfApiQuery.addIds(deviceID);
		sfApiQuery.addQueryString("userid", userid);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Signal Wipe Done
    * {
    * "Logs" :
    * [
    * { "FileName":"fileA",
    * "FileID":"id",
    * "Timestamp":0,
    * "AccountID":"id",
    * "UserID":"userId1",
    * "Action":"OpenGeneric",
    * "AdditionalInfo":""
    * },
    * ...
    * ],
    * "WipeResults" :
    * [
    * {"id":"userId1", "WipeToken":"token1", "Success":"true", "ErrorMessage":"" },
    * {"id":"userId1", "WipeToken":"token2", "Success":"false", "ErrorMessage":"some error" },
    * ...
    * ]
    * }
	* Signal that a device wipe has been completed
	* @param deviceID 	
	* @param deviceWipeReport 	
	* @param singlePlane 	
	* @return no data on success
    */
	public SFApiQuery wipeDone(String deviceID, SFDeviceWipeReport deviceWipeReport, Boolean singlePlane = false)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("WipeDone");
		sfApiQuery.addIds(deviceID);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setBody(deviceWipeReport);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Check Device Status
	* @param deviceID 	
	* @return DeviceStatus
    */
	public SFApiQuery<SFDeviceStatus> status(String deviceID)
	{
		SFApiQuery<SFDeviceStatus> sfApiQuery = new SFApiQuery<SFDeviceStatus>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("Status");
		sfApiQuery.addIds(deviceID);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

