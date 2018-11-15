package com.dim.api.eobj;

import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description
 * @ClassName
 * @Create Date 2017-05-05 11:13:32.834
 * @Modified
 * @version V1.0
 */

public class DimQueryEObj extends AbstractEObj {
	public static final String resultType_M = "M";
	public static final String resultType_L = "L";

	//查询Id
	private  Long  queryId;
	//数据源Id
	private  Long  sourceId;
	//查询 表达式
	private  String  queryExpression;
	//查询名称
	private  String  queryName;
	//查询所属目录ID
	private  String  queryCategoryId;
	//备注描述
	private  String  queryDescription;
	//null
	private  String  resultType;
	
	private String queryCode;
	

	public String getQueryCode() {
		return queryCode;
	}

	public void setQueryCode(String queryCode) {
		this.queryCode = queryCode;
	}

	public Long getQueryId() {
		return queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	public Long getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public String getQueryExpression() {
		return this.queryExpression;
	}

	public void setQueryExpression(String queryExpression) {
		this.queryExpression = queryExpression;
	}

	public String getQueryName() {
		return this.queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public String getQueryCategoryId() {
		return this.queryCategoryId;
	}

	public void setQueryCategoryId(String queryCategoryId) {
		this.queryCategoryId = queryCategoryId;
	}

	public String getQueryDescription() {
		return this.queryDescription;
	}

	public void setQueryDescription(String queryDescription) {
		this.queryDescription = queryDescription;
	}



	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	
	

}
