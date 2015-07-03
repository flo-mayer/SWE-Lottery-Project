import java.util.LinkedHashSet;
import java.util.Set;



public class Storage {
	String name;
	int[] numbers = new int[6];
	static int counter;
	static Storage[] entries = new Storage[999];
	static Set<Integer> draw = new LinkedHashSet<Integer>();
	
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
		System.out.println(entries[counter].name);
	}
	
	public static void storedraw(int a, int b, int c, int d, int e, int f){
		draw.add(a);
		draw.add(b);
		draw.add(c);
		draw.add(d);
		draw.add(e);
		draw.add(f);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
