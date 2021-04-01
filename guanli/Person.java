package guanli;

public abstract class Person {
	private String name;//姓名
	private int age;//年龄
	private String gender;//性别
	public abstract void print();//显示
	public abstract void change();//修改
	
	public String getGender() {
		return gender;
		
	}
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	public String getName() {
	return name;
	
}

	public void setName(String name) {
	this.name = name;
	
}

	public int getAge() {
	return age;
	
}

	public void setAge(int age) {
	this.age = age;
	
}
}
