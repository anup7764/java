package Math;


import java.util.Scanner; 
public class Prog7 {
public static void main(String[] args) {

Scanner input = null;
//... Initialize Scanner to read from console. Scanner input = new Scanner(System.in); System.out.print("Enter first number : ");
int a = input.nextInt(); 
System.out.print("Enter second number: "); 
int b = input.nextInt(); 
System.out.print("Enter last number : "); 
int c = input.nextInt();
System.out.println("Average is " + (a+b+c)/3);

}

}
