package com.sist.manager;
import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
   [{"singer":"NewJeans","album":"NewJeans 'OMG'","title":"Ditto","poster":"","key":"qaO0Wq3Acfs"},
    {"singer":"NewJeans","album":"NewJeans 'OMG'","title":"OMG","poster":"","key":"0R-tkdX8UUw"},
    {"singer":"NewJeans","album":"NewJeans 1st EP 'New Jeans'","title":"Hype boy","poster":"","key":"11cta61wi0g\\u0026pp=ygUISHlwZSBib3k%3D"},
    {"singer":"윤하 (YOUNHA)","album":"YOUNHA 6th Album Repackage 'END THEORY : Final Edition'","title":"사건의 지평선","poster":"","key":"mnpQsM-tqQU"},{"singer":"LE SSERAFIM (르세라핌)","album":"ANTIFRAGILE","title":"ANTIFRAGILE","poster":"","key":"pyf8cbqyfPs"},{"singer":"NewJeans","album":"NewJeans 1st EP 'New Jeans'","title":"Attention","poster":"","key":"CHp0Kaidr14"},{"singer":"IVE (아이브)","album":"After LIKE","title":"After LIKE","poster":"","key":"F0B7HDiY-10"},{"singer":"임영웅","album":"신사와 아가씨 OST Part.2","title":"사랑은 늘 도망가","poster":"","key":"pBEAzM2TRmE"},{"singer":"태양","album":"VIBE","title":"VIBE (Feat. Jimin of BTS)","poster":"","key":"cXCBiF67jLM"},{"singer":"임영웅","album":"IM HERO","title":"우리들의 블루스","poster":"","key":"YKenCC4OAyk"},{"singer":"이영지","album":"쇼미더머니 11 Episode 3","title":"NOT SORRY (Feat. pH-1) (Prod. by Slom)","poster":"","key":"jvqbOU3gSzw"},{"singer":"임영웅","album":"IM HERO","title":"다시 만날 수 있을까","poster":"","key":"sHqFqWDviBg"},{"singer":"(여자)아이들","album":"I love","title":"Nxde","poster":"","key":"fCO7f0SmrDc"},{"singer":"IVE (아이브)","album":"LOVE DIVE","title":"LOVE DIVE","poster":"","key":"Y8JFxS1HlDo"},{"singer":"NewJeans","album":"NewJeans 1st EP 'New Jeans'","title":"Cookie","poster":"","key":"VOmIplFAGeg"},{"singer":"임영웅","album":"내일은 미스터트롯 우승자 특전곡","title":"이제 나만 믿어요","poster":"","key":"kSzraUekkNE"},{"singer":"임영웅","album":"Polaroid","title":"London Boy","poster":"","key":"TMfvkhkALbU"},{"singer":"지코 (ZICO)","album":"스트릿 맨 파이터(SMF) Original Vol.3 (계급미션)","title":"새삥 (Prod. by ZICO) (Feat. 호미들)","poster":"","key":"azaZt7eccnc"},{"singer":"NCT DREAM","album":"Candy - Winter Special Mini Album","title":"Candy","poster":"","key":"zuoSn3ObMz4"},{"singer":"임영웅","album":"Polaroid","title":"Polaroid","poster":"","key":"I82pbW2y_cc"},{"singer":"임영웅","album":"IM HERO","title":"무지개","poster":"","key":"jP2J0qnFtV4"},{"singer":"임영웅","album":"IM HERO","title":"아버지","poster":"","key":"r7B_9-rj9bI"},{"singer":"Charlie Puth","album":"CHARLIE","title":"I Don't Think That I Like Her","poster":"","key":"bOVzVuB5DpY"},{"singer":"임영웅","album":"IM HERO","title":"A bientot","poster":"","key":"zLFypmn42NE"},{"singer":"임영웅","album":"IM HERO","title":"손이 참 곱던 그대","poster":"","key":"OpZIaI-J0uk"},{"singer":"임영웅","album":"IM HERO","title":"사랑해 진짜","poster":"","key":"CbhiBN5wpCc"},{"singer":"테이 (Tei)","album":"Monologue","title":"Monologue","poster":"","key":"IeDb7OrnGNE"},{"singer":"멜로망스 (MeloMance)","album":"사랑인가 봐 (사내맞선 OST 스페셜 트랙)","title":"사랑인가 봐","poster":"","key":"McidaTgrQB0"},{"singer":"임영웅","album":"IM HERO","title":"인생찬가","poster":"","key":"7EC6RGJ8BOE"},{"singer":"임영웅","album":"IM HERO","title":"연애편지","poster":"","key":"P2FcQvCbDWg"},{"singer":"BLACKPINK","album":"BORN PINK","title":"Shut Down","poster":"","key":"POe9SOEKotk"},{"singer":"임영웅","album":"IM HERO","title":"보금자리","poster":"","key":"Znpnf1HUmQ4"},{"singer":"WSG워너비 (가야G)","album":"WSG워너비 1집","title":"그때 그 순간 그대로 (그그그)","poster":"","key":"aH-IdX8U6jc"},{"singer":"Charlie Puth","album":"CHARLIE","title":"That's Hilarious","poster":"","key":"MPP2Q9JBvbg"},{"singer":"(여자)아이들","album":"I NEVER DIE","title":"TOMBOY","poster":"","key":"Jh4QFaPmdss"},{"singer":"WSG워너비 (4FIRE)","album":"WSG워너비 1집","title":"보고싶었어","poster":"","key":"B69HTHBsHCQ"},{"singer":"BLACKPINK","album":"BORN PINK","title":"Pink Venom","poster":"","key":"gQlMMD8auMs"},{"singer":"The Kid LAROI & Justin Bieber","album":"Stay","title":"Stay","poster":"","key":"Ec7TN_11az8"},{"singer":"Crush","album":"Rush Hour","title":"Rush Hour (Feat. j-hope of BTS)","poster":"","key":"PS0qkO5qty0"},{"singer":"성시경","album":"별에서 온 그대 OST Part.7 (SBS 수목드라마)","title":"너의 모든 순간","poster":"","key":"i2aRMXZR1k0"},{"singer":"저스디스 (JUSTHIS) & R.Tee & 던말릭 (DON MALIK) & 허성현 (Huh) & KHAN & 맥대디 (Mckdaddy) & Los","album":"쇼미더머니 11 Episode 1","title":"마이웨이 (MY WAY) (Prod. by R.Tee)","poster":"","key":"y4Ok11V6fz8"},{"singer":"#안녕","album":"해요 (2022)","title":"해요 (2022)","poster":"","key":"P6gV_t70KAk"},{"singer":"김민석 (멜로망스)","album":"취중고백","title":"취중고백","poster":"","key":"FCrMKhrFH7A"},{"singer":"10CM","album":"5.3","title":"그라데이션","poster":"","key":"kQuxJbP6s8Y"},{"singer":"경서예지 & 전건호","album":"다정히 내 이름을 부르면","title":"다정히 내 이름을 부르면","poster":"","key":"b_6EfFZyBxY"},{"singer":"우디 (Woody)","album":"Say I Love You (Re : WIND 4MEN Vol.04)","title":"Say I Love You","poster":"","key":"yo-cqIHBJ2U"},{"singer":"주호","album":"내가 아니라도","title":"내가 아니라도","poster":"","key":"lAq9l8o6UXU"},{"singer":"정국 & 방탄소년단","album":"Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack)","title":"Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)","poster":"","key":"IwzkfMmNMpM"},{"singer":"윤하 (YOUNHA)","album":"YOUNHA 6th Album 'END THEORY'","title":"오르트구름","poster":"","key":"cFgk2PMgPJ4"},{"singer":"경서","album":"나의 X에게","title":"나의 X에게","poster":"","key":"iAfxyHOmHrM"}]

 */
