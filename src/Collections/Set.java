package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	void HashSetEx() {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi"); // it will not print this bcoz set has unique values
							// only
		set.add("Ajay");
		 System.out.println("set size:"+set.size());


		// print the set
		for (String h : set) {
			System.out.println("from Hashset" + "-->" + h);
		}

	}

	void LinkedHashSetEx() {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi"); // it will not print this bcoz set has unique values
						// only
		al.add("Ajay");
		// print the set
		for (String o : al) {
			System.out.println("from Linked Hashset" + "-->" + o);
		}

	}

	// Treeset maintaining ascending order
	void TreesetEx() {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Ravi");
		tree.add("Vijay");
		tree.add("Ravi");
		tree.add("Ajay");

		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(5);
		num.add(1);
		num.add(8);
		num.add(4);
		num.add(5);

		// print the tree
		for (String strtree : tree) {
			System.out.println("from Treeset(string)" + "-->" + strtree);
		}

		// print the tree
		for (Integer inttree : num) {
			System.out.println("from Treeset(int)" + "-->" + inttree);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj = new Set();
		obj.HashSetEx();
		obj.LinkedHashSetEx();
		obj.TreesetEx();
	}
}
