package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		int price;
		int count;
		int total = 0;

		// scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("상품을 입력해주세요(종료 q)");

		// ArrayList
		List<Goods> gList = new ArrayList<Goods>();

		// while문 (반복 실행)
		while (true) {
			String input = sc.nextLine();
			//(배열 형태의 경우)탈출 순서 중요
			if (input.equals("q")) {
				System.out.println("[입력완료]");
				break;
			}

			String[] obj = input.split(",");

			// 문자->숫자변경
			price = Integer.parseInt(obj[1]);
			count = Integer.parseInt(obj[2]);

			// 인스턴스 생성 (한바퀴 돌때마다 생성)

			Goods goods = new Goods(obj[0], price, count); // 인스턴스 생성
			gList.add(goods);// 리스트 추가
			
			total = total + count;

		}

		System.out.println("====================");
		for (Goods g : gList) {
			g.showinfo();
		}

		System.out.println("모든 상품의 갯수는 "+total+"개입니다.");

		sc.close();
	}

}
