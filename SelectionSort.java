import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you wants to store: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int num:A)
        {
            System.out.print(num);
        }
        int min_index=-1;
        for(int i=0;i<n-1;i++)
        {
            min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if (A[min_index]>A[j])
                {
                    min_index=j;
                }
            }
            int temp=A[min_index];
            A[min_index]=A[i];
            A[i]=temp;
            System.out.println();
            for(int num:A)
            {
                System.out.print(num);
            }
        }
        System.out.println("Before sorting");
        for(int num:A)
        {
            System.out.print(num);
        }
    }
    
}