public class MusicGetData {
    // list-wrap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        	Elements title=doc.select("table.list-wrap a.title");
        	Elements singer=doc.select("table.list-wrap a.artist");
        	Elements album=doc.select("table.list-wrap a.albumtitle");
        	Elements poster=doc.select("div.newest-list table.list-wrap a.cover img");
        	JSONArray arr=new JSONArray();
        	for(int i=0;i<title.size();i++)
        	{
        		/*System.out.println(title.get(i).text()+" "
        				+singer.get(i).text()+" "
        				+album.get(i).text()+" "
        				+poster.get(i).attr("src")+" "
        				+youubeGetKey(title.get(i).text()));*/
        		JSONObject obj=new JSONObject();
        		obj.put("no", i+1);
        		obj.put("title", title.get(i).text());
        		obj.put("singer", singer.get(i).text());
        		obj.put("poster", poster.get(i).attr("src"));
        		obj.put("album", album.get(i).text());
        		obj.put("key", youubeGetKey(title.get(i).text()));
        		arr.add(obj);
        	}
        	System.out.println(arr.toJSONString());
        }catch(Exception ex){}
	}
	public static String youubeGetKey(String title)
	{
		String key="";
		try
		{
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="
		      +URLEncoder.encode(title, "UTF-8")).get();
			String data=doc.toString();
			//System.out.println(data);
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m=p.matcher(data);
			while(m.find())
			{
				String s=m.group();
				System.out.println(s);
				key=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				break;
			}
		}catch(Exception ex) {}
		return key;
	}

}
