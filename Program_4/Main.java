/*
    Problem Statement : Accept one number from user and calculat the even factorial
*/

import java.util.*;

class Numbers
{    
    int EvenFact(int iNo)
    {
        int iFact = 1;
        int iCnt = 2;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iCnt<=iNo)
        {
            iFact = iFact * iCnt;
            iCnt = iCnt + 2;
        }
        return iFact;
    }
}

class Main
{
    public static void main(String args[])
    {
        int iRet = 0;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter a number");
        int iNo = cin.nextInt();

        Numbers fobj = new Numbers();

        iRet = fobj.EvenFact(iNo);

        System.out.println("Even Factorial is : "+iRet);
    }
}