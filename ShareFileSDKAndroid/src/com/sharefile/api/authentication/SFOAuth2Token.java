package com.sharefile.api.authentication;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.sharefile.api.constants.SFKeywords;
import com.sharefile.api.exceptions.SFJsonException;
import com.sharefile.api.gson.SFGsonHelper;
import com.sharefile.api.interfaces.SFJsonInterface;
import com.sharefile.api.models.SFODataObject;


public class SFOAuth2Token implements SFJsonInterface
{
	public String mAccessToken = "";
	public String mRefreshToken = "";
	public String mTokenType = "";
	public String mAppcp = "";
	public String mApicp = "";
	public String mSubdomain = "";
	public int mExpiresIn = 0;

	/*
	public SFOAuth2Token()
	{
		mAccessToken = "default_accesstoke";
		mRefreshToken = "default_refresh_toke";
		mTokenType = "default_tokenType";
		mAppcp = "default_appcp";
		mApicp = "default_apicp";
		mSubdomain = "default_subdomain";
		mExpiresIn = 99;		
	}
	
	public SFOAuth2Token(boolean b)
	{				
	}*/
	
	public SFOAuth2Token(JsonObject json) 
	{
		parse(json);
	}
	
	public SFOAuth2Token(String jsonString) throws SFJsonException
	{
		parseFromJson(jsonString);
	}

	@Override
	public void parseFromJson(String jsonString) throws SFJsonException 
	{				        
        try
        {           	        	
        	SFGsonHelper.fromJson(jsonString, SFOAuth2Token.class, new TypeToken<SFOAuth2Token>(){}.getType(), new SFGsonDeserializer());
        }
        catch(JsonSyntaxException ex)
        {
        	throw new SFJsonException(ex);
        }        		
	}
	
	@Override
	public String toJsonString() throws SFJsonException 
	{		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty(SFKeywords.ACCESS_TOKEN, mAccessToken );
		jsonObject.addProperty(SFKeywords.REFRESH_TOKEN,mRefreshToken );
		jsonObject.addProperty(SFKeywords.TOKEN_TYPE,mTokenType );
		jsonObject.addProperty(SFKeywords.APP_CP,mAppcp );
		jsonObject.addProperty(SFKeywords.API_CP,mApicp );
		jsonObject.addProperty(SFKeywords.SUBDOMAIN,mSubdomain );
		jsonObject.addProperty(SFKeywords.EXPIRES_IN,mExpiresIn );
		
		return jsonObject.toString();
	}
	
	private class SFGsonDeserializer implements JsonDeserializer<Object>
	{
		@Override
		public SFODataObject deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext context) throws JsonParseException 
		{
			if (jsonelement != null) 
			{
				JsonObject json = jsonelement.getAsJsonObject();				
				parse(json);
			}
			
			return null;						
		}		
	}
	
	private void parse(JsonObject json) throws JsonParseException
	{
		if(json!=null)
		{						
			mAccessToken = SFGsonHelper.getString(json,SFKeywords.ACCESS_TOKEN , null);
			mRefreshToken = SFGsonHelper.getString(json,SFKeywords.REFRESH_TOKEN , null);
			mTokenType = SFGsonHelper.getString(json,SFKeywords.TOKEN_TYPE , null);
			mAppcp = SFGsonHelper.getString(json,SFKeywords.APP_CP , null);
			mApicp = SFGsonHelper.getString(json,SFKeywords.API_CP , null);
			mSubdomain = SFGsonHelper.getString(json,SFKeywords.SUBDOMAIN , null);
			mExpiresIn = SFGsonHelper.getInt(json,SFKeywords.EXPIRES_IN , 0);
		}
		else
		{
			throw new JsonParseException("NULL Object given to parser");
		}
	}
}