package com.sangamone;
import java.io.File;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class C31 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("file1.txt");
		File f2 = new File("file2.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(f2);
		int line = 1;
		while(sc1.hasNextLine()&&sc2.hasNextLine())
		{
			String line1 = sc1.nextLine();
			String line2 = sc2.nextLine();
			if(line1.equals(line2))
			{
				line++;
			}
			else
			{
				String[] text1 = line1.split(" ");
				String[] text2= line2.split(" ");
				for(int i=0;i<text1.length;i++)
				{
					if(text1[i].equals(text2[i]))
					{
						continue;
					}
					else
					{
						System.out.println("line: "+line+" word: "+i+" "+text1[i]+" "+text2[i]);
						
					}
				}
				line++;
			}
		}
		

	}

}
