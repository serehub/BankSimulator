import java.util.ArrayList;

/**
 * This class is used to simulate a bank with different number of clerks
 * @author Addisu
 *
 */

public class Bank {
	
	private int numberOfClerks;
	private ArrayList<Clerk> clerkList;
	private BankQueue line; 
	static final int WORK_HOURS=8; 
	static final int NUMBER_OF_MINUTES_PER_HOUR=60; 

	/**
	 * This is the constructor for Bank object
	 * @param numberOfClerks
	 */
	public Bank(int numberOfClerks){
		
		this.numberOfClerks=numberOfClerks;
		line=new BankQueue();
		clerkList= new ArrayList<Clerk>();
		
		
		
	}
	
	/**
	 * This method instantiates clerks for a bank based on the given number of clerks
	 */
	public void clerksWorking(){
		for(int k=0;k<this.numberOfClerks;k++){
			clerkList.add(new Clerk());
		}
	}
	/***
	 * This method changes the random percentage generated to number of seconds it takes for the customer for a service
	 * @param num
	 * @return
	 */
	public int processRand(int num){
		
		int customerNum=0;
		if(num>70){
			customerNum=4;
		}
		else if(num>60 && num<=70){
			customerNum=3;
		}
		else if(num>36 && num<=60){
			customerNum=2;
		}
		else if(num>16 && num<=36){
			customerNum=1;
		}
		else {
			customerNum=0;
		}
		return customerNum;
	}
	/**
	 * This method checks if there is a clerk available
	 * @return
	 */
	public boolean clerkAvailable(){
		
		boolean temp=false;
		
		for(int a=0;a<clerkList.size();a++){
			if(!clerkList.get(a).isBusy()){
				temp=true;
			}
		}
		
		return temp;
	}
	/**
	 * This method returns the position of the next clerk available
	 * @return
	 */
	public int firstAvailableClerkIndex(){
		
		int temp=-1;
		
		for(int a=0;a<clerkList.size();a++){
			if(!clerkList.get(a).isBusy()){
				temp=a;
				
				break;
			}
		}
		
		return temp;
	}
	/**
	 * This method runs the bank every minute to add new customers into the queue and deduct the service time remaining
	 * It deducts 60seconds from the serviceTimeLeft every minute it runs
	 */
	public void runBank(){
		
		int totalMins=0;
		int numberOfCust;
		int sum=0;
		int cu=0;
		int lineMaxNum = 0;
		
		totalMins=WORK_HOURS*NUMBER_OF_MINUTES_PER_HOUR;
		
		for(int i=0;i<totalMins;i++){
			int custRand=(int)(Math.random()*100);
			numberOfCust=processRand(custRand);
			
			
			for(int j=0;j<numberOfCust;j++){
				
				line.enque(new Customer());
				
				cu++;
			}
			
			
			while(clerkAvailable() && !line.isEmpty()){
				Customer cust=line.deque();
				
				Clerk firstClerk=(Clerk) clerkList.get(firstAvailableClerkIndex());
				firstClerk.setServiceTime(cust.getAmountOfTimeNeeded());
				firstClerk.setServiceTimeLeft(cust.getAmountOfTimeNeeded());
				
				//reduce the time 60 times because this is done every minute and the customer time is in seconds
				for(int sec=0;sec<60;sec++){
				firstClerk.reduceRemainingTime();
				}
				
			}
			
			if(!clerkAvailable()){
				for(int b=0;b<clerkList.size();b++){
					for(int sec=0;sec<60;sec++){
						clerkList.get(b).reduceRemainingTime();
						}
					
				}
				
			}
			
			int len=line.lineLength();;
			if(len>lineMaxNum){
				lineMaxNum=len;
			}
			sum+=len;
		}
		
		double ave=sum/(double)totalMins;
		System.out.println("The number of people served per day: " + cu);
		System.out.println("The maximum number of people that had to wait on line: " + lineMaxNum);
		System.out.println("Average number of Customers on the line on every minute: " + ave);
		
		
	}
	
	/**
	 * This is the main method where six banks are instantiated with different number of clerks
	 * @param args
	 */
	
	public static void main(String [] args){
	
		Bank bk1=new Bank (1);
		System.out.println("================The stat with only one clerk");
		//create the number of clerks available to help customers
		bk1.clerksWorking();
		
		//run the bank
		bk1.runBank();
		//System.out.println(bk.firstAvailableClerkIndex());
		Bank bk2=new Bank (2);
		System.out.println("================The stat with two clerks======");
		//create the number of clerks available to help customers
		bk2.clerksWorking();
		
		//run the bank
		bk2.runBank();
		
		Bank bk3=new Bank (3);
		System.out.println("================The stat with three clerks======");
		//create the number of clerks available to help customers
		bk3.clerksWorking();
		
		//run the bank
		bk3.runBank();
		
		Bank bk4=new Bank (4);
		System.out.println("================The stat with four clerks======");
		//create the number of clerks available to help customers
		bk4.clerksWorking();
		
		//run the bank
		bk4.runBank();
		
		Bank bk5=new Bank (5);
		System.out.println("================The stat with five clerks=======");
		//create the number of clerks available to help customers
		bk5.clerksWorking();
		
		//run the bank
		bk5.runBank();
		
		Bank bk6=new Bank (6);
		System.out.println("================The stat with six clerks========");
		//create the number of clerks available to help customers
		bk6.clerksWorking();
		
		//run the bank
		bk6.runBank();
		
		
		
	}

	
}
