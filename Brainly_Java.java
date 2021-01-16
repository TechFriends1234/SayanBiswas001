import java.util.Scanner;           //Importing Scanner
public class Brainly_Java           //Creating Class
{
    public static void main(String[] args)   //Creating main() function
    {
        Scanner sc = new Scanner(System.in);        //Creating Scanner object
        int arr1[] = new int[10];                   //Creating an array for first 10 elements
        int arr2[] = new int[10];                   //Creating an array for next 10 elements   
        for(int i=0;i<10;i++)                       //Loop for taing input of first 10 elements
        {
            System.out.print("Enter Number ["+(i+1)+"] : ");    //Asking for user input
            arr1[i] = sc.nextInt();                             //Scanning User Input
        }
        for(int i=0;i<10;i++)                       //Loop for taking uer input of next 10 elements
        {
            System.out.print("Enter Number ["+(i+11)+"] : ");   //Asking for user input
            arr2[i] = sc.nextInt();                             //Scanning User Input

        }
        System.out.println();
        System.out.println("The elements are: \n");
        displayArray(arr1);             //Displaying elements with a displayArray(int arr[]) function
        displayArray(arr2);
        System.out.println("\n");
        System.out.println("The first ten elements in ascending order, sorted by Selection Sort are: ");
        selectionSort(arr1);        //Sorting arr1 by Selection Sort

        displayArray(arr1);         //Displaying sorted arr1
        System.out.println("\n");
        System.out.println("The last ten elements in descending order, sorted by Bubble Sort are: ");
        descendingBubbleSort(arr2); //Sorting arr2 in Decending Order by Bubble Sort
        displayArray(arr2);         //Displaying sorted arr2
    }
    static void selectionSort(int arr[])        //Selection Sort function

    {

        for(int i=0;i<arr.length-1;i++)         //Outer Loop runs through the Array, and moves the boundary of unsorted subarray

        {  

            int min = i;                        //Minimum Value Index Position is assumed to be i

           

            for(int j=i+1;j<arr.length;j++)     //Inner Loop runs from i+1 to last element of arr to find minimum value in unsorted part

            {

                if (arr[j]<arr[min])           

                {

                    min = j;                    //Storing index position of minimum value in min

                }

            }

           

            if(min!=i)                      //Swapping Minimum Element with first element

            {

                int temp = arr[i];

                arr[i] = arr[min];

                arr[min] = temp;

            }

        }

    }
    static void descendingBubbleSort(int arr[])     //Descending Order Bubble Sort function
    {
        int n = arr.length;                 //Storing array length in n
        for(int i=0;i<n-1;i++)         

        {

            for(int j=0;j<n-i-1;j++)

            {

                if(arr[j]<arr[j+1])         //Comparing two adjacent elements

                {

                    int temp = arr[j];      //If bigger element is on the right, then the two elements are swapped

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }

            }

        }

    }

   

    static void displayArray(int arr[])     //Function to display elements of an array

    {

        for(int i=0;i<arr.length;i++)      

        {

            System.out.print(arr[i]+" ");       //Printing array elements

        }

    }

   

}

