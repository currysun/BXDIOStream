package it.cast.d20.filewriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo2 {
	/*
	 * read(char[] char) ��ȡ�ַ��洢���ַ�������ڴ�ԭ��
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("demo2.txt");
		
		char[] charArray=new char[3];
		
		int len=0;
		
		while((len=fr.read(charArray))!=-1){
			System.out.println(new String(charArray,0,len));
		}
		
		/*int num=fr.read(charArray);
		int num1=fr.read(charArray);
		int num2=fr.read(charArray);
		System.out.println(num+"= "+new String(charArray,0,num));
		System.out.println(num1+"= "+new String(charArray,0,num1));
		// -1 indexofbound System.out.println(num2+"= "+new String(charArray,0,num2));
		*/
	}
}
