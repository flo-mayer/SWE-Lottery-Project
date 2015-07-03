import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int descision = 0;
		int entryused = 0;
		int drawingused = 0;
		//showmenu(entryused, drawingused);
		Generator.startgenerator();
	}
	static void showmenu(int entryused, int drawingused) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
	    String entry = br.readLine();
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    int e = sc.nextInt();
	    int f = sc.nextInt();
	    Storage.store(entry, a, b, c, d, e, f);
	    Storage.print(Storage.counter-1);
	}
}
