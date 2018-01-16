package it.cast.da21.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * ×Ö·û´®»º³åÇø copy ÎÄ¼þ
 */
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("buffer.txt");
		BufferedReader br=new BufferedReader(fr);
			
		FileWriter fw=new FileWriter("buffer_copy.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		//byte[] b=new byte[1024];
		
		String line=null;
		
		while((line=br.readLine())!=null){
			//System.out.println(line);
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
	}

}
