# class-and-association
It's a small project in which I create two classes and I connect them through an association
package classandassociation;

import java.util.ArrayList;

/**
 * @author ONANAArnold
 * @version 1.0
 *
 */
/**
 * class of employee
 */
public class employee {
	private String firstName;
	private String lastName;
	private int hireYear;
	private ArrayList<Smartphone> listSmartphone=new ArrayList<>();
	public employee(String aFirstName,String aLastName,int aHireYear ) {
		this.listSmartphone=new ArrayList<>();
		this.firstName=aFirstName;
		this.lastName=aLastName;
		this.hireYear=aHireYear;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setLastName(String aLastName) {
		this.lastName=aLastName;
	}
	public void addSmartphone(Smartphone smart) {
		listSmartphone.add(smart);
	}
	public void deleteSmartphone(Smartphone smart) {
		listSmartphone.remove(smart);
	}
	public int countByBrand(String brand) {
		int c=0;
		for(int i=0;i<listSmartphone.size();i++) {
			if(brand==listSmartphone.get(i).getBrand()) {
				c++;
			}
		}
		return c;
		
	}
	
	public int computeSeniority(Integer currentYear) {
		return (currentYear-hireYear);
	}
	public void display() {
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.hireYear);
		
	}


}
