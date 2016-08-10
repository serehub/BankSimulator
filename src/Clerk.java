/**
 * 
 * @author Addisu
 *This class is used when a clerk is instantiated
 */
public class Clerk {
	
	private int serviceTime;
	private int serviceTimeLeft;
	
	/**
	 * This is the constructor for a Clerk object
	 */
	public Clerk(){
		serviceTime=0;
		serviceTimeLeft=0;
	}
	/**
	 * This method returns the service time
	 * @return
	 */
	public int getServiceTime() {
		return serviceTime;
	}
	/**
	 * This method sets the service time
	 * @return
	 */
	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}
	
	/**
	 * This method returns the service time left
	 * @return
	 */

	public int getServiceTimeLeft() {
		return serviceTimeLeft;
	}

	/**
	 * This method sets the service time left
	 * @return
	 */
	public void setServiceTimeLeft(int serviceTimeLeft) {
		this.serviceTimeLeft = serviceTimeLeft;
	}
	/**
	 * THis method checks if a clerk is busy or not
	 * @return
	 */
	public boolean isBusy( )
	   {
	      return (serviceTimeLeft > 0);
	   }
	/**
	 * THis method reduces the service time left from a clerk
	 * @return
	 */
	
	 public void reduceRemainingTime( )
	   {
	      if (serviceTimeLeft > 0)
	    	  serviceTimeLeft--;
	   } 
	
}
