package com.dim.api.eobj;

import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description
 * @ClassName
 * @Create Date 2017-05-11 09:06:46.37
 * @Modified
 * @version V1.0
 */
public class DimFunctionCrossQueryEObj extends AbstractEObj {
	// 交叉表Id
	private Long queryFuncId;
	// 查询Id
	private Long queryId;
	// 功能Id
	private Long funcId;
	// 优先级
	private Long priority;
	// 功能点实体
	private DimFunctionEObj dimFunctionEObj;
	// 查询实体
	private DimQueryEObj dimQueryEObj;

	public DimFunctionEObj getDimFunctionEObj() {
		return dimFunctionEObj;
	}

	public void setDimFunctionEObj(DimFunctionEObj dimFunctionEObj) {
		this.dimFunctionEObj = dimFunctionEObj;
	}

	public DimQueryEObj getDimQueryEObj() {
		return dimQueryEObj;
	}

	public void setDimQueryEObj(DimQueryEObj dimQueryEObj) {
		this.dimQueryEObj = dimQueryEObj;
	}

	public Long getQueryFuncId() {
		return this.queryFuncId;
	}

	public void setQueryFuncId(Long queryFuncId) {
		this.queryFuncId = queryFuncId;
	}

	public Long getQueryId() {
		return this.queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	public Long getFuncId() {
		return this.funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

}
