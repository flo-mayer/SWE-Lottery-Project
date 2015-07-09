import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Result {
	static int index;
	String name;
	int[] numbers = new int[6];
	static int[] drawing = new int[6];
	
	
	static void startresult() throws IOException{
		index = Storage.counter-1;
		for (int i=0;i<=index;i++){
			int a1 = Storage.entries[i].numbers[0];
			int a2 = Storage.entries[i].numbers[1];
			int a3 = Storage.entries[i].numbers[2];
			int a4 = Storage.entries[i].numbers[3];
			int a5 = Storage.entries[i].numbers[4];
			int a6 = Storage.entries[i].numbers[5];
			int b1 = Storage.draw[0];
			int b2 = Storage.draw[1];
			int b3 = Storage.draw[2];
			int b4 = Storage.draw[3];
			int b5 = Storage.draw[4];
			int b6 = Storage.draw[5];
			int hits=compare(a1,a2,a3,a4,a5,a6,b1,b2,b3,b4,b5,b6);
			System.out.printf("Name: "+ Storage.entries[i].name + "\n");
			System.out.printf("Numbers: "+ a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + "\n");
			System.out.printf(hits + " out of 6 correct numbers!\n");
		}
					
		askclear();
	}
	
	static int compare(int a1, int a2, int a3, int a4, int a5, int a6, int b1, int b2, int b3, int b4, int b5, int b6){
		Set<Integer> comparison = new HashSet<Integer>();
		comparison.add(a1);
		comparison.add(a2);
		comparison.add(a3);
		comparison.add(a4);
		comparison.add(a5);
		comparison.add(a6);
		comparison.add(b1);
		comparison.add(b2);
		comparison.add(b3);
		comparison.add(b4);
		comparison.add(b5);
		comparison.add(b6);
		int hits = 12 - comparison.size();
		return hits;
	}
	
	static void askclear() throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose:");
		System.out.println("1 - Reset and return to menu");
		System.out.println("0 - Quit");
		int descission = sc.nextInt();
		if (descission==1){
			Storage.clear();
		}
		else if (descission==0){
			System.exit(0);
		}
		else {
			System.out.println("Invalid input!");
			askclear();
		}
	}
	
}
