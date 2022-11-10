package busresv;

public class Bus {
	private int busnumber;
	private boolean ac;
	private int capacity;
	
	Bus(int num,boolean ac,int cap){
		this.busnumber = num;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getbusnumber(){
		return busnumber;
	}
	public boolean getac(){
		return ac;
	}
     public int getcapacity(){
    	 return capacity;
     }
     public void setac(boolean val){
		 ac = val;
	 }
     public void setcapacity(int cap){
	     capacity = cap;
     }
     public void displayBusinfo(){
    	 System.out.println("bus no : " + busnumber + " ac : " +  ac  + " Total capacity : " + capacity);
	 
  
}
}
