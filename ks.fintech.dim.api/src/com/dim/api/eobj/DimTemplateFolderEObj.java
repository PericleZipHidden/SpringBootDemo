package com.dim.api.eobj;

import ks.fintech.framework.object.base.AbstractEObj;

/**
 * @Description
 * @ClassName
 * @Create Date 2017-08-08 14:34:32.15
 * @Modified
 * @version V1.0
 */
public class DimTemplateFolderEObj extends AbstractEObj {
	// 模板文件夹ID
	private Long templateFolderId;
	// 模板文件夹描述
	private String templateFolderDesc;
	// 模板文件夹名称
	private String templateFolderName;
	// 模板文件夹类型（暂无）
	private String templateFolderType;
	// 父模板文件夹ID
	private Long templateFolderParentId;

	public Long getTemplateFolderId() {
		return this.templateFolderId;
	}

	public void setTemplateFolderId(Long templateFolderId) {
		this.templateFolderId = templateFolderId;
	}

	public String getTemplateFolderDesc() {
		return this.templateFolderDesc;
	}

	public void setTemplateFolderDesc(String templateFolderDesc) {
		this.templateFolderDesc = templateFolderDesc;
	}

	public String getTemplateFolderName() {
		return this.templateFolderName;
	}

	public void setTemplateFolderName(String templateFolderName) {
		this.templateFolderName = templateFolderName;
	}

	public String getTemplateFolderType() {
		return this.templateFolderType;
	}

	public void setTemplateFolderType(String templateFolderType) {
		this.templateFolderType = templateFolderType;
	}

	public Long getTemplateFolderParentId() {
		return this.templateFolderParentId;
	}

	public void setTemplateFolderParentId(Long templateFolderParentId) {
		this.templateFolderParentId = templateFolderParentId;
	}
}
