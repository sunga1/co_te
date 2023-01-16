package co_te.week1;

import java.util.Scanner;

public class week1_1 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		long result=fibo(input);
		System.out.println(result);
	}
	public static long fibo(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	
}
