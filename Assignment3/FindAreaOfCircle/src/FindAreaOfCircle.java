import java.util.Scanner;
public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("The area of circle:"+area);
		double circumference=Math.PI*2*radius;
		System.out.println("Circumference of circle is:"+circumference);
		

	}

}
