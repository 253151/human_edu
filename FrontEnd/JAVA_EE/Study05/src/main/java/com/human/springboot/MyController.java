package com.human.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private memberDAO mdao;
	@Autowired
	private postDAO pdao;
	
	@RequestMapping ("/") 
//	@ResponseBody
	public String home(HttpServletRequest req, Model model) {
		HttpSession s = req.getSession();
		ArrayList<postDTO>pdto=pdao.getList();
		model.addAttribute("postlist",pdto);
		model.addAttribute("gUserid", (String) s.getAttribute("gUserid"));
		return "home";
		}
	@RequestMapping ("/signin") public String doSignin() { return "signin"; }
	@RequestMapping ("/login") public String doLogin() {return "login"; }
	@RequestMapping ("/write") public String doWrite() {return "write"; }
	
	@RequestMapping("/checkDup")
	@ResponseBody
	public String doCheckDup(HttpServletRequest req) {
		
		int n = mdao.checkDup(req.getParameter("loginid"));
		return Integer.valueOf(n).toString();
	}
	
	@RequestMapping("/checkuser")
	@ResponseBody
	public String doCheckUser(HttpServletRequest req) {
	  String retval="";
	  try {
		String uid = req.getParameter("userid");
		String pw = req.getParameter("passcode");
		
		int n=mdao.getMemberCount(uid, pw);
		if(n==1) {
			HttpSession session=req.getSession();	// 초기화
			session.setAttribute("gUserid", uid);	// 값설정
			retval="ok";
		} else {
			retval="fail";
		}
	  }catch (Exception e) {
		  retval="fail";
	  }
	  return retval;
	}
	
	@RequestMapping("/viewuser")
	@ResponseBody
	public String doViewUser(HttpServletRequest req) {
		String retval="";
		try {
		String loginid=req.getParameter("loginid");
		String pass1=req.getParameter("passcode1");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		
		mdao.addMember(loginid, pass1, name, mobile);
		retval="ok";
		// MyBatis insert call
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/logincheck")
	@ResponseBody
	public String doLoginCheck(HttpServletRequest req) {
		String str="";
		HttpSession session=req.getSession();	
		String userid=(String) session.getAttribute("gUserid");
		if(userid==null || userid.equals("")) {
			str="";
//			str="<a href='/login'>로그인</a>&nbsp;&nbsp;<a href='/signin'>회원가입</a><br><br>";
		}else {
			str=userid;
//			str="<label>"+userid+"</label>&nbsp;&nbsp;<label id=lblSignout>로그아웃</label><br><br><input type=button id=btnWrite value='글작성'>";
		}
		return str;
	}
	
	@RequestMapping("/signout")
	@ResponseBody
	public String doSignout(HttpServletRequest req) {
		String retval="";
		try {
			HttpSession session=req.getSession();	
			session.invalidate();
			retval="ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public String doInsert(HttpServletRequest req) {


		HttpSession session=req.getSession();
		String name=(String) session.getAttribute("gUserid");
		
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		
		System.out.println(name);
		System.out.println(title);
		System.out.println(content);
		pdao.addWrite(title,content,name);
		
		return "insert";
	}
	
	@RequestMapping(value="/view")
	public String doView(HttpServletRequest req, Model model) {

		int post_id=Integer.parseInt(req.getParameter("post_id"));

			// pdao 메소드 호출
		viewDTO vdto = pdao.getPost1(post_id);
		
		System.out.println(post_id);
			// model에 담아서
		model.addAttribute("post",vdto);
			// view.jsp에 전달

		return "view";
	}
	
	@RequestMapping("/delete")
	public String doDelete(HttpServletRequest req) {
		
		HttpSession session=req.getSession();
		String currUser=(String)session.getAttribute("gUserid");
		if(currUser==null) {	// 로그인이 안된 사용자 확인
			return "redirect:/";
		}
		
		
		int post_id=Integer.parseInt(req.getParameter("post_id"));
		pdao.delPost(post_id);
		
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String doUpdate(HttpServletRequest req, Model model) {
		
		HttpSession session=req.getSession();
		String currUser=(String)session.getAttribute("gUserid");
		if(currUser==null) {	// 로그인이 안된 사용자 확인
			return "redirect:/";
		}
		
		int post_id=Integer.parseInt(req.getParameter("post_id"));
		postDTO pdto=pdao.getPost(post_id);
		model.addAttribute("post",pdto);
		return "update";
	}
	
	@RequestMapping("/modify")
	public String doModify() {
		return "redirect:/";
	}
}














