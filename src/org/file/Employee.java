package org.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Employee {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Add\\Sub\\Mull\\three.txt");
	//boolean a = f.mkdirs();
	//System.out.println(a);
//	boolean c = f.createNewFile();
	//System.out.println(c);
	//boolean b = f.canRead();
	//System.out.println(b);
	//boolean d = f.canWrite();
	//System.out.println(d);
	//boolean e = f.canExecute();
	//System.out.println(e);
	//String[] s = f.list();
	//for (String x: s) {
	//	System.out.println(x);
		
	//}
	//File[] k = f.listFiles();
	//for (File file : k) {
		//System.out.println(file);
		
		FileUtils.write(f, "praveen", true);
		FileUtils.write(f, "tamil", true);
		FileUtils.write(f, "krish", false);
	}
	
	
	
	
	

}
