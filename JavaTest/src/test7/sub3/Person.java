package test7.sub3;

public class Person {
	protected String name;
	protected String birth;
	
	public Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	public void printPersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birth);
	}
}
