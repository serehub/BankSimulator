import java.util.Scanner;

public class Stairs {
	
public static void main (String [] args){
		
		int num=0;
		System.out.println("If you want to exit the loop enter -1");
		
		while(num !=-1)
		{
		System.out.print("Please enter stsircase:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int ways = 0;
		if(num>0)
		ways=countWays(num);
		

		if(num==-1)
			break;
		
		System.out.println("The number of ways to climb " + num + " number of stairs is " + ways);
		
		
		}
	}

	public static int countWays(int numStairs){
		int temp=0;
		if(numStairs==1){
			temp=1;
		}
		else if (numStairs==2) {
				temp=2;
		}
		else{
			temp+=countWays(numStairs-1) + countWays(numStairs-2);
		}
		
		
		
		return temp;
	}

}
