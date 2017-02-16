import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner Get =new Scanner(System.in);
		System.out.println("Enter The numbers to swap ");
		int a =Get.nextInt();
		int b =Get.nextInt();
		System.out.println("Before Swaping a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping a = "+a+" b = "+b);

	}

}
