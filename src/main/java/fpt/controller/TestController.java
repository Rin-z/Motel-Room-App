package fpt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fpt.service.AccountStatusService;


@Controller
public class TestController {
	
	@RequestMapping("/")
	public String hello(){
		return "index";
	}
	
	@RequestMapping("/2")
	public String test2(){
		return "index2";
	}
	
	@RequestMapping("/status")
	public ModelAndView getStatusName(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session){
		String id = request.getParameter("accStatusId");
		if(id!=null) {
			AccountStatusService accstatus = new AccountStatusService();
			if(accstatus!=null) {
				String name = accstatus.findNameByAccstatusid(id);
				if(name!=null) {
					model.addAttribute("statusName", name);
				}
			}
		}
		else {
			model.addAttribute("statusName", "nothing belong with");
		}
		return new ModelAndView("status");
	}
	
	@RequestMapping("/log")
	public ModelAndView log(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session){
		model.addAttribute("testmess", "test message!");
		return new ModelAndView("login");
	}
	
	
	
}
