






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

import com.google.gson.annotations.SerializedName;


public class SFToolInformation extends SFODataObject {



	@SerializedName("ToolName")

	private String ToolName;


	@SerializedName("Version")

	private String Version;




	public String getToolName() {
		return ToolName;
	}


	public void setToolName(String toolname) {
		ToolName = toolname;
	}


	public String getVersion() {
		return Version;
	}


	public void setVersion(String version) {
		Version = version;
	}

}