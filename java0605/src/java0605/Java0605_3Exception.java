package java0605;

import java.util.Scanner;

public class Java0605_3Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend=sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ�:");
			int divsor=sc.nextInt();
			try{
				System.out.println(dividend+"��"+divsor+"�� ������ ����"+(double)dividend/divsor+"�Դϴ�");
				break;
			}catch(ArithmeticException e){
				System.out.println("0���� ���� �� �����ϴ� �ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}

}
