package com.human.springboot;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	@Autowired
	private empDAO emp;
	
	@RequestMapping("/")
	public String home(Model model) {
		ArrayList<EmpDTO> edto = emp.list();
		model.addAttribute("worker",edto);
		
		return "home";
	}
	
	@RequestMapping("/department")
	public String getDepartmentList(Model model) {
		
		return "department";
	}
		
	@RequestMapping("/roomtype")
	public String getList(Model model) {
		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
		model.addAttribute("rt",rdto);

		return "roomtype";
	}

	
	@RequestMapping("/roominfo")
	public String doRoomInfo(Model model) {
		ArrayList<RoomInfoDTO> rdto=emp.listRoomInfo();
		model.addAttribute("roominfo",emp.listRoomInfo());
		ArrayList<RoomtypeDTO> tdto = emp.listRoomType();
		model.addAttribute("rt",tdto);
		return "roominfo";
	}
	
	@RequestMapping("/xroominfo")
	public String viewRoomInfo() {
//		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
//		model.addAttribute("rt",rdto);

		return "ajax_roominfo";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/getRoomInfo")
	@ResponseBody
	public String doGetRoomInfo() {
		ArrayList<RoomInfoDTO> idto =emp.listRoomInfo();
		JSONArray ja = new JSONArray();
		for( int i=0; i<idto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("num", idto.get(i).getNum());
			jo.put("name", idto.get(i).getName());
			jo.put("type", idto.get(i).getType());
			jo.put("howmany", idto.get(i).getHowmany());
			jo.put("howmuch", idto.get(i).getHowmuch());
			ja.add(jo);
			System.out.println(jo);
		}
		

		return ja.toString();
	}
	
	@RequestMapping("/cudRoomInfo")
	@ResponseBody
	public String doCudRoomInfo(HttpServletRequest req) {
		if(req.getParameter("optypeI").equals("deleteI")) {
			int num=Integer.parseInt(req.getParameter("num"));
			emp.deleteRoomInfo(num);
		} else if(req.getParameter("optypeI").equals("insertI")) {
			emp.insertRoomInfo(req.getParameter("name"), 
					Integer.parseInt(req.getParameter("type")), 
					Integer.parseInt(req.getParameter("howmany")), 
					Integer.parseInt(req.getParameter("howmuch")));
		} else if(req.getParameter("optypeI").equals("updateI")) {
			emp.updateRoomInfo(Integer.parseInt(req.getParameter("num")), 
					req.getParameter("name"), 
					Integer.parseInt(req.getParameter("type")), 
					Integer.parseInt(req.getParameter("howmany")), 
					Integer.parseInt(req.getParameter("howmuch")));
		}
//		return "redirect:/roominfo";
		return "OK";
		
	}
	
	@RequestMapping("/ajaxtest")
	public String doAjaxText() {
		return "ajax";
	}
	@RequestMapping("/doPlus")
	@ResponseBody
	public String doPlus(HttpServletRequest req) {
		System.out.println("doPlus called");
		int one = Integer.parseInt(req.getParameter("first"));
		int two = Integer.parseInt(req.getParameter("second"));
		int result=one+two;
		return Integer.valueOf(result).toString();
	}


	@RequestMapping("/getEmpList")
	@ResponseBody
	public String doGetEmpList() {
		System.out.println("doGetEmpList");
		ArrayList<EmpDTO> edto = emp.list();
		System.out.println("edto count ["+edto.size()+"]");
		
		JSONArray ja = new JSONArray();
		for( int i=0; i<edto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("eid",edto.get(i).getEmployee_id());
			jo.put("emp_name", edto.get(i).getEmp_name());
			jo.put("salary", edto.get(i).getSalary());
			jo.put("mname", edto.get(i).getManager_name());
			ja.add(jo);
		}
		return ja.toString();
	}
	
	@RequestMapping("/emplist")
	public String showEmpList() {
		return "EmpList";
	}
	
	@RequestMapping("/xroomtype")
	public String viewRoomType() {
//		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
//		model.addAttribute("rt",rdto);

		return "ajax_roomtype";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/getRoomType",method=RequestMethod.GET, produces="application/json")
	@ResponseBody
	public String doGetRoomType() {
		ArrayList<RoomtypeDTO> rdto =emp.listRoomType();
		JSONArray ja = new JSONArray();
		for( int i=0; i<rdto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("typenum", rdto.get(i).getTypenum());
			jo.put("typename", rdto.get(i).getTypename());
			ja.add(jo);
		}
		return ja.toString();
	}
	

	@RequestMapping("/cudRoomType")
	@ResponseBody
	public String doCudRoomType(HttpServletRequest req) {
		if(req.getParameter("optype").equals("delete")) {
			int typenum=Integer.parseInt(req.getParameter("typenum"));
			emp.deleteRoomType(typenum);
		} else if(req.getParameter("optype").equals("insert")) {
			String typename = req.getParameter("typename");
			emp.insertRoomType(typename);
		} else if(req.getParameter("optype").equals("update")) {
			String typename = req.getParameter("typename");
			int typenum=Integer.parseInt(req.getParameter("typenum"));
			emp.updateRoomType(typename, typenum);
		}
		return "OK";	// dummy data
//		return "redirect:/roomtype";
	}
}
