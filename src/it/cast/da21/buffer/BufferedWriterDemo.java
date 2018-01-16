package it.cast.da21.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	private static final String LINE_SEPERATOR=System.getProperty("line.separator");
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("buffer.txt");
		
		//Ϊ�����д���Ч�ʡ�ʹ���ַ����Ļ�������
		//������һ���ַ�д�����Ļ�����󣬲���ָ��Ҫ������Ķ��������
		BufferedWriter bufw=new BufferedWriter(fw);
		
		//������д���ַ��������С�
		bufw.write("abcdfg");
		//bufw.write("abcdf"+LINE_SEPERATOR+"curry+thomphson");
		bufw.newLine();
		bufw.write("currysun");
			
		//ʹ�û�������ˢ�·���������ˢĿ�ĵ��С�
		bufw.flush();
		
		//�رջ�����
		bufw.close();
		
		//fw.write("abcdefg");
		
		//fw.close();
		
	}
}
