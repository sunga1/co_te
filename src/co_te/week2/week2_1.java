package co_te.week2;

import java.util.Scanner;

public class week2_1 {
	static long arr[]=new long[100];
	static long fibo(int n) {
		if(n==0)
			return 0;
		if(n==1||n==2) {
			arr[n]=1;
			return 1;}
		else if(arr[n]!=0)
			return arr[n];
		else {
			arr[n]=fibo(n-1)+fibo(n-2);
			return arr[n];
		}
	}
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		long result=fibo(num);
		System.out.println(result);
	}
}
