package com.poly;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class FileEx1 
{
	public static void main(String[] args) throws IOException
	{
		
		
		//FileOutputStream->write
		//FileInputStream->read
		String s ="Welcome to tops";
		FileOutputStream fout =new FileOutputStream("E://radhika.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
	}
}
