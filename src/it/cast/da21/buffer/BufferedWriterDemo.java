package it.cast.da21.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	private static final String LINE_SEPERATOR=System.getProperty("line.separator");
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("buffer.txt");
		
		//为了提高写入的效率。使用字符流的缓冲区。
		//创建了一个字符写入流的缓冲对象，并和指定要被缓冲的对象相关联
		BufferedWriter bufw=new BufferedWriter(fw);
		
		//将数据写入字符缓冲区中。
		bufw.write("abcdfg");
		//bufw.write("abcdf"+LINE_SEPERATOR+"curry+thomphson");
		bufw.newLine();
		bufw.write("currysun");
			
		//使用缓冲区的刷新方法将数据刷目的地中。
		bufw.flush();
		
		//关闭缓冲区
		bufw.close();
		
		//fw.write("abcdefg");
		
		//fw.close();
		
	}
}
