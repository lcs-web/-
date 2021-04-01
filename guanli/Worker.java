package guanli;
//工作人员

import java.util.Scanner;

public class Worker extends Person{
	private int wnum;
	public Worker(){
		Scanner s=new Scanner(System.in);

		System.out.println("请输入姓名，年龄，性别，工作编号");
		
		this.setName(s.next());
		this.setAge(s.nextInt());
		this.setGender(s.next());
		this.setWnum(s.nextInt());

	}
	public void print()
	{
		System.out.println("姓名 "+this.getName()+" 年龄 "+this.getAge()+" 性别 "+this.getGender()+"工作编号"+this.getWnum());
		
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
		System.out.println("输入修改后的工作编号");
		this.setWnum(sc.nextInt());

	}
		public int getWnum() {
			return wnum;
		}
		public void setWnum(int wnum) {
			this.wnum = wnum;
		}

}
