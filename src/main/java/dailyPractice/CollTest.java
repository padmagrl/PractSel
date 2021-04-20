package dailyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Stu {
	int id;
	String name;

	Stu(int id, String name) {
		this.id = id;
		this.name = name;

	}

}

public class CollTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		
		ar2.add(3);
		ar2.add(5);
		ar2.add(6);
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		
	}
}


