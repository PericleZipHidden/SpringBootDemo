package com.crm.controller;


import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import cn.hutool.http.HttpUtil;


/**
 * 期货管理短信平台
 * @author PZH
 */
@Controller
@RequestMapping(value="/crm/MailApi")
public class MailApi {
	
	
	@RequestMapping(value="/post.jhtml",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String postHttps(HttpServletRequest request,HttpServletResponse response) {
		String responseText ="发送失败";
		
		String  username = 	request.getParameter("username");
		String  applicationIdentifier = 	request.getParameter("applicationIdentifier");
		String  businessIdentifier = 	request.getParameter("businessIdentifier");
		String  mobile = 	request.getParameter("mobile");
		String  content = 	request.getParameter("content");
		String  applicationUser = 	request.getParameter("applicationUser");
		
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("username", username);
		paramMap.put("applicationIdentifier", applicationIdentifier);
		paramMap.put("businessIdentifier", businessIdentifier);
		paramMap.put("mobile", mobile);
		paramMap.put("content", content);
		paramMap.put("applicationUser", applicationUser);
		
		try {
			String result= HttpUtil.post("http://175.101.60.55:8080/api/send/single", paramMap);
           
			
			JsonObject jsonObject = (JsonObject) new JsonParser().parse(result);
			String errorCode=jsonObject.get("errorCode").getAsString();
			jsonObject.get("errorCode").getAsString();
			
			if("0".equals(errorCode)) {
			responseText="发送成功";
			}
			else {
				responseText="发送失败";
			}
		} catch (Exception e) {
			responseText="发生"+e+"错误,短信发送失败";
		}
		
		
		
		
		
		return responseText;
	}
	
	

}
