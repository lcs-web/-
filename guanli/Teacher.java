package guanli;

import java.util.Scanner;
//教师类
public class Teacher extends Person{
	private String college;
	private String subject;
	public Teacher(){
		Scanner s=new Scanner(System.in);

		System.out.println("请输入姓名，年龄，性别，学院，学科");
		
		this.setName(s.next());
		this.setAge(s.nextInt());
		this.setGender(s.next());
		this.setCollege(s.next());
		this.setSubject(s.next());

	}
	public void print()
	{
		System.out.println("姓名 "+this.getName()+" 年龄 "+this.getAge()+" 性别 "+this.getGender()+" 学院 "+this.getCollege()+" 学科 "+this.getSubject());
		
	}
		public void change()
	{		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("输入修改后的姓名 ");
		this.setName(sc.next());
		System.out.println("输入修改后的年龄");
		this.setAge(sc.nextInt());
		System.out.println("输入修改后的性别");
		this.setGender(sc.next());
		System.out.println("输入修改后的学院");
		this.setCollege(sc.next());
		System.out.println("输入修改后的学科");
		this.setSubject(sc.next());		

	}

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
