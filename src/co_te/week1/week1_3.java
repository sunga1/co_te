package co_te.week1;

import java.util.Scanner;

class Merge {
	private int point;
	private int count=0;
	int arr[];
	int sort_arr[];
	Merge(int size,int point){
		arr=new int[size];
		sort_arr=new int[size];
		this.point=point;
	}
	//static boolean check=false;
	void merge_sort(int arr[],int p,int r) {
		if(p<r) {
			int q=(p+r)/2;
			merge_sort(arr,p,q);
			merge_sort(arr,q+1,r);
			merge(arr,p,q,r);
		}
	}
	void merge(int arr[],int p,int q,int r) {
		int i=p;int j=q+1;int t=0;
		while(i<=q&&j<=r) {
			if(arr[i]<=arr[j]) {
				sort_arr[t++]=arr[i++];
			}
			else {
				sort_arr[t++]=arr[j++];
			}
		}
		while(i<=q)
			sort_arr[t++]=arr[i++];
		while(j<=r)
			sort_arr[t++]=arr[j++];
		i=p;t=0;
		
		while(i<=r) {
			count++;
			if(count==point) {
				System.out.println(sort_arr[t]);
				System.exit(0);
				//check=true;
			}
				
			arr[i++]=sort_arr[t++];
		}
	}
}

public class week1_3{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int Size=scanner.nextInt();
		int point=scanner.nextInt();
		Merge m=new Merge(Size,point);
		for(int i=0;i<Size;i++) {
			m.arr[i]=scanner.nextInt();
		}
		m.merge_sort(m.arr,0,Size-1);
		//if(check==false)
		System.out.println(-1);
		scanner.close();
	}

}
