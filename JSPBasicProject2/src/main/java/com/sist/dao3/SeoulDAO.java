package com.sist.dao3;
import java.util.*;
import java.sql.*;
import com.sist.common.*;
public class SeoulDAO {
	private Connection conn;
	private PreparedStatement ps;
	private CreateConnection dbconn=new CreateConnection();
	public void getConnection()
	{
		conn=dbconn.getConnection();
	}
	public void disConnection()
	{
		dbconn.disConnection(ps,conn);
	}
	public ArrayList<SeoulVO> seoulData(String table)
	{
		ArrayList<SeoulVO> list=new ArrayList<SeoulVO>();
		try
		{
			getConnection();
			String sql="SELECT no, title, poster, rownum "
						+"FROM seoul_ "+table
						+"WHERE rownum<=20 ";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				SeoulVO vo=new SeoulVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPoster(rs.getString(3));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
}
