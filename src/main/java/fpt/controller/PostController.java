package fpt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fpt.service.PostService;

@Controller
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping("/post")
	public String showAll(HttpServletRequest request) {
		request.setAttribute("post", postService.findAll());
		request.setAttribute("post2", postService.findAllAvailability());
		return "accountHome";
	}
}

