package co_te.week1;

public class week1_4 {
	public static void star(int size,int start,int end) {
		if(size>1&&size!=start) {
			star(size/3,start,end/3);
		}
		else {
			System.out.print("*");
			if(start<end)
				start++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
