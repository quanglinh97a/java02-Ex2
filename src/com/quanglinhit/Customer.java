package com.quanglinhit;

public class Customer {
	private String id;
	private String name;
	private String email;
	private String birthday;
	private double balance;
	private String avatar;
	private int status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Customer(String id, String name, String email, String birthday, double balance, String avatar, int status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.balance = balance;
		this.avatar = avatar;
		this.status = status;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer: "+
				"\n - Id: "+id+
				"\n - Name: "+name+
				"\n - Email: "+email+
				"\n - Birthday: "+birthday+
				"\n - Balance: "+balance+
				"\n - Avatar: "+avatar+
				"\n - Status: "+status;
	}
	public static void selectProduct(String productName){
		System.out.println("Khách hàng đã chọn sản phẩm: "+productName+".");
	}
	public void checkOut(){
		System.out.println("Khách hàng đã thực hiện thanh toán hoá đơn.");
	}
	
}
