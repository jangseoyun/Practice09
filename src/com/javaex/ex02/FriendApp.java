package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");
		//ArrayList 생성
		List<Friend> fList = new ArrayList<Friend>();
		
		for(int i = 1; i<=3; i++) {
			
			System.out.print(">>");
			String input = sc.nextLine();
			String[] obj = input.split(" ");
			
				for(int a = 0; a<1; a++){
					
					Friend friend = new Friend(obj[0], obj[1], obj[2]);
					fList.add(friend);
				}
				
		}
		
		//전체 출력
		for(Friend f :fList) {
			f.showinfo();
		}
		
		/*
		//01
		System.out.print(">>");
		String input01 = sc.nextLine();
		String[] obj01 = input01.split(" ");
		Friend f01 = new Friend(obj01[0],obj01[1],obj01[2]);//인스턴스 생성
		fList.add(f01);//리스트 추가
		
		//02
		System.out.print(">>");
		String input02 = sc.nextLine();
		String[] obj02 = input02.split(" ");
		Friend f02 = new Friend(obj02[0],obj02[1],obj02[2]);//인스턴스 생성
		fList.add(f02);//리스트 추가
		
		//03
		System.out.print(">>");
		String input03 = sc.nextLine();
		String[] obj03 = input03.split(" ");
		Friend f03 = new Friend(obj03[0],obj03[1],obj03[2]);//인스턴스 생성
		fList.add(f03); //리스트 추가 
		*/

		sc.close();
	}

}
