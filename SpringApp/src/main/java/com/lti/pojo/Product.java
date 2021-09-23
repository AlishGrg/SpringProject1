package com.lti.pojo;

public class Product {
	
	private String prodid;
	private String pname;
	private int price;
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", pname=" + pname + ", price=" + price + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
