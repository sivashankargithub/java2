package com.sangamone;
import java.util.ArrayList;

public class Encode1 {
	public static void main(String[] args) {
		A4 a4=new A4();
		ArrayList<String>digits=new ArrayList<>();
		ArrayList<String>alpha=new ArrayList<>();
		String s1="FUNWITHPROGRAMMING1 funwithProgramming, . ";
		String char1;
		int position=0;
		String s2="";
		alpha=a4.getAlpha();
		digits=a4.getDigits();
		for (int i=0;i<s1.length();i++) {
			char1=s1.substring(i,i+1);
			position=alpha.indexOf(char1);
			s2=s2+digits.get(position);
		}
		System.out.println(s2);
	}
}
