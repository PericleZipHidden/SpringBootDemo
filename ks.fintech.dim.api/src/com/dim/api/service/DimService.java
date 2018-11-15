package com.dim.api.service;

import java.util.Map;

import com.dim.api.eobj.DimQueryEObj;

public interface DimService {

	public Object dealPquery(DimQueryEObj query,Map params);
	
	
}
