//The public access modifier is accessible everywhere

import ForDefaultAccess.*;

public class PublicAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicAccessModify obj = new PublicAccessModify();
		obj.simbu();

	}

}

/*Access Modifier	within class	within package	outside package by subclass only	outside package
Private                        	           Y	N	N	N
Default                     	Y	Y	N	N
Protected                 	Y	Y	Y	N
Public	              Y	Y	Y	Y*/