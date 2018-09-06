package ComparableEx;

class Person implements Comparable<Person> {
	int mobile;
	String name;
	int age;

	Person(int mobile, String name, int age) {
		this.mobile = mobile;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}