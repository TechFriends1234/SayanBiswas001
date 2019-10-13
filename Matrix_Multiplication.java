import java.util.*;
public class Matrix_Multiplication
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to add 2 matrixes of rxc order.");
        System.out.println("Enter the order of the matrices: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat1[][] = new int[r][c];
        int mat2[][] = new int[r][c];
        int mat3[][] = new int[r][c];
        int i,j,k;
        System.out.println("Enter the values for first "+r+"x"+c+" matrix: ");
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        mat1[i][j]=sc.nextInt();
        System.out.println("Enter the values for second "+r+"x"+c+" matrix: ");
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        mat2[i][j]=sc.nextInt();
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        for(k=0;k<c;k++)
        mat3[i][j]+=mat1[i][k]*mat2[k][j];
        System.out.println("Product of the matrices is: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            System.out.print(mat3[i][j]+"  ");
            System.out.println("");
        }
    }
}
