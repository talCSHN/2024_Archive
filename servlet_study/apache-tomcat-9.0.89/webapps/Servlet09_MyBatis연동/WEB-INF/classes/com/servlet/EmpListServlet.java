package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;


@WebServlet("/list")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		//서비스 연동
		EmpService service =
				 new EmpServiceImpl();
		service.setDao(new EmpDAO());
		
		List<EmpDTO> list = service.findAll();
		
		//scope에 저장
		request.setAttribute("list", list);
		
		//jsp에 위임
		// redirect(X)
		// forward
		request.getRequestDispatcher("list.jsp")
		       .forward(request, response);
	}
}





