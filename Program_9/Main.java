/*
    Problem Statement : Accept a number from user and print fibonacci series.
                        
                        Input : 8
                        Output : 0 1 1 2 3 5 8 13
*/

import java.util.*;

class Numbers
{
    void Fibbo(int iNo)
    {
        int iNo1 = 0, iNo2 = 1, iNo3 = 0;

        for(int iCnt=0;iCnt<iNo;iCnt++)
        {
            System.out.print(iNo1+"\t");
            iNo3 = iNo1 + iNo2;
            iNo1 = iNo2;
            iNo2 = iNo3;
        }
    }
}

class Main
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        
        Numbers nobj = new Numbers();

        System.out.println("Enter a number");
        int iNo = cin.nextInt();

        nobj.Fibbo(iNo);
    }
}