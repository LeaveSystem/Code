<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login</title>
    <style>
    	.form{
    		width:300px;  
		    height:200px;  
		    position:absolute;  
		    left:50%;  
		    top:50%;  
		    margin:-100px 0 0 -150px 
    	}
    	
    </style>

  </head>
  
  <body background="bk.jpg" style="background-size:100%";
>
  	<div class="form">
	  <form action="" method="post">
	    <table align="center">
	    	<tr>
	    		<td><b>用户ID</b></td>
	    		<td>
	    			<input type="text" name="id" id="id">
	    		</td>
	    	</tr>
	    	<tr>
	    		<td><b>密码</b></td>
	    		<td>
	    			<input type="password" name="password" id="password">
	    		</td>
	    	</tr>
	    	<tr>
	    		<td></td>
	    		<td>
	    			<input type="submit" value="登录">
	    			<input type="reset" value="重置">
	    		</td>
	    	</tr>
	    </table>
	   </form>
	  </div>
  </body>
</html>
