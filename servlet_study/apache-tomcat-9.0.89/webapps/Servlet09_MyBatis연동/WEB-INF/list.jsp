<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   
   List<EmpDTO> list = 
        (List<EmpDTO>)request.getAttribute("list");    

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Emp 목록</h1>
<table border="1">
   <tr>
     <th>사원번호</th>
     <th>사원명</th>
     <th>월급</th>
     <th>입사일</th>     
     <th>부서번호</th>     
   </tr>
<%
  if(list!=null && list.size()!=0)
   for(EmpDTO dto: list){
	 int empno = dto.getEmpno();
	 String ename = dto.getEname();
	 int sal = dto.getSal();
	 String hiredate = dto.getHiredate();
	 int deptno = dto.getDeptno();
%>   
   <tr>
      <td><%= empno  %></td>
      <td><%= ename %></td>
      <td><%= sal %></td>
      <td><%= hiredate %></td>
      <td><%= dto.getDeptno() %></td>
   </tr>
<%
   }//end for
%>     
</table>
</body>
</html>