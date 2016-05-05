package car;

public class Car extends Moto {

	private String type = "°ÂµÏ";// ±¦Âí¡¢±¼³Û¡¢°ÂµÏ
 public Car(){}
	public Car(String MotoNo) {
		super(MotoNo);
		
	}

	public Car(String MotoNo, String type) {
		super(MotoNo);
		this.type = type;
	}
	@Override 
	public double rentFee(int day) {
		// need day & type
		if (type.equals("±¦Âí")) {
			setFee(500);
		} else if (type.equals("±¼³Û")) {
			setFee(600);
		} else {
			setFee(400);
		}
		return super.rentFee(day);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
