package com.sist.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.sist.dao.NoticeDAO;
import com.sist.manager.NewsManager;
import com.sist.vo.NewsVO;
import com.sist.vo.NoticeVO;

public class CommonsModel {
	//모든 .do에 공통으로 들어감
		public static void footerData(HttpServletRequest request)
		{
			//Footer 출력
			   NoticeDAO ndao=new NoticeDAO();
			   List<NoticeVO> nList=ndao.noticeTop5();
			   request.setAttribute("nList", nList);
			 //뉴스출력 => naver
			   NewsManager nm=new NewsManager();
			   List<NewsVO> newList=nm.newsAllData("여행");
			   request.setAttribute("newList", newList); 
		}
}
