package com.automation.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class ListFilesInDirectory {
	
	
	public static void listFiles(String... stringPath) throws Exception{
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> directories = new ArrayList<String>();
		
		for(String str:stringPath)
			directories.add(str);
		
		while (directories.size()>0){
			
			String directoryName=directories.get(0);
			directories.remove(0);
			
			String[] files=new File(directoryName).list();
			
			if (files!=null)
				for (int i = 0; i < files.length; i++) {
					
					File file = new File(directoryName+files[i]+"\\");
									
					if (!file.isDirectory()) 
						list.add(directoryName+files[i]+"\\");
					else
						directories.add(directoryName+files[i]+"\\");
						
				}
			}
				
		for(String fileName:list){
			BasicFileAttributes attributes=Files.readAttributes(Paths.get(fileName), BasicFileAttributes.class);
			System.out.println(fileName+"  "+attributes.creationTime() + "  "+attributes.lastModifiedTime());
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		//listFiles("D:\\tools\\templates\\projects\\NewAndroidApplication\\");
		listFiles("D:\\");
		
	}
	

}
