import java.io.*;
import java.util.Scanner;

class A {
  String name;
  final int fInt;
  A(){
	  System.out.println("A()");
	  fInt = 4;
	  }
  A(String name) {
     this.name = name;
	 System.out.println("A(String name)");
	 fInt = 4;
  }  
  void printName(){
     System.out.println(name);
	 //fInt++;
  }
};

class B extends A {     
  B(){System.out.println("B()");};
  B(String name) {
     super(name);    
     System.out.println("B(String name)");	 
  }
};

class C extends A {     
  C(){};
  C(String name) {
     super(name);     
  }
};

class D extends B {     
  D(){};
  D(String name) {
     super(name);     
  }
};

