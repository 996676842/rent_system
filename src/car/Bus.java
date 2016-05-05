package car;

public class Bus extends Moto {
	private int seatCount = 0;

	public Bus() {}
		


	
	public Bus(String MotoNo) {
		super(MotoNo);
		
	}

	public Bus(String MotoNo, int seatCount) {
		super(MotoNo);
		this.seatCount = seatCount;
	}
	@Override 
	public double rentFee(int day) {
		if (seatCount >= 16) {
			setFee(2000);
		} else {
			setFee(1000);
		}
		return super.rentFee(day);
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}
