package fpt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fpt.model.Account;
import fpt.service.AccountService;

@Controller
public class LoginController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/")
	public String home() {
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Model model, HttpServletRequest request, HttpSession session) {
		String username = request.getParameter("txtusername");
		String password = request.getParameter("txtpassword");
		if(username!=null && username!="" && password!=null && password!="") {
			Account account = accountService.findOneByUsernameAndPassword(username, password);
			if(account!=null) {
				String name = account.getName();
				session.setAttribute("accName", name);
				if(account.getRole()==1)
					return "adminHome";
				else return "redirect:post";
			}
			else request.setAttribute("error", "none");
		}
		else {
			request.setAttribute("error", "empty_text");
		}
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "login";
	}
	
}
