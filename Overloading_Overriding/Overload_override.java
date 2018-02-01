//import java.io.*;
//import java.util.Scanner;
//import java.Inheritance.A;
//import java.Inheritance.B;
//import java.Inheritance.C;
//import java.Inheritance.D;

class Overload_override{
	public static void main(String args[]){
		A a;
		a = new A();
		a.printName();
        a = new B();
		a.printName();
		a = new C();
		a.printName();
		a = new D();
		a.printName();

		a = new A("1");
		a.printName();
        a = new B("2");
		a.printName();
		a = new C("3");
		a.printName();
		a = new D("4");
		a.printName();
 		
	}
};