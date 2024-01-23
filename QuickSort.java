import java.util.Scanner;
public class QuickSort
{
    public static void quicksort(int[] A,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(A, low, high);
            quicksort(A,low,pi-1);
            quicksort(A,pi+1,high);
        }
    }
    private static int partition(int A[],int low,int high)
    {
        int pivot=A[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(A[j]<pivot)
            {
            i++;
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            }
        }
        int temp=A[i+1];
        A[i+1]=A[high];
        A[high]=temp;
        System.out.println();
        for (int num:A)
        {
            System.out.print(num+" ");
        }
        return i+1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        System.out.println();
        for (int num:A)
        {
            System.out.print(num+" ");
        }
        quicksort(A,0,A.length-1);
        System.out.println();
        System.out.println("After sorting");
        for (int num:A)
        {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
