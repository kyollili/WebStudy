package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.ReserveDAO;
import java.util.*;
import com.sist.vo.*;
@Controller
public class ReserveModel {
	@RequestMapping("reserve/reserve_main.do")
	public String reserve_main(HttpServletRequest request,HttpServletResponse response)
	{
		
		request.setAttribute("main_jsp", "../reserve/reserve_main.jsp");
		CommonsModel.footerData(request);
		return "../main/main.jsp";
	}
	
	@RequestMapping("reserve/reserve_food.do")
	public String reserve_food_list(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			request.setCharacterEncoding("UTF-8");
		}catch(Exception ex) {}
		String fd=request.getParameter("fd");
		ReserveDAO dao=new ReserveDAO();
		List<FoodVO> list=dao.reserveFoodListData(fd);
		request.setAttribute("list", list);
		return "../reserve/reserve_food.jsp";
	}
}
