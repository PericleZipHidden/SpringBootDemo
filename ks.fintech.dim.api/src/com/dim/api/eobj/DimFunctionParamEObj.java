package com.dim.api.eobj;

import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description
 * @ClassName
 * @Create Date 2017-05-18 20:02:56.087
 * @Modified
 * @version V1.0
 */
public class DimFunctionParamEObj extends AbstractEObj {
	private String paramShowName;
	// 参数Id
	private Long paramId;
	// 参数名称
	private String paramName;
	// 参数数据类型
	private String dataType;
	// 控件类型
	private Long controlTypeId;
	// 功能Id
	private Long funcId;
	// 默认值
	private String defaultValue;
	// 参数顺序
	private Long paramOrd;
	// 关联维度ID
	private Long dimId;
	// 查询Id
	private Long compQueryId;
	// 查询组件类型
	private String inputCompType;
	// 参数描述
	private String paramDescription;

	public Long getParamId() {
		return this.paramId;
	}

	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Long getControlTypeId() {
		return this.controlTypeId;
	}

	public void setControlTypeId(Long controlTypeId) {
		this.controlTypeId = controlTypeId;
	}

	public Long getFuncId() {
		return this.funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Long getParamOrd() {
		return this.paramOrd;
	}

	public void setParamOrd(Long paramOrd) {
		this.paramOrd = paramOrd;
	}

	public Long getDimId() {
		return dimId;
	}

	public void setDimId(Long dimId) {
		this.dimId = dimId;
	}

	public DimFunctionParamEObj(Long funcId) {
		super();
		this.funcId = funcId;
	}

	public DimFunctionParamEObj() {
		super();
	}

	public String getParamShowName() {
		return paramShowName;
	}

	public void setParamShowName(String paramShowName) {
		this.paramShowName = paramShowName;
	}

	public Long getCompQueryId() {
		return compQueryId;
	}

	public void setCompQueryId(Long compQueryId) {
		this.compQueryId = compQueryId;
	}

	public String getInputCompType() {
		return inputCompType;
	}

	public void setInputCompType(String inputCompType) {
		this.inputCompType = inputCompType;
	}

	public String getParamDescription() {
		return paramDescription;
	}

	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

}
