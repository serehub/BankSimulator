import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main (String [] args){
		
		int num=0;
		System.out.println("If you want to exit the loop enter -1");
		while(num !=-1)
		{
		System.out.print("Please enter an integer:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		String binary=printInBinary(num);
		

		if(num==-1)
			break;
		
		System.out.println("The binary representation of the number " + num + " is " + binary);
		
		
		}
	}

	public static String printInBinary(int x){


	        int a;

	        if(x > 0)

	        {

	            a = x % 2;

	            return (printInBinary (x / 2) + "" + a);

	        }

	        return "";

	}
}
