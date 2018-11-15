package com.dim.api.var;

/**
 * @description : 
 * @author :chengye.yu
 * @create :2017-05-12
 */
public enum FunctionCrossQueryEnum {
	
	Valid("1") , 
	InValid("0")

	;
	private final String value;
    public String getValue() {
        return value;
    }
    
	FunctionCrossQueryEnum(String value){
		this.value = value;
	}
	
	public String toString() {
		switch (this) {
		case Valid:
			return "有效";
		case InValid:
			return "无效";
		default :
			return "unknow";
		}
	}

}
