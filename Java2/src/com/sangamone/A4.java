package com.sangamone;
import java.util.ArrayList;
public class A4 {
	public static ArrayList<String> getAlpha() {
		ArrayList<String>alpha=new ArrayList<>();
		for(int i=0;i<26;i++) {
			String alpha1=String.valueOf((char)(65+i));
			alpha.add(alpha1);
		}
		for(int i=0;i<26;i++) {
			String alpha1=String.valueOf((char)(97+i));
			alpha.add(alpha1);
		}
		for(int i=0;i<10;i++) {
			alpha.add(String.valueOf(i));
		}
		String special="~!@#$%^&*()_+-={}[]|;:'<>?/,. ";
		int len1=special.length();
		for(int i=0;i<len1;i++) {
			alpha.add(special.substring(i, i+1));
		}
		return alpha;
	}
	public static ArrayList<String>getDigits(){
		ArrayList<String>digits=new ArrayList<>();
		String digit1="";
		for(int i=0;i<getAlpha().size();i++) {
			digit1=String.valueOf(1+i);
			digits.add(digit1);
		}
		return digits;
	}

	public static void main(String[] args) {
			System.out.println(getAlpha());
			System.out.println(getDigits());
			
	}

}






