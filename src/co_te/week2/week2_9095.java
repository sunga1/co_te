package co_te.week2;

import java.util.Scanner;

public class week2_9095 {
	static int tot_cnt=0;
	static int arr[]=new int[12];
	public static int sum_calc(int num) {
		int x=0,y=0,z=0;
		if(num==0) {
			return 1;
		}		
		else if(arr[num]!=0) {
			return arr[num];
		}
		else {
			if(num>=2) {
				x=sum_calc(num-2);
				}
			if(num>=3) {
				y=sum_calc(num-3);
				}
			if(num>=1) {
				z=sum_calc(num-1);
				}
			arr[num]=x+y+z;
			return arr[num];
		}
}

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=0;i<num;i++) {
			int x=scanner.nextInt();
			tot_cnt=0;
			int result=sum_calc(x);
			System.out.println(result);
		}
	}
}
