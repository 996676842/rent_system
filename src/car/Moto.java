package car;

public abstract class Moto {
	private String MotoNo;
	private double fee;
    public Moto(){}
	public Moto(String MotoNo){
		this.MotoNo = MotoNo;
	}
	
	public double rentFee(int day){
		return day * fee ;
	}

	public String getMotoNo() {
		return MotoNo;
	}

	public void setMotoNo(String motoNo) {
		MotoNo = motoNo;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
