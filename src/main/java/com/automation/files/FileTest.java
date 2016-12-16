package com.automation.files;

import java.io.File;
import java.nio.file.Paths;

public class FileTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
				
		File file = new File("D://useless//spire-crm");	
		
		System.out.println("Is Directory? " + file.isDirectory());
		System.out.println("Is File? "+file.isFile());
		System.out.println("Is hidden file? "+file.isHidden());
		System.out.println("is Absolute? "+file.isAbsolute());
		
		if (file.isDirectory()) {
			
			String[] fileList=file.list();
			
			for (int i = 0; i < fileList.length; i++) {
				System.out.println(fileList[i]);
			}
			
			File createFile = new File("D://useless//spire-crm//raghav.txt");
			
			System.out.println("Is Directory? " + createFile.isDirectory());
			System.out.println("Is File? "+createFile.isFile());
			System.out.println("Is hidden file? "+createFile.isHidden());
			System.out.println("is Absolute? "+createFile.isAbsolute());
			
			if (createFile.createNewFile()){
				System.out.println("New file created");
			}else{
				System.out.println("File already exist");
			}
			
			
			
		}
		
	}

}
