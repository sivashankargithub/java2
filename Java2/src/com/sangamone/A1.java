package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class A1 {

	public static void main(String[] args) throws FileNotFoundException{
		File f1=new File("projects.txt");
		Scanner sc1=new Scanner(f1);
		ArrayList<String>projects=new ArrayList<>();
		ArrayList<Integer>projectid=new ArrayList<>();
		ArrayList<Integer>usns=new ArrayList<>();
		ArrayList<String>usn = new ArrayList<>();
		String[]arr1=new String[4];
		String[]arr2=new String[4];
		String info1;
		String temp1;
		int count=1;
		while(sc1.hasNext()) {
			info1=sc1.nextLine();
			arr1=info1.split(":");
			projects.add(arr1[0]);
			projectid.add(count);
			
			temp1=arr1[1];
			arr2=temp1.split(",");
			count++;
		}
		int qty=projects.size();
		
		for(int i=0;i<qty;i++) {
			System.out.println(projectid.get(i)+"."+usn.get(i)+","+projects.get(i));
			
		}
		for(int i=70;i<70+63;i++) {
			usns.add(i);
		}
		System.out.println(usns);
		
		

	}

}
