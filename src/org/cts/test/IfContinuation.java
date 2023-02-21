package org.cts.test;

public class IfContinuation {
	
	public static void main(String[] args) {
		

		int a=0;
		do {
			System.out.println(a);
			a++;
		}
		while(a<5);

	
	for(int i=0;i<5;i++) {
		
		for(int j=10;j<15;j++) {
			System.out.println(j);
			if(j==12) {
				continue;
			}
		}
		System.out.println(i);
	}
}
}