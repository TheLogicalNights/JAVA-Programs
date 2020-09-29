/*
    problem Statement : Write a program which will display the below pattern

                        Input : 6 6
                        Output : & * * * * *
                                 * & * * * *
                                 * * & * * *
                                 * * * & * *
                                 * * * * & *
                                 * * * * * &   
*/ 
import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        char ch = 'A';
        int iDigit = 1;
        if(iRow!=iCol)
        {
            return ;
        }
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                if(i==j)
                {
                    System.out.print("&\t");
                }
                else if((i==1) || (j==1) || (i==iRow) || (j==iCol))
                {
                    System.out.print("*\t");
                }
                else if(i>j)
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
                else
                {
                    System.out.print(iDigit+"\t");
                    iDigit++;
                }
            }
            System.out.println();
        }
    }
}
class Main
{
    public static void main(String args[]) 
    {
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Enter no of rows");
        int iRow = cin.nextInt();

        System.out.println("Enter no of columns");
        int iCol = cin.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iRow,iCol);
    }
}