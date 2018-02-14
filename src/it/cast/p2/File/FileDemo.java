package it.cast.p2.File;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {

	public static void main(String[] args) {
		
		//fileDemo();
		//fileRootList();
		fileList2();
	}
	
	public static void fileList3() {
		File file=new File("C:\\");
		file.getName();
		file.lastModified();
		file.getName();
		File[] files=file.listFiles(new FilterByHidden());
		
		for (File f : files) {
			System.out.println(f);
		}
		
	}

	public static void fileDemo() {
		File[] files=File.listRoots();
		long value;
		long maxvalue=0;
		int maxindex=0;
		for (int i=0;i<files.length;i++) {			
			value=files[i].getFreeSpace();
			if(maxvalue<value) {
				maxvalue=value;
				maxindex=i;
			}		
		}
		System.out.println(files[maxindex]+String.valueOf(maxvalue));	
	}
	
	public static void fileRootList() {
		File[] files=File.listRoots();
		for (File file : files) {
			System.out.println(file.getFreeSpace());
		}
	}
	
	public static void fileList() {
		File file=new File("C:\\");
		String[] f1=file.list();
		for (String s : f1) {
			System.out.println(s);
		}
	}
	
	public static void fileList2() {
		File file=new File("C:\\");
		String[] f1=file.list(new SuffixFilter(".java")); /*{
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			}
		});*/
		for (String s : f1) {
			System.out.println(s);
		}
	}
	
	
}
