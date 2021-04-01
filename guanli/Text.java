package guanli;

import java.util.Scanner;
//测试类
public class Text {
	public static void main(String args[]) {
		Administer m=new Administer();
		while(true){
		System.out.println("请输入你的选择");
		System.out.println("1.创建学生对象；2.创建教师对象；3.创建行政人员对象；4.创建管理员对象；");
		System.out.println("5.创建工作人员对象；6删除指定对象；7修改指定对象;8显示对象信息；0退出");
		
		Scanner sc = new Scanner(System.in);
		
		int s=sc.nextInt();

		switch(s)
		{
		case 1:
		{
			Student stu=new Student();
			m.create(stu);
			break;
		}
		case 2:
		{
			Teacher tea=new Teacher();
			m.create(tea);
			break;
		}
		case 3:
		{
			Administration adn=new Administration();
			m.create(adn);
			break;
		}
		case 4:
		{
			Worker wor=new Worker();
			m.create(wor);
			break;
		}
		case 5:
		{
			Administrators ads=new Administrators();
			m.create(ads);
			break;
		}
		case 6:
		{
			System.out.println("请输入想要删除对象的名字");
			Scanner scan = new Scanner(System.in);
			String name=scan.next();
			m.delete(name);
			break;
		}
		case 7:
		{
			System.out.println("请输入想要修改属性的名字");
			Scanner scan = new Scanner(System.in);
			String name=scan.next();
			m.change(name);

			break;

		}
		case 8:
		{
			m.printf();
			break;
		}
		case 0:
		{
			System.out.println("退出管理");
			return;
			
		}
		}

	}
}
}

