package com.javaex.ex04;

public abstract class Shape {// 추상클래스
	// 필드
	private int countSides;

	// 생성자
	public Shape() {
	}

	public Shape(int countSides) {
		super();
		this.countSides = countSides;
	}

	// 메소드g,s

	// 메소드 일반
	// 추상 메소드
	public abstract double getArea(); // 넓이
	// 추상 메소드
	public abstract double getPerimeter(); // 둘레 길이

}
