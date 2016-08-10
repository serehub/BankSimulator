import java.util.Scanner;

public class CannonBall {
	
public static void main (String [] args){
		
		int num=0;
		System.out.println("If you want to exit the loop enter -1");
		
		while(num !=-1)
		{
		System.out.print("Please enter the number of layers:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int numCannonBalls = 0;
		if(num>0)
			numCannonBalls=countCannonBalls(num);
		

		if(num==-1)
			break;
		
		System.out.println("The number of cannon balls is " + numCannonBalls);
		
		
		}
	}

	public static int countCannonBalls(int layers){
		
		int temp=0;
		
		if(layers==0){
			temp=0;
		}
		
		else{
			temp= layers * layers + countCannonBalls(layers-1);
		}
		
		return temp;
	}
	

}
