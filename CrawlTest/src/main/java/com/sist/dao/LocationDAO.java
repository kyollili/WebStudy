package com.sist.dao;

import java.sql.*;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LocationDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    Random random=new Random();
    
	
	public LocationDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void locationInsert(LocationVO vo) {
		try 
		{
			getConnection();
			String sql="INSERT INTO jj_location_1(no,title,address,tel,page,image,info,detail,time,price,inout,doing,dotime,facil,etc) "
					+"VALUES(jl_no_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getPage());
			ps.setString(5, vo.getImage());
			ps.setString(6, vo.getInfo());
			ps.setString(7, vo.getDetail());
			ps.setString(8, vo.getTime());
			ps.setString(9, vo.getPrice());
			ps.setString(10, vo.getInout());
			ps.setString(11, vo.getDoing());
			ps.setString(12, vo.getDotime());
			ps.setString(13, vo.getFacil());
			ps.setString(14, vo.getEtc());

			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
}
