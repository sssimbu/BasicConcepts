package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	void HashMapEx() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(101);
		System.out.println("values after remove" + " " + map);

	}

	void LinkedHashMapEx() {

		LinkedHashMap<Integer, String> ss = new LinkedHashMap<Integer, String>();

		ss.put(100, "sss");
		ss.put(101, "lll");
		ss.put(102, "sss");

		for (Map.Entry n : ss.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		ss.remove(102);
		System.out.println("after remove" + ss);

	}

	void TreeMapEx() {
		TreeMap<Integer, String> treeemap = new TreeMap<Integer, String>();
		treeemap.put(1040, "frtghy");
		treeemap.put(1015, "frtghy");
		treeemap.put(1024, "Rahul");
		treeemap.put(4556, "frggg");
		treeemap.put(5677, "frtghy");
		treeemap.put(4598, "thgg");
		for (Map.Entry r : treeemap.entrySet()) {
			System.out.println("TreeMap" + r.getKey() + " " + r.getValue());
		}
		treeemap.remove(1015);
		System.out.println("values after remove(treemap)" + " " + treeemap);

	}

	void HasTableEx() {
		/*
		 * It contains only unique elements. It may have not have any null key
		 * or value.
		 */

		Hashtable<Integer, String> ll = new Hashtable<Integer, String>();

		ll.put(100, "Amit");
		ll.put(102, "Ravi");
		ll.put(101, "Vijay");
		ll.put(103, "Rahul");
		ll.put(103, "Rahul");
		ll.put(211, "Rahul");

		for (Map.Entry y : ll.entrySet()) {
			System.out.println("HashTable values" + y.getKey() + " " + y.getValue());
		}

		ll.remove(103);
		System.out.println("after removed(HashTable)" + ll);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapEx obj = new MapEx();
		obj.HashMapEx();
		obj.LinkedHashMapEx();
		obj.TreeMapEx();
		obj.HasTableEx();

	}

}
