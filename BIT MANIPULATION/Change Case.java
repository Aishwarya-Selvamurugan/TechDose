import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int mask = 1;
		mask <<= 5;
		System.out.println((char)(a^mask));
	}
}
