package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("travel.txt");
		Scanner sc1=new Scanner(f1);
		
		for(int i=0;i<10;i++) {
			String temp1=sc1.nextLine();
			System.out.println(temp1);
		}
		

	}

}
