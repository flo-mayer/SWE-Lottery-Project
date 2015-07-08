import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Entry {
	String entry;
	//InputStreamReader isr = new InputStreamReader(System.in);
	//BufferedReader entry = new BufferedReader(isr);

	static void startentry(int drawingued)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
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
		String part1 = parts[0]; 
		String part2 = parts[1];
		String part3 = parts[2];
		String part4 = parts[3];
		String part5 = parts[4];
		String part6 = parts[5];
		String part7 = parts[6];
		
		int number1 = Integer.parseInt(part2);
		int number2 = Integer.parseInt(part3);
		int number3 = Integer.parseInt(part4);
		int number4 = Integer.parseInt(part5);
		int number5 = Integer.parseInt(part6);
		int number6 = Integer.parseInt(part7);
		
<<<<<<< HEAD
<<<<<<< HEAD
		Main.setentryused(1);
=======
>>>>>>> origin/ruben
=======
>>>>>>> origin/ruben
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
		
		Storage.store(part1, number1, number2, number3, number4, number5, number6);
		
		Main.setentryused(1);
	
		}
	}
}