package assignments;

import java.util.Scanner;

public class ArrayAss2 {
	static int temp1 =0;
	static int temp2 =0;
	static void adding(int a[][]){
		
		for(int i =0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
for(int i =0;i<a.length;i++){
			
			int sum =0;
			
			for(int j=0;j<a.length;j++){
				
				if(i==j){
					
					sum = a[i][j];//+a[i][j];
					//System.out.print(a[i][j]+" ");
				}
				//System.out.println();
				//System.out.print(sum);
					
				
				
			}
			
			temp1 = temp1+sum;
						
			}
System.out.println("The Diagonal 1:");
System.out.println(temp1);

for(int i =0;i<a.length;i++){
	
	int sum =0;
	
	for(int j=0;j<a.length;j++){
		
		if((i<j) || (i==j) || (i>j)){
			
			sum = a[i][j];//+a[i][j];
			//System.out.print(a[i][j]+" ");
		}
		//System.out.println();
		//System.out.print(sum);
			
		
		
	}
	
	temp2 = temp2+sum;
				
	}
System.out.println("The Diagonal 2:");
System.out.println(temp2);
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
