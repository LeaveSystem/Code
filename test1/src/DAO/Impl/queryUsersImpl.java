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
			response.setCharacterEncoding("gb2312");//֪ͨ��������������ʱ���ĵ����
			response.setContentType("text/html;charset=gb2312");//֪ͨ������Ժ�������
			
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
