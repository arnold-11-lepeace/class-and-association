package classandassociation;

public class Tablette extends ObjetNumerique {
	private float screenDimension;
	public Tablette(String brand,String model,float screenDimension) {
		super(brand,model);
		this.screenDimension=screenDimension;
	}
	@Override
	public String getBrand() {
		return super.getBrand();
	}
	@Override
	public String getmodel() {
		return super.getmodel();
	}
	public float getScreenDimension() {
		return screenDimension;
	}
	public float setScreenDimension(float aScreenDimension) {
		this.screenDimension=aScreenDimension;
		return screenDimension;
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println(screenDimension);
	}

}
