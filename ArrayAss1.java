package assignments;

import java.util.Scanner;

public class ArrayAss1 {
	
	static void adding(int a[][]){
		
		for(int i =0;i<a.length;i++){
			
			int sum =0;
			
			for(int j=0;j<a.length;j++){
				
				sum += a[i][j];//+a[i][j+1]+a[i][j+2];
				
				//System.out.print(sum);
				System.out.print(a[i][j]+" ");
				
		}
			
			System.out.println(sum);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]= new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		//ArrayAss1 Ass = new ArrayAss1();
		
		for(int i =0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				
			
			System.out.println("Enter the values in the array:");
			
			A[i][j]= sc.nextInt();
			
			
		}
		
		}
		adding(A);

	}

}
