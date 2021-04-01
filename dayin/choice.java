package dayin;

public class choice {
	public static Print get(String name)
	{
		Print p=null;
		if("word".equals(name))
		{
			p=new Word();
		}
		if("pdf".equals(name))
		{
			p=new Pdf();
		}
		if("excel".equals(name))
		{
			p=new Excel();
		}

		return p;
		
	}

}
