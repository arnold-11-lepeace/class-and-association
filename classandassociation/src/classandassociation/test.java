package classandassociation;
import java.util.*;

public class test {
	public static void main(String args[]){
		String a;
		employee e=new employee ("arnold","onana",2002);
		a=e.getLastName();
		System.out.println(a);
		ObjetNumerique m=new ObjetNumerique("nike","b");
		e.addObjetNumerique(m);
		e.display();
	}
	

}
