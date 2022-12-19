package classandassociation;

/**
 * 
 * @author ONANAArnold
 *@version 1.0
 */
public class Smartphone extends ObjetNumerique {
	private String phoneNumber;
	
	public Smartphone(String brand,String model,String phoneNumber) {
		
		super(brand,model);
		this.phoneNumber=phoneNumber;
	}
	@Override
	public String getBrand() {
		return super.getBrand();
	}
	@Override
	public String getmodel() {
		return super.getmodel();
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String setPhoneNumber(String aPhoneNumber) {
		this.phoneNumber=aPhoneNumber;
		return phoneNumber;
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println(phoneNumber);
	}

}
