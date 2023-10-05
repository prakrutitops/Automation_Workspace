package com.a510;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEx 
{
	public static void main(String[] args) throws IOException 
	{
		/*
		 * int i = 0; FileWriter fw =new FileWriter("E://a.txt"); fw.write("Welcome");
		 * fw.flush(); fw.close(); System.out.println("Success");
		 */
		
		int i = 0;
		FileReader fr =new FileReader("E://a.txt");
		
		while((i = fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
		
	}
}
