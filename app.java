package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// 더해서 출력하는 프로그램
		// TODO Auto-generated method stub
		Scanner noa = new Scanner(System.in);
		System.out.println("number 1 input");
		String data = noa.nextLine();
		System.out.println("number 2 input");
		String data2 = noa.nextLine();
		int noa1 = Integer.parseInt(data);
		int noa2 = Integer.parseInt(data2);
		int key = noa1 + noa2;
		System.out.println("value is = "+key);
		
	}

}
