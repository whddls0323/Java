package sub4;

public class Person {
	
	//속성
	protected String name;
	protected int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메서드
	public void work() {
		System.out.println("Person is working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 " + this.name + "이고 나이는 " + this.age + "세 입니다.");
	}
}
