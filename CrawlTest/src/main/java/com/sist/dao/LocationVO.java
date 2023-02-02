package com.sist.dao;
/*
 * 	NO      NOT NULL NUMBER         
	TITLE   NOT NULL VARCHAR2(100)  
	ADDRESS NOT NULL VARCHAR2(500)  
	TEL              VARCHAR2(15)   
	PAGE             VARCHAR2(1000) 
	IMAGE            VARCHAR2(500)  
	INFO             VARCHAR2(4000) 
	DETAIL           VARCHAR2(4000) 
	TIME             VARCHAR2(1000) 
	PRICE            VARCHAR2(1000) 
	INOUT            VARCHAR2(100)  
	DOING            VARCHAR2(500)  
	DOTIME           VARCHAR2(500)  
	FACIL            VARCHAR2(1000) 
	ETC              VARCHAR2(1000) 
 */
public class LocationVO {
	private int no;
	private String title,address,tel,page,image,info,detail,time,price,inout,doing,dotime,facil,etc;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public String getDoing() {
		return doing;
	}
	public void setDoing(String doing) {
		this.doing = doing;
	}
	public String getDotime() {
		return dotime;
	}
	public void setDotime(String dotime) {
		this.dotime = dotime;
	}
	public String getFacil() {
		return facil;
	}
	public void setFacil(String facil) {
		this.facil = facil;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
}
