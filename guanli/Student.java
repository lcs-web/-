package guanli;

import java.util.Scanner;
//学生类
public class Student extends Person{
	
	private int number;//学号

	public Student(){
		Scanner s=new Scanner(System.in);

		System.out.println("请输入姓名，年龄，性别,学号");
		
		this.setName(s.next());
		this.setAge(s.nextInt());
		this.setGender(s.next());
		this.setNumber(s.nextInt());
	}

	public void print()
	{
		System.out.println("姓名 "+this.getName()+" 年龄 "+this.getAge()+" 性别 "+this.getGender()+" 学号 "+this.getNumber());
		
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
		System.out.println("输入修改后的学号");
		this.setNumber(sc.nextInt());

	}

	public int getNumber() {
		return number;
		
	}

	public void setNumber(int number) {
		this.number = number;
		
	}


}
