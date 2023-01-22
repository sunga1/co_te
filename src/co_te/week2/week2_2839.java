package co_te.week2;
import java.lang.*;
import java.util.Scanner;

public class week2_2839 {
	static int arr[]=new int[10000];
	public static int sugarcalc(int kilo) {
		if(kilo<0)
			return -1;
		if(kilo==0)
			return 0;
		else {
			if(arr[kilo]!=0) {
				return arr[kilo];}
			else {
				int kilo3=sugarcalc(kilo-3);
				int kilo5=sugarcalc(kilo-5);
				if(kilo3==-1&&kilo5==-1)
					arr[kilo]=-1;
				else if(kilo3==-1||kilo5==-1)
					arr[kilo]=Math.max(kilo3,kilo5)+1;
				
				else 
					arr[kilo]=Math.min(kilo3,kilo5)+1;
				return arr[kilo];
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int result=sugarcalc(num);
		System.out.println(result);
	}

}
