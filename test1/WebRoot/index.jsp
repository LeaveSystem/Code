<%@page import="DBUtil.DButil"%>
<%@page import="DAO.Impl.queryUsersImpl"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
  </head>
  
  <body>
    This is my JSP page. <br>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">编号</td>
			<td align="center">姓名</td>
			<td align="center">类型</td>
			<% 
				queryUsersImpl a = new queryUsersImpl();
				ResultSet rs = null;
				rs = a.findUsers();
				if(!rs.next()){
			%>
						<script>
							alert("未找到您查询的内容");
							document.location = 'http://localhost:8888/finalpro_bone/boneneedquery.jsp';
						</script>
			<%
				}
				do{
			%>
				<tr>
					<td align="center"><%=rs.getString(1) %></td>
					<td align="center"><%=rs.getString(2) %></td>
					<td align="center"><%=rs.getString(3) %></td>
				</tr>
				
			<% 
				}while(rs.next());//endwhile
				a.close();
			%>
	</table>
  </body>
</html>
