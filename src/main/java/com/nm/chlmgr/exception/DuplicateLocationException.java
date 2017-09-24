package com.nm.chlmgr.exception;

import javax.ws.rs.core.Response.Status;

import com.nm.chlmgr.exception.meta.LocationBaseException;

public class DuplicateLocationException extends LocationBaseException {

	private static final long serialVersionUID = -8212991366777389573L;

	public DuplicateLocationException() {

		super(Status.CONFLICT, "Location is already stored");
		
	}
	
}