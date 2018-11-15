package com.crm.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wb.util.PropKit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.hutool.core.io.FileUtil;

@Controller
@RequestMapping(value="/crm/BusinessDossiers")
public class BusinessDossiersController {
	
	
	/**
	 * 文件自动移位并存入数据库
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/move.jhtml",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String moveAndStore(HttpServletRequest request,HttpServletResponse response) throws Exception {
		StringBuffer sb=new StringBuffer();
		String src = PropKit.getProperty("BusinessDossiersPath");
		String format = PropKit.getProperty("BusinessDossiersFormat");
		sb.append(src+"/"+new SimpleDateFormat(format).format(new Date()));
		String[] UserNames;
		File root=new File(sb.toString());
		UserNames=root.list();
//		for (String userPath : UserNames) {
//			File[] userFiles=new File(userPath).listFiles();
//			if()
//			
//			
//		}
//		
//		
//		FileUtil.
		
		return "0";
	
	}
	
	public String[] findDossiersType() {
		/*
		 * 执行一个sp,返回各个档案的对应关系,
		 * 返回的每条结果有Dossier_type和actual_Dossier_type
		 *把每条记录做一个插入
		 */
		
		
		return new String[] {"1"};
	}
	
	public void save(String client_no,String filePath,String fileSuffix,String fileSize) {
		/*
		 * 执行保存的sp
		 */
		
		
	}
	
	
	
	
	
	
}
