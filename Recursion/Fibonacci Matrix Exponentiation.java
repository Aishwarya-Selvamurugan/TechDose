import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.println("1");
            return;
        }
        int[][] res = fib(n,new int[][]{{1,1},{1,0}});
        System.out.println(res[0][1]);
    }
    public static int[][] fib(int n,int[][] a)
    {
        if(n == 1)
        {
            return a;
        }
        int[][] temp = fib(n/2,a);
        if(n%2==0)
        {
            return multiply(temp,temp);
        }
        return multiply(temp,multiply(a,temp));
    }
    public static int[][] multiply(int[][] a,int[][] b)
    {
        int[][] temp = new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                temp[i][j] = 0;
                for(int k=0;k<2;k++)
                {
                    temp[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return temp;
    }
}
