package Math;

public class Nestedswtich {

	public static void main(String[] args) { 
		char choice = '0';// TODO Auto-generated method stub
	switch(choice) {
	case '1':
	System.out.println("The if:\n"); 
	System.out.println("if(condition) statement;"); 
	System.out.println("else statement;");
	break; 
	case '2':
	System.out.println("The switch:\n"); 
System.out.println(" break;"); 
System.out.println(" // ...");
	System.out.println("}");
	 
	break; 
	case '3':
	System.out.println("The for:\n"); 
	System.out.print("for(init; condition; iteration)"); 
	System.out.println(" statement;");
	break; 
	case '4':
	System.out.println("The while:\n"); 
	System.out.println("while(condition) statement;"); 
	break;
	case '5':
	System.out.println("The do-while:\n"); 
	System.out.println("do {"); 
	System.out.println(" statement;"); 
	System.out.println("} while (condition);"); 
	break;
	}

			System.out.print("Selection not found.");

			}
	}


