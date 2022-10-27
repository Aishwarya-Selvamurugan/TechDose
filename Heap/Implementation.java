import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            a[i] = sc.nextInt();
        }
        MAX_Heap(a);
//        Heap_POP(a);
        for(int i1=1;i1<a.length;i1++)
        {
            System.out.print(a[i1]+" ");
        }
        Heap_IK(a,2,1);
        Heap_DK(a,-3,2);
//        System.out.println(Heap_Extract(a));
//        System.out.println(Heap_Extract(a));
//        System.out.println(Heap_Extract(a));
//        System.out.println(Heap_Extract(a));
        System.out.println();
        for(int i1=1;i1<a.length;i1++)
        {
            System.out.print(a[i1]+" ");
        }
    }
    public static void swap(int[] a,int x,int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void MAX_Heap(int[] a)
    {
        int n = a.length-1;
        for(int i=n/2;i>=1;i--)
        {
            Heapify(a,i);
        }
    }
    public static void Heapify(int[] a,int i)
    {
        if(i > (a.length-1)/2)
        {
            return;
        }
        int l = i*2;
        int r = i*2+1;
        int max = i;
        if(l<a.length && a[l] > a[max])
        {
            max = l;
        }
        if(r<a.length && a[r] > a[max])
        {
            max = r;
        }
        if(max != i) {
            swap(a, max, i);
            Heapify(a, max);
        }
    }
    public static void Heap_POP(int[] a)
    {
        int l = a.length-1;
        a[1] = a[l];
        Heapify(a,1);
    }
    public static int Heap_Extract(int[] a)
    {
        int l = a.length-1;
        int res = a[1];
        a[1] = a[l];
        a[l] = 0;
        Heapify(a,1);
        return res;
    }
    public static void Heap_IK(int[] a,int diff,int i)
    {
        if(diff < 0)
        {
            System.out.println("Invalid Diff");
            return;
        }
        a[i]+=diff;
        while(i<1 && a[i/2] < a[i])
        {
            swap(a,i/2,i);
            i/=2;
        }
    }
    public static void Heap_DK(int[] a,int diff,int i)
    {
        if(diff >= 0)
        {
            System.out.println("Invalid Diff");
            return;
        }
        a[i]+=diff;
        Heapify(a,i);
    }
}
