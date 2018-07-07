package auto_typing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Auto_Correct {
	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("C:\\Users\\user\\Desktop\\abc.txt");
	    Scanner sc = new Scanner(file);
		String str="";
		
		while (sc.hasNext()){
	    	str+=sc.next();
	    }
		
		checkSpell(str);
	}

	private static void checkSpell(String str) {
		// TODO Auto-generated method stub
		
	}
}
