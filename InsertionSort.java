import java.util.Scanner;
public class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int A[]=new int [n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int nums:A)
        {
            System.out.print(nums+" ");
        }
        for(int i=1;i<A.length;i++)
        {
            int key=A[i];
            int j=i-1;
            while(j>=0 && A[j]>key)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
            System.out.println();
            for(int nums:A)
            {
                System.out.print(nums+" ");
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for(int nums:A)
        {
            System.out.print(nums+" ");
        }
        sc.close();
    }
}

