package com.himedia.springboot;

public class mallDTO { 
	
//	값을 하나만 받고싶으면 dto따로 만들어야함
	int seq;
	String name;
	int price;
	String genre;
	String img;
	String author;
	String prodinfo;
	int prodid;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getProdinfo() {
		return prodinfo;
	}
	public void setProdinfo(String prodinfo) {
		this.prodinfo = prodinfo;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}	
}
