import java.io.*;
import java.util.Scanner;
//import java.util.PrintWriter;

class Person {   
   public static void main(String[] args){
	   String firstName;
	   String lastName;
	   int age;
       /*PrintWriter printer = new PrintWriter(System.out);
	   printer.print("Hello");*/
	   Scanner scan = new Scanner(System.in);	   
	   System.out.println("\n Enter first name:");	   
	   firstName = scan.nextLine();
	   System.out.println("\n Enter Last name:");
	   lastName = scan.nextLine();
	   System.out.println("\n Enter Age:");
	   age = scan.nextInt();
	}
}