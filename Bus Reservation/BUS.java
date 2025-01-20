package BusResv;

public class BUS {
	private int BusNo;
	private boolean Ac;
	private int Capacity;
	
	BUS(int no,boolean ac,int cap){
		this.BusNo=no;
		this.Ac=ac;
		this.Capacity=cap;
	}
	public int getBusNo() {
		return BusNo;
	}
	
	public boolean isAc() {
		return Ac;
	}
	
	public int getCapacity() {
		return Capacity;
	}
	
	public void setAc(boolean val) {
		Ac=val;
	}
	
	public void setCapacity(int cap) {
		Capacity=cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus no: "+BusNo+" Ac: "+Ac+" Capacity: "+Capacity);
	}
}
