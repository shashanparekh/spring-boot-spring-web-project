package com.tech.SpringProject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	
	public ModelAndView home(Alien alien) {
		
		//if we use jsp concept and than below line used to transfer data to jsp page
//		HttpSession httpSession=req.getSession();
//		String val=req.getParameter("name");
		//Spring boot provides HttpSession directly to fetch data
//		session.setAttribute("name", val);
		
		
		//Session can be replaced by  model and view where data is fetched by model and transfered by view
		//This operation is done by ModelAndView class
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
}
