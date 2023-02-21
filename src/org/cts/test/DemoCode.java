package org.cts.test;

import org.hcl.test.DemoCodeFive;
//imprt packagename.classname
import org.tcs.test.DemoCodeFour;

//main class
public class DemoCode {
	
	//collection of objects and methods
	
	
	//ctrl+space
	public void studentName() {
		
		//ctrl+d
		System.out.println("Student name is Lokesh");
	}
	
	public static void main(String[] args) {
		
		//classname object = new classname();
		
		DemoCode d = new DemoCode(); //object create - memory allocation
		
		//objectname.methodname
		
		d.studentName();
		
		DemoCodeTwo dc = new DemoCodeTwo();
		dc.trainerName();
		
		DemoCodeThree dct = new DemoCodeThree();
		dct.trainingLocation();
		
		DemoCodeFour dcf = new DemoCodeFour();
		dcf.modeOfTraining();
		
		DemoCodeFive dcfi= new DemoCodeFive();
		dcfi.taskCompletionStatus();
	}

}
