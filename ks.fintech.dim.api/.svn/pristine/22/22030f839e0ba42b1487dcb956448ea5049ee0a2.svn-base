package com.dim.api.other.eobj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dim.api.eobj.DimDimensionInstanceEObj;
import com.dim.api.eobj.DimFunctionEObj;

public class DimResultEObj {
	private List<String> headers = new ArrayList<String>();
	private List<DimDataEObj> dimData = new ArrayList<DimDataEObj>();

	public DimResultEObj(List<DimFunctionEObj> functions, List<DimDimensionInstanceEObj> dimInstanceses) {

		for (DimDimensionInstanceEObj dimInstancese : dimInstanceses) {
			headers.add(dimInstancese.getDimDimensionEObj().getDimName());
		}
		for (DimFunctionEObj function : functions) {
			headers.add(function.getFuncOutname());
		}

	}

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	public List<DimDataEObj> getDimData() {
		return dimData;
	}

	public void setDimData(List<DimDataEObj> dimData) {
		this.dimData = dimData;
	}

	public List<List<Map<String, String>>> getHtmlTd() {
		List<List<Map<String, String>>> ret = new ArrayList();
		for (DimDataEObj eobj : dimData) {
			ret.addAll(getDimDataTd(eobj));
		}

		return ret;
	}

	public List<List<Map<String, String>>> getDimDataTd(DimDataEObj eobj) {
		List<List<Map<String, String>>> ret = new ArrayList();
		if (eobj.getChilds().size() == 0) {
			List<Map<String, String>> ret1 = new ArrayList();
			Map m1 = new HashMap();
			m1.put("value", eobj.getDimName());
			m1.put("height", "1");
			m1.put("wide", eobj.getDimLevel());
			ret1.add(m1);
			for(Object o:eobj.getFunctionResult()){
				Map m = new HashMap();
				m.put("value", o.toString());
				m.put("height", "1");
				m.put("wide", "1");
				ret1.add(m);

			}
			ret.add(ret1);
			return ret;
		}else{
			List<List<Map<String, String>>> ret1 = new ArrayList();
			for(DimDataEObj ch:eobj.getChilds()){
				ret1.addAll(this.getDimDataTd(ch));
			}
			if(ret1.size()>0){
				Map m1 = new HashMap();
				m1.put("value", eobj.getDimName());
				m1.put("height", eobj.getHeight());
				m1.put("wide", "1");
				ret1.get(0).add(0, m1);
			}
			ret.addAll(ret1);
		}

		return ret;

	}

}
