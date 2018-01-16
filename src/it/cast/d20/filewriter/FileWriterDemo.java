package it.cast.d20.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
		
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		/*
		 * 
		 * ����һ���������ļ��������ַ����ݵ� �ַ�������Ķ���
		 * 
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ �ͱ�����ȷ���ļ���
		 * 
		 * ����ļ������ڣ����½����ļ���
		 * ����ļ����ڣ��򸲸ǡ�
		 * 
		 * ���캯���ڼ������true ����֧����д
		 */
		FileWriter fw=new FileWriter("demo.txt",true);
		
		/*
		 * ����FileWriter �е�Writer���� ���ļ���д����������
		 * 
		 * ������������ʱд����������
		 */
		fw.write("curry 30  "+LINE_SEPARATOR+"66666");
		fw.write("great");
		
		/*
		 * ˢ�����ݣ�������д�뵽Ŀ�ĵ��С�
		 */
		fw.flush();
		
		/*
		 * �ر������ر���Դ���ڹر�ǰ�����flush��������ˢ�£������ݴӻ�����д��Ŀ�ĵء�
		 */
		fw.close();
		
	}
	
}
