import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int entryused = 0;
		int drawingused = 0;
		
		showmenu(entryused, drawingused);
		Generator.startgenerator();
	}
	static void showmenu(int entryused, int drawingused) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose:");
		System.out.println("1 - Enter Ticket");
		System.out.println("2 - Draw Numbers");
		System.out.println("3 - Show results");
		System.out.println("0 - Quit");
		int descission = sc.nextInt();
		if (descission==1){
			
		}
		else if (descission==2){
			
		}
		else if (descission==3){
			
		}
		else if (descission==0){
			System.exit(0);
		}
		else {
			
		}
	    /*String entry = br.readLine();
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    int e = sc.nextInt();
	    int f = sc.nextInt();
	    Storage.store(entry, a, b, c, d, e, f);
	    Storage.print(Storage.counter-1);*/
	}
}
