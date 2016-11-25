package volumn100;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class _102 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		while(scan.hasNextInt()){
			Bottle bb = new Bottle();
			Bottle gb = new Bottle();
			Bottle cb = new Bottle();
			for(int i=0;i<3;i++){
				bb.addBot(scan.nextInt());
				gb.addBot(scan.nextInt());
				cb.addBot(scan.nextInt());
			}
			Iterator it = bb.i
		}
	}
}
class Bottle{
	String color;
	static List<Integer> can;
	public static  void addBot(int bot) {
		 can = new ArrayList<>();
		 can.add(bot);
	}
	
	
	
	
}
