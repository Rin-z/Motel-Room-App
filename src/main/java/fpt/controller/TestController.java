package fpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	@RequestMapping("/")
	public String test1(){
		return "index";
	}
	
	@RequestMapping("/login1")
	public String test2(){
		//LoginService loginser= new LoginService();
		//User user = loginser.findOneByUserId(1);
		return "index2";
	}
}
