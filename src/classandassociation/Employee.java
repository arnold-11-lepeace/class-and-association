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
public class Employee {
	private String firstName;
	private String lastName;
	private int hireYear;
	private ArrayList<ObjetNumerique> listObjetNumerique=new ArrayList<>();
	public Employee(String aFirstName,String aLastName,int aHireYear ) {
		this.listObjetNumerique=new ArrayList<>();
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
	public void addObjetNumerique(ObjetNumerique objet) {
		listObjetNumerique.add(objet);
	}
	public void deleteObjetNumerique(ObjetNumerique objet) {
		listObjetNumerique.remove(objet);
	}
	public int countByBrand(String brand) {
		int c=0;
		for(int i=0;i<listObjetNumerique.size();i++) {
			if(brand==listObjetNumerique.get(i).getBrand()) {
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
		for(int i=0;i<listObjetNumerique.size();i++)
		{
			System.out.println(listObjetNumerique.get(i).getBrand());
		}
		
	}


}
