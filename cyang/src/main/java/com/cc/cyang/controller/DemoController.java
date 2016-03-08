package com.cc.cyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cyang
 * @Date: 2016年3月5日 下午2:01:49 
 *
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {
	
	@RequestMapping(value="/test1")
	public String test1(){
		System.out.println("测试");
		return "success";
	}
}
