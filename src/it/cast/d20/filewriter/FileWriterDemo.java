package it.cast.d20.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
		
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		/*
		 * 
		 * 创建一个可以往文件中输入字符数据的 字符输出流的对象
		 * 
		 * 既然是往一个文件中写入文字数据，那么在创建对象时 就必须明确该文件。
		 * 
		 * 如果文件不存在，则新建该文件。
		 * 如果文件存在，则覆盖。
		 * 
		 * 构造函数内加入参数true 可以支持续写
		 */
		FileWriter fw=new FileWriter("demo.txt",true);
		
		/*
		 * 调用FileWriter 中的Writer方法 像文件中写入文字数据
		 * 
		 * 将文字数据暂时写到缓冲区内
		 */
		fw.write("curry 30  "+LINE_SEPARATOR+"66666");
		fw.write("great");
		
		/*
		 * 刷新数据，将数据写入到目的地中。
		 */
		fw.flush();
		
		/*
		 * 关闭流，关闭资源。在关闭前会调用flush方法进行刷新，将数据从缓冲区写入目的地。
		 */
		fw.close();
		
	}
	
}
