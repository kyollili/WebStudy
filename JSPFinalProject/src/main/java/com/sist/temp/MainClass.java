package com.sist.temp;
import java.sql.*;
public class MainClass {
//트랜젝션 프로그램 
	/*
	 * commit이 포함된 sql 문장(insert,update,delete)이 여러 개일 때 
	 * 한 개의 sql 문장에서 오류 발생 시 전체 commit을 취소할 수 있는 문장
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url,"hr","happy");
			conn.setAutoCommit(false);
			String sql="INSERT INTO card VALUES(2,'park',30000)";
			ps=conn.prepareStatement(sql);
			ps.executeUpdate(); //commit 취소
			
			sql="INSERT INTO point VALUES(1,'park',300)";
			ps=conn.prepareStatement(sql);
			ps.executeUpdate(); //commit;
			
			conn.commit(); //전체 저장
		}catch(Exception ex)
		{
			ex.printStackTrace();
			try 
			{
				conn.rollback(); //전체 취소
			}catch(Exception e) {}
		}
		finally
		{
			try
			{
				if(conn!=null) conn.close();
				if(ps!=null) ps.close();
			}catch(Exception ex) {}
		}
	}

}
