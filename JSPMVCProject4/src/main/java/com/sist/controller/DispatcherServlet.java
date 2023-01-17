package com.sist.controller;

import java.io.*;
import java.net.URL;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

import java.util.*;
import com.sist.model.*;
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> list=new ArrayList<String>();
	public void init(ServletConfig config) throws ServletException {
		//String path="C:\\webDev\\webStudy\\JSPMVCProject4\\src\\main\\webapp\\WEB-INF\\application.xml";
		try
		{
			URL url=this.getClass().getClassLoader().getResource(".");
			File file=new File(url.toURI());
			//System.out.println(file.getPath());
			String path=file.getPath();
			path=path.replace("\\", File.separator);
			path=path.substring(0,path.lastIndexOf(File.separator));
			path=path+File.separator+"application.xml";
			System.out.println(path);
			//list.add(clsName);
			/*//1. XML 파서기
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBulder db=dbf.newDocumentBuilder();
			
			Document doc=db.parse(new File(path));
			Element beans=doc.getDocumentElement();
			System.out.println(beans.getTagName());
			NodeList node=beans.getElementsByTagName("bean");
			for(int i=0;i<node.getLength();i++)
			{
				Element bean=(Element)node.item(i);
				String clsName=bean.getAttribute("class");
				System.out.println(clsName);
			}*/
		}catch(Exception ex) {}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//uri 받기
		try
		{
			
			String uri=request.getRequestURI();
			uri=uri.substring(request.getContextPath().length()+1);
		}catch(Exception ex) {}
	}

}
