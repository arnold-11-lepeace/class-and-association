package classandassociation;
import java.util.*;

public class Test {
	public static void main(String args[]){
		String employeeName;
		Employee employee=new Employee ("arnold","onana",2002);
		employeeName=employee.getLastName();
		System.out.println(employeeName);
		ObjetNumerique m=new ObjetNumerique("nike","b");
		employee.addObjetNumerique(m);
		employee.display();
	}


}
