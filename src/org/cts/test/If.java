package org.cts.test;

public class If {
	
	public static void main(String[] args) {
		
		

	//break and continue
	
	
	for(int i=0;i<5;i++) {
		
		for(int j=10;j<15;j++) {
			System.out.println("Inner for loop"+j);
			if(j==12) {
				continue;
			}
		}
		System.out.println("Outer for loop"+i);
	}
}
}