package oops_concept;

public class EncapResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationGetAndSet obj = new EncapsulationGetAndSet();
		obj.setA(1);
		obj.setB(2);
		obj.setC(43.5f);
		obj.setName("simbu");

		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		System.out.println(obj.getName());

	}

}
