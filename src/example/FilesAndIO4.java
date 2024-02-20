package example;

import java.io.File;
import java.io.FileInputStream;

public class FilesAndIO4 {

	public static void main(String[] args) throws Exception
	{
		File f=new File("D:\\new\\hello.txt");
		FileInputStream fis=new FileInputStream("D:\\new\\hello.txt");
		System.out.println(f.isFile());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		int a;
		while((a=fis.write())!=1)
		{
			System.out.print((char)a);
		}
//		fis.close();
		

	}

}
