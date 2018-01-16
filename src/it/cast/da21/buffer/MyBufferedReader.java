package it.cast.da21.buffer;

import java.io.FileReader;
import java.io.IOException;

/**
 * 分析：
 * 缓冲区无非就是封装了一个数组，
 * 并对外提供了更多的方法对数组进行访问。
 * 其实这些方法最终操作的都是数组的角标。
 * 
 * 缓冲的原理：
 * 其实就是从源中获取一批数据装进缓冲区。
 * 再从缓冲区中不断的取出一个一个数据。
 * 
 * 在此次取完后，在从源中继续取一批数据进缓冲区。
 * 当源中的数据取光时，用-1作为结束标记。
 * 
 * 
 *
 */
public class MyBufferedReader {

	private FileReader r;
	
	//定义一个数组 作为缓冲区
	char[] cbuf=new char[1024];
	
	//定义一个指针操作数组中的元素。当操作到最后一个指针时，指针归0。
	private int pos=0; 
	
	//定义一个计数器用于记录缓冲区中的数据个数，当该数据为0时，就从源中继续获取数据到缓冲区。
	private int count=0;
	
	private MyBufferedReader(FileReader r){
		this.r=r;
	}
	
	public void read() throws IOException{
		if(count==0){
			count=r.read(cbuf);
		}
		
		
	}

	public static void main(String[] args) {
	

	}

}
