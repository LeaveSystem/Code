package DAO.Impl;

import java.sql.*;


import DAO.queryUsers;
import DBUtil.DButil;

public class queryUsersImpl implements queryUsers {

	DButil db = new DButil();
	public void close(){
		db.closeConn();
	}
	@Override
	public ResultSet findUsers() {
		// TODO Auto-generated method stub
		
		Statement stmt = null;
		ResultSet rs = null;
		try{
			
			
			stmt = db.getConn();
			
/*			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("gb2312");//通知服务器发送数据时查阅的码表
			response.setContentType("text/html;charset=gb2312");//通知浏览器以何种码表打开
			
*/		
			String querySQL = "select * from users";
			rs = stmt.executeQuery(querySQL);
		
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			
		}
		return rs;
	}

}
