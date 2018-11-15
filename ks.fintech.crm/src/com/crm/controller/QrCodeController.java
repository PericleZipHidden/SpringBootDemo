package com.crm.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.util.QrCodeCreateUtil;
import com.google.zxing.WriterException;

import cn.hutool.http.HttpUtil;

/**
 * 生成二维码
 * @author PZH
 */
@Controller
@RequestMapping(value="/crm/QrCode")
public class QrCodeController {
	

	
	
	
	/**
	 * 生成二维码
	 * @param request 请求对象
	 * @param response 响应对象
	 */
	@RequestMapping(value="/create.jhtml",produces="text/html;charset=UTF-8")
	@ResponseBody
	public  String createQr(HttpServletRequest request,HttpServletResponse response) {
		String string = HttpUtil.get("https://10.253.117.136:19080/api/send/single?username=zts&applicationIdentifier=KSYC&businessIdentifier=LOGIN_VERIFICATIONCODE&mobile=18292028336&content=hahaha&applicationUser=QQQQQQ");
		   
		System.out.println(string);
		String responseText =null;
		try {
			QrCodeCreateUtil.createQrCode(new FileOutputStream(new File("d:\\qrcodeTest.jpg")),"channel=@0001$luoqin&brokerId=0212&mobile=4007002828&packName=xsj",900,"JPEG");
			 responseText = "生成成功";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			 responseText = "生成失败";
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			 responseText = "生成失败";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 responseText = "生成失败";
		}
		
		
		
		
		
		return responseText;
		
	}
	
	
}