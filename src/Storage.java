import java.util.LinkedHashSet;
import java.util.Set;



public class Storage {
	String name;
	int[] numbers = new int[6];
	static int counter;
	static Storage[] entries = new Storage[999];
	static int[] draw = new int[6];
	
	public Storage(String entry, int a, int b, int c, int d, int e, int f){
		this.name = entry;
		this.numbers[0] = a;
		this.numbers[1] = b;
		this.numbers[2] = c;
		this.numbers[3] = d;
		this.numbers[4] = e;
		this.numbers[5] = f;
		counter++;
	}
	public static void store(String entry, int a, int b, int c, int d, int e, int f){
		entries[Storage.counter] = new Storage(entry, a, b, c, d, e, f);
	}
	
	public static void print(int counter){
		System.out.println(counter);
		System.out.println(entries[counter].name);
	}
	
	public static void storedraw(int a, int b, int c, int d, int e, int f){
		draw[0]=a;
		draw[1]=b;
		draw[2]=c;
		draw[3]=d;
		draw[4]=e;
		draw[5]=f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
