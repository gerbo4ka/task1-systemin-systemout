import java.util.Scanner;

public class task1 {

	public task1() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public static void main(String[] args) {
		System.out.println("Как тебя зовут?");
		
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.printf("Привет, %s!", name);
	}
}