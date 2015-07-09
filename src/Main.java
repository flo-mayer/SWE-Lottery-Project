import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		showmenu();
		//Generator.startgenerator(entryused, drawingused);
	}
	static void showmenu() throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose:");
		System.out.println("1 - Enter Ticket");
		System.out.println("2 - Draw Numbers");
		System.out.println("3 - Show results");
		System.out.println("0 - Quit");
		String input = sc.next();
		int descission = -1;
		try {
			descission = Integer.parseInt(input);
		}
		catch(java.lang.NumberFormatException e){
			System.out.println("Invalid input!");
			showmenu();
			throw e;
		}
		if (descission==1){
			if (Storage.drawingused==1){
				System.out.println("No more entries allowed after the numbers have been drawn!");
				showmenu();
			}
			else Entry.startentry();
			
		}
		else if (descission==2){
			if (Storage.entryused!=1){
				System.out.println("You have to make an entry first!");
				showmenu();
			}
			else if (Storage.drawingused==1){
				System.out.println("Numbers are already drawn!");
				showmenu();
			}
			else Generator.startgenerator();
		}
		else if (descission==3){
			if (Storage.entryused!=1){
				System.out.println("You have to make an entry first!");
				showmenu();
			}
			else if(Storage.drawingused!=1){
				System.out.println("You have to draw numbers first!");
				showmenu();
			}
			else Result.startresult();
		}
		else if (descission==0){
			System.exit(0);
		}
		else {
			System.out.println("Invalid input!");
			showmenu();
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
