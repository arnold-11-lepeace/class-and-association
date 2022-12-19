package classandassociation;
import java.util.*;

public class Test {
	public static void main(String args[]){
		String a;
		Employee e=new Employee ("arnold","onana",2002);
		a=e.getLastName();
		System.out.println(a);
		ObjetNumerique m=new ObjetNumerique("nike","b");
		e.addObjetNumerique(m);
		e.display();
	}
	

}
