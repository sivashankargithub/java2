package com.sangamone;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C30 {
	public static void diff1(String fname1,String fname2) throws Exception{
		File f1=new File(fname1);
		File f2=new File(fname2);
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(f2);
		List<Integer> difflines=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		String[] words1;
		String[] words2;
		String s1,s2,line1,line2,word1,word2;
		int len1=0;
		int lineno;
		for(int i=0;i<4;i++) {
			s1=sc1.nextLine();
			s2=sc2.nextLine();
			if(!s1.equals(s2)){
				difflines.add(i);
				list1.add(s1);
				list2.add(s2);
				//System.out.println("Line "+i+" Mismatch "+s1+"-"+s2);
			}
		}
		for(int j=0;j<2;j++) {
			lineno=difflines.get(j);
			line1=list1.get(j);
			line2=list2.get(j);
			words1=line1.split(" ");
			words2=line2.split(" ");
			len1=words1.length;
			for(int i=0;i<len1;i++) {
				word1=words1[i];
				word2=words2[i];
				if(!word1.equals(word2)) {
					System.out.println("line "+lineno +" word "+i+ " mismatch "+ word1+"-"+word2);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		diff1("file1.txt","file2.txt");
		// To make a product similar to https://www.diffchecker.com/
		
	}
}
