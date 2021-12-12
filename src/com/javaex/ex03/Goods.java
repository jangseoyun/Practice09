package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;

	// 생성자
	public Goods() {
	}

	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	// 메소드 g,s
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public void showinfo() {
		System.out.println(name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다.");
	}

}
