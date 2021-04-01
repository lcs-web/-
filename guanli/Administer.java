package guanli;
//管理类
import java.util.ArrayList;

public class Administer {
	public ArrayList<Person> per= new ArrayList<Person>();//动态数组
	public  void create(Person p)
	{
		per.add(p);
		System.out.println("添加成功");
	}
	public Person find(String name) {//根据名字来查找
		Person p=null;
		for(Person i:per) 
		{
			if(name.equals(i.getName()))
			{
				p=i;
				return p;
			}
		}
		return p;
	}

	public  void delete(String name)//删除
	{
		if(per==null)
		{
			System.out.println("没有这个人");
			return;
		}
		Person p=this.find(name);
		if(p==null)
		{
			System.out.println("没找到这个人");
			return;
		}
		per.remove(p);
		System.out.println("删除成功");
	}

	public  void change(String name)
	{
		if(per==null)
		{
			System.out.println("没有这个人");
			return;
		}
		Person p=this.find(name);
		if(p==null)
		{
			System.out.println("没找到这个人");
		}
		p.change();
		System.out.println("修改成功 ");
	}
	public void printf()
	{
		for(Person i:per)
		{
			i.print();
		}
	}

}