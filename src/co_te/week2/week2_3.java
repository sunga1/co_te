package co_te.week2;

import java.util.Arrays;
import java.util.Scanner;

public class week2_3 {
	static int arr[]=new int[1000000];
	public static int making1(int num) {
		int x=1000000,y=1000000,z=1000000;
		if(arr[num]!=10000000)
			return arr[num];
		if(num==1) {
			arr[1]=0;
			return 0;
		}
		if(num%3==0){
			x=making1(num/3);
			//System.out.print("x="+x);
			//x=arr[num/3];
		}
		if(num%2==0) {
			y=making1(num/2);
			//System.out.print("y="+y);
			//y=arr[num/2];
		}
		 
			z=making1(num-1);
			//z=arr[num-1];
		
		arr[num]=Math.min(Math.min(x,y),z)+1;
		return arr[num];
	} 
	
	public static void main(String args[]) {
		Arrays.fill(arr, 10000000);
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println(making1(num));
	}
}
