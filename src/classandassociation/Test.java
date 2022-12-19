package classandassociation;
import java.util.*;

public class Test {
	public static void main(String args[]){
		String employeName;
		Employee employe=new Employee ("arnold","onana",2002);
		employeName=employe.getLastName();
		System.out.println(employeName);
		ObjetNumerique m=new ObjetNumerique("nike","b");
		employe.addObjetNumerique(m);
		employe.display();
	}
	

}
