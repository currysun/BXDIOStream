package it.cast.d20.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		
		try {
			
			fw=new FileWriter("K:\\demo.txt");
			fw.write("curry");
			//fw.close();//�����д������ʱ�������󣬾Ͳ������йر����ݣ����Է���finally��
		} catch (IOException e) {
			// TODO: handle exception
			
		}
		finally{
			try {
				if(fw!=null)
				fw.close();//�����д������ʱ�������󣬾Ͳ������йر����ݣ����Է���finally��
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
