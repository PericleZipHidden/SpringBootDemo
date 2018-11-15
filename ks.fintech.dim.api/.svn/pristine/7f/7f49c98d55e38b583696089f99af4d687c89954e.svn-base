package com.dim.api.eobj;

import java.util.ArrayList;
import java.util.List;

import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description
 * @ClassName
 * @Create Date 2017-05-09 15:47:05.056
 * @Modified
 * @version V1.0
 */
public class DimFunctionEObj extends AbstractEObj {
	// 功能号
	private Long funcId;
	// 功能表达式
	private String funcExpression;
	// 指标名称
	private String funcOutname;
	// 功能顺序
	private Long funcOrd;
	// 功能名
	private String funcName;
	// 备注描述
	private String funcDescription;
	// 目录ID
	private Long funcCategoryId;
	// 统计策略 S 求和、A 平均 、C 计算
	private String staticStragegy;

	private List<DimFunctionParamEObj> functionParams = new ArrayList<DimFunctionParamEObj>();

	// 临时使用，不持久化
	private Boolean total = false;
	// SP名称
	private String spName;
	
	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public Boolean getTotal() {
		return total;
	}

	public void setTotal(Boolean total) {
		this.total = total;
	}

	public Long getFuncId() {
		return this.funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}

	public String getFuncExpression() {
		return this.funcExpression;
	}

	public void setFuncExpression(String funcExpression) {
		this.funcExpression = funcExpression;
	}

	public String getFuncOutname() {
		return this.funcOutname;
	}

	public void setFuncOutname(String funcOutname) {
		this.funcOutname = funcOutname;
	}

	public Long getFuncOrd() {
		return this.funcOrd;
	}

	public void setFuncOrd(Long funcOrd) {
		this.funcOrd = funcOrd;
	}

	public String getFuncName() {
		return this.funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getFuncDescription() {
		return this.funcDescription;
	}

	public void setFuncDescription(String funcDescription) {
		this.funcDescription = funcDescription;
	}

	public Long getFuncCategoryId() {
		return this.funcCategoryId;
	}

	public void setFuncCategoryId(Long funcCategoryId) {
		this.funcCategoryId = funcCategoryId;
	}

	public String getStaticStragegy() {
		return staticStragegy;
	}

	public void setStaticStragegy(String staticStragegy) {
		this.staticStragegy = staticStragegy;
	}


	public List<DimFunctionParamEObj> getFunctionParams() {
		return functionParams;
	}

	public void setFunctionParams(List<DimFunctionParamEObj> functionParams) {
		this.functionParams = functionParams;
	}

	public DimFunctionParamEObj getParamByDimId(Long dimId) {
		for (DimFunctionParamEObj paramEObj : this.getFunctionParams()) {
			if (dimId.equals(paramEObj.getDimId())) {
				return paramEObj;
			}
		}
		return null;
	}

}
