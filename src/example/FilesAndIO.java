package example;

import java.io.File;

public class FilesAndIO {

	public static void main(String[] args) {
		File f=new File("/");
		System.out.println(f.canRead());
		System.out.println(f.canExecute());

	}

}
