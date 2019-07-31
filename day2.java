import java.util.Scanner;

public class day2 {
	public static void main(String[] args) {
		day2 runner = new day2();
		runner.adder();
		runner.d2array();
		
		rectangle rec = new rectangle();
		circle cir = new circle();	
		triangle tri = new triangle();
		
		tri.calculateArea(25, 10);
		tri.display();
		
		cir.calculateArea(10, 0);
		cir.display();
		
		rec.calculateArea(20, 40);
		rec.display();
	}
	
	public void adder(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to start");
		int val1 = in.nextInt(); 
		int val2 = 1;
		int result = val1;
		while(val2 != 0) {
			System.out.println("Enter another number, enter 0 to finish");
			val2 = in.nextInt();
			result = result + val2;
			if(val2 != 0) {
				System.out.println("Current result = " + result);
			}
		else {
			System.out.println("Final result = " + result);
			}
		}
	}
	
	public void d2array(){
		
			int size = 5;
			int[][] array2d = new int[size][size];

			for(int x = 0;x<size;x++) {
				for(int y = 0;y<size;y++) {
					int random = (int)( Math.random()*100);
					array2d[x][y] = random;
				}
			}

			int xMax = 0;int yMax = 0;int max = 0;

			for(int x = 0;x<size;x++) {
				for(int y = 0;y<size;y++) {
					System.out.print("|"+array2d[x][y]+"|");
					if(array2d[x][y] > max){
						max = array2d[x][y];
						xMax = y+1;
						yMax = x+1;
					}
				}
				System.out.println();
			}
			System.out.println("Max number is :" + max + " X coordinate :" + xMax + " Y coordinate :" + yMax);
		}
		
		
	}
	
interface shape{
	void display();
	void calculateArea(double b, double c);
}

class circle implements shape{
	double radius = 0;
	double result = 0;
	double pi = Math.PI;
	public void calculateArea(double radius, double pi) {
		pi = Math.PI;
		result = (pi * (radius * radius));
	}
	
	public void display() {
		System.out.println(result);	
	}
}

class triangle implements shape{

	double height = 0;
	double width = 0;
	double result = 0;
	public void calculateArea(double height, double width) {
		
	result = (.5 * height * width);
	}
	
	public void display() {
		System.out.println(result);	
	}
}

class rectangle implements shape{
		double length = 0; 
		double width = 0;
		double result = 0;
	
	public void calculateArea(double length, double width) {
		
		result = (length * width);
	}
	
	public void display() {
		System.out.println(result);	
	}
}