package fpt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import fpt.service.AccountInfoService;

@Controller
public class TestController2 {

	@Autowired
	private AccountInfoService accountInfoService;

	
	public TestController2() {
		super();
	}

	public TestController2(AccountInfoService accountInfoService) {
		super();
		this.accountInfoService = accountInfoService;
	}

	@GetMapping("list-accountInfo")
	public String showListAccountInfo(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("listOfAccountInfo", accountInfoService.findAllAccountInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list-accountInfo";

	}
}
