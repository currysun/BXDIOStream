package it.cast.da21.buffer;

import java.io.FileReader;
import java.io.IOException;

/**
 * ������
 * �������޷Ǿ��Ƿ�װ��һ�����飬
 * �������ṩ�˸���ķ�����������з��ʡ�
 * ��ʵ��Щ�������ղ����Ķ�������ĽǱꡣ
 * 
 * �����ԭ��
 * ��ʵ���Ǵ�Դ�л�ȡһ������װ����������
 * �ٴӻ������в��ϵ�ȡ��һ��һ�����ݡ�
 * 
 * �ڴ˴�ȡ����ڴ�Դ�м���ȡһ�����ݽ���������
 * ��Դ�е�����ȡ��ʱ����-1��Ϊ������ǡ�
 * 
 * 
 *
 */
public class MyBufferedReader {

	private FileReader r;
	
	//����һ������ ��Ϊ������
	char[] cbuf=new char[1024];
	
	//����һ��ָ����������е�Ԫ�ء������������һ��ָ��ʱ��ָ���0��
	private int pos=0; 
	
	//����һ�����������ڼ�¼�������е����ݸ�������������Ϊ0ʱ���ʹ�Դ�м�����ȡ���ݵ���������
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
