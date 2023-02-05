package encapsulation;

public class practice1 {
    private String name;
    private int age;
    private int salary;
	public static void main(String[] args) {
		
		practice1 encap=new practice1();
		encap.age=23;
		encap.name="mayuri";
		encap.salary= 35000;
		
		System.out.println("age is===>"+encap.age);
		System.out.println("name is===>"+encap.name);
		System.out.println("salary is===>"+encap.salary);

	}

//	public String getName() {
	//	return name;
	//}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
}
