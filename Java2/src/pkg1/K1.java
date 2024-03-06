package pkg1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class K1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int custId=0;
		long accNo=0;
		String acctype="";
		String custName="";
		String s1="";
		String s2="";
		String[]list1=new String[4];		
		ArrayList<Integer> custIds=new ArrayList<>();
		ArrayList<Integer> accNos=new ArrayList<>();
		ArrayList<String> accTypes=new ArrayList<>();
		ArrayList<String> custNames=new ArrayList<>();
		
		File f1=new File("input1.txt");
		FileWriter fw1=new FileWriter("output1.txt");
		Scanner sc1=new Scanner(f1);
		for (int i=0; i<3;i++) {
			s1=sc1.nextLine();
			list1=s1.split(",");
			custIds.add(Integer.parseInt(list1[0]));
			accNos.add(Integer.parseInt(list1[1]));
			accTypes.add(list1[2]);
			custNames.add(list1[3]);
		}
		System.out.println(custIds);
		System.out.println(accNos);
		System.out.println(accTypes);
		System.out.println(custNames);
		
		s2="Dear "+custNames.get(0)+" Congratulations for opening an "+accTypes.get(0)+" account in SBI. Your Account Number is "+ accNos.get(0)+"Please use your custId "+custIds.get(0)+"NetBanking";
		fw1.write(s2);
		fw1.close();
		
		
		

	}

}
