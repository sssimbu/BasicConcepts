package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class List {

	void ArrayListEx() {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("simbu");// Adding object in arraylist
		list.add("prasanth");
		list.add("harsha");
		list.add("yoki");
		list.add("srini");
		// Traversing list through Iterator
		java.util.Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// another method of printing arraylist
		for (int i = 0; i < list.size(); i++) {
			System.out.println("using for to print arraylist" + "-->" + list.get(i));
		}

		// another method of printing arraylist
		for (String s : list) {
			System.out.println("using for each to print arraylist" + "-->" + s);
		}

		// adding one list to another

		ArrayList<String> al = new ArrayList<String>();
		al.add("ssd");
		al.add("fff");
		al.add("fgg");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ssd");
		al2.add("sdfre");

		// retain all
		al.retainAll(al2); // it will be print common words
		for (String d : al) {
			System.out.println("after retaining" + "-->" + d);
		}

		al.addAll(al2);// adding second list in first list
		// print the al list
		for (String m : al) {
			System.out.println("added one list to another" + "-->" + m);
		}
		// removing one list from another
		al.removeAll(al2);
		// print the al list
		for (String n : al) {
			System.out.println("removed one list to another" + "-->" + n);
		}

	}

	// method for linkedlist
	void LinkedListEx() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Ravi");
		li.add("Vijay");
		li.add("Ravi"); //it will print bcoz list has duplicate values
		li.add("Ajay");

		// print the li list
		for (String h : li) {
			System.out.println("from linkedlist" + "-->" + h);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj = new List();
		obj.ArrayListEx();
		obj.LinkedListEx();

	}

}
