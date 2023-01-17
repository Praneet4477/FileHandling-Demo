package com.java.fileHandling;

import java.io.*;

public class RenameFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Praneeth\\Desktop\\Project\\demo.txt");
		File renameFile = new File("C:\\Users\\Praneeth\\Desktop\\Project\\changedName.txt");
		
		if(file.exists()) {
			System.out.println(file.renameTo(renameFile));
			System.out.println("Renamed :) ");
		}else {
			System.out.println("File doesn't exits on desktop to rename...");
		}

	}

}
