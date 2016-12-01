package DBUtil;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButil {
//�������ķ���
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	
	//����1�����ڻ�ȡ���ݿ������
	public Statement getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test1";
			String username = "root";
			String password = "1111";
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		}
		return stmt;
	}
	
	//����2���ر����ݿ�������Դ
	public void closeConn(){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
	
	//����3��ר��ִ����ɾ�ĵķ���
	
	public int execOther(final String strSQL, final Object[] params){
		this.getConn();
		try {
			System.out.println("SQL:> " + strSQL);
			//��ʱ���в���
			pstmt = conn.prepareStatement(strSQL);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i+1, params[i]);
			}
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}	
	}
	
	//����4��ר��ִ�в�ѯ
	public ResultSet execQuery(final String strSQL, Object[] params){
		this.getConn();
		try {
			System.out.println("SQL:> " + strSQL);
			pstmt = conn.prepareStatement(strSQL);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i+1, params[i]);
			}
			return pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
		
	}
}
	
	
