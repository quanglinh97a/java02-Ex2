package com.quanglinhit;

public class MainThread {

	public static void main(String[] args) {
		Customer cus1=new Customer("D01","Linh Già","quanglinhd1097@gmail.com","14/03/1997",10000000,"linhgia.jpg",1);
		System.out.println(cus1.toString());
		cus1.selectProduct("Quần chip");
		cus1.checkOut();
	}

}
