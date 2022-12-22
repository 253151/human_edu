package com.human.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@RequestMapping("/") 
	public String home(HttpServletRequest req,Model model) {
		HttpSession session=req.getSession();
		String sess_info=(String) session.getAttribute("gUserid");
		model.addAttribute("userid",sess_info);
		return "home"; 
	}
	
	@RequestMapping("/login") public String doLogin() { return "login"; }

	@RequestMapping("/signin") public String doSignin() { return "signin"; }
	
	@RequestMapping("/checkuser")
	public String doCheckUser(HttpServletRequest req, Model model) {
		String uid = req.getParameter("userid");
		String pw = req.getParameter("passcode");

		// MyBatis select call : select count(*) from member where loginid=x and passcode=x
		
		HttpSession session=req.getSession(); // 초기화
		session.setAttribute("gUserid", uid);  // 값 설정
		
		return "redirect:/";
//		model.addAttribute("userid",uid);
//		model.addAttribute("pwd",pw);
//		return "loginok";
	}
	
	@RequestMapping("/viewuser")
	public String doViewUser(HttpServletRequest req, Model model) {
		String loginid=req.getParameter("loginid");
		String pass1=req.getParameter("passcode1");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		
		// MyBatis insert call
		HttpSession session=req.getSession();
		
		return "redirect:/login";
	}

}
