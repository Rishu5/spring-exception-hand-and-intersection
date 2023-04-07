package com.rishu.exception;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controler {

	@RequestMapping(value = "/Chooser", method = RequestMethod.POST)
	public ModelAndView Secondpage(@RequestParam("filechooser") CommonsMultipartFile file, HttpSession s) {
//		String st = null;
//		System.out.println(st.charAt(10));
//
//		long l = 925687763;
//		int i = (int) l;

		ModelAndView m = new ModelAndView();
		m.setViewName("Second");
		return m;
	}

	@RequestMapping(value = "First")
	public String Firstpage() {
		return "First";
	}

	@RequestMapping(value = "file2")
	public String Firstpage1(@RequestParam("ldate") String sdate) {
		
		System.out.println(sdate);
		return "Second";
	}

//	@ExceptionHandler({NullPointerException.class})
//	public String exceptionhandler(Model m) {
//		m.addAttribute("msg","null pointer exception");
//		return "Exception";
//	}
}
