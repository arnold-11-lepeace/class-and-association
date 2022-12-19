package classandassociation;

public class ObjetNumerique {
	protected String brand;
	protected String model;
	public ObjetNumerique(String brand,String model) {
		this.brand=brand;
		this.model=model;
	}
	public String getBrand() {
		return brand;
	}
	public String getmodel() {
		return model;
	}
	public void display() {
		System.out.println(brand);
		System.out.println(model);
	}
	

}
