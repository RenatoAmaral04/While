package ww;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Olá digite um número");
		
		Scanner ff = new Scanner(System.in);
		int x = ff.nextInt();
		int y = 0;
		
		while (x != 0){
			
			y += x;
			x = ff.nextInt();
			
		}
		
		System.out.println(y);

	}

}
