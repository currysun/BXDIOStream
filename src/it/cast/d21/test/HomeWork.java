package it.cast.d21.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {
	//��c�̵�һ���ı��ļ����Ƶ�d��
	
	private static final int BUFFER_SIZE = 1024;




	public static void main(String[] args) throws IOException {
		
		//copyFile1();
		copyFile2();


	}




	public static void copyFile2() throws IOException {
		FileWriter fw=null;
		try {
			FileReader fr=new FileReader("demo.txt");
			
			char[] cbuff=new char[BUFFER_SIZE];
			
			int len=0;
			
			fw=new FileWriter("d://demo2.txt");
					
			while((len=fr.read(cbuff))!=-1){
				System.out.println(len);
				fw.write(cbuff,0,len);
				System.out.println("�����ļ��ɹ�");
			}
		} catch (Exception e) {
			System.out.println("��дʧ��");
		}finally{
			if(fw!=null){
				fw.close();
			}
		}
	}
		
		
		

	private static void copyFile1() throws FileNotFoundException, IOException {
		FileReader fr=new FileReader("demo.txt");
		
		int len=0;
		
		FileWriter fw=new FileWriter("d://demo.txt");
		
		StringBuilder sb=new StringBuilder();
		
		while((len=fr.read())!=-1){
			fw.write(len);
			//System.out.print(txt.valueOf(len));
			//sb.append((char)len);
		}
			fr.close();
			fw.close();
		//String txt=new String(sb);
		//System.out.println(txt);
	}
}
