/**
 * 
 */
package com.tlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HUASINE
 *
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping(value="/login")
	public String add(String uname,String upwd){
		System.out.println("��Ӳ�����ҵ���߼�login:"+uname+" "+upwd);
		return "success";
	}
}
