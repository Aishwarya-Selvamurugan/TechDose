import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int mask = 1;
		mask <<= 5;
		System.out.println("Upper to Lower(0) or Lower to Upper(1)");
		int type = sc.nextInt();
		if(type == 0)
		{
		    UpperToLower(a);
		}
		else{
		    LowerToUpper(a);
		}
	}
	public static void UpperToLower(char a)
	{
	    int mask = 1;
	    mask<<=5;
	    System.out.println((char)(a|mask));
	}
	public static void LowerToUpper(char a)
	{
	    int mask = 1;
	    mask <<= 5;
	    System.out.println((char)(a&~mask));
	}
}
