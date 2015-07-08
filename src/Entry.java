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
		String[] parts = entry.split(" ");
		String part1 = parts[0]; 
		String part2 = parts[1];
		String part3 = parts[2];
		String part4 = parts[3];
		String part5 = parts[4];
		String part6 = parts[5];
		String part7 = parts[6];
		
		
		//Main.setentryused(1);
	}
}