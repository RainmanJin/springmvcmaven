package com.fendo.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/aaa")
@Controller
public class TestController {
	

	@RequestMapping(value="/add")
	public String add(String uname,String upwd){
		System.out.println("��Ӳ�����ҵ���߼�:"+uname+" "+upwd);
		return "success";
	}
	
	
}
