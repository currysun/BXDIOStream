package it.cast.d20.filewriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.������ȡ�ַ����ݵ������� 
		 * FileReader fr=new FileReader();
		 * �ڴ���������ʱ ������ȷ��ȡ�ļ���
		 * new FileReader("demo.txt")
		 * 
		 */
		
		FileReader fr=new FileReader("demo.txt");
		
		/*
		 * �����ֽھ���16λ�����ƣ� 2��16�η�����65536,����UCS-2����ܱ���65536���ַ��� 
		 * ������ĸ"a"��Unicode ������0x0061,ʮ������97
		 */
		int ch=0;
		ch=fr.read();
		while(ch!=-1){
			System.out.println((char)ch);
			ch=fr.read();
		}
		
		
	}
}
