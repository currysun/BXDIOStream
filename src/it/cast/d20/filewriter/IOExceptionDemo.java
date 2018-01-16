package it.cast.d20.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		
		try {
			
			fw=new FileWriter("K:\\demo.txt");
			fw.write("curry");
			//fw.close();//如果在写入数据时发生错误，就不会运行关闭数据，所以放在finally里
		} catch (IOException e) {
			// TODO: handle exception
			
		}
		finally{
			try {
				if(fw!=null)
				fw.close();//如果在写入数据时发生错误，就不会运行关闭数据，所以放在finally里
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
