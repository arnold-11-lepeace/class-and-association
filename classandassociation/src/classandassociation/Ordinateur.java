package classandassociation;
import java.util.*;
public class Ordinateur extends ObjetNumerique {
	private  ArrayList<String> listLogiciel=new ArrayList<>();
	private float processorSpeed;
	
	public Ordinateur(String brand,String model,ArrayList<String> listLogiciel,float processorSpeed) {
		super(brand,model);
		this.listLogiciel=listLogiciel;
		this.processorSpeed=processorSpeed;
	}
	@Override
	public String getBrand() {
		return super.getBrand();
	}
	@Override
	public String getmodel() {
		return super.getmodel();
	}
	public ArrayList<String> getListLogiciel() {
		return listLogiciel;
	}
	public float getProcessorSpeed() {
		return processorSpeed;
	}
	public ArrayList<String> setLogiciel(String l1,String l2) {
		for(int i=0;i<listLogiciel.size();i++) {
			if(listLogiciel.get(i)==l1) {
				listLogiciel.set(i, l2);
			}
		}
		return listLogiciel;
	}
	public float setProcessorSpeed(float aSpeedProcessor) {
		processorSpeed=aSpeedProcessor;
		return processorSpeed;
	}
	@Override
	public void display() {
		super.display();
		System.out.println(processorSpeed);
		for(int i=0;i<listLogiciel.size();i++)
		System.out.println(listLogiciel.get(i));
	}


}
