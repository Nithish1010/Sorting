package Sorting;
import java.util.Scanner;
public class BS1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want to store: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter th elements: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int num:A)
        {
            System.out.print(" "+num);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
                System.out.println();
                for(int num:A)
                {
                System.out.print(" "+num);
                }
            }
        }
        System.out.println("\nAfter sorting");
        for(int num:A)
        {
            System.out.print(" "+num);
        }
    }
    
}
