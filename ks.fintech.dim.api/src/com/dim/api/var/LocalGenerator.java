package com.dim.api.var;

import ks.fintech.framework.generate.DictGenerator;

public class LocalGenerator {
	public static void main(String[] args) {
		DictGenerator.generate(
				"ks.fintech.dim/src/config/dim/dictionary_zh_CN.properties",
				"ks.fintech.impl/src/config/dim/errorCode_zh_CN.properties", 
				 LocalGenerator.class,
				"Dim");
	}
}
