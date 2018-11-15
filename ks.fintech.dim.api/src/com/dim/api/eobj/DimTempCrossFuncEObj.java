package com.dim.api.eobj;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description 
 * @ClassName 
 * @Create Date 2017-05-26 17:21:53.804
 * @Modified
 * @version V1.0
 */
public class DimTempCrossFuncEObj extends AbstractEObj {
	//null
	private  Long  tempCrossFuncId;
	//null
	private  Long  templateId;
	//null
	private  Long  functionId;
	// 模板实体类
	private DimTemplateEObj dimTemplateEObj;
	// 功能指标
	private DimFunctionEObj dimFunctionEObj;
	
	public DimTemplateEObj getDimTemplateEObj() {
		return dimTemplateEObj;
	}
	public void setDimTemplateEObj(DimTemplateEObj dimTemplateEObj) {
		this.dimTemplateEObj = dimTemplateEObj;
	}
	public DimFunctionEObj getDimFunctionEObj() {
		return dimFunctionEObj;
	}
	public void setDimFunctionEObj(DimFunctionEObj dimFunctionEObj) {
		this.dimFunctionEObj = dimFunctionEObj;
	}
	public Long getTempCrossFuncId()
	{
		return this.tempCrossFuncId;
	}
	public void setTempCrossFuncId(Long tempCrossFuncId)
	{
		this.tempCrossFuncId=tempCrossFuncId;
	}
	public Long getTemplateId()
	{
		return this.templateId;
	}
	public void setTemplateId(Long templateId)
	{
		this.templateId=templateId;
	}
	public Long getFunctionId()
	{
		return this.functionId;
	}
	public void setFunctionId(Long functionId)
	{
		this.functionId=functionId;
	}
	}
