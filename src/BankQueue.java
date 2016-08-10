import java.util.ArrayList;
/**
 * THis class simulates a bank line using arraylist
 * @author Addisu
 *
 */
public class BankQueue{
	
	private ArrayList list;
	 
	
	public BankQueue(){
		list=new ArrayList<Customer>();
	}
	
	public void enque(Customer c){
		list.add(c);
	}
	
	public Customer deque(){
		return (Customer)(list.remove(list.size()-1));
	}
	
	public int lineLength(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
 }