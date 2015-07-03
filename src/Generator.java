import java.util.ArrayList;
import java.util.Collections;

public class Generator {
	static int[] drawing = new int[6];
	
	static void startgenerator(){
		ArrayList<Integer> drawing = new ArrayList<Integer>();
		for(int i=1; i<=49; i++){
			drawing.add(i);
		}
		Collections.shuffle(drawing);
		Storage.storedraw(drawing.get(0), drawing.get(1), drawing.get(2), drawing.get(3), drawing.get(4), drawing.get(5));
	}
}
