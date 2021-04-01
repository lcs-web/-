package guanli;

import java.util.Scanner;
//行政人员类
public class Administration extends Person{
	private int num;
	public Administration(){
		Scanner s=new Scanner(System.in);

		System.out.println("请输入姓名，年龄，性别，行政编号");
		
		this.setName(s.next());
		this.setAge(s.nextInt());
		this.setGender(s.next());
		this.setNum(s.nextInt());

	}
	public void print()
	{
		System.out.println("姓名 "+this.getName()+" 年龄 "+this.getAge()+" 性别 "+this.getGender()+"行政编号"+this.getNum());
		
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
		System.out.println("输入修改后的行政编号");
		this.setNum(sc.nextInt());

	}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}

}
