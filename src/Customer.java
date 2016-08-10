/**
 * THis class simulates a customer object
 * @author Addisu
 *
 */
public class Customer {
	
	private int amountOfTimeNeeded;
	public Customer(){
		
		int randRmountOfTimeNeeded=(int)(Math.random()*100);
		amountOfTimeNeeded=returnAmountOfTimeNeeded(randRmountOfTimeNeeded);
	}
	
	public int returnAmountOfTimeNeeded(int num){
		int time=0;
		
		if(num>85){
			time=110;
		}
		else if(num>75 && num<=85){
			time=100;
		}
		else if(num>50 && num<=75){
			time=90;
		}
		else if(num>35 && num<=50){
			time=80;
		}
		else if(num>25 && num<=35){
			time=60;
		}
		else if(num>15 && num<=25){
			time=50;
		}
		else if(num>10 && num<=15){
			time=40;
		}
		else if(num>0 && num<=10){
			time=30;
		}
		
		return time;
	}

	public int getAmountOfTimeNeeded() {
		return amountOfTimeNeeded;
	}

	public void setAmountOfTimeNeeded(int amountOfTimeNeeded) {
		this.amountOfTimeNeeded = amountOfTimeNeeded;
	}
	
}
