package guanli;

import java.util.Scanner;
//管理员类
public class Administrators extends Person{
	private int anum;
	public Administrators(){
		Scanner s=new Scanner(System.in);

		System.out.println("请输入姓名，年龄，性别，管理编号");
		
		this.setName(s.next());
		this.setAge(s.nextInt());
		this.setGender(s.next());
		this.setAnum(s.nextInt());

	}
	public void print()
	{
		System.out.println("姓名 "+this.getName()+" 年龄 "+this.getAge()+" 性别 "+this.getGender()+"管理编号"+this.getAnum());
		
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
		System.out.println("输入修改后的管理编号");
		this.setAnum(sc.nextInt());

	}
		public int getAnum() {
			return anum;
		}
		public void setAnum(int anum) {
			this.anum = anum;
		}
}