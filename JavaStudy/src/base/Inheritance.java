package base;

public class Inheritance {

	public static void main(String[] args) {
		Testable test = new TestA();
		System.out.println(test.getState(true) +" : " + test.getState(false));
		System.out.println(test.getState(true, false) +" : " + test.getState(true, true));
		System.out.println(test.getReveseState(true) +" : " + test.getReveseState(false));

		System.out.println("---- TestB ----");
		test = new TestB();
		System.out.println(test.getState(true) +" : " + test.getState(false));
		System.out.println(test.getState(true, false) +" : " + test.getState(true, true));
		System.out.println(test.getReveseState(true) +" : " + test.getReveseState(false));
	}
}

interface Testable {
	default String getState(boolean checked) {
		return checked ? "checked" : "unchecked";
	}
	
	default String getState(boolean checked, boolean reverse) {
		return ((!checked && reverse) || (checked && !reverse)) ? "checked" : "unchecked";
	}
	
	default String getReveseState(boolean checked) {
		return !checked ? "checked" : "unchecked";
	}
}

class TestA implements Testable {

}

class TestB implements Testable {

	@Override
	public String getState(boolean checked) {
		return checked ? "selected" : "unselected";
	}
	
}
