package co_te.week2;

import java.util.List;
import java.util.Scanner;
public class week2_1003 {
	static int[][] proof_arr=new int[50][2];
	public static int[] fibo1(int num,int arr[]) {
		if(proof_arr[num][0]!=0||proof_arr[num][1]!=0) {
			arr[0]=proof_arr[num][0];
			arr[1]=proof_arr[num][1];
			return arr;
			}
		else {
		if(num==0) {
			arr[0]++;
			return arr;
		}
		else if(num==1) {
			arr[1]++;
			return arr;
		}
		else {
			if(proof_arr[num][0]!=0||proof_arr[num][1]!=0) {
				arr=proof_arr[num];
			}
			else {
			int arr1[]=fibo1(num-2,proof_arr[num-2]);
			
			int arr2[]=fibo1(num-1,proof_arr[num-1]);
			//System.out.print("2="+arr2[0]+" "+arr2[1]+" ");
			proof_arr[num][0]=arr1[0]+arr2[0];
			proof_arr[num][1]=arr1[1]+arr2[1];
			}
			return proof_arr[num];
		}}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=0;i<num;i++) {
			int x=scanner.nextInt();
			int arr[]=new int[2];
			arr=fibo1(x,arr);
			System.out.println(arr[0]+" "+arr[1]);
		}
	}

}
