
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

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.SFAccountsEntity;
import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFQuery;
import com.sharefile.api.models.internal.SFOutlookInformation;

public class SFAccountsEntityInternal extends SFAccountsEntity
{
    /**
	* Get Outlook Information
	* @return OutlookInformation
    */
	public ISFQuery<SFOutlookInformation> getOutlookInformation()
	{
		ISFQuery<SFOutlookInformation> sfApiQuery = new SFQuery<SFOutlookInformation>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("OutlookInformation");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}
