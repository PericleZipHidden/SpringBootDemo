package com.dim.api.other.eobj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dim.api.eobj.DimDimensionInstanceEObj;
import com.dim.api.eobj.DimFunctionEObj;

public class DimDataEObj {
 	private String dimName;
	private Object dimValue;
	private List<DimDataEObj> childs = new ArrayList<DimDataEObj>();
	private List<Object> functionResult = new ArrayList<Object>();
	private List<Integer> functionResultNum = new ArrayList<Integer>();
	private List<DimFunctionEObj> functions = new ArrayList<DimFunctionEObj>();
	private DimDimensionInstanceEObj  dimInstanceEObj;
	private Integer funcNum;
	private Integer dimLevel;
 	private Map<String,Object> tmpParam=new HashMap<String,Object >();

	public Integer getDimLevel() {
		return dimLevel;
	}

	public void setDimLevel(Integer dimLevel) {
		this.dimLevel = dimLevel;
	}

	public Integer getFuncNum() {
		return funcNum;
	}

	public void setFuncNum(Integer funcNum) {
		this.funcNum = funcNum;
	}

	public DimDimensionInstanceEObj getDimInstanceEObj() {
		return dimInstanceEObj;
	}

	public void setDimInstanceEObj(DimDimensionInstanceEObj dimInstanceEObj) {
		this.dimInstanceEObj = dimInstanceEObj;
	}

	public int getHeight() {
/*		if (functionResult!=null && functionResult.size() > 0) {
			this.high=functionResult.size();

			return functionResult.size();
		} else {
			int ret = 0;
			for (DimDataEObj dd : childs) {
				ret = ret + dd.getHeight();
			}
			this.high=ret;
			return ret;
		}*/
		
		if ( childs.size() == 0) {
			return 1;
		} else {
			int ret = 0;
			for (DimDataEObj dd : childs) {
				ret = ret + dd.getHeight();
			}
			//this.high=ret;
			return ret;
		}
 	}

	public DimDataEObj(DimDimensionInstanceEObj dimInstanceEObj,int funcNum) {
		this.dimInstanceEObj=dimInstanceEObj;
		this.funcNum=funcNum;
	}

	public String getDimName() {
		return dimName;
	}

	public void setDimName(String dimName) {
		this.dimName = dimName;
	}

	public List<DimDataEObj> getChilds() {
		return childs;
	}

	public void setChilds(List<DimDataEObj> childs) {
		this.childs = childs;
	}

	public List<Object> getFunctionResult() {
		return functionResult;
	}

	public void setFunctionResult(List<Object> functionResult) {
		this.functionResult = functionResult;
	}

	public Object getDimValue() {
		return dimValue;
	}

	public void setDimValue(Object dimValue) {
		this.dimValue = dimValue;
	}

/*	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}*/

	public List<DimFunctionEObj> getFunctions() {
		return functions;
	}

	public void setFunctions(List<DimFunctionEObj> functions) {
		this.functions = functions;
	}

	public List<Integer> getFunctionResultNum() {
		return functionResultNum;
	}

	public void setFunctionResultNum(List<Integer> functionResultNum) {
		this.functionResultNum = functionResultNum;
	}

 

	public Map<String, Object> getTmpParam() {
		return tmpParam;
	}

	public void setTmpParam(Map<String, Object> tmpParam) {
		this.tmpParam = tmpParam;
	}

 
 

}
