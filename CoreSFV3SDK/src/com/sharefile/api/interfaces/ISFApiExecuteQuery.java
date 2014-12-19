package com.sharefile.api.interfaces;

import com.sharefile.api.exceptions.SFInvalidStateException;
import com.sharefile.api.exceptions.SFV3ErrorException;
import com.sharefile.api.models.SFODataObject;

/**
 *  Implementations of this interface provides the bare-minimum functions to make the V3 API server calls and read + parse their responses.
 *  <br>These calls are blocking calls so that the application can use its own thread management.
 *  
 *  <br><br>The calls to be made are in this sequence:<br>
 *  
 *  <b>
 *  <br>executeBlockingQuery();
 *  <br>callresponseListeners();
 *  </b>
 *  
 *  <br><br>Typical usage in Android AsyncTask would be :<br>
 *  
 *  <br>doInBackgrond()
 *  <br>{
 *  <br>	executeBlockingQuery();
 *  <br>}
 *  <br>
 *  <br>onPostExecute()
 *  <br>{
 *  <br>	callresponseListeners();
 *  <br>}
 *  
 */
public interface ISFApiExecuteQuery 
{
	public <T> T executeBlockingQuery() throws SFV3ErrorException, SFInvalidStateException;
	public void callResponseListeners() throws SFInvalidStateException;	
}
