package it.cast.d20.filewriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.创建读取字符数据的流对象 
		 * FileReader fr=new FileReader();
		 * 在创建流对象时 必须明确读取文件。
		 * new FileReader("demo.txt")
		 * 
		 */
		
		FileReader fr=new FileReader("demo.txt");
		
		/*
		 * 两个字节就是16位二进制， 2的16次方等于65536,所以UCS-2最多能编码65536个字符。 
		 * 比如字母"a"的Unicode 编码是0x0061,十进制是97
		 */
		int ch=0;
		ch=fr.read();
		while(ch!=-1){
			System.out.println((char)ch);
			ch=fr.read();
		}
		
		
	}
}
