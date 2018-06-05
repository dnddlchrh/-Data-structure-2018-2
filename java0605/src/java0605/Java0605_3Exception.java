package java0605;

import java.util.Scanner;

public class Java0605_3Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("나뉨수를 입력하시오:");
			int dividend=sc.nextInt();
			System.out.print("나눔수를 입력하시오:");
			int divsor=sc.nextInt();
			try{
				System.out.println(dividend+"를"+divsor+"로 나누면 몫은"+(double)dividend/divsor+"입니다");
				break;
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다 다시 입력하세요");
			}
		}
		sc.close();
	}

}
