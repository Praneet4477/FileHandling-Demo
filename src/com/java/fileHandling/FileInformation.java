package com.java.fileHandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Praneeth\\Desktop\\fileFirst.txt");

		if (file.exists()) {
			System.out.println("File Name : " + file.getName());
			System.out.println("File Location : " + file.getAbsolutePath());
			System.out.println("File Size : " + file.length());
			System.out.println("File Writable? : " + file.canWrite());
			System.out.println("File Readable? : " + file.canRead());

			// System.out.println("Delete the File : " + f.delete());

		} else {
			System.out.println("File Dosen't exists on desktop...");
		}

	}

}
