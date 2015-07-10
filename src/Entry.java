import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Entry {
	String entry;

	static void startentry()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String part1 = null; 
		String part2 = null;
		String part3 = null;
		String part4 = null;
		String part5 = null;
		String part6 = null;
		String part7 = null;
		System.out.println("Please enter your name and number.");
		System.out.println("Like this:");
		System.out.println("MaxMustermann 1 23 21 33 11 22");
		String entry = br.readLine();
			if(entry.contains("  ")){
				System.out.println("Incorrect entry!");
				Main.showmenu();
			}
		else{
		String[] parts = entry.split(" ");
		if (parts.length==7){
		part1 = parts[0]; 
		part2 = parts[1];
		part3 = parts[2];
		part4 = parts[3];
		part5 = parts[4];
		part6 = parts[5];
		part7 = parts[6];
		}
		else{
			System.out.println("Incorrect entry!");
			Main.showmenu();
		}
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int number6 = 0;
		
		try{
		number1 = Integer.parseInt(part2);
		number2 = Integer.parseInt(part3);
		number3 = Integer.parseInt(part4);
		number4 = Integer.parseInt(part5);
		number5 = Integer.parseInt(part6);
		number6 = Integer.parseInt(part7);
		}
		catch(java.lang.NumberFormatException e) {
			System.out.println("Incorrect entry!");
			Main.showmenu();
			throw e;
		}
		
		
		
		if((number1>=1 && number1<=49)&&
				(number2>=1 && number2<=49)&&	
				(number3>=1 && number3<=49)&&
				(number4>=1 && number4<=49)&&
				(number5>=1 && number5<=49)&&
				(number6>=1 && number6<=49));
			else{
				System.out.println("Incorrect entry!");
				Main.showmenu();
			}
		Set<Integer> comparison = new HashSet<Integer>();
		comparison.add(number1);
		comparison.add(number2);
		comparison.add(number3);
		comparison.add(number4);
		comparison.add(number5);
		comparison.add(number6);
			if(comparison.size()!=6){
				System.out.println("Incorrect entry!");
				Main.showmenu();
			}	
		
		Storage.store(part1, number1, number2, number3, number4, number5, number6);	
		System.out.println("Entry Succesful!");
		System.out.println("Name: "+part1+"\nNumbers: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6);
		Storage.setentryused(1);
		Main.showmenu();
		}
		
	
	}
}