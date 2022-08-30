import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		int mask = 1;
		mask <<= i;
		System.out.println(n^mask);
	}
}
