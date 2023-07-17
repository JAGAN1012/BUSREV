package busreservation;

public class Bus {
   private int busNo;
   private  boolean ac;
   private int capacity;// set and get Encapsulation
   
   Bus(int no,boolean ac,int cap){
	   this.busNo=no;
	   this.ac=ac;
	   this.capacity=cap;
   }
   
   public int getbusNo()  {//access method
	   return busNo;
   }
   
   public int getCapacity()  {//access method
	   return capacity;
   }
   public void setCapacity(int cap) {//mutator
	   capacity = cap;
   }
   public boolean getAc()  {//access method
	   return ac;
   }
   public void setAc(boolean val) {//mutator
	   ac = val;
   }
   void displaybusInfo() {
	   System.out.println("BusNo:"+busNo+"Ac:"+ac+"Total Capacity:"+capacity);
   }
   
}
 