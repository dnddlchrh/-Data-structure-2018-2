package day0524;

public class _day3_0524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double sum=0;
		int arr[]=new int[10];
		System.out.println("랜덤한 정수들");
		for(int j=0;j<arr.length;j++){
			 i=(int)(Math.random()*10+1);
			arr[j]=i;
			System.out.print(arr[j]+" ");
			sum+=arr[j];
			}
		System.out.println();
		System.out.println(sum/arr.length);
	}

}
