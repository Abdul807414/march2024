package com.selenium.testing;

public class cloneProg  implements Cloneable{
		
	int practHrs;
	String res;

public void display() {
	System.out.println(practHrs+"="+res);	

}	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	cloneProg prog = new cloneProg();
	Object object = prog.clone();
	cloneProg prog1 =(cloneProg) object;

	System.out.println(prog.hashCode());
	System.out.println(object.hashCode());
	
	prog1.practHrs=9;
	prog1.res ="job";
	prog1.display();
	
	
	
}

}
