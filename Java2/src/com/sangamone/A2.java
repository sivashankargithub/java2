package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("projects.txt");
		Scanner sc1=new Scanner(f1);
		String temp1;
		for (int i=0;i<10;i++) {
			temp1=sc1.nextLine();
			System.out.println(temp1);
		}
		

	}

}
