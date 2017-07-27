
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

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFIrmClassificationsEntity extends SFEntitiesBase
{
	public SFIrmClassificationsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get a list of all file types supported by IRM
	* @return List of strings
	*/
	public ISFQuery<SFODataFeed<SFODataObject>> getSupportedFileExtensions()	{

		SFApiQuery<SFODataFeed<SFODataObject>> sfApiQuery = new SFApiQuery<SFODataFeed<SFODataObject>>(this.client);
		sfApiQuery.setFrom("IrmClassifications");
		sfApiQuery.setAction("SupportedFileExtensions");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}
