package test7.sub3;

public class Developer extends Employee {
	private String field;

	public Developer(String name,String birth,String employeeId, String dept, int salary,String field) {
		super(name,birth,employeeId,dept,salary);
		this.field = field;
	}
	
	public void changeField(String s) {
		System.out.println("개발 분야 변경");
		this.field = s;
	}
	
	public void printDeveloperInfo() {
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birth);
		System.out.println("직원 아이디: " + employeeId);
		System.out.println("부서: " + dept);
		System.out.println("급여: " + salary);
		System.out.println("개발분야: " + field);
	}
}
